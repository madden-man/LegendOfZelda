import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

/**
 * Created by tommy_000 on 6/10/2014.
 */
public class InputManager implements KeyListener {
    public static boolean W;
    public static boolean A;
    public static boolean S;
    public static boolean D;
    public static boolean Q;
    public static boolean ESC;

    public InputManager() {
        W = false;
        A = false;
        S = false;
        D = false;
        Q = false;
        ESC = false;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            W = true;
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            A = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            S = true;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            D = true;
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ESC = true;
        } else if (e.getKeyCode() == KeyEvent.VK_Q) {
            Q = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            W = false;
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            A = false;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            S = false;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            D = false;
        } else if (e.getKeyCode() == KeyEvent.VK_Q) {
            Q = false;
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ESC = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}