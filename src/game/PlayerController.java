package game;
import city.cs.engine.Body;
import city.cs.engine.BodyImage;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class PlayerController implements KeyListener {
    Timer timer;
    private static final float WALKING_SPEED = 10;

    private Player player;

    private HashMap<Body, BodyImage> hiddenImages = null;

    public PlayerController(Player p){
        player = p;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_LEFT) {
            player.jump= false;
            player.walk = true;
            player.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_RIGHT) {
            player.jump= false;
            player.walk = true;
            player.startWalking(WALKING_SPEED);
        }
        else if (code == KeyEvent.VK_UP){
            player.jump= true;
            player.jump(40);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            player.walk = false;
            player.stopWalking();
        } else if (code == KeyEvent.VK_RIGHT) {
            player.walk = false;
            player.stopWalking();
        }
        else if (code == KeyEvent.VK_UP){
            player.jump = false;
        }
    }
}
