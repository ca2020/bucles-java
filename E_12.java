/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
pedir un numero y calcular su factorial
 */
public class E_12 {
    public static void main(String[] args) {
        int numero, factorial=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        for(int i=1; i<=numero;i++){
            factorial *=i;
        }
        JOptionPane.showMessageDialog(null, " el factorial del " + numero + "  es : " + factorial);
    }
}
