import java.awt.*;
/**
 *  Created by Jimmy on 6/7/2014.
 */
public class Weapon extends Item{
    protected int sharpness;
    public Weapon(String des, Image img, int sharp)
    {
        super(des, img);
        sharpness = sharp;
    }
}