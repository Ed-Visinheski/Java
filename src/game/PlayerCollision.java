package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class PlayerCollision implements CollisionListener {
    private Player player;
    private HealthBar healthBar;

    public PlayerCollision(Player player, HealthBar healthBar){
        this.player = player;
        this.healthBar = healthBar;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if(collisionEvent.getOtherBody() instanceof Enemy){
            if (player.dash == true){
                collisionEvent.getOtherBody().destroy();
            }
            else{
                player.health--;
                healthBar.SpriteChange();
                collisionEvent.getOtherBody().destroy();
            }
        }
        if(collisionEvent.getOtherBody() instanceof Collectibles){
            ((Collectibles) collisionEvent.getOtherBody()).CollisionResponce();
            if (player.health>3){player.health=3;}
            collisionEvent.getOtherBody().destroy();
        }
        if(collisionEvent.getOtherBody() instanceof Checkpoint){
            player.SetCheckpoint(((Checkpoint) collisionEvent.getOtherBody()).GetCheckpointPos());
            collisionEvent.getOtherBody().destroy();
        }
    }
}
