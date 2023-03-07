package game;
import city.cs.engine.*;
public class Player extends Walker {
    private static final Shape playerShape = new PolygonShape(
            -1f,-2.75f,
            -1f,2.5f,
            1f,1.1f,
            1f,-2.75f
    );
    private final BodyImage playerImage = new BodyImage("data/WizIdle/W0.png", 10f);
    public Player(World world) {
        super(world, playerShape);
        addImage(playerImage);
    }
}