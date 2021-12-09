/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
 pedir numeros hasta que se introduzca uno negativo, y caclcular la media.
 */
public class E_07 {
    public static void main(String[] args) {
        int numero,media,total=0,suma=0 ;
        
         numero = Integer.parseInt(JOptionPane.showInputDialog(" digite numero "));
         while(numero >=0){
          
            
            suma  += numero;//suma iteradora
            total++;
            numero = Integer.parseInt(JOptionPane.showInputDialog(" digite numero "));
         }
            if(total ==0){
                JOptionPane.showMessageDialog(null, "no se puede dividir por 0 : " );
            }else{
                media = suma/total;
                JOptionPane.showMessageDialog(null, "la media es : " + media);
            }
           
         
    }
}
