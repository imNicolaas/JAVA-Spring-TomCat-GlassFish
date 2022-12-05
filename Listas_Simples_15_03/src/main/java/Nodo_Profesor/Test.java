package Nodo_Profesor;
public class Test {

    public static void main(String[] args) {

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 2;

        for(contador =2; contador <=10; contador+=2){

            recorrer.info = contador;

                if (contador < 10) {
                    recorrer.siguiente = new Nodo();
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

