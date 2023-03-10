package game;
import city.cs.engine.UserView;
import javax.swing.*;
import java.awt.*;
public class MainView extends UserView {
    private  Image background;
    private Image topRightSign;
    private Image topLeftSign;

    public MainView(MainWorld w, int width, int height) {

        super(w, width, height);
        background = new ImageIcon("data/background.png").getImage();
        topRightSign = new ImageIcon("data/topRightSign.png").getImage();
        topLeftSign = (new ImageIcon("data/topLeftSign.png").getImage());
    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }
}
