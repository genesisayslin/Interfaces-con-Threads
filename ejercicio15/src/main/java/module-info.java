module com.zafg.isis.ejercicio15 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio15 to javafx.fxml;
    exports com.zafg.isis.ejercicio15;
}
