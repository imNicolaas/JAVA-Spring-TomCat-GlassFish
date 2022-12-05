package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaProducto extends conexion {
    public boolean registrar(modelo pro){
        PreparedStatement ps=null; 
        Connection con= getconexion();
        String sql= "Insert into producto (codigo, nombre, precio, cantidad) values (?,?,?,?)";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,pro.getCodigo());
            ps.setString(2,pro.getNombre());
            ps.setDouble(3,pro.getPrecio());
            ps.setInt(4,pro.getCantidad());
            ps.execute();
            return true;
        }catch(SQLException e)
        {
            System.err.println(e);
            return(false);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
           
        }
    
    
    }
    public boolean modificar(modelo pro){
        PreparedStatement ps=null; 
        Connection con= getconexion();
        String sql= "update producto set codigo=?, nombre=?, precio=?, cantidad=? where cantidad=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,pro.getCodigo());
            ps.setString(2,pro.getNombre());
            ps.setDouble(3,pro.getPrecio());
            ps.setInt(4,pro.getCantidad());
            ps.setInt(5,pro.getId());
            ps.execute();
                   return true;
        }catch(SQLException e)
        {
            System.err.println(e);
            return(false);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
           
        }
    
    
    }
    
    
    
    public boolean eliminar(modelo pro){
        PreparedStatement ps=null; 
        Connection con= getconexion();
        String sql= "delete from producto where id=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,pro.getId());
            ps.execute();
              return true;
        }catch(SQLException e)
        {
            System.err.println(e);
            return(false);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
           
        }
    
    
    }
    public boolean buscar(modelo pro) {
        PreparedStatement ps=null; 
        ResultSet rs=null;
        Connection con= getconexion();
        String sql= "select * from producto where codigo=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,pro.getCodigo());
            rs=ps.executeQuery();
            
            if(rs.next()){
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setCodigo(Integer.parseInt(rs.getString("codigo")));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(Double.parseDouble(rs.getString("precio")));
                pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                return true;
        }
            return false;
            }catch(SQLException e)
        {
            System.err.println(e);
            return(false);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
           
        }
    
    
    }

    
        
}