import javax.swing.*;
import java.awt.*;

/**
 * Created by Avinash050411 on 6/9/2014.
 */
//is JPanel where game happens
public class GamePanel extends JPanel {
    private CoolGame game;
    private Image background;
    public GamePanel(CoolGame cool)
    {
        background = new ImageIcon("background.png").getImage();
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        this.game = cool;
    }
    public void start()
    {
        JFrame frame = game.getFrame();
        frame.getContentPane().removeAll();
        frame.add(this);
        frame.addKeyListener(new InputManager());
        frame.revalidate();
        World world = new World(20, this);
        world.beginGame();
    }

    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, 800, 600);
        for (int i = 0; i < World.bodies.size(); i++) {
            Body body = World.bodies.get(i);
            g.drawImage(body.getImg(), body.getPosition()[0], body.getPosition()[1], null);
        }

    }
}
