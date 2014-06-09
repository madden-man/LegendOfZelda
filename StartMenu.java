import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class StartMenu extends JPanel {
    private Image background;
    private Click click;
    public StartMenu() {
        background = new ImageIcon("background.png").getImage();
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        click = new Click();
        addMouseListener(click);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
}