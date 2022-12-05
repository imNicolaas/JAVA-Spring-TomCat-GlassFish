
package array.list;

import java.util.ArrayList;
import java.util.Scanner;


public class Probador {

    public static String Dat[];
    
    public static void main(String[] args) {
        Scanner Datos=new Scanner(System.in);
        Scanner sn =new Scanner (System.in);
         ArrayList listas=new ArrayList();  
        int limite;String buscar;int elem,resp;
        int opcion = 0;
        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido");
            System.out.println("1.Registrar un vehiculo");
            System.out.println("2.Buscar por modelo del vehiculo");
            System.out.println("3.Eliminar un vehiculo del registro");
            System.out.println("4.Listado de los vehiculos y seguir modificando");
            System.out.println("5.Salir");
            
            System.out.println("Introduzca la eleccion que desee");
            opcion = sn.nextInt();
            switch (opcion){
                case 1: 
                    System.out.println("Ingrese la Cantidad de elementos a almacenar en el ArrayList");
                    limite=Datos.nextInt();
                    Dat=new String[limite];
                    AlmacenarElementosArrayList(Dat, listas, Datos);
                    break;
             
                case 2:
                    System.out.println("Ingrese el elemento a buscar ");
                    buscar=Datos.next();
                    if(BuscarElemento(listas, buscar)){
                    System.out.println("elemento encontrado");
                    }else{
                    System.out.println("elemento no existe");
                    }
                    break;
                case 3: 
                    System.out.println("");
                    System.out.println("Ingrese el elemento que desea eliminar del ArrayList");
                    elem=Datos.nextInt();
                    EliminarElementoArrayList(listas, elem);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Nuevos Elementos");
                    MostrarElementosArrayList(listas);
                    System.out.println("");
                    System.out.println("Desea seguir con el proceso si=1/ no=otras teclas ");
                    resp=Datos.nextInt();
                    while(resp==1){
                        System.out.println("Ingrese el elemento a buscar ");
                        buscar=Datos.next();
                        if(BuscarElemento(listas, buscar)){
                        System.out.println("elemento encontrado");
                        }else{
                        System.out.println("elemento no existe");
                        }
                        System.out.println("");
                        System.out.println("Ingrese el elemento que desea eliminar del ArrayList");
                        elem=Datos.nextInt();
                        EliminarElementoArrayList(listas, elem);
                        System.out.println("");
                        System.out.println("Nuevos Elementos");
                        MostrarElementosArrayList(listas);
                        System.out.println("");
                        System.out.println("Desea seguir con el proceso si=1/ no=otro numero ");
                        resp=Datos.nextInt();
                    }
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                        System.out.println("Ingrese una opcion");
              
            }
            
        }
        
    }
    public static void AlmacenarElementosArrayList(String Array[],ArrayList list,
            Scanner sc){
        for(int i=0;i<Array.length;i++){
            System.out.println("Ingrese la placa ["+i+"] --> ");
            Array[i]=sc.next();
            list.add(Array[i]);
            System.out.println("Ingrese el movil ["+i+"] --> ");
            Array[i]=sc.next();
            list.add(Array[i]);
            System.out.println("Ingrese el modelo ["+i+"] --> ");
            Array[i]=sc.next();
            list.add(Array[i]);
            System.out.println("Ingrese la marca ["+i+"] --> ");
            Array[i]=sc.next();
            list.add(Array[i]);
        }
    }
    
    public static void MostrarElementosArrayList(ArrayList list){
       list.forEach((lista)->{
           System.out.println("* "+lista);
           
       });
       
       
    }
   
    public static boolean BuscarElemento(ArrayList list,String md){
       boolean bandera=false;
        if(list.contains(md)){
            bandera=true;
        }
        return bandera;
    }
    
    public static void EliminarElementoArrayList(ArrayList list,int  elemento){
        list.remove(elemento);
    }
    
}
    
    
    
         

