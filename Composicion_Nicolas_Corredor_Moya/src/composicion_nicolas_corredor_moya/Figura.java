
package composicion_nicolas_corredor_moya;

public class Figura {
    
    public void RecibeObjetoRectangulo(Rectangulo rec_obj){
        rec_obj.setBase(10);
        rec_obj.setAltura(100);
        
        System.out.println("Imprime base del rectangulo: " + rec_obj.getBase()+ "\n");
        
        System.out.println("Imprime altura del rectangulo: " + rec_obj.getAltura()+ "\n");
    }
    
}
