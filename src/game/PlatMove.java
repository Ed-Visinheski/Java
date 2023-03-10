package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class PlatMove extends StaticBody implements StepListener {

    //private static final Shape liftShape = new BoxShape(2, 0.2f);
    private Vec2 startPosition;
    private float start, end;
    private float delta;
    private boolean vertical;

    /*
    This implementation works for static bodies that don't have a startWalking method. The body
    is moved using multiple calls to setPosition();
     */

    public PlatMove(World w,Shape platShape,Vec2 startPos,Vec2 endPos,float speed, boolean vertical) {
        super(w, platShape);
        this.vertical = vertical;
        this.startPosition = startPos;
        if(vertical == true) {
            start = startPosition.y;
            end = endPos.y;
            delta = speed;
        }
        else{
            start = startPosition.x;
            end = endPos.x;
            delta = speed;
        }
        w.addStepListener(this);
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if(vertical) {
            if (getPosition().y <= start) {this.setPosition(startPosition);delta *= -1;}
            if (getPosition().y >= end) {delta *= -1;}
            this.setPosition(new Vec2(this.getPosition().x, this.getPosition().y + delta));
        }
        else{
            if (getPosition().x < start) {
                this.setPosition(startPosition);
                delta *= -1;
            }
            if (getPosition().x > end) {
                delta *= -1;
            }
            this.setPosition(new Vec2(this.getPosition().x+ delta, this.getPosition().y));
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}
