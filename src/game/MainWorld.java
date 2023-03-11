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

        Points coin = new Points(this);
        coin.setPosition(new Vec2(-8,-5));

        Shape platform2Shape = new BoxShape(3, 0.5f);
        PlatMove xPlat1 = new PlatMove(this, platform2Shape,new Vec2(1,0),new Vec2(8,0),0.05f,false);
        xPlat1.setPosition(new Vec2(3,0 ));

        StaticBody platform3 = new StaticBody(this, platform2Shape);
        platform3.setPosition(new Vec2(3, 6f));

        Shape smallBoxShape = new BoxShape(1f,1f);
        StaticBody smallBox = new StaticBody(this,smallBoxShape);
        smallBox.setPosition(new Vec2(0,10));

        Points coin1 = new Points(this);
        coin1.setPosition(new Vec2(0,11));

        Shape smallBoxShape2 = new BoxShape(2f,1f);
        StaticBody smallBox1 = new StaticBody(this,smallBoxShape2);
        smallBox1.setPosition(new Vec2(-7,10));

        GreenSlime greenSlime1 = new GreenSlime(this);
        greenSlime1.setPosition(new Vec2 (-7,11));

        StaticBody smallBox2 = new StaticBody(this,smallBoxShape2);
        smallBox2.setPosition(new Vec2(-12,12));

        PlatMove yAxis = new PlatMove(this,smallBoxShape,new Vec2(-13,14),new Vec2(-13,23),0.05f,true);
        yAxis.setPosition(new Vec2(-13, 14));

        Shape longPlatShape = new BoxShape(10f,0.5f);
        StaticBody longPlatform = new StaticBody(this, longPlatShape);
        longPlatform.setPosition(new Vec2(3,25));


        player = new Player(this);
        player.setPosition(new Vec2(0,-8));


        Lizard lizard = new Lizard(this);
        lizard.setPosition(new Vec2(2,27));

        HealthCollectible health1 = new HealthCollectible(this,3,player);
        health1.setPosition(new Vec2(0,0));

        Checkpoint checkpoint = new Checkpoint(this);
        checkpoint.setPosition(new Vec2(10,27));

        StaticBody signBody = new StaticBody(this);
        new Signs(signBody,smallBoxShape,new String("topRight"));
        signBody.setPosition(new Vec2(-4,-2));
        StaticBody signBody2 = new StaticBody(this);
        new Signs(signBody2,smallBoxShape,new String("topLeft"));
        signBody2.setPosition(new Vec2(10,3));
        StaticBody healthBarBody = new StaticBody(this);
        HealthBar healthBar = new HealthBar(healthBarBody,smallBoxShape,player);
        healthBarBody.setPosition(new Vec2(13,13));



        PlayerCollision pc = new PlayerCollision(player,healthBar);
        player.addCollisionListener(pc);

    }
    public Player getPlayer(){
        return player;
    }
}
//g