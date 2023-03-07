package game;
import city.cs.engine.*;
public class Enemy extends DynamicBody {
    private static final Shape enemyShape = new BoxShape(1, 2);
    private static final BodyImage image = new BodyImage("data/student.png", 4);

    public Enemy(World world) {
        super(world, enemyShape);
        this.addImage(image);
    }
}//g