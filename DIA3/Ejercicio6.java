
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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 2 numeros enteros positivos: ");
        double num1 = leer.nextInt(),num2 = leer.nextInt();
        boolean resp = true;
        int opcion;

        do {
            System.out.println("");
            System.out.println("------MENU------");
            System.out.println(" 1-SUMAR \n 2-RESTAR \n 3-MULTIPLICAR \n 4-DIVIDIR \n 5-SALIR \n elija una opcion: " );
            opcion = leer.nextInt();
            System.out.println("----------------"); 
          
            
            if (opcion >= 1 || opcion <= 5) {
                switch (opcion) {
                    case 1:
                        double suma = num1 + num2;
                        System.out.println("La suma de los dos numeros " + num1 + " + " + num2 + " es: " + suma);
                        break;
                    case 2:
                        double resta = num1 - num2;
                        System.out.println("La resta de los dos numeros " + num1 + " - " + num2 + " es: " + resta);
                        break;
                    case 3:
                        double mult = num1 * num2;
                        System.out.println("La multiplicacion de los dos numeros " + num1 + " x " + num2 + " es: " + mult);
                        break;
                    case 4:
                        double division = num1 / num2;
                        System.out.println("La division de los dos numeros ingresados " + num1 + " / " + num2 + " es: " + division);
                        break;
                    case 5:
                        System.out.println("Esta seguro que desea salir del programa?(S/N)");
                        String siono = leer.next();
                        
                        if (siono.equalsIgnoreCase("S")) {
                            System.out.println("Gracias por usar la calculadora!");
                            System.out.println("----------------------------------");
                            resp = false;
                        }
                }
            }
        }while (true == resp);
        
     }   
   }
