
package DIA9y10y11;

import java.util.Random;
import java.util.Scanner;

/**
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor del vector: ");
        int num = leer.nextInt();
        int [] vector = new int[num];
        LlenarRandom(vector,num);
        LeerRandom(vector,num);
    }
public static void LlenarRandom(int [] vector, int num){
    for (int i = 0; i < num; i++) {
        Random rand = new Random();
        
        vector [i]= rand.nextInt(20-1+1)+1;
        
        System.out.append("[" +vector[i]+ "] ");
    }
    System.out.println("");
}
public static void LeerRandom(int [] vector, int num){
    int cont=0;
    Scanner leer = new Scanner(System.in);
    System.out.println("Que numero desea buscar?: ");
    int resp = leer.nextInt();
    
    for (int i = 0; i < num; i++) {
            if ( vector [i]==resp) {
                System.out.println("El numero "+resp+ " se encuentra en la posicion: " +(i+1));
               cont ++;
            }
    }
    if (cont==0) {
        System.out.println("El numero no se encuentra en el arreglo");
    }
}
        
}
