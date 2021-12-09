/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
digitar n cantidad de ventas y sumar las ventas digitadas si preciona 0
* sale, suma la cantaidad de ventas y termina el programa
 */
public class E_13 {
    public static void main(String[] args) {
        
        int ventas,valor,contador=0, suma_ven=0;
        
        ventas = Integer.parseInt(JOptionPane.showInputDialog("digite las ventas del dia"));
        
        for(int i = 1;i<=ventas; i++){
            
            valor =Integer.parseInt(JOptionPane.showInputDialog("digite venta"));
            
            if(valor>0 ){
                suma_ven = suma_ven+valor;
                contador++;
                
            }
            
        }
            JOptionPane.showMessageDialog(null, " el valor total de las ventas es: " + suma_ven);
            JOptionPane.showMessageDialog(null, " el numero de ventas es: " +  ventas);
            
    }
}
