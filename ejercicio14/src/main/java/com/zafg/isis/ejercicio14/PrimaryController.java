package com.zafg.isis.ejercicio14;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        String tabla = "";

        for (int i = 1; i <= 10; i++) {
            tabla = tabla + numero + "x" + i + " = " + (numero * i) + "\n";
        }

        txtTabla.setText(tabla);
    }

    @FXML
    private void limpiar() {
        txtNumero.setText("");
        txtTabla.setText("");
    }
}