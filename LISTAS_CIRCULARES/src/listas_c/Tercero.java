
package listas_c;

public class Tercero {

    public static void main(String[] args) {
        
        NODO Cabeza = new NODO(); 
            NODO recorrer = Cabeza; 
            
            int CONTADOR = 2; 
            
            for (CONTADOR =2; CONTADOR <= 20; CONTADOR +=2){ 
            recorrer.info = CONTADOR; 
                if (CONTADOR < 30) { 
                recorrer.siguiente = new NODO(); 
                }
                        if (CONTADOR==6){
                            CONTADOR = CONTADOR+2;

                        }if (CONTADOR==10){
                            CONTADOR = CONTADOR+2;
                        }
                        if (CONTADOR==14){
                            CONTADOR = CONTADOR+2;
                        }
                        
                        recorrer = recorrer .siguiente;
                        }
            
            recorrer=Cabeza;
            
            while (recorrer != null){
                System.out.println(recorrer.info);
                recorrer = recorrer.siguiente;
                
            }
        
    }
    
}

