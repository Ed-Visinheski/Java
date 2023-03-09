package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdleTimer implements ActionListener {
    private Player player;
    int idleCounter = 0;
    int jumpCounter = 0;
    int walkCounter = 0;
     private MainWorld world;


    public IdleTimer(MainWorld world, Player player) {
        this.world = world;
        this.player = player;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(idleCounter == 20){idleCounter = 0;}
        if(walkCounter == 20){idleCounter = 0;}
        if(jumpCounter == 8){jumpCounter = 0;}
        if(player.jump){
            walkCounter = 0;
            idleCounter = 0;
            player.removeAllImages();
            player.addImage(player.updateImage(jumpCounter));
            jumpCounter++;
        }
        else {
            if (player.walk) {
                jumpCounter = 0;
                idleCounter = 0;
                player.removeAllImages();
                player.addImage(player.updateImage(walkCounter));
                walkCounter++;
            } else if (!player.walk) {
                walkCounter = 0;
                player.removeAllImages();
                player.addImage(player.updateImage(idleCounter));
                idleCounter++;
            }
        }
    }


}
