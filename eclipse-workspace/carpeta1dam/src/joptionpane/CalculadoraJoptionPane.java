package joptionpane;

import javax.swing.JOptionPane;

public class CalculadoraJoptionPane {
    public static void main(String[] args) {
        // Crear cuatro botones para las operaciones
        Object[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        int operation = JOptionPane.showOptionDialog(null, "Selecciona una operación", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        // Pedir al usuario que introduzca dos números
        String num1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String num2 = JOptionPane.showInputDialog("Introduce el segundo número:");
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        // Realizar la operación seleccionada
        if (operation == 0) {
            JOptionPane.showMessageDialog(null, "El resultado de la suma es " + (numero1 + numero2));
        } else if (operation == 1) {
            JOptionPane.showMessageDialog(null, "El resultado de la resta es " + (numero1 - numero2));
        } else if (operation == 2) {
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es " + (numero1 * numero2));
        } else if (operation == 3) {
            JOptionPane.showMessageDialog(null, "El resultado de la división es " + (numero1 / numero2));
        } else {
            JOptionPane.showMessageDialog(null, "Operación no válida");
        }
    }
}







