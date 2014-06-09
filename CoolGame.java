import javax.swing.*;
import java.awt.*;
/**
 * Created by tommy_000 on 6/7/2014.
 */
public class CoolGame {
    private JFrame frame;
    private StartMenu start;
  //private Credits cred;
  //private ChooseSave save;
  //private Options opt;
  //private GamePane game;
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
