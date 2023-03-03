package game;
import city.cs.engine.*;
public class Enemy extends DynamicBody {
    private static final Shape playerShape = new BoxShape(1, 2);
    private static final BodyImage image = new BodyImage("data/student.png", 4);

    public Enemy(World world) {
        super(world, playerShape);
        this.addImage(image);
    }
}//g