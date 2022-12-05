
package composicion_nicolas_corredor_moya;

public class Composicion_Nicolas_Corredor_Moya {

    public static void main(String[] args) {
        
        Figura fig = new Figura();
        
        fig.RecibeObjetoRectangulo(new Rectangulo());
        
        fig = null;
        
            try {

                fig.RecibeObjetoRectangulo(new Rectangulo());

            } catch (Exception e) {

                System.out.println("NO es posible, el objeto figura fue borrado");

            }
            
        
       
        
    }
    
}
