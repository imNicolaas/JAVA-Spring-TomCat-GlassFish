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
public class Controlador_E8 {
    List<Modelo_E8> empleados;

    // Llenar la lista
    public Controlador_E8() {
        empleados = new ArrayList<>();
    }
     public void insertarEmpleado(Modelo_E8 empleado) {
        empleados.add(empleado);
        System.out.println("Se agregó el estudiante");
    }
    public List<Modelo_E8> imprimirEmpleado(){
        return empleados;        
    }
    public Modelo_E8 obtenerEmpleado(String cedula) {
        for (Modelo_E8 empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }
    public void actualizarEmpleado(Modelo_E8 empleado) {
        int i = 0;
        while (i < empleados.size()) {
            if (empleados.get(i).getCedula().equals(empleado.getCedula())) {
                empleados.set(i, empleado);
                System.out.println("Se modificó el estudiante");
                break;
            }
            i++;
        }
    }
    public void eliminarEmpleado(Modelo_E8 estudiante) {
        empleados.remove(estudiante);
        } 
    
}
