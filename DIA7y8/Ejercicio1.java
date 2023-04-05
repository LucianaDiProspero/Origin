
package DIA7y8;

import java.util.Scanner;

/**
 Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese 2 numeros enteros positivos: ");
        int num1= leer.nextInt(),num2=leer.nextInt();
        
        System.out.println("MENU \n 1-SUMAR \n 2-RESTAR \n 3-MULTIPLICAR \n 4- DIVIDIR \n ingrese una opcion: ");
        int opcion =leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("la suma de los numeros es: "+sumar( num1,num2));
                break;
            case 2:
                System.out.println("la resta de los numeros es: "+restar(num1,num2));
                break;
            case 3:
                 System.out.println("la multiplicacion de los numeros es: "+multiplicar(num1,num2));
                 break;
            case 4:
                 System.out.println("la division de los numeros es: "+dividir(num1,num2));
                 break;
            default:
                System.out.println("Opcion no valida! hasta luego!");
        }
        
    }
 public static int sumar(int num1,int num2){
     int suma=num1+num2;
     return suma;
 }
 public static int restar(int num1,int num2){
     int resta=num1-num2;
     return resta;   
}
 public static int multiplicar(int num1,int num2){
     int mult=num1*num2;
     return mult;
}
  public static float dividir(int num1,int num2){
     float division=num1/num2;
     return division;
} 
}

