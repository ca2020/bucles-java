/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
 diseñar un programa quue muestre el producto de los 10 primeros numero impares
 */
public class E_11 {
    public static void main(String[] args) {
        int numero=1;
        
        for(int i=1; i<=20;i+=2){
            numero *= i;
        }
        JOptionPane.showMessageDialog(null, numero);
    }
}
