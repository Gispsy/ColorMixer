module fr.mixercolor.colormixer {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.mixercolor.colormixer to javafx.fxml;
    exports fr.mixercolor.colormixer;
}