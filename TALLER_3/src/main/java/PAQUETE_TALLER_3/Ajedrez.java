
package PAQUETE_TALLER_3;

public class Ajedrez {

    public void Metodo_Ajedrez() {
         int fila, columna, usufila, usucolumna;
        System.out.println("Ingrese la fila");
        usufila=Leer.datoInt();
        System.out.println("Ingrese la columna");
        usucolumna=Leer.datoInt(); 
        for(fila=1; fila<=8; fila++){
            for(columna=1; columna<=8; columna++){
                if((fila==usufila)  &&  (columna==usucolumna)){
                    System.out.print(" TU ");
            }
                else  if((fila+columna)%2==0){
                              System.out.print(" N ");
                    }
                    else{
                              System.out.print(" B ");
                    }
        
        }  
            System.out.println("");
            
        
    }
        System.out.println("");
        System.out.println("El afil se mueve "  +  usucolumna +" posiciones" );
        System.out.println("                                ");
        System.out.println("La torre se mueve "  +  usufila +" posiciones");
        
    
}
    
}

        
    
    

