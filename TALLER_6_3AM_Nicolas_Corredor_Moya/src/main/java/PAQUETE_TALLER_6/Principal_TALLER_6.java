
package PAQUETE_TALLER_6;
import java.util.Scanner;


public class Principal_TALLER_6 {

    public static void main(String[] args) {
        
        Estudiante a = new Estudiante();
        Scanner leer = new Scanner(System.in);
        
        int Opcion;
        
        while (true){
        
                System.out.println("________________________________________________________________________________________________________________");
                System.out.println("                                  MENÚ TALLER SEIS - ARREGLOS DE OBJETOS");
                System.out.println("                                            ESCOJA UNA OPCION ");
                System.out.println("");
                System.out.println("    DIGITE 1 PARA REGISTRAR Y ADMINISTRAR ESTUDIANTES ");
                System.out.println("    DIGITE 2 PARA SALIR ");
                Opcion = leer.nextInt();
                
                    if (Opcion == 1){
                        a.Solicitar_Estudiantes();
                    }else if (Opcion ==2){
                        break;
                    }else{
                        System.out.println("NÚMERO NO VALIDO FAVOR INTENTE NUEVAMENTE :D");
                    }
            
        }

        
    }
    
}
