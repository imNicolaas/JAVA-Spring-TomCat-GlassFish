/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paq_menu_ejercicios_mvc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Locky
 */
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

    

