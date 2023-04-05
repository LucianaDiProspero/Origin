
package DIA9y10y11;

import java.util.Scanner;

/**
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos)
 */
public class EjercicioExtra2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de los dos vectores");
        int tamanio = leer.nextInt();
        
        int [] vector1= new int [tamanio];
        int [] vector2 = new int [tamanio];
        
        //rellenado de vector 1:
        System.out.println("ingrese los valores para el vector 1 de "+tamanio+ " dimension");
        
        for (int i = 0; i < vector1.length; i++) {
            vector1 [i] = leer.nextInt();
        }
        
        System.out.println("------------------------------------");
        
        System.out.println("Ingrese los valores para el vector 2 de "+tamanio +" dimension");
        for (int i = 0; i < vector2.length; i++) {
            vector2 [i]=leer.nextInt();   
        }
        
        comparacion(vector1,vector2);
        
    }
public static void comparacion( int []vector1, int [] vector2){
    
    
    for (int i = 0; i < vector1.length; i++) {
        for (int j = 0; j < vector2.length; j++) {
            if (vector1[i] != vector2[i]) {
               int posicion=i;
                System.out.println("DIFERENCIA ENCONTRADA EN LA POSICION "+(posicion+1)+ " !");
                return;
            }
        }
    }
    System.out.println("Los vectores son iguales"); 
}
}
