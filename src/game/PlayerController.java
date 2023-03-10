package game;
import city.cs.engine.Body;
import city.cs.engine.BodyImage;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PlayerController implements KeyListener {
    private static final float WALKING_SPEED = 10;
    private Timer timer;
    private Player player;
    private boolean buttonPressed = false;

    private HashMap<Body, BodyImage> hiddenImages = null;

    public PlayerController(Player p){
        player = p;
        timer = new Timer(50,new PlayerControllerTimer(player,this));
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_LEFT) {
            player.flipImage=true;
            player.SpriteChange(true);
            player.startWalking(-WALKING_SPEED);
        }
        else if (code == KeyEvent.VK_SPACE){
            if(!buttonPressed&& !player.flipImage) {
                player.dash = true;
                timer.start();
                player.startWalking(WALKING_SPEED * 3);
                buttonPressed = true;
                timer.stop();
            }
            else if(!buttonPressed && player.flipImage){
                player.dash = true;
                timer.start();
                player.startWalking(-WALKING_SPEED * 3);
                buttonPressed = true;
                timer.stop();
            }
            player.SpriteChange(true);
        }
        else if (code == KeyEvent.VK_RIGHT) {
            player.flipImage=false;
            player.SpriteChange(true);
            player.startWalking(WALKING_SPEED);
        }
        else if (code == KeyEvent.VK_UP){
            player.jump(40);
        }
        else if (code == KeyEvent.VK_R){
            player.setPosition(player.GetCheckpoint());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            player.stopWalking();
            player.SpriteChange(false);
        } else if (code == KeyEvent.VK_RIGHT) {
            player.stopWalking();
            player.SpriteChange(false);
        }
        else if (code == KeyEvent.VK_UP){
        }
        else if (code == KeyEvent.VK_SPACE) {
            player.stopWalking();
            buttonPressed = false;
            player.SpriteChange(false);
        }
    }
}
