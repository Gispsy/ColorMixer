package fr.mixercolor.colormixer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class ColorMixerController {

    // Label and slider
    public Slider sldRed;
    public Slider sldGreen;
    public Slider sldBlue;
    public Label lblRed;
    public Label lblGreen;
    public Label lblBlue;
    public Label lblMix;

    //Ghost value
    public double red;
    public double green;
    public double blue;

    //Function
    public void moussReleasedRed(MouseEvent mouseEvent) {
        red = sldRed.getValue();
        lblRed.setStyle("-fx-background-color: rgb("+red+","+0+","+0+")");

        //System.out.println(sldRed.getValue());
        changeStyle();

    }

    public void moussReleasedGreen(MouseEvent mouseEvent) {
        green = sldGreen.getValue();
        lblGreen.setStyle("-fx-background-color: rgb("+0+","+green+","+0+")");

        //System.out.println(sldGreen.getValue());
        changeStyle();

    }

    public void moussReleasedBlue(MouseEvent mouseEvent) {
        blue = sldBlue.getValue();
        lblBlue.setStyle("-fx-background-color: rgb("+0+","+0+","+blue+")");

        //System.out.println(sldBlue.getValue());
        changeStyle();
    }

    public void changeStyle(){
        lblMix.setStyle("-fx-background-color: rgb("+red+","+green+","+blue+")");

    }
}