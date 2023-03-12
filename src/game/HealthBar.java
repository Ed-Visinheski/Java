package game;

import city.cs.engine.Body;
import city.cs.engine.BodyImage;
import city.cs.engine.GhostlyFixture;
import city.cs.engine.Shape;

public class HealthBar extends GhostlyFixture {
    private Player player;
    private Body healthBarBody;

    public HealthBar(Body body, Shape shape,Player player) {
        super(body, shape);
        this.player = player;
        this.healthBarBody = body;
        healthBarBody.addImage(new BodyImage("data/3Health.png",1f));
    }
    public void SpriteChange(){
        healthBarBody.removeAllImages();
        if(player.health>3){healthBarBody.addImage(new BodyImage("data/3Health.png",1f));}
        else if(player.health<0){healthBarBody.addImage(new BodyImage("data/0Health.png",1f));}
        else{healthBarBody.addImage(new BodyImage("data/"+player.health+"Health.png",1f));}
    }
}
