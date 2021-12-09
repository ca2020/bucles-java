/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
LEER NUMEROs HASTA QUE SE INTRODUZCA UN 0. PARA CADA UNO INDICAR SI ES PAR O IMPAR

 */
public class E_03 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        while(numero !=0){
            if(numero%2 == 0){
                JOptionPane.showMessageDialog(null, " El numero es par : " + numero);
            }else{
                JOptionPane.showMessageDialog(null, " El numero es impar : " + numero);
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        }
    }
    
}
