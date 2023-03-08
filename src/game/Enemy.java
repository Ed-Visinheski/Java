package game;
import city.cs.engine.*;
public abstract class Enemy extends Walker {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public Enemy(World world, Shape shape) {
        super(world,shape);
    }
    public abstract void enemyHealth();
    public abstract void enemyAttack();
    public abstract void enemyMovement();


    /*private abstract static final Shape enemyShape
    private abstract static final BodyImage image = new BodyImage("data/Slime.png", 4);

    public Enemy(World world) {
        super(world, enemyShape);
        this.addImage(image);
    }*/
}