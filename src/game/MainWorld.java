package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public class MainWorld extends World {
    private Player player;
    public MainWorld(){
        super();
        Shape shape = new BoxShape(12.5F, 1F);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0.0F, -12F));

        Player player = new Player(this);
        player.setPosition(new Vec2(0,0));

        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(3,3));

    }
    public Player getPlayer(){
        return player;
    }
}
