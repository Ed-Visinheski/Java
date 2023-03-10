package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Checkpoint extends StaticBody {

    private Vec2 checkpoint = new Vec2(0,-8);
    private static final Shape s = new PolygonShape(1f,1f,1f,-1f,-1f,-1f,-1,1f);
    private final BodyImage checkpointImage = new BodyImage("data/checkpoint.png",2f);

    public Checkpoint(World w) {super(w, s);this.addImage(checkpointImage);}

    public Vec2 GetCheckpointPos(){
        return this.getPosition();
    }

}
