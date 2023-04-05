
package DIA9y10y11;

import java.util.Scanner;

/**
 Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
public class EjercicioExtra4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] notas = new double[5];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " +(i+1)+ ": ");
            LlenarMatriz(notas);
        }
      
    }
    
         
    public static void LlenarMatriz(double [] notas){
        Scanner leer = new Scanner(System.in);
         double N1=0,N2=0,N3=0,N4=0;
         
            for (int i = 0; i < 10; i++) {
                if (i==0) {
                System.out.println("nota del TP1");
                double notaTP1= leer.nextDouble(); 
                    notas[0]=(notaTP1*0.1);
                    N1=notas[0];
                    System.out.println(notas[0]);
                    System.out.println(N1);
                    
                }
                if (i==1) {
                    System.out.println("nota del TP2");
                double notaTP2= leer.nextDouble();
                    notas[1]=(notaTP2*0.15);
                    N2=notas[1];
                    System.out.println(notas[1]);
                    System.out.println(N2);
                }
                if (i==2) {
                    System.out.println("nota del I1");
                double notaI1 = leer.nextDouble();
                    notas[2]=(notaI1*0.25);
                    N3=notas[2];
                    System.out.println(notas[2]);
                    System.out.println(N3);
                    
                }
                if (i==3) {
                    System.out.println("nota del I2");
                double notaI2= leer.nextDouble();
                    notas[3]=(notaI2*0.5);
                    N4=notas[3];
                    System.out.println(notas[4]);
                    System.out.println(N3);
                  
                }
                if (i==4) {
                   double promedio =((N1+N2+N3+N4)/4);
                   notas[4]=promedio;
                    System.out.println(notas[4]);
                    
                   
              //  notas[4]= leer.nextDouble();
                
                }
               
        }
            
            
           
                 
            }
         
    }
   
    
                
                
                
                
                
                
          

