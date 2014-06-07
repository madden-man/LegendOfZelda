import javax.swing.*;
import java.awt.*;

/**
 * Created by tommy_000 on 6/7/2014.
 */
public class CoolGame {
    public static void main(String[] args) {
        CoolGame loz = new CoolGame();
        loz.create();
        loz.startGame();
    }

    private JFrame frame;

    public CoolGame() {}

    public void create() {
        frame = new JFrame("Legend Of Zelda!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(new Dimension(806, 635));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.validate();
    }

    public void startGame() {

    }

}
