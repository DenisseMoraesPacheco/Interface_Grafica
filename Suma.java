package InterfazGrafica;

import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        String primerNumero= JOptionPane.showInputDialog("Enter the first integer");

        String segundoNumero=JOptionPane.showInputDialog("Enter the second value");

        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);

        int sum = numero1 + numero2;
        //Muestra los resultados en el dialogo de mensajes de JOptionPane
        JOptionPane.showInputDialog(null,
                "The sum is: "+sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}