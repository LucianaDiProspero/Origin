
package DIA3;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el pass: ");
        
            String pass = "eureka";
            
           String pass2 = leer.next();
            
           if (pass2.equalsIgnoreCase(pass)) {
               System.out.println("CORRECTO!");
        }else{
               System.out.println("Incorrecto  -.-");    
               
        
    }
}
}
