/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQ_MENU_J_G12;

/**
 *
 * @author Locky
 */
public class Modelo_E1 {
     
    double division,numero1 , numero2, resultado, suma ,a, resta, producto;;

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getresultado() {
        return resultado;
    }

    public void setresultado(int resultado) {
        this.resultado = resultado;
        
    }
    public double getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public double getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }
        public void setSuma(double suma) {
                  this.suma = suma;  
        }
                public void setResta(double resta) {
                  this.resta = resta;  
        }

                        public void setProducto(double producto) {
                  this.producto = producto;  
        }


        
    public  void operaciones(){
         suma = numero1 + numero2;
        setSuma(suma);
        resta = numero1 - numero2;
        setResta(resta);
        producto = numero1 * numero2;
        setProducto(producto);
        if (numero2 != 0 ){
                    division = numero1 / numero2;
        setDivision(division);
            
        }else System.out.println("No se puede presentar");

        
    }
}

    
