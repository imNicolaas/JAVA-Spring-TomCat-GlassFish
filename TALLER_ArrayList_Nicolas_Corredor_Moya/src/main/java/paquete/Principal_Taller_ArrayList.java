
package paquete;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal_Taller_ArrayList {

    public static String Dat[];
    
    public static void main(String[] args) {
        
        Scanner Datos=new Scanner(System.in);
        Scanner sn =new Scanner (System.in);
        
        ArrayList LISTAS=new ArrayList();  
        
        int limite, ELEMENTO_A_BUSCAR,resp;
        String buscar;
        
        int opcion = 0;
        
        boolean CONTINUAR = false;
        while (!CONTINUAR){
            
            System.out.println("        BIENVENIDO A EL MENU ");
            System.out.println("        Transportes Taxis Bogotá  ");
            System.out.println("                      Digite  ");
            System.out.println("");
            System.out.println("  [1] PARA REGISTRAR INGRESO DE UN TAXI A LA EMPRESA");
            System.out.println("  [2] PARA BUSCAR INFORMACION DE LOS TAXIS POR MODELOS ");
            System.out.println("  [3] PARA ELIMINAR UN DATO");
            System.out.println("  [4] PARA LISTAR VEHICULOS");
            System.out.println("  [5] PARA SALIR ");
            opcion = sn.nextInt();
            
            switch (opcion){
                case 1: 
                    System.out.println("Ingrese la Cantidad de elementos a almacenar en el ArrayList");
                    limite=Datos.nextInt();
                    Dat=new String[limite];
                    almacenar(Dat, LISTAS, Datos);
                    break;
             
                case 2:
                    
                    System.out.println("Ingrese el elemento a buscar: ");
                    buscar=Datos.next();
                    
                        if(buscar(LISTAS, buscar)){
                            System.out.println("");
                            System.out.println("****************************************");
                            System.out.println(" ELEMENTO ENCONTRADO CON EXITO");
                            System.out.println("****************************************");
                            }else{
                            System.out.println("***************************");
                            System.out.println(" EL ELEMENTO NO EXISTE ");
                            System.out.println("***************************");
                                }
                        System.out.println("");
                    break;
                    
                case 3: 
                    System.out.println("");
                    System.out.println("Ingrese LA POSICION del elemento que desea eliminar del ArrayList");
                    ELEMENTO_A_BUSCAR=Datos.nextInt();
                    
                    eliminar(LISTAS, ELEMENTO_A_BUSCAR);
                    
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("TAXIS REGISTRADOS: ");
                    mostrar(LISTAS);
                    System.out.println("");
                    break;
                    
                case 5:
                    CONTINUAR=true;
                    break;
                    
                default:
                        System.out.println("Ingrese una opcion");
              
            }
            
        }
        
    }
    public static void almacenar(String Array[],ArrayList list, Scanner TECLADO){
        
        for(int i=0;i<Array.length;i++){
            
            System.out.println("-------------------------------------");
            System.out.println("C O N D U C T O R  "+(i+1));
            System.out.println("-------------------------------------\n");
            
                    System.out.println("Ingrese la placa ["+i+"] : ");
                    Array[i]=TECLADO.next();
                    list.add(Array[i]);

                    System.out.println("Ingrese el movil ["+i+"] : ");
                    Array[i]=TECLADO.next();
                    list.add(Array[i]);

                    System.out.println("Ingrese el modelo ["+i+"] : ");
                    Array[i]=TECLADO.next();
                    list.add(Array[i]);

                    System.out.println("Ingrese la marca ["+i+"] : ");
                    Array[i]=TECLADO.next();
                    list.add(Array[i]);
        }
    }
    
    public static void mostrar(ArrayList list){
        
       list.forEach((lista)->{
           System.out.println("• "+lista);
           
       });
    }
   
    public static boolean buscar(ArrayList list,String Informacion){
        
       boolean INDICADOR=false;
       
        if(list.contains(Informacion)){
            INDICADOR=true;
        }
        
        return INDICADOR;
    }
    
    public static void eliminar(ArrayList list, int  elemento_a_eliminar){
        
        list.remove(elemento_a_eliminar); //Se elimina el elemento que se solicitara al ejecutor Bv
        
    }
    
}
