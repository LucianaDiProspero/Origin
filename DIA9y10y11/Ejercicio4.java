
package DIA9y10y11;

/**
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        transpuesta(matriz);
    }
    public static void transpuesta(int[][] matriz) {
        //simplemente es escribirla al reves, pero tambien si necesitas guardar los valores de la primer matriz
       // tenes que hacerlo como esta aplicado este, con una matriz auxiliar (B).
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j]=matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = B[j][i];
                System.out.print(matriz[i][j] + " ");
                //System.out.println(matriz[j][i]);
                
                
            }
            System.out.println("");
        }
    }
}