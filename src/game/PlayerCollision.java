package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class PlayerCollision implements CollisionListener {
    private Player player;

    public PlayerCollision(Player player){
        this.player = player;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if(collisionEvent.getOtherBody() instanceof Enemy){
            if (player.dash == true){
                collisionEvent.getOtherBody().destroy();
            }
            else{
                player.health--;
                collisionEvent.getOtherBody().destroy();
            }
            System.out.print(player.health);
        }
        if(collisionEvent.getOtherBody() instanceof Collectibles){
            ((Collectibles) collisionEvent.getOtherBody()).CollisionResponce();
            collisionEvent.getOtherBody().destroy();
        }
        if(collisionEvent.getOtherBody() instanceof Checkpoint){
            player.SetCheckpoint(((Checkpoint) collisionEvent.getOtherBody()).GetCheckpointPos());
            collisionEvent.getOtherBody().destroy();
        }
    }
}
