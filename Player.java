import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Player extends LivingBeing{
    private String path;
    private final int normalSpeed = 5;

    public Player(String path, int x, int y)
    {
        super(path, x, y);
        name = "player";
    }

    public void act() {
        velocity[X] = 0;
        velocity[Y] = 0;
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
        velocity[X] += acceleration[X];
        velocity[Y] += acceleration[Y];
        position[X] += velocity[X];
        position[Y] += velocity[Y];
    }
}