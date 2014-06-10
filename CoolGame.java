import javax.swing.*;
import java.awt.*;
/**
 * Created by tommy_000 on 6/7/2014.
 */
public class CoolGame {
    private JFrame frame;
    private Inventory invent;
    private StartMenu start;
    private Setup setup;
    private GamePanel game;
  //private Credits cred;
  //private Options opt;
    public static void main(String[] args) {
        CoolGame loz = new CoolGame();
        loz.create();
        loz.startGame(1);
    }

    public CoolGame() {}

    public void create() {
        frame = new JFrame("The Sands of Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(new Dimension(806, 635));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        start = new StartMenu(this);
        start.addMouseListener(start);
        frame.add(start);
        frame.repaint();
    }
    public void chooseSave() {

    }

    public void startGame(int numOfSave) {

    }

}
