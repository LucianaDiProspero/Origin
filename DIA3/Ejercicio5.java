
package DIA3;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite números al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
public class Ejercicio5 { 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int aux = 0;
        System.out.println("ingrese un valor limite positivo: ");
        int num1 = leer.nextInt();
        
        
       for (int i=0; (i<=num1-1); i++){
           System.out.println("ingrese un numero entero positivo menor al limite");
           int num2 = leer.nextInt();
           aux+=num2;
           if (aux>num1) {
        System.out.println("La suma supero el limite indicado");
        break;
         }
        
        }
    }
}
