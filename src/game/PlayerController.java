package game;
import city.cs.engine.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerController implements KeyListener  {
    Player player;
    public PlayerController(Player player){
        this.player = player;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
/*        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            player.startWalking(-5);
        } else if (code == KeyEvent.VK_2) {
            player.startWalking(5);
        }*/
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
