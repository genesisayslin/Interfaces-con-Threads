module com.zafg.isis.ejercicio13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio13 to javafx.fxml;
    exports com.zafg.isis.ejercicio13;
}
