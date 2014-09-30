import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.Timer;

/**
 * Created by tommy_000 on 6/7/2014.
 */
public class World {
    private int step;
    private int howOften;
    private GamePanel panel;
    public static ArrayList<Body> bodies;
    private ArrayList<Body> origBodies;
    private static int bodyNum;

    public World(int howOften, GamePanel panel) {
        step = 0;
        bodyNum = 0;
        this.howOften = howOften;
        this.panel = panel;
        bodies = new ArrayList<Body>();
        bodies.add(new Player(50, 50));
        origBodies = new ArrayList<Body>();
    }

    public void beginGame() {
        javax.swing.Timer timer = new javax.swing.Timer((int) howOften, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
                step();
            }
        });

        timer.start();
    }

    public void step() {
        for (int i = 0; i < bodies.size(); i++) {
            bodies.get(i).act();
        }
    }
    //pre:
    //post: changes position of all bodies except player
    public static void changeBodiesPosition(int xChange, int yChange)
    {
        for(int i = 0; i < bodies.size(); i++)
        {
            Body body = bodies.get(i);
            body.setPosition(body.getXPosition()+xChange, body.getYPosition()+yChange);
        }
    }
    //pre: need a .txt file with its location being the String path in the code.
    //saves all Bodies and their locations
    public static void save()
    {
        try {
            String path = "appProperties.txt";
            Properties applicationProps = new Properties();

// now saves data
            reset();
            FileOutputStream out = new FileOutputStream(path);
            String answer = "";
            for(int i = 0; i < bodies.size(); i++)
            {
                Body body = bodies.get(i);
                int[] pos = body.getPosition();
                int x = pos[0];
                int y = pos[1];
                int age = body.getAge();
                String duplicateBodies = applicationProps.getProperty(body.getName());
                if(duplicateBodies != null)
                    answer = "" +duplicateBodies +x +", " +y +", " +age +";";
                else
                    answer = "" +x +", " +y +", " +age +";";
                applicationProps.setProperty(body.getName(), answer);
            }
            applicationProps.store(out, "List of Bodies and Locations");
            out.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //pre: need a .txt file with its location being path. Type "player=xLocation, yLocation;" without quotes to set player's location. don't forgot the comma, space, and semicolon
    //makes all bodies and sets their locations
    public void setUp()
    {
        try {
            String path = "appProperties.txt";
            Properties applicationProps = new Properties();

// now load properties
// from last invocation
            FileInputStream in = new FileInputStream(path);
            applicationProps.load(in);
            Object[] DiffBodies = applicationProps.stringPropertyNames().toArray();
            for(int bodyNum = 0; bodyNum < DiffBodies.length; bodyNum++)
            {
                String name = (String)(DiffBodies[bodyNum]);
                String loc = applicationProps.getProperty(name);
                String x = "";
                String y = "";
                String age = "";
                int commaPlace=0;
                int whichComma = 0;
                for(int i = 0; i < loc.length(); i++)
                {
                    if(loc.charAt(i) == ',' && whichComma==0) {
                        x = loc.substring(0, i);
                        commaPlace = i;
                        whichComma++;
                    }
                    else if(loc.charAt(i) == ',' && whichComma==1) {
                        System.out.println("" +commaPlace +" " +i);
                        y = loc.substring(commaPlace+2, i);
                        commaPlace = i;
                        whichComma++;
                    }
                    if(loc.charAt(i) == ';') {
                        age = loc.substring(commaPlace+2, i);
                        Body body = makeBody(name);
                        body.setX(Integer.parseInt(x));
                        body.setY(Integer.parseInt(y));
                        body.setAge(Integer.parseInt(age));
                        origBodies.add(body);
                        whichComma = 0;
                    }
                }
            }
            in.close();
            FileOutputStream out = new FileOutputStream(path);
            applicationProps.store(out, "---No Comment---");
            out.close();
            copyBodies();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //converts string of body types to actual bodies
    public Body makeBody(String name)
    {
        if(name.equals("player"))
        {
            return (Body)(new Player(100, 100));
        }
        else if(name.equals("TestEnemy"))
        {
            return (Body)(new TestEnemy(200, 200));
        }
        else if(name.equals("Paladin"))
        {
            return (Body)(new Paladin(200, 200));
        }
        else
        {
            return null;
        }

    }

    public static void reset()
    {
        try {
            String path = "appProperties.txt";
            Properties applicationProps = new Properties();
// now load properties
// from last invocation
            FileInputStream in = new FileInputStream(path);
            applicationProps.load(in);
            Object[] DiffBodies = applicationProps.stringPropertyNames().toArray();
            for(int i = 0; i < DiffBodies.length; i++)
            {
                applicationProps.remove((String)(DiffBodies[i]));
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void addBodyNum()
    {
        bodyNum++;
    }

    public static int getBodyNum()
    { return bodyNum;}

    public static void removeBodyNum(int bodyNum)
    {
        bodies.remove(bodyNum);
        for(int i = bodyNum; i<bodies.size(); i++)
        {
            bodies.get(i).decreaseBodyID();
        }
    }
    public void copyBodies()
    {
        for(int i = 0; i<origBodies.size(); i++)
        {
            bodies.add(origBodies.get(i));
        }
    }

    // pre: need one .txt file with ID's that represent the actual 10x10 items in the world called "area(#).txt" where # is the area the player is on
    // post: creates the items that are supposed to be in the world on the actual screen and in the hard code
    public void buildWorld() {
        Player player = (Player)bodies.get(0);
        player.getArea();
    }
}