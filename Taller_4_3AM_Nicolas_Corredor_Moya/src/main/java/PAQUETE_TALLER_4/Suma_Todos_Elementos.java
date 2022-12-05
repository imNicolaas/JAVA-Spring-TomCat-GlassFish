
package PAQUETE_TALLER_4;

import java.util.Scanner;

public class Suma_Todos_Elementos {
    
    public void Suma_Elementos (){
    
     int Cant, Cant_Dos, Cant_Tres, Num_Mayor= 0, Num_Uno,Num_Dos, Num_Tres, SubTotal=0, Total=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("    BIENVENIDO");
        System.out.println("");
        
        System.out.println("Digite la cantidad de valores Que tendran todos los Vectores");
        Cant = teclado.nextInt();
        teclado.nextLine();
        System.out.println("");

        int [] Vector_Uno = new int [Cant];
        int [] Vector_Dos = new int [Cant];
        int [] Vector_Tres = new int [Cant];
        
        System.out.println("  •Digite los "+Cant + " valores del Primer vector: ");
        System.out.println("");
        
                for (int i = 0; i < Cant; i++) {
                    System.out.println("Dato [" + (i + 1)+"]: ");
                    Vector_Uno[i] = teclado.nextInt();   
                }
        
        System.out.println("  •Digite los "+Cant + " valores del Segundo Vector:");
        System.out.println("");
        
                for (int i = 0; i < Cant; i++) {
                    System.out.println("Dato [" + (i + 1)+"]: ");
                    Vector_Dos[i] = teclado.nextInt();   
                }
        
        System.out.println("  •Digite los "+Cant + " valores del Tercer Vector");
        System.out.println("");
        
                for (int i = 0; i < Cant; i++) {
                    System.out.println("Dato [" + (i + 1)+"]: ");
                    Vector_Tres[i] = teclado.nextInt();   
                }
       
        for (int i = 0; i < Cant; i++) {
            
            Num_Uno = Vector_Uno[i];
            Num_Dos = Vector_Dos[i];
            Num_Tres = Vector_Tres[i];
            
            SubTotal = Num_Uno + Num_Dos + Num_Tres;
            Total = Total+SubTotal;
            
            System.out.println(Vector_Uno[i]+" + "+Vector_Dos[i]+" + "+Vector_Tres[i]+ " = " +SubTotal);
            
        }
        
        System.out.println("El total es: "+Total);
        
        
        
    }
}
