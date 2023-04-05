
package DIA7y8;

import java.util.Scanner;

/**
 Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
* 
 */
public class EjercicioGuia2 {

    
    public static void main(String[] args) {
      
		          Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Por favor, ingrese 2 numeros enteros positivos:");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		
                
                if(multiplo(num1,num2)==true) {
                    System.out.println("los numeros SON MULTIPLOS");
                } else{
                    System.out.println("los numeros NO SON MULTIPLOS");
                } 
                    
	}

	public static boolean multiplo(int num1, int num2) {
		boolean esmultiplo;
		esmultiplo = num1%num2==0;
		return esmultiplo;
	}
}   
