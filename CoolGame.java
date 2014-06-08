import javax.swing.*;
import java.awt.*;
/**
 * Created by tommy_000 on 6/7/2014.
 */
public class CoolGame {
    private JFrame frame;
    private StartMenu start;
  //private GamePane game;
    public static void main(String[] args) {
        CoolGame loz = new CoolGame();
        loz.create();
        loz.startGame();
    }

    public CoolGame() {}

    public void create() {
        frame = new JFrame("Legend Of Zelda!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(new Dimension(806, 635));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        start = new StartMenu();
        frame.add(start);
        frame.repaint();
    }

    public void startGame() {

    }

}
