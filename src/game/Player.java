package game;
import city.cs.engine.*;
import city.cs.engine.AttachedImage;
import org.jbox2d.common.Vec2;
public class Player extends Walker {
    private int health = 3;
    String[] playerIdle;
    BodyImage[] playerImageList;
    BodyImage playerImage;
    private static final Shape playerShape = new PolygonShape(-1f,-2.75f,-1f,2.5f,1f,1.1f, 1f,-2.75f);
    public void PlayerIdle(){
        playerIdle = new String[20];
        playerImageList = new BodyImage[20];
        for(int i=0; i <20; i++){
            playerIdle[i] = "data/WizIdle/W"+i+".png";
        }
        for(int i = 0; i<20; i++){
            playerImageList[i] = new BodyImage(playerIdle[i],10f);
        }
    }

    public Player(World world) {
        super(world, playerShape);
        PlayerIdle();
        setGravityScale(10);
    }

    public BodyImage updateImage(int idleCounter) {
        playerImage = (playerImageList[idleCounter]);
        return playerImage;
    }
}