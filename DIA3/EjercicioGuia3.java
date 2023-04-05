
package DIA3;

import java.util.Scanner;

/** primero JAVA y despues NETBEANS!
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class EjercicioGuia3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota del 1 al 10: ");
        int nota;
        
        
        do {
            nota=leer.nextInt();
            
            if (nota<0 || nota>10)
                System.out.println("La nota ingresada no es valida, ingrese nuevamente");
            
        } while (nota<0 || nota>=10);
        System.out.println("Nota Indexada!");
}
}    
    
/*
*    mientras y hacer mientras
*    mientras (algo pase)
*    FinMientras
*   afuera habia que definir variables 
*
*   hacer
*       adentro habia que preguntar todo
*   (   statement)
*   mientras que (boolean)
*/
