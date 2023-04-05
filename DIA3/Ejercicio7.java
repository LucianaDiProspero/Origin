
package DIA3;

import java.util.Scanner;

/**
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
* 
* //cadenas de 5 caracteres de largo (maximo!)
     //primer caracter X y el ultimo O
     
     //si lee y tiene esto (X y O)=correctas
     //secuencia especial "&&&&&" marca el final de los envios   "&&&&&"=FDE
     //secuencia distinta a FDE y distinta a X y O =INCORRECTA
     //imprime imforme mostrando correctas o incorrectas
 */
public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese cadenas de NO MAS DE 5 caracteres: ");
        System.out.println("Para terminar, ingrese la cadena final FDE");
        System.out.println("------");
        String cadena;
        
        do {
            
         cadena = leer.next();  
        
        System.out.append(cadena);
        int longitud = cadena.length();
      
        if ((longitud==5) && (((cadena.substring(0,1).equalsIgnoreCase("X"))) && ((cadena.substring((longitud-1), (longitud))) .equalsIgnoreCase("O")))) {
            System.out.println("     CORRECTA"); 
          } else if (cadena.equals("&&&&&")){
              System.out.println("------------------");
                 System.out.println("CADENA FDE INGRESADA");  
                 break;
            
        } else if ((!(cadena.substring(0,1).equals("X"))) && (!(cadena.substring((longitud-1), (longitud))) .equals("O"))){
            System.out.println("     INCORRECTA");    
        } 
        } while (!cadena.equals("&&&&&"));
            }
    }
