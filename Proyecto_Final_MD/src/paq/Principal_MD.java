
package paq;

import java.util.Scanner;

public class Principal_MD {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int filas =0, columnas =0, opcion = 0;
        
        System.out.println("Digite 1 para ");
        
        System.out.print("Digite cuantas filas tendrá la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        
        do {            
            System.out.print("Digite cuantas columnas tendra la matriz: ");
            columnas = entrada.nextInt();
            
            if(filas != columnas){
                System.out.println("la cantidad de filas debe ser igual a las columnas (matriz simetrica)");
            }
        } while (columnas != filas);
        
        System.out.println("");
        
        int a[][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                    if(i==j){
                        a[i][j]=1;
                    }else{
                        a[i][j]=0;
                    }
                    
                }
            }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        
        System.out.println("\nRelaciones de la matriz:\n");
        System.out.print("R=[");
        
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                    if(a[i][j]==1){
                        System.out.print("(" +(i+1)+","+(j+1)+")" );
                    }
                
            }
        }
        
        System.out.print("]\n\n");
        
        }
        
    }
    

