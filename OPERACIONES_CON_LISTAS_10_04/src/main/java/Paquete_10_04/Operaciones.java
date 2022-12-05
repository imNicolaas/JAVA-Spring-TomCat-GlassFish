package Paquete_10_04;

public class Operaciones {

    public NODO añadir(NODO lista, NODO nuevo) {
        
        if (lista != null) {
            NODO recorrer = lista;
            while (recorrer.siguiente != null) {
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = nuevo;
            nuevo.siguiente = null;
        } else {
            lista = nuevo;
        }
        return lista;
    }

    public NODO eliminar(NODO lista, String nombreCiudad) {
        
        NODO recorrer = lista;
        NODO anterior = null;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(nombreCiudad))) {
            anterior = recorrer;
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            if (anterior != null) {
                anterior.siguiente = recorrer.siguiente;
                recorrer.siguiente = null;
            } else if (anterior == null) {
                lista = recorrer.siguiente;
                recorrer.siguiente = null;
            }
            System.out.println("nodo eliminado");
        } else {
            System.out.println("no existe el nodo");
        }
        return lista;
    }

    public NODO buscar(NODO lista, String nombreCiudad) {
        NODO recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(nombreCiudad))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }

    public NODO modificar(NODO lista, String ciudadbuscada, String nuevaCiudad, String nuevoDepartamento) {
        NODO recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(ciudadbuscada))) {

            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.ciudad = nuevaCiudad;
            recorrer.informacion.departamento = nuevoDepartamento;
        }
        return lista;
    }

    public void listar(NODO lista) {
        NODO recorrer = lista;
        while (recorrer != null) {
            System.out.println("ciudad: " + recorrer.informacion.ciudad);
            System.out.println("departamento: " + recorrer.informacion.departamento);
            System.out.println("----------------------------------------------------");
            recorrer = recorrer.siguiente;
        }

    }

}