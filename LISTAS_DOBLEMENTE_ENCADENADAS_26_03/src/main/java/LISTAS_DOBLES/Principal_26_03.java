
package LISTAS_DOBLES;

public class Principal_26_03 {

    public static void main(String[] args) {
        
        NODO Cabeza = new NODO();
        
        Cabeza.INFO = 7;
        
        Cabeza.sig = new NODO();
        Cabeza.sig.ant = Cabeza;
        Cabeza.sig.INFO = 6;
        
        Cabeza.sig.sig = new NODO();
        Cabeza.sig.sig.ant = Cabeza.sig;
        Cabeza.sig.sig.INFO = 5;
        
        NODO Recorrido = Cabeza;
        NODO Recorrido_inversa = null;
        
            while(Recorrido != null){
                System.out.println(Recorrido.INFO);
                
                Recorrido_inversa = Recorrido.ant;
                
                Recorrido = Recorrido.sig;
                
            }
            
            System.out.println("");
        
            while(Recorrido_inversa != null){
                System.out.println(Recorrido_inversa.INFO);
                Recorrido_inversa = Recorrido_inversa.ant;
            }
        
    }
    
}
