/*
 Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package DIA3;

import java.util.Scanner;

/**
 *
 * @author Windows 10 64bits
 */
public class EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos: ");
        int num1 =leer.nextInt();
        int num2=leer.nextInt();
        
        if  (num1 > 25 && num2 > 25){
        System.out.println("Ambos numeros " + num1+ " y " +num2+ " son mayores a 25");
            
    }  else if (num1<25 && num2<25){
        System.out.println("Ambos numeros "+ num1+ " y " +num2+ " son menores a 25");
        
            
    }else if ((num1>25 || num2<25)||(num1<25 || num2>25)){
            System.out.println(" Alguno de los dos es menor a 25");
    
    }
}
}
