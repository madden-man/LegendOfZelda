import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * Created by Avinash050411 on 6/7/2014.
 */
public class Click implements MouseListener {
    public Click()
    {
    }
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        if(x >= 610 && x <= 800 && y >= 100 && y <= 145)
        {
            System.out.println("Credits");
        }
        else if(x >= 645 && x <= 800 && y >= 280 && y <= 325)
        {
            System.out.println("Start");
        }
        else if(x >= 610 && x <= 800 && y >= 455 && y <= 500)
        {
            System.out.println("Options");
        }
    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }
}
