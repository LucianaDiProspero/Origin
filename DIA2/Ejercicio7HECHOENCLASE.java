package DIA2;


import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */

public class Ejercicio7HECHOENCLASE
{
      public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un numero entero: ");
          int num1 = leer.nextInt();
          int Double = num1*2;
          int Triple =num1*3;
          double RC = Math.sqrt(num1);
          System.out.println("El doble del numero es: " + Double);
          System.out.println("El triple del numero es: " +Triple);
          System.out.println("La raiz del numero es: "+ RC);
}
}
