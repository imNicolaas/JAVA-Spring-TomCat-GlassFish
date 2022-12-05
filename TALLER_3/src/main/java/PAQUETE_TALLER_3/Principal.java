
package PAQUETE_TALLER_3;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        int Opcion = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        Peajes_Bogota PB = new Peajes_Bogota();
        Estudiante Estudiante = new Estudiante();
        Ajedrez Ajedrez = new Ajedrez();
      
        while (Opcion != 4){
        System.out.println("______________________________________________________________");
        System.out.println("            MENU TALLER TRES- CICLOS Y RECORRIDOS");
        System.out.println("                     ESCOJA UNA OPCION ");
        System.out.println("");
        System.out.println("    DIGITE 1 PARA REPRODUCIR UN JUEGO DE AJEDREZ");
        System.out.println("    DIGITE 2 PARA CALCULAR EL PROMEDIO DE UN ALUMNO");
        System.out.println("    DIGITE 3 REPRODUCIR EL PROGRAMA PEAJES BOGOTA ");
        System.out.println("    DIGITE 4 PARA SALIR ");
        Opcion = teclado.nextInt();
        teclado.nextLine();
        System.out.println("");
        
            if (Opcion == 1 ) {
                
                Ajedrez.Metodo_Ajedrez();
            
            }else if (Opcion == 2 ){
                
                Estudiante.Promedio_Estu();
            
            }else if (Opcion == 3 ){
                
                PB.PEAJE();
            
            }else if (Opcion == 4 ){
                System.out.println("Gracias por su ejecucion, Vuelva pronto :)");
            }else{
                System.out.println("OPCION INVALIDA VUELVA A INTENTARLO");
                System.out.println("");
            }
                
                
        }
    }   
}
