
package PAQUETE_TALLER_4;

import java.util.Scanner;

public class Organizar_Numeros {
    
        public void Organizar_ (){
            
            int cantidad, positivos=0, negativos =0, ceros =0, AUX=0, cont_positivos = 0, cont_negativos =0, cont_ceros=0;
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("    BIENVENIDO");
            System.out.println("");
            do{
            System.out.println("Cuantos terminos tendra el vector: ");
            cantidad = teclado.nextInt();
            teclado.nextLine();
            }while(cantidad<1);
            
            int [] vector = new int [cantidad];
            
            System.out.println("Rellene el vector: \n ");
            
            
            for (int i = 0; i < cantidad; i++) {
                    System.out.println("•Dato [" + (i + 1)+"]:");
                    vector[i] = teclado.nextInt();
                    
                    if (vector[i]>0) {
                        positivos++;
                    }else if(vector[i]<0) {
                        negativos++;
                    }else {
                        ceros++;
                    }
                    
                    
            }
            
            int Vec_Positivos[]=new int[positivos];
            int Vec_Negativos[]=new int[negativos];
            int Vec_Ceros[]=new int[ceros];
            
            positivos = 0;
            negativos =0;
            ceros=0;
            
            for (int i = 0; i < cantidad; i++) {
                
                    if( vector[i]>0){
                        Vec_Positivos[positivos] = vector[i];
                        cont_positivos = cont_positivos + 1;
                        positivos++;
                    }else if (vector[i]<0){
                        Vec_Negativos[negativos] = vector[i];
                        cont_negativos = cont_negativos +1; 
                        negativos++;
                    }else{
                        Vec_Ceros[ceros] = vector [i];
                        cont_ceros = cont_ceros + 1;
                        ceros++;
                    }
            }
            
            for (int i = 0; i < positivos; i++) {
                for (int j = i+1; j < positivos; j++) {
                    
                    if (Vec_Positivos[i]<Vec_Positivos[j]){
                        
                        AUX =  Vec_Positivos[i];
                        Vec_Positivos[i]= Vec_Positivos[j];
                        Vec_Positivos[j]= AUX;
                        
                    } 
               }
            }
            
            for (int i = 0; i < negativos; i++) {
                for (int j = i+1; j < negativos; j++) {
                    
                    if (Vec_Negativos[i]>Vec_Negativos[j]){
                        
                        AUX =  Vec_Negativos[i];
                        Vec_Negativos[i]= Vec_Negativos[j];
                        Vec_Negativos[j]= AUX;
                        
                    } 
               }
            }
            
           
            if (cont_positivos > 0){
                    System.out.print("LOS NUMEROS POSITIVOS DEL VECTOR, DE MAYOR A MENOR SON: ");
                    for (int i = 0; i < positivos; i++) {
                        System.out.print(Vec_Positivos[i] +", " );
                    }
                    System.out.println("");
            }else {
                System.out.println("NO SE DIGITARON NUMEROS POSITIVOS EN EL VECTOR");
            }
            
            if(cont_negativos >0){
                    System.out.print("LOS NUMEROS NEGATIVOS DEL VECTOR, DE MENOR A MAYOR SON: ");
                    for (int i = 0; i < negativos; i++) {
                        System.out.print(Vec_Negativos[i] +", " );
                    }
                    System.out.println("");
            }else{
                System.out.println("NO SE DIGITARON NUMEROS NEGATIVOS EN EL VECTOR ");
            }
            
            if(cont_ceros>0) {
                    System.out.print("LOS CEROS DIGITADOS FUERON: " + cont_ceros +"==> ");
                    for (int i = 0; i < ceros; i++) {
                        System.out.print(Vec_Ceros[i] +", " );
                    }
                    System.out.println("");
            }
            
            
            
            
            
            
            
                
        
        
        }
}
