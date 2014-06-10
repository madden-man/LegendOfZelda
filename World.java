import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

/**
 * Created by tommy_000 on 6/7/2014.
 */
public class World {
    private int step;
    private int howOften;
    private GamePanel panel;
    public static ArrayList<Body> bodies;

    public World(int howOften, GamePanel panel) {
        step = 0;
        this.howOften = howOften;
        this.panel = panel;
        bodies = new ArrayList<Body>();
        Player player = new Player("player.png", 100, 100);
        bodies.add(player);
    }

    public void beginGame() {
        javax.swing.Timer timer = new javax.swing.Timer((int) howOften, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
                step();
            }
        });

        timer.start();
    }

    public void step() {
        for (int i = 0; i < bodies.size(); i++) {
            bodies.get(i).act();
        }
    }
}
