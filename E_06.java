/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
*/
public class E_06 {
    public static void main(String[] args) {
        int numero, suma=0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
            
            suma = suma+numero;//suma iteradora
            
        }while(numero !=0);
        
        JOptionPane.showMessageDialog(null, "la sumas es : " + suma);
        
    }
}
