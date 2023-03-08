package game;
import city.cs.engine.*;
public class Player extends Walker {
    private int idleCounter;
    private String[] playerIdle = {("data/WizIdle/W0.png"),("data/WizIdle/W1.png"),("data/WizIdle/W10.png")};
    private static final Shape playerShape = new PolygonShape(
            -1f,-2.75f,
            -1f,2.5f,
            1f,1.1f,
            1f,-2.75f
    );

    public int idleCounter(int idleCounter){
        this.idleCounter = idleCounter;
        System.out.println(idleCounter);
        return idleCounter;
    }


    public Player(World world) {
        super(world, playerShape);
    }

    public BodyImage updateImage(int idleCounter) {
        BodyImage playerImage = new BodyImage(playerIdle[idleCounter], 10f);
        return playerImage;
    }
}