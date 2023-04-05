
package DIA7y8;


import java.util.Scanner;

/**
 Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class EjercicioGuia1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una palabra o frase");
        String cadena = leer.nextLine();
        int longCad = cadena.length();

        while (!".".equals(cadena.substring(longCad - 1))) {
            System.out.println("Debe ingresar punto(.) al final");
            System.out.println("Ingrese una palabra o frase");
            cadena = leer.nextLine();
            longCad = cadena.length();
        }
        
        System.out.println("La frase codificada es: " + codificar(cadena,longCad));

    }
    
    public static String codificar(String cadena, int longCad){
        
        String cadena2 = "";
       
        cadena= cadena.toLowerCase();
        
        for (int i = 0; i < longCad; i++) {
         String letra = (cadena.substring(i,i+1));
            switch (letra) {
                case "a":
                    cadena2= cadena2.concat("@");
                    break;
                case "e":
                     cadena2= cadena2.concat("#");
                    break;
                case "i":
                    cadena2= cadena2.concat("$");
                    break;
                case "o":
                    cadena2= cadena2.concat("%");
                    break;
                case "u":
                    cadena2= cadena2.concat("*");
                    break;
                default:
                    cadena2 = cadena2.concat(cadena.substring(i,i+1));
            }
            
        }
        return cadena2;
    }

}
