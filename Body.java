import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Body {
    protected int[] position;
    protected double[] velocity;
    protected double[] acceleration;
    protected final int X = 0;
    protected final int Y = 1;
    protected Image image;
    protected String name;
    protected int bodyID;

    public Body(int x, int y) {
        position = new int[2];
        velocity = new double[2];
        acceleration = new double[2];
        position[X] = x;
        position[Y] = y;
        velocity[X] = 0;
        velocity[Y] = 0;
        acceleration[X]=0;
        acceleration[Y]=0;
        bodyID = World.getBodyNum();
        World.addBodyNum();
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int xPosition, int yPosition) {position[X] = xPosition;
    position[Y] = yPosition;}

    public int getXPosition() {return position[X];}

    public int getYPosition() {return position[Y];}

    public double[] getVelocity() {
        return velocity;
    }

    public double getXVelocity() {return velocity[X];}

    public double getYVelocity() {return velocity[Y];}

    //pre: player overrides this
    //post: sets velocity
    public void setVelocity(double xVelocity, double yVelocity)
    {
        velocity[X]=xVelocity;
        velocity[Y]=yVelocity;
    }

    public double[] getAcceleration() {
        return acceleration;
    }

    public Image getImg() {
        return image;
    }

    public void setImg(Image img) {
        image = img;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) { position[X] = x;}

    public void setY(int y) { position[Y] = y;}

    public void act()
    {
        velocity[X] += acceleration[X];
        velocity[Y] += acceleration[Y];
        position[X] += velocity[X];
        position[Y] += velocity[Y];
    }
    public void decreaseBodyID()
    {
        bodyID--;
    }
}