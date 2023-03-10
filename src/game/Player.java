package game;
import city.cs.engine.*;
import city.cs.engine.AttachedImage;
import org.jbox2d.common.Vec2;

import javax.swing.*;

public class Player extends Walker {
    public boolean dash = false;
    int health = 3;
    private String imageName, previousFrame;
    public boolean flipImage = false;
    private Vec2 checkpoint = new Vec2(0,-8);
    private static final Shape playerShape = new PolygonShape(-0.5f,-0.9f,-0.5f,0.9f,0.5f,0.9f, 0.5f,-0.9f);

    public Player(World world) {
        super(world, playerShape);
        setGravityScale(10);
        this.addImage(new BodyImage("data/playeridle.gif",2f));
    }

    public void SpriteChange(Boolean walk){
        if(walk){
            imageName = "walk";
        }
        else{
            imageName = "idle";
        }
        if(imageName != previousFrame ){
            this.removeAllImages();
            if(flipImage){this.addImage(new BodyImage("data/player"+imageName+".gif",2f)).flipHorizontal();}
            else {this.addImage(new BodyImage("data/player" + imageName + ".gif", 2f));}
        }
        previousFrame = imageName;
    }
    public void SetCheckpoint(Vec2 checkpoint){
        this.checkpoint = checkpoint;
    }
    public Vec2 GetCheckpoint(){
        return checkpoint;
    }
}
