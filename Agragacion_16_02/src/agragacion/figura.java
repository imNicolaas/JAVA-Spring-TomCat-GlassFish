    
package agragacion;

public class figura {
    
    private int CalcArea(int V1, int V2){
        return V1 * V2;
    }
    
    public void AgregarCuadrado(cuadrado cua_obj){
        
        this.CalcArea(cua_obj.getLado(), cua_obj.getLado());
        System.out.println ("Area desde agregacion: " + this.CalcArea(cua_obj.getLado(), cua_obj.getLado()));

        
    }
    
}
