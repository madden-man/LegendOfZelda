/**
 * Created by Jimmy on 6/21/2014.
 */
public class Enemy extends LivingBeing {
    protected LivingBeing prey;
    public Enemy(String path, int x, int y)
    {super(path, x, y);}
    public Enemy(String path, int x, int y, int age)
    {super(path, x, y, age);}
}
