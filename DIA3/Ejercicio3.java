
package DIA3;

import java.util.Scanner;

/**
 Realizar un programa que permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra con maximo 8 caracteres");
        String palabra = leer.next();
        
       int aux = palabra.length();
       
        if (aux<8) {
            System.out.println("La palabra ingresada "+  "´" +palabra+ "´" + " posee MENOS DE 8 caracteres");
            
        }else if(aux==8) {
            System.out.println("La palabra ingresada "+  "´" +palabra+ "´" + " posee EXACTAMENTE 8 caracteres");
       } else 
            System.out.println("La palabra ingresada "+  "´" +palabra+ "´" + "posee MAS de 8 caracteres");
   }
}
