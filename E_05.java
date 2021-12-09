/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import javax.swing.JOptionPane;
/**
realizar un juego para adivinar un numero. para ello generar un numero aleatorio entre 0-100
* y luego ir pidiendo numero indicando" es mayor" 0 "es menor" segun sea mayor o menor con 
* respecto a N. El proceso termian cuando el usuario acierta y mostrar el numero 
* de intentos.
*/
public class E_05 {
    public static void main(String[] args) {
       int numero, n2 , contador=0;
       
       n2= (int)(Math.random()*100);
       
       do{
           
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
            
            if(n2>numero){
                JOptionPane.showMessageDialog(null, "digite un numero mayor " );
            }else{
                
                    JOptionPane.showMessageDialog(null, "digite un numero menor  " );
                
            }
             contador++;
           
           
       }while(numero!=n2);
            
            JOptionPane.showMessageDialog(null, "advinaste el numero !!" + n2+  " el numero en : " + contador + " intentos");
    }
}
