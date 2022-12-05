
package herencia;

public class cuadrado extends figura{
    
    private int lado;

    
    public int getLado() {
        return lado;
    }

    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int CalcArea_2(){
        return super.CalcArea(this.lado, this.lado); //PARA LLAMAR A LA CLASE  PADRE QUE EN ESTE CASO ES figura SE USA LA PALABRA SUPER
    }
}
