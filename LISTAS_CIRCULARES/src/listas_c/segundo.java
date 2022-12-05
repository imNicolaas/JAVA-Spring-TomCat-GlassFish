
package listas_c;

public class segundo {

    public static void main(String[] args) {
        
        System.out.println("CUANTOS COMPAÑEROS DESEA PROCESAR: ");
        int CANT_NODOS = Leer.datoInt();
        
        NODO Cabeza =null;
        NODO recorrer;
        
        if (CANT_NODOS > 0) {
           Cabeza= new NODO();
            recorrer = Cabeza;
            int i = 0;
            
            while (i < CANT_NODOS) {
                System.out.print("introduzca Nombre "+(i+1)+": ");
                recorrer.nombre = Leer.dato();
                System.out.print("Introduzca el numero Celular "+(i+1)+": ");
                recorrer.Celular = Leer.datoInt();
                System.out.print("Introduzca El email "+(i+1)+": ");
                recorrer.Correo= Leer.dato();
                i++;
                System.out.println("");
                System.out.println("______________________________");
                
                    if (i < CANT_NODOS) {
                        recorrer.sig = new NODO();
                        recorrer.sig.ant = recorrer;
                        recorrer=recorrer.sig;
                    }
            }
        }
        recorrer= Cabeza;
       System.out.println("LOS DATOS ALMACENADOS SON: \n ");
       
       int poto = 1;
        while(recorrer!=null){
            
            System.out.println(poto +")  • Nombre: "+recorrer.nombre+ "    • Correo: "+recorrer.Correo+ "    • Celular: "+recorrer.Celular);
            recorrer=recorrer.sig;
            poto++;
        }
        
    }
}
        
    
        
        
    

