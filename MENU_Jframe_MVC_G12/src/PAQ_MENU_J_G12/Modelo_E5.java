/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQ_MENU_J_G12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Locky
 */
public class Modelo_E5 {
   
        ArrayList <Integer> Numeros = new ArrayList<Integer>();
        
        int pos = 0, neg = 0, cero = 0, total_de_positivos = 0, total_de_negativos = 0;
        
        int i;


    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getTotal_de_positivos() {
        return total_de_positivos;
    }

    public void setTotal_de_positivos(int total_de_positivos) {
        this.total_de_positivos = total_de_positivos;
    }

    public int getTotal_de_negativos() {
        return total_de_negativos;
    }

    public void setTotal_de_negativos(int total_de_negativos) {
        this.total_de_negativos = total_de_negativos;
    }

    public int getNeg() {
        return neg;
    }

    public void setNeg(int neg) {
        this.neg = neg;
    }

    public int getCero() {
        return cero;
    }

    public void setCero(int cero) {
        this.cero = cero;
    }

        
        
    public  void operaciones(){

        for (i = 0; i < Numeros.size(); i++) {
            
                if (Numeros.get(i) > 0) {
                    pos++;
                    total_de_positivos = total_de_positivos + Numeros.get(i);

                } else if (Numeros.get(i) < 0) {
                    neg++;
                    total_de_negativos = total_de_negativos + Numeros.get(i);
                } else {
                    cero++;
                }
            
        }
        
    }
                
    
    
}
