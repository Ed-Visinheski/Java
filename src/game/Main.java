package game;
import city.cs.engine.*;

import javax.management.ValueExp;
import javax.swing.JFrame;
import org.jbox2d.common.Vec2;

public class Main {
    public Main() {
        MainWorld world = new MainWorld();
        MainView view = new MainView(world,500,500);

        PlayerController controller = new PlayerController(world.getPlayer());
        view.addKeyListener(controller);

        view.setGridResolution(1.0F);
        JFrame frame = new JFrame("Tower of God");
        frame.add(view);
        frame.setDefaultCloseOperation(3);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        //JFrame debugView = new DebugViewer(world, 500, 500);
        world.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
