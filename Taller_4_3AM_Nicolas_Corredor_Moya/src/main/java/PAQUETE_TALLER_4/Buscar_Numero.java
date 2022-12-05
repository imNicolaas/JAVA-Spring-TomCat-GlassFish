package PAQUETE_TALLER_4;

import java.util.Scanner;

public class Buscar_Numero {

    public void Buscar_Num() {

        int Cant_, Num_a_Buscar, Contador =0;
        Scanner entrada = new Scanner(System.in);

           do{
                System.out.println("Digite la cantidad de numeros que tendra el Vector: ");
                Cant_ = entrada.nextInt();
                entrada.nextLine();
           }while (Cant_<1);
           
        int[] Vector = new int[Cant_];

        System.out.println("\nDigite los datos del Vector: ");
        System.out.println("");

        for (int i = 0; i < Cant_; i++) {
            System.out.println("Dato [" + (i + 1)+"]: ");
            Vector[i] = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("\nDIGITE EL NUMERO A BUSCAR:");
        Num_a_Buscar = entrada.nextInt();
        System.out.println("");

        for (int i = 0; i < Cant_; i++) {
            
            if (Vector[i] == Num_a_Buscar){
                Contador = Contador +1; 
            }else if (Vector[i] != Num_a_Buscar){
            
            }
            
        }
        
                if(Contador != 0){
                    System.out.println("********************************************************");
                    System.out.println("*EL NUMERO "+ Num_a_Buscar +" HA SIDO ENCONTRADO "+ Contador + " VECES *");
                    System.out.println("********************************************************");
                }else{
                    System.out.println("El numero no ha sido encontrado");
                }

        
        
    }
}
