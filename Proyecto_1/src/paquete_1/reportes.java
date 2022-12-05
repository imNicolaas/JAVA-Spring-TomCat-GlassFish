package paquete_1;


public class reportes {
    public void salida() {
        Producto prod = new Producto();
        
        System.out.println("ingrese el producto ");
        prod.Nom_Producto=leer.dato();
        
        System.out.println("ingrese el proveedor");
        prod.setProveedor(leer.dato());
        
        
        System.out.println("El producto es "+prod.Nom_Producto);
        System.out.println("El codigo es "+prod.Codigo);
        System.out.println("la presentacion es "+prod.Presentacion);
        System.out.println("la cantidad es "+prod.getCantidad());
        System.out.println("el valor unitario es "+prod.getValor_unit());
        System.out.println("el proveedor es "+prod.getProveedor());
        
    } 
}
