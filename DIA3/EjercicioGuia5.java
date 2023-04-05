
package DIA3;

import java.util.Scanner;

/**

Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
public class EjercicioGuia5 {

   
   
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int i;
        int j;
  
        for (i = 0; i < 4; i++) {
         System.out.println("ingrese un numero entero entre 1 y 20");
         int num = leer.nextInt();
            System.out.print(num+" ");
             for (j = 0; j < num; j++) {
               System.out.print("*");   }
             System.out.print(System.lineSeparator());
        }
    }
    }
