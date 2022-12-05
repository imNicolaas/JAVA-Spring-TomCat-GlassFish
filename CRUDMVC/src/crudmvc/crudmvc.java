
package crudmvc;

import controlador.controlador;
import modelo.ConsultaProducto;
import modelo.modelo;
import vista.vista;


public class crudmvc {

    
    public static void main(String[] args) {
        // TODO code application logic here
        modelo mod =new modelo();
        ConsultaProducto con = new ConsultaProducto();
        vista vis=new vista();
        controlador cont=new controlador(mod,con,vis);
        
    }
    
}
