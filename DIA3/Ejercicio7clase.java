
package DIA3;

import java.util.Scanner;

/**
ealizar un programa que simule el funcionamiento de un dispositivo
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
public class Ejercicio7clase {

    
   public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String contra;
        int correcto = 0;
        int incorrecto = 0;
        int intentos = 3;
        
        do {
            System.out.println("Ingrese una contraseña:\n - De 5 o menos caracteres \n - Que comienze con X/x \n - Que termine con O/o \n - Ingrese - &&&&& - para terminar ");
            contra = consola.nextLine();
            if ("&&&&&".equalsIgnoreCase(contra)) {
                break;
            }
            if (contra.length()<=5 && contra.substring(0, 1).equalsIgnoreCase("x") && contra.substring(contra.length()-1,contra.length()).equalsIgnoreCase("o")){
              correcto++;  
            }else{
              incorrecto++;
            }
            /*if (contra.length() > 5 && !"X".equalsIgnoreCase(contra.substring(0, 0)) && !"O".equalsIgnoreCase(contra.substring(contra.length(), contra.length()))) {
                incorrecto = incorrecto + 1;
            } else {
                correcto = correcto + 1;
            }*/

        } while (!"&&&&&".equalsIgnoreCase(contra));
        System.out.println("Correctos: " + correcto);
        System.out.println("Incorrecto: " + incorrecto);
    }

}
