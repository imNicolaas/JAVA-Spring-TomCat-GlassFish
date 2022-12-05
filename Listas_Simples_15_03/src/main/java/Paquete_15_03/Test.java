package Paquete_15_03;

public class Test {
    
    public static void main(String[] args) {
        
        nodo Cabeza = new nodo();
        
            Cabeza.Nombre = "Camilo";
            Cabeza.cc = 123344;
            Cabeza.Edad = 34;

            Cabeza.next = new nodo();
            Cabeza.next.Nombre = "Carlos"; 
            Cabeza.next.cc = 999999; 
            Cabeza.next.Edad = 22;


            Cabeza.next.next = new nodo();
            Cabeza.next.next.Nombre = "Jose"; 
            Cabeza.next.next.cc = 212138888; 
            Cabeza.next.next.Edad = 28;

            Cabeza.next.next.next = new nodo();
            Cabeza.next.next.next.Nombre = "Maria"; 
            Cabeza.next.next.next.cc = 22222222; 
            Cabeza.next.next.next.Edad = 18;
            
            
            
            System.out.println("----------------------------------------------");
                    
            System.out.println(Cabeza.Nombre);
            System.out.println(Cabeza.cc);
            System.out.println(Cabeza.Edad);
            
            System.out.println("----------------------------------------------");
            
            
            System.out.println(Cabeza.next.Nombre);
            System.out.println(Cabeza.next.cc);
            System.out.println(Cabeza.next.Edad);
            
            System.out.println("----------------------------------------------");
            
            System.out.println(Cabeza.next.next.Nombre);
            System.out.println(Cabeza.next.next.cc);
            System.out.println(Cabeza.next.next.Edad);
            
            System.out.println("----------------------------------------------");
            
            System.out.println(Cabeza.next.next.next.Nombre);
            System.out.println(Cabeza.next.next.next.cc);
            System.out.println(Cabeza.next.next.next.Edad);
            
        
    }

}


