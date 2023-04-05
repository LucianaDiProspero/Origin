
package DIA9y10y11;

import java.util.Scanner;

/**
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [100];
        LlenarVector(vector);
        MostrarVector(vector);
        
    }
public static void LlenarVector( int [] vector){
    for (int i = 0; i < 100; i++) {
        vector [i] = i+1;
    }    
}
public static void MostrarVector( int [] vector){
    for (int i = 99; i > -1; i--) {
        System.out.append("["+vector[i]+ "]");
    }
}
}