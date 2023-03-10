package game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControllerTimer implements ActionListener {
    private Player player;
    private PlayerController playerController;

    public PlayerControllerTimer(Player player, PlayerController playerController){
        this.player = player;
        this.playerController = playerController;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(player.dash == true){
            player.stopWalking();
            player.dash =false;
        }
    }
}
