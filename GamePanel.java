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
        frame.revalidate();
    }

    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, 800, 600);
        Player player = new Player("player.png", 100, 100);
        g.drawImage(player.getImg(), player.getPosition()[0], player.getPosition()[1], null);
    }
}
