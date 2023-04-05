
package DIA3;

import java.util.Scanner;

/**
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
* MENU
* SUMAR
* RESTAR
* MULTIPLICAR 
* DIVIDIR
* SALIR
* ELIJA OPCION:
 */
public class Ej6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt(),num2 = leer.nextInt(),opcion;
        
         do {
             
             
        System.out.println(" MENU \n 1-SUMAR \n 2-RESTAR \n 3-MULTIPLICAR \n 4-DIVIDIR \n 5-SALIR \n ELIJA OPCION" );
        opcion = leer.nextInt();

        switch (opcion){
            case 1:
                System.out.println("la suma de los dos numeros es: " +(num1+num2));
                break;
            case 2:
                System.out.println("la resta de los dos numeros es: " +(num1-num2));
                 break;
            case 3:
                System.out.println("la multiplicacion de los dos numeros es: " +(num1*num2));
                 break;
            case 4:
                System.out.println("la division de los dos numeros es: " +(num1/num2));
                 break;
            case 5:
                System.out.println("Esta seguro que quiere salir? (S/N)");
                String resp = leer.next();
                
                if (resp.equalsIgnoreCase("S")) {
                    System.out.println("Gracias por usar la calculadora!");
                    break; 
                }else {
                    opcion=(7);
                }     
    }
        } while (opcion != 5); 
    }
}
