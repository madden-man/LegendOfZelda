/**
 * Created by Jimmy on 9/29/2014.
 */
public class Paladin extends Enemy{
    protected static final int OLDAGE = 80;
    protected static final int REPRODUCTIONAGE = 20;
    protected static final int normalSpeed = 1;
    private static String path = "Paladin.gif";

    public Paladin(int x, int y)
    {
        super(path, x, y);
        name = "Paladin";
        velocity[X] = normalSpeed;
        velocity[Y] = normalSpeed;
    }
    public Paladin(int x, int y, int age)
    {
        super(path, x, y, age);
        name = "Paladin";
        velocity[X] = normalSpeed;
        velocity[Y] = normalSpeed;
    }
    public void act() {super.act();}
    public boolean tooOld()
    {
        if(age>OLDAGE)
            return true;
        else
            return false;
    }
}
