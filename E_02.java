/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import javax.swing.JOptionPane;

/**
LEER UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO.
* EL PROCESO SE REPETIRAR HASTA QUE SE INTRODUZCA UN 0
 */
public class E_02 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        while(numero > 0){
            JOptionPane.showMessageDialog(null, "el numero es positivo : " + numero );
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
            if(numero < 0){
                JOptionPane.showMessageDialog(null, "el numero es negativo : " + numero);
                numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
            }
        }
    }
}
