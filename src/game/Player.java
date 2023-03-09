package game;
import city.cs.engine.*;
import city.cs.engine.AttachedImage;
import org.jbox2d.common.Vec2;
public class Player extends Walker {
    private int health = 3;
    String[] playerIdle;
    BodyImage[] playerImageList;
    BodyImage playerImage;
    boolean walk=false;
    boolean jump=false;

    String[] playerWalk;
    BodyImage[] walkImageList;
    String[] playerJump;
    BodyImage[] jumpImageList;
    private static final Shape playerShape = new PolygonShape(-1f,-2.75f,-1f,2.5f,1f,1.1f, 1f,-2.75f);
    public void GenPlayerImageList(){
        playerIdle = new String[20];
        playerImageList = new BodyImage[20];
        playerWalk = new String[20];
        walkImageList = new BodyImage[20];
        playerJump = new String[8];
        jumpImageList = new BodyImage[8];
        for(int i=0; i <20; i++){
            playerIdle[i] = "data/WizIdle/W"+i+".png";
        }
        for(int i = 0; i<20; i++){
            playerImageList[i] = new BodyImage(playerIdle[i],10f);
        }
        for(int i=0; i <20; i++){
            playerWalk[i] = "data/WizWalk/WW"+i+".png";
        }
        for(int i = 0; i<20; i++){
            walkImageList[i] = new BodyImage(playerWalk[i],10f);
        }
        for(int i=0; i <8; i++){
            playerJump[i] = "data/WizJump/WJ"+i+".png";
        }
        for(int i = 0; i<8; i++){
            jumpImageList[i] = new BodyImage(playerJump[i],10f);
        }

    }

    public Player(World world) {
        super(world, playerShape);
        GenPlayerImageList();
        setGravityScale(10);
    }

    public BodyImage updateImage(int idleCounter) {
        if(jump){playerImage = (jumpImageList[idleCounter]);}
        else {
            if (!walk) {
                playerImage = (playerImageList[idleCounter]);
            } else if (walk) {
                playerImage = (walkImageList[idleCounter]);
            }
        }
        return playerImage;
    }
}