package game;
import city.cs.engine.*;

public class GreenSlime extends Enemy {
    private int health;
    private int damage;

    private static final Shape greenSlimeShape = new PolygonShape(
            -1f,-1f,
            -1f,1f,
            1f,1f,
            1f,-1f
    );
    private static final BodyImage image = new BodyImage("data/Slime.png", 2);

    public GreenSlime(World world) {
        super(world, greenSlimeShape);
        this.addImage(image);
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
