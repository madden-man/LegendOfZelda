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

    public World(int howOften, GamePanel panel) {
        step = 0;
        this.howOften = howOften;
        this.panel = panel;
        bodies = new ArrayList<Body>();
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
                String duplicateBodies = applicationProps.getProperty(body.getName());
                if(duplicateBodies != null)
                    answer = "" +duplicateBodies +x +", " +y +";";
                else
                    answer = "" +x +", " +y +";";
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
                int commaPlace=0;
                for(int i = 0; i < loc.length(); i++)
                {
                    if(loc.charAt(i) == ',') {
                        x = loc.substring(0, i);
                        commaPlace = i;
                    }
                    if(loc.charAt(i) == ';') {
                        y = loc.substring(commaPlace+2, i);
                        Body body = makeBody(name);
                        body.setX(Integer.parseInt(x));
                        body.setY(Integer.parseInt(y));
                        bodies.add(body);
                    }
                }
            }
            in.close();
            FileOutputStream out = new FileOutputStream(path);
            applicationProps.store(out, "---No Comment---");
            out.close();
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
}