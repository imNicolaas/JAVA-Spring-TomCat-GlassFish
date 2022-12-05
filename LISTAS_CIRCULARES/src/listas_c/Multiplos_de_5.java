
package listas_c;

public class Multiplos_de_5 {

    public static void main(String[] args) {
        
        NODO Cabeza = new NODO(); 
            NODO recorrer = Cabeza; 
            
            
            for (int CONTADOR =15; CONTADOR <= 30; CONTADOR +=5) { 
                recorrer.info = CONTADOR; 
                    if (CONTADOR < 30 && CONTADOR % 5==0) { 
                    recorrer.siguiente = new NODO(); 
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

           