package Nodos_19_03;

public class Nodo_19_03 {
    
    public static void main(String[] args) {

        N_O_D_O Cabeza = new N_O_D_O();
        N_O_D_O recorrer = Cabeza;
        
        for (int contador = 2; contador <=10; contador+=2) {
            recorrer.info = contador;
            
            if (contador < 10) {
                recorrer.siguiente = new N_O_D_O();
            }
            recorrer = recorrer.siguiente;
        }
        
         recorrer = Cabeza;
            
                while (recorrer != null) {
                    System.out.println(recorrer.info);
                    recorrer = recorrer.siguiente;
                }
        }
    }


