package paq_j_E6;

import java.util.ArrayList;
import java.util.List;

public class Controlador_E6 {

    List<Modelo_E6> registros;

    public Controlador_E6() {
        registros = new ArrayList<>();
    }

    public void insertarRegistro(Modelo_E6 registro) {
        registros.add(registro);
        System.out.println("Se agregó el registro");
    }

    public List<Modelo_E6> imprimirRegistros() {
        return registros;
    }

}
