package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreenSlimeTimer implements ActionListener {

    private GreenSlime greenSlime;
    private int slimeCounter = 0;
    public GreenSlimeTimer(GreenSlime greenSlime) {
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
