package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdleTimer implements ActionListener {
    private Player player;
    int counter = 0;
     private MainWorld world;


    public IdleTimer(MainWorld world, Player player) {
        this.world = world;
        this.player = player;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(counter == 20){counter = 0;}
        player.removeAllImages();
        player.addImage(player.updateImage(counter));
        counter++;
    }


}
