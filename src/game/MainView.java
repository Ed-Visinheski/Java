package game;
import city.cs.engine.UserView;
import javax.swing.*;
import java.awt.*;
public class MainView extends UserView {
    private  Image background;

    public MainView(MainWorld w, int width, int height) {

        super(w, width, height);
        background = new ImageIcon("data/sky.png").getImage();
    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 130, this);
    }
}
