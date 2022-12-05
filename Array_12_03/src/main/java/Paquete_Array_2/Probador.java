
package Paquete_Array_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Probador {

    public static void main(String[] args) {
        
        ArrayList <Factura> Array_1 = new ArrayList<Factura>();
        
        Factura factu = new Factura();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuantos Productos");
        int Cant = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < Cant; i++) {
            factu = new Factura();
            
            System.out.println("Ingrese el articulo ");
            factu.Articulo=teclado.nextLine();
            
            System.out.println("Ingrese la cantidad: ");
            factu.Cantidad=teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("Ingrese el valor: ");
            factu.Valor = teclado.nextFloat();
            teclado.nextLine();
            
            System.out.println("");
            
            Array_1.add(factu); 
        }

            Procesador sali = new Procesador();
            sali.Imprimir(Array_1);
            
            
        
    }
    
}
