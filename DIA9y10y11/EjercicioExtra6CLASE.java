
package DIA9y10y11;

import java.util.Scanner;

/**
 *
 * 
 */
public class EjercicioExtra6CLASE {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String [][] sopa = new String [20][20];
        int aux1, aux2;
        String palabra;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra");
            aux1= (int)(Math.random()*13+1);
            aux2= (int)(Math.random()*13+1);
            palabra = leer.next(); //STRING ES POR DEFECTO
            for (int j = 0; j < palabra.length(); j++) {
                sopa [aux1][aux2+j]= palabra.substring(j,j+1);//para poner la primera posicion del bucle substring recorta la palabra
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null ) {
                    aux1=(int) (Math.random() * 10 + 1);
                    sopa[i][j] = String.valueOf(aux1);
                }
            }
            
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" +sopa [i][j] + "] ");
                
            }
            System.out.println("");
        }
        
        
    }

}
    


