/**
 * Created by Jimmy on 6/21/2014.
 */
public class Enemy extends LivingBeing {
    protected LivingBeing prey;
    protected static int normalSpeed;
    public Enemy(String path, int x, int y)
    {super(path, x, y);
    prey = World.getPlayer();}
    public Enemy(String path, int x, int y, int age)
    {
        super(path, x, y, age);
        prey = World.getPlayer();
    }

    //pre: prey has been set
    //post: returns distance from center of prey to center of it. change in future.
    public double DistancetoPrey()
    {
        int xDiff = prey.getXPosition()-getXPosition();
        int yDiff = prey.getYPosition()-getYPosition();
        double distance = Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        return distance;
    }
    public void act()
    {
        int xDiff = prey.getXPosition()-getXPosition();
        int yDiff = prey.getYPosition()-getYPosition();
        if(xDiff>0)
            velocity[X] = normalSpeed;
        else if(xDiff<0)
            velocity[X] = -normalSpeed;
        else
            velocity[X] = 0;
        if(yDiff>0)
            velocity[Y] = normalSpeed;
        else if(yDiff<0)
            velocity[Y] = -normalSpeed;
        else
            velocity[Y] = 0;
        System.out.println(normalSpeed);
        velocity[X] += acceleration[X];
        velocity[Y] += acceleration[Y];
        position[X] += velocity[X];
        position[Y] += velocity[Y];
    }
}
