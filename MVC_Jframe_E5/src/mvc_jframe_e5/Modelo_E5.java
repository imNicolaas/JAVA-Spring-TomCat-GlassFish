/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_jframe_e5;

import java.util.Scanner;

/**
 *
 * @author Locky
 */
public class Modelo_E5 {
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0, mas = 0; 
                int i;

    public int getMas() {
        return mas;
    }

    public void setMas(int mas) {
        this.mas = mas;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
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
                for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
                        numeros[i] = sc.nextInt();
                }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        
    }
                
    
    
}
