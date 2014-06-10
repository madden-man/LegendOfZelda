import java.awt.*;
/**
 * Created by Avinash050411 on 6/9/2014.
 */
public class Item {
    protected String description;
    protected Image img;
    protected boolean equipped;
    public Item(String des, Image img){
        description = des;
        this.img = img;
        equipped = false;
    }
    public void setEquipped()
    {
        equipped = !equipped;
    }
}
