
package DIA3;

import java.util.Scanner;

/**
 Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String palabra = leer.next(); 
        
    if ((palabra.substring(0,1)).equalsIgnoreCase("a")){
        System.out.println("CORRECTO!");   
    }else{       
      System.out.println("INCORRECTO");
    }
}
}


