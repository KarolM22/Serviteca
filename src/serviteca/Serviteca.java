/*2.	En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”,
dicha promoción consiste en lo siguiente:
•	Si se compran menos de cinco llantas el precio es de U$100 cada una,
de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.
•	Obtener la cantidad de dinero que una persona tiene que pagar por 
cada una de las llantas que compra y la que tiene que pagar por el total de la compra.

 */
package serviteca;

import java.util.Scanner;


/**
 *
 * @author KAROL LIZETH MARTINEZ 20201186781
 */
public class Serviteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer  = new Scanner(System.in); 
        System.out.println("|-----Bienvenido a Serviteca-----|"); 
        System.out.println("");
        System.out.println("Hoy tenemos una promocion en la marca de llantas Pinchadas");
        System.out.println("");
        System.out.println("Por la cantidad de llantas compradas segun la regla");
        System.out.println("Si compra menos de 5 llantas cada una tendra el precion de U$100");
        System.out.println("Si compra entre 5 y 10  llantas cada una tendra el precion de $75");
        System.out.println("Si compra mas de 10  llantas cada una tendra el precion de $50");
        System.out.println("");
        int llantas, totalpagar;
        System.out.println("porfavor ingresar el numero de llantas a comprar");
        llantas=leer.nextInt();
        
        if (llantas<5){
            System.out.println("cada llanta tiene un valor de $100");
            totalpagar=llantas*100;
        }
        else{
            if ((llantas>=5) && (llantas<=10)){
                System.out.println("cada llanta tiene un valor de $75");
                totalpagar=llantas*75; 
                
            }
            else {
                System.out.println("cada llanta tiene un valor de $50");
                totalpagar=llantas*50;
                
            }
        } 
        
        
        System.out.println("su total a pagar es de :"+totalpagar);
        
        
    }
       
}
