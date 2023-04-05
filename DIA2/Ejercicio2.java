package DIA2;


import java.util.Scanner;
/* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
int= intergure (numero entero)
*/

public class Ejercicio2 {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
//sout+tab y se empieza a escribir rapido

System.out.println("ingrese 2 numeros enteros:");
int num1 = leer.nextInt();
int num2 = leer.nextInt();
int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: " + suma);
        
        
    }
    
}
