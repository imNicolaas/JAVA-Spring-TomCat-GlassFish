
package PAQUETE_TALLER_3;

import java.util.Scanner;

public class Estudiante {

    public void Promedio_Estu() {
        float num= 1;
        float notas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas en la materia Estructura de Datos");
        float can =r.nextFloat(); 
        while (num <= can){
            System.out.println("Ingrese la nota numero "+ num+": ");
            float n=r.nextFloat();
            notas += n;
            num++;
            
            
        }
        float promedio = notas / can;
        System.out.println("El promedio es: " + promedio);
       
    }
    
}
