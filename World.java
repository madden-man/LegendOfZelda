import java.util.*;

/**
 * Created by tommy_000 on 6/7/2014.
 */
public class World {
    private int step;
    private double howOften;
    private ArrayList<Body> bodies;

    public World(double howOften) {
        step = 0;
        this.howOften = howOften;
    }

    public void step() {
        for (int i = 0; i < bodies.size(); i++) {
            bodies.get(i).act();
        }
    }
}
