
package DIA9y10y11;

import java.util.Scanner;

/**
 Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
public class EjercicioGuia2 {

    
    public static void main(String[] args) {
          //Scanner leer = new Scanner(System.in); 
      String [] equipo = new String[4];
      
      LlenarVector(equipo);
      MostrarVector(equipo);
 
    }
    
    
public static void LlenarVector(String [] equipo ){
     Scanner leer = new Scanner(System.in); 
    for (int i = 0; i < 4; i++) {
        System.out.println("Ingrese el nombre [" +i+ "] :");
        String nombre;   
        equipo [i] =  leer.next();    
    }
    
}
public static void MostrarVector (String [] equipo ){
    for (int i = 0; i < 4; i++) {
        
        
        if (i==3) {
          System.out.append("["+equipo [i]+ "] "  );  
        }else{
            System.out.append("["+equipo [i]+ "] ,"  );
        }
    }
 System.out.println("");
}
}
