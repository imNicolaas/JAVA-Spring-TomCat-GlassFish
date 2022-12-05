/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConsultaProducto;
import modelo.modelo;
import vista.vista;
/**
 *
 * @author ESTACION
 */
public class controlador implements ActionListener{
    private ConsultaProducto modelo;
    private modelo mod;
    private vista vis;

    public controlador(ConsultaProducto modelo, modelo mod, vista vis) {
        this.modelo = modelo;
        this.mod = mod;
        this.vis = vis;
        this.vis.btnbuscar.addActionListener(this);
        this.vis.btneliminar.addActionListener(this);
        this.vis.btnguardar.addActionListener(this);
        this.vis.btnmodificar.addActionListener(this);
        
    }

    public controlador(modelo mod, ConsultaProducto con, vista vis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void iniciar(){
            vis.setTitle("Productos");
            vis.setLocationRelativeTo(null);
            vis.txtid.setVisible(false);
        }
    @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==vis.btnguardar){
                mod.setCodigo(Integer.parseInt(vis.txtcodigo.getText()));
                mod.setNombre(vis.txtnombre.getText());
                mod.setPrecio(Double.parseDouble(vis.txtprecio.getText()));
                mod.setCantidad(Integer.parseInt(vis.txtcantidad.getText()));
            }
            if(modelo.registrar(mod)){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                limpiar();
        }
        else{
             JOptionPane.showMessageDialog(null,"Error al Guardar");
             limpiar();
        }
        if(e.getSource()==vis.btnmodificar){
                mod.setId(Integer.parseInt(vis.txtid.getText()));
                mod.setCodigo(Integer.parseInt(vis.txtcodigo.getText()));
                mod.setNombre(vis.txtnombre.getText());
                mod.setPrecio(Double.parseDouble(vis.txtprecio.getText()));
                mod.setCantidad(Integer.parseInt(vis.txtcantidad.getText()));
            }
            if(modelo.modificar(mod)){
                JOptionPane.showMessageDialog(null,"Registro Mofificado");
                limpiar();
        }
        else{
             JOptionPane.showMessageDialog(null,"Error al Modificar");
             limpiar();
        }
            if(e.getSource()==vis.btneliminar){
                mod.setId(Integer.parseInt(vis.txtid.getText()));
                
            }
            if(modelo.eliminar(mod)){
                
                JOptionPane.showMessageDialog(null,"RegistroEliminado");
                limpiar();
        }
        else{
             JOptionPane.showMessageDialog(null,"Error al eliminar");
             limpiar();
        }
            
          if(e.getSource()==vis.btnbuscar){
                mod.setCodigo(Integer.parseInt(vis.txtcodigo.getText()));
                
            }
        
            if(modelo.buscar(mod)){
                vis.txtid.setText(String.valueOf(mod.getId()));
                vis.txtcodigo.setText(String.valueOf(mod.getCodigo()));
                vis.txtnombre.setText(mod.getNombre());
                vis.txtprecio.setText(String.valueOf(mod.getPrecio()));
                vis.txtcantidad.setText(String.valueOf(mod.getCantidad()));
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        if(e.getSource()==vis.btnlimpiar){
               limpiar();
                
            }
        
            if(modelo.buscar(mod)){
                vis.txtid.setText(String.valueOf(mod.getId()));
                vis.txtcodigo.setText(String.valueOf(mod.getCodigo()));
                vis.txtnombre.setText(mod.getNombre());
                vis.txtprecio.setText(String.valueOf(mod.getPrecio()));
                vis.txtcantidad.setText(String.valueOf(mod.getCantidad()));
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        }
            
            
          
        
        public void limpiar(){
            vis.txtid.setText(null);
            vis.txtcodigo.setText(null);
            vis.txtnombre.setText(null);
            vis.txtprecio.setText(null);
            vis.txtcantidad.setText(null);
        }
    
}
