
package paquete;

public class clase_fibonacci {
    
      
    public static void main(String[] args) {
        int a, anterior=0, actual=1, posterior, cantidad=0, sumarimpar=1, buscar, encontrado=0;
        System.out.println("Cuantos datos a mostrar");
        cantidad=leer.datoInt();
        System.out.println("Ingrese el numero a buscar");
        buscar=leer.datoInt();
        System.out.println(anterior);
        System.out.println(actual);
        for(a=0; a<cantidad-2; a++){
            posterior=anterior+ actual;
            anterior=actual;
            actual=posterior;
            System.out.println(actual);
            if(actual % 2 != 0){
                sumarimpar=sumarimpar+ actual;
               
            }
            if(buscar==actual){
                encontrado++;
               
            }
           
        }
          System.out.println("la suma de los impares es "+ sumarimpar);
          if( encontrado>1){
              System.out.println("Si esta");
          }
          else{
              System.out.println("No esta");


    }
     
    }
   
    
}
