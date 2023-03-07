package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
public class MainWorld extends World {
    private  Player player;
    public MainWorld(){
        Shape shape = new BoxShape(12.5f, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0.0f, -12f));

        Shape platform1Shape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-8, -4f));


        player = new Player(this);
        player.setPosition(new Vec2(0,-8));

    }
    public Player getPlayer(){
        return player;
    }
}
//g