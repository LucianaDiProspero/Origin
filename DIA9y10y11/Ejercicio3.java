
package DIA9y10y11;

import java.util.Scanner;

/**
 Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el largo del arreglo");
        int[] num = new int[consola.nextInt()];
        Rellenar(num);
        digitos(num);
    }

    public static void Rellenar(int[] num) {
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = consola.nextInt();
        }   
    }

    public static void digitos(int[] num) {
        int cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0;
      
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 10) {
                cont1++;
            }
            if (num[i] > 9 && num[i] < 100) {
                cont2++;
            }
            if (num[i] > 99 && num[i] < 1000) {
                cont3++;
            }
            if (num[i] > 999 && num[i] < 10000) {
                cont4++;
            }
            if (num[i] > 9999) {
                cont5++;
            }
        }
        System.out.println("Existen: \n -Numeros de una cifra:" + cont1 + " \n -Numeros de dos cifras:" + cont2 + " \n -Numeros de tres cifras:" + cont3 + " \n -Numeros de cuatro cifras:" + cont4 + " \n -Numeros de cinco o más cifras:" + cont5);
    }
}