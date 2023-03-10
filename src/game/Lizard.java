package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;

public class Lizard extends Enemy implements StepListener {

    private int health;
    private int damage;
    private float left,right;
    private float v = 4;
    private final int RANGE = 3;

//    String[] orangeSlimeIdle;
//    BodyImage[] orangeSlimeImageList;
//    BodyImage orangeSlimeImage;

    private static final Shape orangeSlimeShape = new PolygonShape(
            -1f,-0.8f, -1f,0.3f, -0.5f,0.75f, 0f,0.82f, 0.5f,0.75f, 1f,0.3f, 1f,-0.82f);
    private String imageName;
    private String previousFrame;
    private boolean flipImage = false;


    public Lizard(MainWorld world) {
        super(world, orangeSlimeShape);
        this.addImage(new BodyImage("data/lizard_run.gif",2f));
        world.addStepListener(this);
        startWalking(v);
    }

    @Override
    public void enemyHealth() {

    }

    @Override
    public void enemyAttack() {

    }

    @Override
    public void enemyMovement() {

    }

    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x-RANGE;
        right = position.x+RANGE;
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right){
            flipImage = true;
            startWalking(-v);
        }
        if (getPosition().x < left){
            flipImage = false;
            startWalking(v);
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}
