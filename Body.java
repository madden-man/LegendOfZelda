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

    public Body(int x, int y) {
        position = new int[2];
        velocity = new double[2];
        acceleration = new double[2];
        position[X] = x;
        position[Y] = y;
    }

    public int[] getPosition() {
        return position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public double[] getAcceleration() {
        return acceleration;
    }

    public Image getImg() {
        return image;
    }
    public void act() { }

    public void setImg(Image img) {
        image = img;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) { position[X] = x;}

    public void setY(int y) { position[Y] = y;}
}