package game;

import city.cs.engine.DynamicBody;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;

import java.awt.*;

public abstract class Collectibles extends DynamicBody {
    private String name;

    public Collectibles(World world, Shape shape) {
        super(world, shape);
    }

    public void setName(String name){
        this.name = name;
    }
    public abstract void CollisionResponce();
}
