module pl.java.wsei.lab5v8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.java.wsei.lab5v8 to javafx.fxml;
    exports pl.java.wsei.lab5v8;
}