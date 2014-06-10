import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jimmy on 6/7/2014.
 */
public class Body {
    protected int x;
    protected int y;
    protected Image image;

    public Body() {
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Image getImg()
    {
        return image;
    }
    public void act() {}
    public void setImg(Image img) { image = img;}
}