
package Paquete;
import java.util.*;


public class Vista_E2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Modelo_E2 mod = new Modelo_E2();
        
        int R_Correctas, R_Incorrectas, R_En_Blanco;
        
        System.out.println("B I E N V E N I D O \n");
        
        System.out.print("Digite el número de respuestas correctas: "); 
        R_Correctas = entrada.nextInt();
        System.out.print("Digite el número de respuestas incorrectas: ");
        R_Incorrectas = entrada.nextInt();
        System.out.print("Digite el número de respuestas en blanco: ");
        R_En_Blanco = entrada.nextInt();
        
        mod.setR_Correctas(R_Correctas);
        mod.setR_Incorrectas(R_Incorrectas);
        mod.setR_En_Blanco(R_En_Blanco);
        
        mod.Operaciones(); //Se debe ejecutar el metodo en el que se estan haceciendo las operaciones para activar las varibles que alli se crean y se envian
        
        System.out.print("\nPuntaje final: " + mod.getPuntaje_final() +"/"+mod.getPuntaje_Maximo()+ "\n");
        
        
        
                
        
    }
    
}
