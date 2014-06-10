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
        image = new ImageIcon(path).getImage();
    }

    public void die()
    {}

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
}