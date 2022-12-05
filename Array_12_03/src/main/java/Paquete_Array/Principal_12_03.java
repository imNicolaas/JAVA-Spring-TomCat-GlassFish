package Paquete_Array;

import java.util.ArrayList;

public class Principal_12_03 {

    public static void main(String[] args) {

        ArrayList a= new ArrayList();
        
            String Cadena_1 = "Hoy es viernes";
            a.add(Cadena_1);

            String Cadena_2 = "Mañana estudio estructurasviernes";
            a.add(Cadena_2);

            String Cadena_3 = "Y termino todos los talleres ";
            a.add(Cadena_3);
            
            ProcesadorArrayList poto = new ProcesadorArrayList();
            poto.Salida(a);
        
        
    }
    
}