
package DIA3;

import java.util.Scanner;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class EjercicioExtra2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
       int A=20, B=30 , C=40 , D=50, aux;
        System.out.append("A = " +A+ "    ");
        System.out.append("B = " +B+"    ");
        System.out.append("C = " +C+ "    ");
        System.out.append("D = " +D+ "    ");
        System.out.println("");
        System.out.println("----------------------");
        
       aux=B;
       B=C;
       C=A;
       A=D;
       D=aux;

        System.out.println("A ="+A );
        System.out.println("B ="+B );
        System.out.println("C ="+C );
        System.out.println("D ="+D );
        
    }

}
