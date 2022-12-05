package PAQUETE_03_05;

public class Principal_pilas_03_05 {

    public static void main(String[] args) {

        Pila pila = new Pila();
        int opcion = -1;

        while (opcion != 4) {
            
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            
            if (opcion == 1) {
                Informacion info = new Informacion();
                System.out.println("digite el dato:");
                info.dato = Leer.dato();
                pila.agregar(info);
                
            } else if (opcion == 2) {
                Informacion info = pila.atender();
                System.out.println("dato atendido : " + info.dato);
                
            } else if (opcion == 3) {
                pila.listar();
            }
        }
        System.out.println("terminado");

    }

}
