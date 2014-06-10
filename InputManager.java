import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by tommy_000 on 6/10/2014.
 */
public class InputManager implements KeyListener {
    public static boolean W;
    public static boolean A;
    public static boolean S;
    public static boolean D;
    public static boolean ESC;

    public InputManager() {
        W = false;
        A = false;
        S = false;
        D = false;
        ESC = false;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'W') {
            W = true;
        } else if (e.getKeyChar() == 'A') {
            A = true;
        } else if (e.getKeyChar() == 'S') {
            S = true;
        } else if (e.getKeyChar() == 'D') {
            D = true;
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ESC = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 'W') {
            W = false;
        } else if (e.getKeyChar() == 'A') {
            A = false;
        } else if (e.getKeyChar() == 'S') {
            S = false;
        } else if (e.getKeyChar() == 'D') {
            D = false;
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ESC = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
