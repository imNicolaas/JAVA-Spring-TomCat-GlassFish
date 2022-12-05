package E3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Locky
 */
public class Modelo_E3 {
    int saldo, salario,incentivo, produccion, neto,a  ; 

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }
         int total;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(int incentivo) {
        this.incentivo = incentivo;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



 
      
  
    public  void operaciones(){
                if (produccion>=0 && produccion<=99){
                neto = produccion * 2 ;
                setNeto(neto);
                }
                else if  (produccion >= 100 && produccion<=199){
                salario = produccion * 2;
                incentivo = salario * 10/100;
                neto = salario + incentivo  ;
                setNeto(neto);
                    
                }
                 else if  (produccion >= 200&& produccion <=299){
                salario = (int) (produccion * 2.5);
                incentivo = salario * 12/100;
                neto  =  salario + incentivo  ;
                setNeto (neto );
                }
                 else if  (produccion >= 300 && produccion <=399){
                salario = (produccion * 3);
                incentivo = salario * 14/100;
                neto  =  salario + incentivo  ;
                setNeto (neto );
                }
                else if  (produccion >= 400){
                salario = (int) (produccion * 3.5);
                incentivo = salario * 16/100;
                neto  =  salario + incentivo  ;
                setNeto (neto );
                }
                 else{System.out.println(" Esta cantidad no es permitida");

      
}
    }
    
}
