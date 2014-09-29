import javax.swing.*;
import java.awt.*;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class LivingBeing extends Body {
    protected int life;
    protected int movementSpeed;
    protected int attack;
    protected int range;
    protected int age;
    protected Weapon weapon;
    protected Armor armor;

    public LivingBeing(String path, int x, int y) {
        super(x, y);
        age = 0;
        image = new ImageIcon(path).getImage();
    }
    //pre:
    //post: dies if too old
    public void die()
    {
        World.removeBodyNum(bodyID);
    }
    //pre:
    //post: reproduces if meets conditions
    public void reproduce()
    {}
    public void move()
    {
        if(!collides())
        {}
    }

    public void attack()
    {}
    public boolean collides(){return true;}

    public boolean tooOld() {return false;}

    public void act()
    {
        age++;
        reproduce();
        super.act();
        if(tooOld())
            die();
    }
}