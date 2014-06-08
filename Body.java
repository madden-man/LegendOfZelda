import java.awt.image.BufferedImage;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Body {
    protected int x;
    protected int y;
    protected BufferedImage image;

    public Body()
    {}

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getImg()
    {
        return image;
    }
    public void act() {};
}
