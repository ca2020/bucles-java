/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 */
public class E_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        while(numero >=0){
            JOptionPane.showMessageDialog(null, "el numero es " + Math.pow(numero, 2));
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        }
            
    }
    
}
