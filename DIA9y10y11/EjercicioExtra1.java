
package DIA9y10y11;

import java.util.Scanner;

/**
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario. 
 */
public class EjercicioExtra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño que quiere que tenga el vector");
        int tamanio= leer.nextInt();
        int [] vector = new int[tamanio];
        int suma = 0;
        
        System.out.println("ingrese numeros para rellenar el vector");
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= leer.nextInt();
            suma=vector[i]+suma;
        }
        System.out.println("La suma de los numeros ingresados al vector es: "+suma);
    }
}
