import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class StartMenu extends JPanel implements MouseListener {
    private Image background;
    private CoolGame game;
    public StartMenu(CoolGame game) {
        background = new ImageIcon("background.png").getImage();
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        this.game = game;
    }
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        if(x >= 610 && x <= 800 && y >= 100 && y <= 145)
        {
            System.out.println("Credits");
        }
        else if(x >= 645 && x <= 800 && y >= 280 && y <= 325)
        {
            System.out.println("Start");
            game.chooseSave();
        }
        else if(x >= 610 && x <= 800 && y >= 455 && y <= 500)
        {
            System.out.println("Options");
        }
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}