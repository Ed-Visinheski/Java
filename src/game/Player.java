package game;
import city.cs.engine.*;

public class Player extends DynamicBody {

    private static final Shape playerShape = new BoxShape(1,2);
    private static final BodyImage image = new BodyImage("data/student.png",4);
    public Player(World w) {
        super(w, playerShape);
        this.addImage(image);
    }
}
