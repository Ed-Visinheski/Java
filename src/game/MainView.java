package game;
import city.cs.engine.UserView;
import javax.swing.*;
import java.awt.*;
public class MainView extends UserView {
    private final Image backgroundThorn;
    private Image backgroundWall;
    private  Image background;
    private  Image backgroundOver;

    public MainView(MainWorld w, int width, int height) {

        super(w, width, height);
        background = new ImageIcon("data/greenBack.jpg").getImage();
        backgroundThorn = new ImageIcon("data/thorn.png").getImage();
        backgroundOver = new ImageIcon("data/bRight.png").getImage();
        backgroundWall = new ImageIcon("data/wall.png").getImage();
    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
        g.drawImage(backgroundOver, 350, 400, this);
        g.drawImage(backgroundWall, 525, 0, this);
        g.drawImage(backgroundWall, -100, 0, this);
        g.drawImage(backgroundThorn, 0, 0, this);

    }
}
