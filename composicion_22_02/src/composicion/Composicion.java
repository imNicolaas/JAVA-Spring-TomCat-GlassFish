
package composicion;


public class Composicion {

    public static void main(String[] args) {
         
        Figura fig = new Figura();
        
        //C O M P O S I C I O N   P O S E E    O T R A S   C L A S E S
        
        fig.RecibeObjetoCuadrado(new Cuadrado()); //SE CREA UN OBJETO CUADRADO AQUI MISMO NO COMO ANTES QUE SE CREABA UN OBJETO CON LA CLASE CUADRADO
        
        fig = null;
        
        try{
            fig.RecibeObjetoCuadrado(new Cuadrado () );
        }catch (Exception e) {
            System.out.println ("No se puede enviar objeto cuadrado porque el objeto figura se elimino\n"); //SE IMPRIME ESTO PORQUE NO HAY UNA VARIABLE QUE ALMACENE LA INFORMACION DE FIGURA
            
            // NO HAY FORMA DE RECUPERAR LOS VALORES POR QUE SE ELEMINO EL ATRIBUTO OBJETO CUADRADO JUNTO CON EL EL OBJETO FIGURA
        }
        
        
        // se instancia nuevamente
        fig = new Figura();
        
        // se invoca el n uevo método
        fig.ManejaCuadrado();

        // se destruye
        fig=null;
        
        //se comprueba eliminación de los objetos
        try{
          fig.RecibeObjetoCuadrado (new Cuadrado ());
        }catch (Exception e) {
           System.out.println ("No se puede enviar objeto cuadrado manejado porque el objeto figura se eliminó\n");
        }
        
        
    }
}
