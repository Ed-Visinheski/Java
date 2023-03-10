package game;
import city.cs.engine.*;
import javax.management.ValueExp;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class Main {
    private MainWorld world;
    private MainView view;
    public Main() {
        world = new MainWorld();

        view = new MainView(world,600,600);

        PlayerController controller = new PlayerController(world.getPlayer());
        view.addKeyListener(controller);
        view.addMouseListener(new Focus(view));
        world.addStepListener(new Tracker(view, world.getPlayer()));

        view.setGridResolution(1.0F);
        JFrame frame = new JFrame("Tower of God");
        frame.add(view);
        frame.setDefaultCloseOperation(3);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        //JFrame debugView = new DebugViewer(world, 600, 600);
        world.start();
    }

    public static void main(String[] args) {
        new Main();
    }

    public static void update() {

    }
}
