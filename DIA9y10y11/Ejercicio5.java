package DIA9y10y11;

//import java.util.Scanner;
/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //  Scanner leer = new Scanner(System.in);

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        //para mostrar la matriz.
        for (int [] fila : matriz) {
            for (int elemento : fila) {
                System.out.append("[ " + elemento + " ]   ");
                //el bucle For Enhanced!
            }
            
            System.out.println("");
        }
     System.out.println("----------------------");
        //funcion de la matriz transpuesta
        int[][] transpuesta = MatrizTranspuesta(matriz);
        // definis en MAIN la matriz transpuesta para uqe la tome
        //una vez que la trae de la funcion 

      

        boolean SIoNO = EsoNoEs(matriz, transpuesta);
        //si no hago esto, no me guarda la transpuesta y no la pasa
        //para la comparacion.

        if (SIoNO) {
            System.out.println("La matriz es ANTISIMETRICA!");

        } else {
            System.out.println("La matriz NO ES ANTISIMETRICA");
        }
    }

    // FUNCION PARA LA MATRIZ TRANSPUESTA
    public static int[][] MatrizTranspuesta(int[][] matriz) {
        //aca hacemos la matriz transpuesta y la escribimos para llamarla en el algoritmo principal
        int[][] transpuesta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.append("[ " + transpuesta[i][j] + " ]  ");
            }
            System.out.println("");
        }

        return transpuesta;
    }

    public static boolean EsoNoEs(int[][] matriz, int[][] transpuesta) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -transpuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
