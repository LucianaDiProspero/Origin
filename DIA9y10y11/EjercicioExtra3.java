
package DIA9y10y11;

import java.util.Random;
import java.util.Scanner;

/**
 Crear una función que rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
public class EjercicioExtra3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la dimension del vector");
        int dimension = leer.nextInt();
        int [] vector = new int [dimension];
        
        LlenarVector(vector);
        MostrarVector(vector);
        
    
    }
public static void LlenarVector(int [] vector){
    Random random = new Random();  //hay que importar un java.random
    
    for (int i = 0; i < vector.length; i++) {
        vector [i] = random.nextInt(10);
    }
    
    
}
public static void MostrarVector(int [] vector){
    for (int i = 0; i < vector.length; i++) {
        System.out.append("["+vector[i]+ "] ");
    }
    System.out.println("");
}
}
