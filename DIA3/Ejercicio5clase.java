
package DIA3;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite números al usuario hasta que la suma de los
numeros introducidos supere el limite
 */
public class Ejercicio5clase{

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite,num1,suma;
        suma=0;
        System.out.println("Ingrese un numero limite");
        limite = leer.nextInt();
        
        
        do {
            System.out.println("Ingrese un numero"); 
            num1=leer.nextInt();
            suma += num1;
            
            System.out.println("La suma de los numeros es:"+suma );
           
            
        } while (suma<=limite);
        System.out.println("Se supero el limite "+limite);
        
    }

}
