package com.zafg.isis.ejercicio11;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    @FXML
    private void calcular() {
        String fecha = txtFecha.getText();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anio = Integer.parseInt(fecha.substring(6, 10));

        LocalDate hoy = LocalDate.now();
        int anios = hoy.getYear() - anio;
        int meses = hoy.getMonthValue() - mes;

        if (hoy.getDayOfMonth() < dia) {
            meses = meses - 1;
        }
        if (meses < 0) {
            anios = anios - 1;
            meses = meses + 12;
        }

        lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }

    @FXML
    private void limpiar() {
        txtFecha.setText("");
        lblResultado.setText("");
    }
}