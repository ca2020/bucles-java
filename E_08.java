/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
 PEDIR UN NUMERO N, Y MOSTRAR TODOS LOS NUMERO DE 1 AL N
 */
public class E_08 {
    public static void main(String[] args) {
        int numero ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        for(int i=1;i<=numero;i++){
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
