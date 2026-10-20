module com.zafg.isis.ejercicio14 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zafg.isis.ejercicio14 to javafx.fxml;
    exports com.zafg.isis.ejercicio14;
}
