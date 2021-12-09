/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
 escribir todos los numeros del 100 al 0 de 7 en 7
 */
public class E_09 {
    public static void main(String[] args) {
     
        
        for(int i=100;i>=0;i-=7){
            if(i!=0){
                JOptionPane.showMessageDialog(null, i);
            }
            
        }
    }
}
