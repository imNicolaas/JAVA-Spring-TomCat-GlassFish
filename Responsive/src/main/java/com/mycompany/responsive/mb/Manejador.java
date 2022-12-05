/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.responsive.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Nicolas Corredor Moya
 */
@ManagedBean(name = "userLoginView")
@ViewScoped

public class Manejador {
    
    private String  username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void login(){
        System.out.println("El usuario es: " + this.username);
    }
    
    /**
     * Creates a new instance of Manejador
     */
    
    public Manejador() {
    }
    
}
