package DIA2;


import java.util.Scanner;


/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

public class Ejercicio6 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese los grados centigrados: ");
         double num1 = leer.nextDouble();
         double F = 32+(9 * num1/5);
         System.out.println("La cantidad de grados en Farenheit es: " + F);
         
         
         
}
     
}