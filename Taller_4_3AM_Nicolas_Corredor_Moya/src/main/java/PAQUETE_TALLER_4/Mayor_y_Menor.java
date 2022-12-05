
package PAQUETE_TALLER_4;
import java.util.Scanner;

public class Mayor_y_Menor {
    
    public void Mayor_y_Menor (){
    
        int Cantidad_1, Cantidad_2, mayor_1, menor_1, mayor_2, menor_2, menor_total, mayor_total;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite la cantidad de elementos que tendra el primer vector: ");
            Cantidad_1 = teclado.nextInt();
            teclado.nextLine();
        }while(Cantidad_1 <1);
        
        do{
        System.out.println("Digite la cantidad de elementos que tendra el segundo vector: ");
        Cantidad_2 = teclado.nextInt();
        teclado.nextLine();
        }while(Cantidad_2<1);
        
        int [] Vector_A = new int [Cantidad_1];
        int [] Vector_B = new int [Cantidad_2];
        
        System.out.println("\n DIGITE LOS "+ Cantidad_1 + " NUMEROS DEL PRIMER VECTOR \n ");
        
            for (int i = 0; i < Cantidad_1; i++) {
                System.out.println("Dato [" + (i + 1)+"] del vector A: ");
                Vector_A[i] = teclado.nextInt();
            }
            
            System.out.println("");
            System.out.println("_________________________________________________________________");
            
            System.out.println("DIGITE LOS "+ Cantidad_2 + " NUMEROS DEL SEGUNDO VECTOR\n");
        
            for (int i = 0; i < Cantidad_2; i++) {
                System.out.println("Dato [" + (i + 1)+"] del vector B: ");
                Vector_B[i] = teclado.nextInt();
            }
            
            if(Cantidad_1>0 && Cantidad_2 > 0){
                mayor_1 = menor_1 = Vector_A[0];      
                for (int i = 0; i < Cantidad_1; i++) {
                    
                    if (Vector_A[i]>mayor_1){
                        mayor_1 = Vector_A[i];
                    }if(Vector_A[i]<menor_1){
                        menor_1 = Vector_A[i];
                    }   
                }
                System.out.println("\n  •El numero menor del PRIMER vector es: "+ menor_1);
                System.out.println("  •El numero mayor del PRIMER vector es: "+ mayor_1);
            
            

                mayor_2 = menor_2 = Vector_B[0];      
                for (int i = 0; i < Cantidad_2; i++) {
                    
                    if (Vector_B[i]>mayor_2){
                        mayor_2 = Vector_B[i];
                    }if(Vector_B[i]<menor_2){
                        menor_2 = Vector_B[i];
                    }   
                }
                System.out.println("\n  •El numero menor del SEGUNDO vector es: " + menor_2);
                System.out.println("  •El numero mayor del SEGUNDO vector es: " + mayor_2);
                
                if (menor_1>menor_2){
                    menor_total = menor_2;
                }else{
                    menor_total = menor_1;
                }
                
                if (mayor_1>mayor_2){
                    mayor_total = mayor_1;
                }else{
                    mayor_total = mayor_2;
                }
                
                System.out.println("\n  •EL NUMERO MENOR DE LOS DOS VECTORES ES: " + menor_total);
                System.out.println("  •EL NUMERO MAYOR DE LOS DOS VECTORES ES: " + mayor_total);
                
                
                
            }
            
                
                
            
            
            
            
                
        
    }
}
