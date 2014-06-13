import javax.swing.*;
import java.awt.*;

/**
 * Created by Avinash050411 on 6/9/2014.
 */
//is JPanel where game happens
public class GamePanel extends JPanel {
    private CoolGame game;
    private Image background;
    private int h;
    public GamePanel(CoolGame cool)
    {
        background = new ImageIcon("background.png").getImage();
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        this.game = cool;
        h=100;
    }
    public void start()
    {
        JFrame frame = game.getFrame();
        frame.getContentPane().removeAll();
        frame.add(this);
        frame.revalidate();
        act();
    }

    public void paintComponent(Graphics g) {
  //      g.clearRect(0, 0, 500, 500);
        g.drawImage((new Player("player.png")).getImg(), h, h, null);
        System.out.print("paint)");
    }

    public void act()
    {
        boolean done = false;
        while(!done)
        {
            try {
                h = 200;
                repaint(100);
                Thread.sleep(5000);
                System.out.print("hre");
            }
            catch(InterruptedException e) {
                e.getMessage();
            }
        }
        //h = 100;
       // repaint();
   //     h = 300;
    }
}
