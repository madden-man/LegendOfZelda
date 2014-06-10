import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Avinash050411 on 6/9/2014.
 */
public class Inventory extends JFrame {
    private ArrayList<Item> bag;
    public Inventory()
    {
        bag = new ArrayList<Item>(25);
    }
}
