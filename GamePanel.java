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
        g.clearRect(0, 0, 500, 500);
        g.drawImage((new Player("player.png")).getImg(), 100, 100, null);
    }
}
