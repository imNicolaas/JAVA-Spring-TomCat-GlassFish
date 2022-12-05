package modelo;

import java.util.ArrayList;

public class Modelo_Sql_E4 {

    int dias;

    public double total, media, t_max, t_min, nueve_grados, errores;

    public ArrayList<Double> grados = new ArrayList<Double>();

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getT_max() {
        return t_max;
    }

    public void setT_max(double t_max) {
        this.t_max = t_max;
    }

    public double getT_min() {
        return t_min;
    }

    public void setT_min(double t_min) {
        this.t_min = t_min;
    }

    public double getNueve_grados() {
        return nueve_grados;
    }

    public void setNueve_grados(double nueve_grados) {
        this.nueve_grados = nueve_grados;
    }

    public double getErrores() {
        return errores;
    }

    public void setErrores(double errores) {
        this.errores = errores;
    }

    public ArrayList<Double> getGrados() {
        return grados;
    }

    public void setGrados(ArrayList<Double> grados) {
        this.grados = grados;
    }




    public void operaciones() {
        
        for (Double temporal : grados) {

            total = total + temporal;
            
        }
          

            /*
            for(Double temporal : grados){
                media = media + temporal;
            }
        
        sfor (int i = 0; i < grados.size(); i++) {
            total = total + grados.get(i);
        }

        media = total / grados.size();
             */
        }

    }
