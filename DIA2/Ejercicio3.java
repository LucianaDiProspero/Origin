package DIA2;


import java.util.Scanner;


/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
    
  Scanner leer = new Scanner(System.in);
   String nombre;
   System.out.println("Ingresa tu nombre:");
   nombre = leer.next();
   System.out.println("Hola " + nombre + "!");
   
 
  }
  }