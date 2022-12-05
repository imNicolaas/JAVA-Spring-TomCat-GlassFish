
package agragacion;


public class Agragacion_16_02 {

    public static void main(String[] args) {
        
        //AGREGACION (USA): UNA CLASE PUEDE USAR A OTRA PERO LA POTESTAD ES MUY DEBIL Y LIMITADA ES DECIR QUE UN CAMBIO EN LA CLASE QUE USA A LA OTRA PUEDE HACER QUE NO SEA POSIBLE HACER USO DE SUS METODOS
     
        figura fig = new figura();
        
        cuadrado cua = new cuadrado();
        cua.setLado(12);
        
        fig.AgregarCuadrado(cua);
        
        fig = null; //SE ASIGNA A LA CLASE FIGURA UN VALOR NULO 
        
        System.out.println("Informacion del cuadrado despues de destruido el objeto figura: " + cua.getLado());
        
            try {
                fig.AgregarCuadrado(cua); //SE LLAMA AL METODO DE LA CLASE FIGURA PERO EN ESTA CLASE YA NO HAY METODOS YA QUE SE BORRO TODO LO QUE HABIA EN ELLA POR LO CUAL DA ERROR Y SE EJECUTA EL CATCH
            } catch (Exception e) {
                System.out.println ("No existe el objeto figura, por lo cual no se puede agregar");
            }
        
    }
    
}
