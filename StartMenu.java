import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 * Created by Avinash050411 on 6/7/2014.
 */
public class StartMenu extends JPanel {
    private Image background;
    private Click click;
    public StartMenu()
    {
        Image background = new ImageIcon("background.gif").getImage();
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        click = new Click(false);
        addMouseListener(click);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
}
