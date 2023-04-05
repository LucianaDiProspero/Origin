package DIA2;


import java.util.Scanner;



/**
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
public class Ejercicio7 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero entero: ");
         int num1=leer.nextInt();
         int N1 = num1*2;
         int N2 = num1*3;
         int SR = (int) Math.sqrt(num1);
         
         System.out.println("el doble del numero es: "+ N1 +", el triple del numero es: "+ N2+", La raiz cuadrada es: "+ SR);
         
         
         
}
}