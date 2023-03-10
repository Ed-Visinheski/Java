package game;
import city.cs.engine.*;

import javax.swing.*;

public class GreenSlime extends Enemy {
    private int health;
    private int damage;

    String[] greenSlimeIdle;
    BodyImage[] greenSlimeImageList;
    BodyImage greenSlimeImage;

    private static final Shape greenSlimeShape = new PolygonShape(
            -1f,-0.8f, -1f,0.3f, -0.5f,0.75f, 0f,0.82f, 0.5f,0.75f, 1f,0.3f, 1f,-0.82f);

    public void GreenSlimeIdle(){
        greenSlimeIdle = new String[30];
        greenSlimeImageList = new BodyImage[30];
        for(int i=0; i <30; i++){
            greenSlimeIdle[i] = "data/SlimeGreen/GS"+i+".png";
        }
        for(int i = 0; i<30; i++){
            greenSlimeImageList[i] = new BodyImage(greenSlimeIdle[i],2f);
        }
    }


    public GreenSlime(MainWorld world) {
        super(world, greenSlimeShape);
        GreenSlimeIdle();
        Timer timer = new Timer(100,new GreenSlimeTimer(this));
        timer.start();
    }

    public BodyImage updateImage(int idleCounter) {
        greenSlimeImage = (greenSlimeImageList[idleCounter]);
        return greenSlimeImage;
    }

    @Override
    public void enemyHealth() {
        health = 100;
    }

    @Override
    public void enemyAttack() {
        damage = 5;
    }

    @Override
    public void enemyMovement() {
    }
}
