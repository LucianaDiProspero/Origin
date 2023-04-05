
package DIA3;

import java.util.Scanner;

/**
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
public class EjercicioGuia4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int aux;
        int i;
        aux = 0;
        
        for (i=0; i<=19;i++){
         System.out.println("Ingrese un numero: (max 20 intentos): ");
        int num = leer.nextInt();
        aux=aux+num;
       
        if (num==0){
            System.out.println("Se capturó el numero CERO");
            break; 
        }else{
            if (num<0)
                aux=aux-num; 
        }
            System.out.println("La suma de los numeros es: "+ aux);
        }     
 }       
}
