package game;

import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;

public class HealthCollectible extends Collectibles{
    private static final Shape coinShape = new PolygonShape (1f,1f,1f,-1f,-1f,-1f,-1f,1f);
    private int healthIncrease;
    private Player player;

    public HealthCollectible(World world,int healthIncrease,Player player){
        super(world, coinShape);
        this.healthIncrease = healthIncrease;
        this.player = player;
        this.addImage(new BodyImage("data/healthIncrease"+healthIncrease+".png",2));
    }
    @Override
    public void CollisionResponce() {
        player.health += healthIncrease;
        if(player.health>3){player.health=3;}
        System.out.println("Health Increased to "+player.health);
    }
}
