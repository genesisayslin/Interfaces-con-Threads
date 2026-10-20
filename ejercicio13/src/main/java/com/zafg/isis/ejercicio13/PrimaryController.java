package com.zafg.isis.ejercicio13;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtImpares;
    @FXML private TextField txtPares;
    @FXML private TextField txtTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText());
        int copia = numero;

        int cantidad = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int mayor = 0;
        int menor = 9;

        while (copia > 0) {
            int digito = copia % 10;
            cantidad++;

            if (digito % 2 == 0) {
                sumaPares = sumaPares + digito;
            } else {
                sumaImpares = sumaImpares + digito;
            }

            if (digito > mayor) {
                mayor = digito;
            }
            if (digito < menor) {
                menor = digito;
            }

            copia = copia / 10;
        }

        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + i + "\n";
            }
        }

        txtCantidad.setText(cantidad + "");
        txtImpares.setText(sumaImpares + "");
        txtPares.setText(sumaPares + "");
        txtTotal.setText((sumaImpares + sumaPares) + "");
        txtMayor.setText(mayor + "");
        txtMenor.setText(menor + "");
        txtDivisores.setText(divisores);
    }

    @FXML
    private void limpiar() {
        txtNumero.setText("");
        txtCantidad.setText("");
        txtImpares.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtDivisores.setText("");
    }
}
