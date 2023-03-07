package game;
import city.cs.engine.Body;
import city.cs.engine.BodyImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class PlayerController implements KeyListener {

    private static final float WALKING_SPEED = 3;

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
            player.startWalking(-WALKING_SPEED*2);
        } else if (code == KeyEvent.VK_RIGHT) {
            player.startWalking(WALKING_SPEED*2);
        }
        else if (code == KeyEvent.VK_UP){
            player.jump(12);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            player.stopWalking();
        } else if (code == KeyEvent.VK_RIGHT) {
            player.stopWalking();
        }
    }
}
