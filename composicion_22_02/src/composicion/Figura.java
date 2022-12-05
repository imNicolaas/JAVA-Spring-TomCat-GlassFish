
package composicion;

public class Figura {
    
    public void RecibeObjetoCuadrado(Cuadrado cua_obj){
        cua_obj.setLado(25);
        
        System.out.println("Imprime informacion del atributo de cuadrado: " + cua_obj.getLado() + "\n");
    }
    
    public void ManejaCuadrado(){ //SEGUNDO FORMA DE HACER COMPOSICION
    
        Cuadrado cua = new Cuadrado();
        cua.setLado(64);
        System.out.println("Imprime informacion del atributo de cuadrado 2: " + cua.getLado()+ "\n");
    }
    
}
