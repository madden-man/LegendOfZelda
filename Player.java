import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Player extends LivingBeing{
    private int area;
    private final int normalSpeed = 1;
    private final int friction = 50;
    private static String path = "player.png";
    public Player(int x, int y)
    {
        super(path, x, y);
        name = "player";
        area = 1;
    }

    //pre:
    //post: overrides body setPosition() method, does nothing
    public void setPosition(int xChange, int yChange)
    {

    }
    //pre: none?
    //post: right now moves player, planning on making it sidescroll the map
    public void act() {
        age++;
        if(tooOld())
            die();
        else
        {
            acceleration[X] = 0;
            acceleration[Y] = 0;
            if (InputManager.W) {
                velocity[Y] += -normalSpeed;
            } if (InputManager.A) {
            velocity[X] += -normalSpeed;
        } if (InputManager.S) {
            velocity[Y] += normalSpeed;
        } if (InputManager.D) {
            velocity[X] += normalSpeed;
        }
            if(InputManager.Q) {
                World.save();
            }
            //applies friction
            if(velocity[X] != 0)
            {
                acceleration[X] = -velocity[X]/friction;
            }
            if(velocity[Y] != 0)
            {
                acceleration[Y] = -velocity[Y]/friction;
            }
            velocity[X] += acceleration[X];
            velocity[Y] += acceleration[Y];
            //moves everything else the opposite way player moves to get sidescroll
            World.changeBodiesPosition((int)-velocity[X], (int)-velocity[Y]);
            reproduce();
        }

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}