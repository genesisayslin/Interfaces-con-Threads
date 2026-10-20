module com.zafg.isis.ejercicio11 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio11 to javafx.fxml;
    exports com.zafg.isis.ejercicio11;
}
