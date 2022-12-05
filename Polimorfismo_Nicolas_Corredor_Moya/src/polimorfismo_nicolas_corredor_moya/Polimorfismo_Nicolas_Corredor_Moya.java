
package polimorfismo_nicolas_corredor_moya;

import java.util.*;
import java.util.ArrayList;

//@author Nicolas Corredor Moya

public class Polimorfismo_Nicolas_Corredor_Moya {

    public static void main(String[] args) {

        List<Figura> figuraList = new ArrayList();

        Figura figura = null;

        int valori =0;
        
        for(int k=0; k<10;k++){
            valori = (int) (Math.random()*3+1);
            System.out.println(valori);

            switch (valori){
                case 1:
                    figura = new Cuadrado();
                    figuraList.add(figura);
                    break;
                case 2:
                    figura = new Rectangulo();
                    figuraList.add(figura);
                    break;
                case 3:
                    figura = new Triangulo();
                    figuraList.add(figura);
                    break;
                default:
                    System.out.println("no soy ninguna de las figuras");
                    break;
            }
        }

        for(Figura f:figuraList){
            f.imprimir();
        }
    }


}
