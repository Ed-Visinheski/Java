package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreenSlimeTimer implements ActionListener {

    private MainWorld world;
    private GreenSlime greenSlime;
    private int slimeCounter = 0;
    public GreenSlimeTimer(MainWorld world, GreenSlime greenSlime) {
        this.world = world;
        this.greenSlime = greenSlime;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(slimeCounter == 30){slimeCounter = 0;}
        greenSlime.removeAllImages();
        greenSlime.addImage(greenSlime.updateImage(slimeCounter));
        slimeCounter++;
    }
}
