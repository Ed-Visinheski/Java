package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainWorld extends World {
    private  Player player;
    private GreenSlime greenSlime;
    private Timer timer;
    private int counter;
    public MainWorld(){
        Shape shape = new BoxShape(12.5f, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0.0f, -12f));

        Shape platform1Shape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-8, -6f));

        Shape platform2Shape = new BoxShape(3, 0.5f);
        StaticBody platform2 = new StaticBody(this, platform2Shape);
        platform2.setPosition(new Vec2(3, 0f));


        player = new Player(this);
        player.setPosition(new Vec2(0,-8));

        GreenSlime greenSlime = new GreenSlime(this);
        greenSlime.setPosition(new Vec2(3,4));
        Timer timer = new Timer(100,new IdleTimer(this,player));
        timer.start();

        GreenSlime greenSlime1 = new GreenSlime(this);
        greenSlime1.setPosition(new Vec2(-3,4));


    }
    public Player getPlayer(){
        return player;
    }
}
//g