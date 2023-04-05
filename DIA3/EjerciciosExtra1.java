
package DIA3;

import java.util.Scanner;

/**
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
public class EjerciciosExtra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de minutos a relacionar");

        
        int minutos = leer.nextInt();

        int dias = minutos / 1440;
        // es 1440 porque son la cantidad de minutos que tiene un dia.
        
        int horas = (minutos % 1440) / 60;
        // se hace esto para calcular el resto de horas dentro de los minutos ingresados
        //al resultado se lo divide en 60 para poder expresarlo en horas.
        
        System.out.println(minutos + " minutos son equivalentes a " + dias + " días y " + horas + " horas.");
    }
} 

  


