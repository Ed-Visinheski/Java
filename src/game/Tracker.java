package game;
import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;
public class Tracker implements StepListener {
    private MainView view;
    private Player player;
    public Tracker(MainView view, Player player) {
        this.player = player;
        this.view = view;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        if(player.getPosition().y < 0f){
            view.setCentre(new Vec2(0,0));
        }
        else{
            Vec2 cameraView = new Vec2(0,player.getPosition().y);
            view.setCentre(cameraView);
        }
    }
}