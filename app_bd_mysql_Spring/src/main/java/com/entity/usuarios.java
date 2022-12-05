
package com.entity;

//@author Nicolas Corredor Moya

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.swing.text.StyleConstants.Size;

@Entity
@Table(name = "usuarios")


public class usuarios implements serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id; 
    
    
    @Column(name = "nombre_usuario")
        private String nombre_usuario; 
    
    
    @Column(name = "clave")
    private String Clave;
    
    public usuarios(){
    }
    
    public usuarios(Integer id){
        this.id=id; 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
    public int hashcode (){
        int hash = 0;
        hash +=(id !=null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals (Object object){
        
        if (!(object instanceof usuarios)){
            return false;
        }
        usuarios other = (usuarios) object;
        
        return true;
    }
    
    @Override
    public String toString(){
        return "Usuarios{" + "id" + id + ", clave" + Clave + "}";
    }
    
    
    
}
