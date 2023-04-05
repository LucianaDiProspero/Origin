
package DIA9y10y11;

import java.util.Scanner;

/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
* respuesta correcta para corregir!
*           2   7   6
*           9   5   1
*           4   3   8
* 
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        boolean cuadradoCorrecto = true;
        int sumF1 = 0, sumF2 = 0, sumF3 = 0;
        int sumC1 = 0, sumC2 = 0, sumC3 = 0;
        int sumD1 = 0, sumD2 = 0;

        // Pedimos al usuario que introduzca los números para el cuadrado
        System.out.println("Introduce los números del cuadrado mágico: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = scanner.nextInt();
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    cuadradoCorrecto = false;
                }
            }
        }

        // Calculamos las sumas de las filas, las columnas y las diagonales
        for (int i = 0; i < 3; i++) {
            sumF1 += cuadrado[0][i];
            sumF2 += cuadrado[1][i];
            sumF3 += cuadrado[2][i];
            sumC1 += cuadrado[i][0];
            sumC2 += cuadrado[i][1];
            sumC3 += cuadrado[i][2];
            sumD1 += cuadrado[i][i];
            sumD2 += cuadrado[i][2 - i];
        }

        // Comprobamos si el cuadrado es mágico
        if (cuadradoCorrecto && sumF1 == sumF2 && sumF1 == sumF3
                && sumF1 == sumC1 && sumF1 == sumC2
                && sumF1 == sumC3 && sumF1 == sumD1
                && sumF1 == sumD2) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");
        }
    }
}
