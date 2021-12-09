/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
 pedir numeros hasta que se teclee uno negativo, y mostrar cunatos numeros
 * se han introducido.
 */
public class E_04 {
    public static void main(String[] args) {
        int numero, contador=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        while(numero >= 0){
            contador++;
            
           
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
            
        }
        JOptionPane.showMessageDialog(null, " total de numero ingresados : " + contador + " no negativos ");
    }
}
