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
        if(counter == 3){counter = 0;}
        player.addImage(player.updateImage(counter));
        System.out.println(counter);
        counter++;

    }
}
