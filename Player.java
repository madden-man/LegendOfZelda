import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Player extends LivingBeing{
    private String path;

    public Player(String path, int x, int y)
    {
        super(path, x, y);
    }

    public void act() {
        velocity[X] += acceleration[X];
        velocity[Y] += acceleration[Y];
        position[X] += velocity[X];
        position[Y] += velocity[Y];
    }
}