
package DIA3;


import java.util.Scanner;

/**
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

* * * *
*     *
*     *
* * * *
 
* doble ciclo para
* 
* i y j
 */
public class Ejercicio8 {

	public static void main(String args[]) {
		          Scanner leer = new Scanner(System.in);
		int i,j,largo;
		
		System.out.println("Por favor, ingrese el tamaño del cuadrado:");
		largo = leer.nextInt();
		for (i=0;(i<=(largo-1));i++) {
			if ( i==0 || ( i==(largo-1))) {
				for (j=0;(j<=(largo-1));j++) {
					System.out.print("*  ");
				}
				System.out.println("");
			} else {
				System.out.print("*  "); //asterisco inicial a la izquierda
				for (j=1;j<=largo-2;j++) {
					System.out.print("   ");// espacios para la parte del medio.es 1 y -2 porque tenemos que obviar los extremos
				}
				System.out.println("*");  //asterisco final 
			}
		}
	}
}