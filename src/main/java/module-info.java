module retailsoftwaresample {
    
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires java.desktop;

    opens com.nmatute.retailsoftwaresample to javafx.fxml;
    exports com.nmatute.retailsoftwaresample;
}
