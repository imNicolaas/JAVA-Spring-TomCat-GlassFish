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
public class Modelo_E7 {
    int gallinas, dias, total, enigma1, enigma,enigma2, pot = 0;

    public int getGallinas() {
        return gallinas;
    }

    public void setGallinas(int gallinas) {
        this.gallinas = gallinas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
        public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getEnigma() {
        return enigma;
    }

    public void setEnigma(int enigma) {
        this.enigma = enigma;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }


    public  void operaciones(){
        int gallinas = (int) Math.pow(3,2);
        
            pot = 1;
            
            for (int i = 0; i < dias; i++) {
                pot = pot*this.gallinas; 
            }        
            
            enigma = 1 + gallinas + ((pot)/this.gallinas);
            setEnigma(enigma);

    }
    

    
}
