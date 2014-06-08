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
        System.out.println("x: " + x);
        System.out.println("y: " + x);
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
