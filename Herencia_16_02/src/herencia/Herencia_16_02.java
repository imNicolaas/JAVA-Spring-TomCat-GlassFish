
package herencia;

public class Herencia_16_02 {

    public static void main(String[] args) {
      
        figura fig = new figura();
        
        //C U A D R A D O 
        cuadrado cua = new cuadrado();
        cua.setLado(20);
        
        //A R E A   D E   C U A D R A D O
        fig.CalcArea(cua.getLado(), cua.getLado());
        System.out.println ("El area del cuadrado es: " + fig.CalcArea(cua.getLado (), cua.getLado ()));
        
        //R E C T A N G U L O
        rectangulo rec = new rectangulo();
        rec.setAtura(10); //se asignan las variables de rectangulo
        rec.setBase(12);
        
        //A R E A   D E   R E C T A N G U L O
        int res_rec = fig.CalcArea(rec.getBase(), rec.getAtura()); // SE HACE LO MISMO DE ARRIBA PERO EN EL PRIMERO CALCULO SE CREA UNA VARIABLE QUE ALMACENA EL RESULTADO PARA IMPRIMIRLO
        System.out.println ("\nEl area del rectangulo es: " + res_rec);
        
        //H E R E N C I A
        
        
        System.out.println("\nArea de cuadrado por metodo de herencia: " + cua.CalcArea_2()); //SI SE BORRA LA INSTANCIACION DE LA CLASE FIGURA EN ESTA MAIN IGUAL PORDRIA FUNCINOAR ESTE METODO YA QUE HACE LOS CALULOS Y SE COMUNICA MEDIANTE LA HERENCIA
        

        
    }
    
}
