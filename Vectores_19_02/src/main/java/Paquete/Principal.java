
package Paquete;

import java.util.Scanner;


public class Principal {

       public static void main(String[] args) {
        
           int i, Nelementos;
           Scanner leer = new Scanner(System.in);
           
           System.out.println("Tamaño del vector");
              Nelementos = leer.nextInt();
              
              int[] m = new int[Nelementos];
              
              System.out.println("");
              System.out.println("Introduzca los valores del vector");
              
              for ( i = 0; i < Nelementos; i++) {
                  System.out.println("m ["+(i+1)+ "] =");
                  m[i] = leer.nextInt();
           }
              
              System.out.println("");
            
              
              for ( i = 0; i < Nelementos; i++) {
                  System.out.println("El valor del vector es: ");
                  System.out.println(m[i] +" ");
                  
           }
           
           
    }
    
}
