package game;

import city.cs.engine.Body;
import city.cs.engine.BodyImage;
import city.cs.engine.GhostlyFixture;
import city.cs.engine.Shape;

public class Signs extends GhostlyFixture {

    private String signType;
    public Signs(Body body, Shape shape,String signType) {
        super(body, shape);
        this.signType = signType;
        body.addImage(SignType());
    }

    public BodyImage SignType(){
        return(new BodyImage("data/"+signType+"Sign.png",2f));
    }
}
