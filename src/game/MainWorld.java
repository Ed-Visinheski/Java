package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import javax.swing.*;

public class MainWorld extends World {
    private  Player player;
    private GreenSlime greenSlime;

    public MainWorld(){
        Shape shape = new BoxShape(12.5f, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0.0f, -12f));

        Shape platform1Shape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-8, -6f));

        Shape platform2Shape = new BoxShape(3, 0.5f);
        PlatMove xPlat1 = new PlatMove(this, platform2Shape,new Vec2(1,0),new Vec2(8,0),0.05f,false);
        xPlat1.setPosition(new Vec2(3,0 ));

        StaticBody platform3 = new StaticBody(this, platform2Shape);
        platform3.setPosition(new Vec2(3, 6f));

        Shape smallBoxShape = new BoxShape(1f,1f);
        StaticBody smallBox = new StaticBody(this,smallBoxShape);
        smallBox.setPosition(new Vec2(0,10));

        Shape smallBoxShape2 = new BoxShape(2f,1f);
        StaticBody smallBox1 = new StaticBody(this,smallBoxShape2);
        smallBox1.setPosition(new Vec2(-7,10));

        StaticBody smallBox2 = new StaticBody(this,smallBoxShape2);
        smallBox2.setPosition(new Vec2(-12,12));

        PlatMove yAxis = new PlatMove(this,smallBoxShape,new Vec2(-13,14),new Vec2(-13,23),0.05f,true);
        yAxis.setPosition(new Vec2(-13, 14));

        Shape longPlatShape = new BoxShape(10f,0.5f);
        StaticBody longPlatform = new StaticBody(this, longPlatShape);
        longPlatform.setPosition(new Vec2(3,25));


        player = new Player(this);
        player.setPosition(new Vec2(0,-8));

        greenSlime = new GreenSlime(this);
        greenSlime.setPosition(new Vec2(3,4));

        Lizard lizard = new Lizard(this);
        lizard.setPosition(new Vec2(5,27));

        GreenSlime greenSlime1 = new GreenSlime(this);
        greenSlime1.setPosition(new Vec2(-3,4));

        EnemyDamage edl = new EnemyDamage(player);
        player.addCollisionListener(edl);
    }
    public Player getPlayer(){
        return player;
    }
}
//g