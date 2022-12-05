
package PAQUETE_TALLER_4;

import java.util.Scanner;

public class Principal_Taller_4 {

    public static void main(String[] args) {
        
        Suma_Todos_Elementos Suma = new Suma_Todos_Elementos();
        Buscar_Numero Buscar = new Buscar_Numero();
        Mayor_y_Menor M_y_M = new Mayor_y_Menor();
        Organizar_Numeros Organizador = new Organizar_Numeros();
        
        int Opcion=0;
        Scanner teclado = new Scanner(System.in);
        
        while (true){
            
                System.out.println("________________________________________________________________________________________________________________________");
                System.out.println("                                  MENÚ TALLER CUATRO- ARREGLOS UNIDIMENSIONALES");
                System.out.println("                                                ESCOJA UNA OPCION ");
                System.out.println("");
                System.out.println("    DIGITE 1 PARA REALIZAR LA SUMA DE TODOS LOS ELEMENTOS DE TRES VECTORES");
                System.out.println("    DIGITE 2 PARA BUSCAR UN NUMERO EN UN VECTOR E INDICAR CUANTAS VECES SE REPITE EN EL MISMO");
                System.out.println("    DIGITE 3 INDICAR EL NUMERO MAYOR Y MENOR ENTRE DOS VECTORES  ");
                System.out.println("    DIGITE 4 ORGANIZAR LOS NUMEROS POSITIVOS Y NEGATIVOS EN UN VECTOR");
                System.out.println("    DIGITE 5 PARA SALIR ");
                Opcion = teclado.nextInt();
                
                    if (Opcion == 1){
                        Suma.Suma_Elementos();
                    }else if (Opcion ==2){
                        Buscar.Buscar_Num();
                    }else if (Opcion ==3){
                        M_y_M.Mayor_y_Menor();
                    }else if (Opcion ==4){
                        Organizador.Organizar_();
                    }else if (Opcion ==5){
                        break;
                    }else{
                        System.out.println("NÚMERO NO VALIDO FAVOR INTENTE NUEVAMENTE :D");
                    }
                
        }
        
        System.out.println("EJECUCION TERMINADA, GRACIAS POR PARTICIPAR :D");
            
        
        
       
        
        
}
}
