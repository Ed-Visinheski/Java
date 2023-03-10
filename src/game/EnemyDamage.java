package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class EnemyDamage implements CollisionListener {
    private Player player;

    public EnemyDamage(Player player){
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
    }
}
