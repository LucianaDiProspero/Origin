package DIA2;


import java.util.Scanner;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */


public class Ejercicio4 {
     public static void main(String[] args) {
         
    String palabra;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar una frase: ");
    palabra = leer.nextLine();
         System.out.println(palabra.toUpperCase());
    
}
}