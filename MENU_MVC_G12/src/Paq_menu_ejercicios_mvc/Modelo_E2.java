package Paq_menu_ejercicios_mvc;

public class Modelo_E2 {

    int R_Correctas, R_Incorrectas, R_En_Blanco, puntos_por_correctas, puntos_por_incorrectas, puntos_por_en_blanco, puntaje_final, Total_preguntas, Puntaje_Maximo;

    public int getR_Correctas() {
        return R_Correctas;
    }

    public void setR_Correctas(int R_Correctas) {
        this.R_Correctas = R_Correctas;
    }

    public int getR_Incorrectas() {
        return R_Incorrectas;
    }

    public void setR_Incorrectas(int R_Incorrectas) {
        this.R_Incorrectas = R_Incorrectas;
    }

    public int getR_En_Blanco() {
        return R_En_Blanco;
    }

    public void setR_En_Blanco(int R_En_Blanco) {
        this.R_En_Blanco = R_En_Blanco;
    }

    public int getPuntos_por_correctas() {
        return puntos_por_correctas;
    }

    public void setPuntos_por_correctas(int puntos_por_correctas) {
        this.puntos_por_correctas = puntos_por_correctas;
    }

    public int getPuntos_por_incorrectas() {
        return puntos_por_incorrectas;
    }

    public void setPuntos_por_incorrectas(int puntos_por_incorrectas) {
        this.puntos_por_incorrectas = puntos_por_incorrectas;
    }

    public int getPuntos_por_en_blanco() {
        return puntos_por_en_blanco;
    }

    public void setPuntos_por_en_blanco(int puntos_por_en_blanco) {
        this.puntos_por_en_blanco = puntos_por_en_blanco;
    }

    public int getPuntaje_final() {
        return puntaje_final;
    }

    public void setPuntaje_final(int puntaje_final) {
        this.puntaje_final = puntaje_final;
    }

    public int getTotal_preguntas() {
        return Total_preguntas;
    }

    public void setTotal_preguntas(int Total_preguntas) {
        this.Total_preguntas = Total_preguntas;
    }

    public int getPuntaje_Maximo() {
        return Puntaje_Maximo;
    }

    public void setPuntaje_Maximo(int Puntaje_Maximo) {
        this.Puntaje_Maximo = Puntaje_Maximo;
    }
    
    

    public void Operaciones() {

        puntos_por_correctas = R_Correctas * 4;
        puntos_por_incorrectas = -R_Incorrectas;
        puntos_por_en_blanco = 0;

        Total_preguntas = R_Correctas + R_Incorrectas + R_En_Blanco;
        Puntaje_Maximo = Total_preguntas * 4;
        puntaje_final = puntos_por_correctas + puntos_por_incorrectas + puntos_por_en_blanco;

        setPuntaje_final(puntaje_final);
        setPuntaje_Maximo(Puntaje_Maximo);
        
    }

}
