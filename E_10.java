/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
pedir 10 numero y escribir la suma total.
 */
public class E_10 {
    public static void main(String[] args) {
        int numero, suma=0,contador=0;
        
        for(int i =1; i <= 10; i++){
             numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
             suma += numero;
             contador++;
              
        }
        JOptionPane.showMessageDialog(null, "la suma es : " + suma);
        JOptionPane.showMessageDialog(null, "la suma es : " + contador);
       
    }
}
