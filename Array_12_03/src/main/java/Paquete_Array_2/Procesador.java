
package Paquete_Array_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Procesador {

    public void Imprimir (ArrayList <Factura> arl){
    
        int i = 0;
        
        System.out.println("Articulo \t\t Cantidad \t\t Valor Unit \t\t Valor Total ");
        
        while (i<arl.size() ){
        
            System.out.println(arl.get(i).Articulo +"\t\t\t"+ arl.get(i).Cantidad +"\t\t\t"+ arl.get(i).Valor +"\t\t\t"+ arl.get(i).Valor_Total());
            i++;
        }
        
    }
    
    
    
}
