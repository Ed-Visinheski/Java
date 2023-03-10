package game;

import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;

public class Points extends Collectibles{

    private int totalCoins=0;
    private static final Shape coinShape = new PolygonShape (1f,1f,1f,-1f,-1f,-1f,-1f,1f);
    public Points(World world){
        super(world, coinShape);
        this.addImage(new BodyImage("data/coin.png",2));
    }


    public void SetTotalCoins(int totalCoins){this.totalCoins=totalCoins;}

    public int GetTotalCoins(){return totalCoins;}

    @Override
    public void CollisionResponce() {
        int totalCoins = GetTotalCoins()+1;
        SetTotalCoins(totalCoins);
        System.out.println(GetTotalCoins());
    }
}
