
package DIA9y10y11;

import java.util.Scanner;

/**
 *
 * 
 */
public class EjercicioExtra5CLASE {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
String[][] sopa;
sopa = new String[20][20];
String[] abc;
int aux; int aux2; int aux3;int aux4=0;
abc = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                aux  = (int)(Math.random()*10+1);
                sopa[i][j]=abc[aux];
                System.out.print("["+sopa[i][j]+"]");
            }
            System.out.println("");
        }
       String palabra ;
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese una palara de 3 a 5 letras esconder en la sopa de letras");
            palabra = leer.next();
            aux2=(int)(Math.random()*10);
             aux3=(int)(Math.random()*10);
            for (int k = 0; k < palabra.length(); k++) {
                
                sopa[aux2][aux3+k]=palabra.substring(k,k+1);
                
            }
            for (int m = 0; m < 20; m++) {
                for (int n = 0; n < 20; n++) {
                     System.out.print("["+sopa[m][n]+"]");
            }
            System.out.println("");
                }
        }
    }
}