package paquete_1;




public class Producto {

    public String getNom_Producto() {
        return Nom_Producto;
    }

    public void setNom_Producto(String Nom_Producto) {
        this.Nom_Producto = Nom_Producto;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getValor_unit() {
        return Valor_unit;
    }

    public void setValor_unit(int Valor_unit) {
        this.Valor_unit = Valor_unit;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
    
    public String Nom_Producto= "arroz";
    public int Codigo = 11111;
    public String Presentacion = "kilos";
    private int Cantidad = 200; 
    private int Valor_unit = 10000; 
    private String Proveedor = "Arroz Diana";
}
