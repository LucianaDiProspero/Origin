
package DIA3;

import java.util.Scanner;

/**
Crear un programa que dado un número determine si es par o impar.
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Ingrese un numero entero positivo:");
        int num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es PAR");   
        }else{
          System.out.println("El numero ingresado es IMPAR");
           
                     
                  
        }
}
}
