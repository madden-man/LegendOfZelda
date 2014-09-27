/**
 * Created by Jimmy on 6/7/2014.
 */
public class TestEnemy extends Enemy {
    protected static final int OLDAGE = 80;
    protected static final int REPRODUCTIONAGE = 20;
    protected static final int normalSpeed = 5;

    public TestEnemy(String path, int x, int y)
    {
        super(path, x, y);
    }
    public void act()
    {
        velocity[X] = 0;
        velocity[Y] = 0;
        velocity[X] += acceleration[X];
        velocity[Y] += acceleration[Y];
        position[X] += velocity[X];
        position[Y] += velocity[Y];
    }
}