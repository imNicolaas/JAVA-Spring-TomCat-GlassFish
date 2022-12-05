
package Paq_menu_ejercicios_mvc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Vista_Global {

    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        int Opcion=0;
        
        do {
        
        System.out.println("_______________________________________________________________________________________________");
        System.out.println("BIENVENIDO AL MENÚ DE EJERCICIOS MVC");
        System.out.println("(este menu se volvera a ejecutar cuando temerine de ejecutar un ejercicio)\n");
        System.out.println("Universidad ECCI");
        System.out.println("Aplicaciones Web - 4AM");
        System.out.println("Grupo 12: Nicolas Correodr Moya y Nicolas Rey Moya Ramirez");
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("Digite una opcion...\n");
        
        System.out.println("    1. Ejecutar ejercicio 1 - Operaciones matematicas");
        System.out.println("    2. Ejecutar ejercicio 2 - Respuestas y puntaje");
        System.out.println("    3. Ejecutar ejercicio 3 - Calculador de salario e icentivos");
        System.out.println("    4. Ejecutar ejercicio 4 - Estacion climatica y temperaturas");
        System.out.println("    5. Ejecutar ejercicio 5 - Contador de números reales");
        System.out.println("    6. Ejecutar ejercicio 6 - Promedio de peso en humanos");
        System.out.println("    7. Ejecutar ejercicio 7 - Produccion de un gallinero");
        System.out.println("    8. Ejecturar ejercicio Nomina - Nomina");
        System.out.println("    9. Salir");
        Opcion = entrada.nextInt();
        entrada.nextLine();
        
                    
                
            
            if(Opcion == 1){
                    
                    Scanner sc= new Scanner(System.in);
                    Modelo_E1 mod = new Modelo_E1 ();
                    int numero1, numero2 , resultado;
                    int opcion=1;
                        while (opcion >= 1 && opcion <= 5) {
                    System.out.println("Escoja una operacion ");

                    System.out.println("1. Suma ");   
                    System.out.println("2. Resta ");
                    System.out.println("3. Producto ");
                    System.out.println("4. Division ");
                    System.out.println("5. Salir ");
                    opcion=sc.nextInt();

                            switch (opcion) {
                                case 1: 
                                System.out.println("Digite el Primer numero. ");
                                numero1 = sc.nextInt();

                                System.out.println("Digite el Segundo numero. ");
                                numero2 = sc.nextInt();
                                mod.setNumero1(numero1);
                                mod.setNumero2(numero2);
                                mod.operaciones();
                                            System.out.println("Numero 1: "+ mod.getNumero1());
                                            System.out.println("Numero 2:  "+ mod.getNumero2());
                                            System.out.println("Resultado:  "+ mod.getSuma());
                                            break;
                                case 2:
                                System.out.println("Digite el Primer numero. ");
                                numero1 = sc.nextInt();
                                System.out.println("Digite el Segundo numero. ");
                                numero2 = sc.nextInt();
                                mod.setNumero1(numero1);
                                mod.setNumero2(numero2);
                                mod.operaciones();
                                            System.out.println("Numero 1 "+ mod.getNumero1());
                                            System.out.println("Numero 2 "+ mod.getNumero2());
                                            System.out.println("Resultado "+ mod.getResta());
                                            break;
                                            case 3:
                                System.out.println("Digite el Primer numero. ");
                                numero1 = sc.nextInt();

                                System.out.println("Digite el Segundo numero. ");
                                numero2 = sc.nextInt();
                                mod.setNumero1(numero1);
                                mod.setNumero2(numero2);
                                mod.operaciones();
                                            System.out.println("Numero 1 "+ mod.getNumero1());
                                            System.out.println("Numero 2 "+ mod.getNumero2());
                                            System.out.println("Resultado "+ mod.getProducto());
                                            break;
                                            case 4:
                                System.out.println("Digite el Primer numero. ");
                                numero1 = sc.nextInt();

                                System.out.println("Digite el Segundo numero. ");
                                numero2 = sc.nextInt();
                                mod.setNumero1(numero1);
                                mod.setNumero2(numero2);
                                mod.operaciones();
                                            System.out.println("Numero 1 "+ mod.getNumero1());
                                            System.out.println("Numero 2 "+ mod.getNumero2());
                                            System.out.println("Resultado "+ mod.getDivision());
                                            break;




                        case 5:
                            System.out.println("Hasta Pronto");
                                    break;

                    // TODO code application logic here
                }
                            break;
            }
        
        }else if(Opcion==2){


                    Modelo_E2 mod = new Modelo_E2();

                    int R_Correctas, R_Incorrectas, R_En_Blanco;

                    System.out.println("B I E N V E N I D O \n");

                    System.out.print("Digite el número de respuestas correctas: "); 
                    R_Correctas = entrada.nextInt();
                    System.out.print("Digite el número de respuestas incorrectas: ");
                    R_Incorrectas = entrada.nextInt();
                    System.out.print("Digite el número de respuestas en blanco: ");
                    R_En_Blanco = entrada.nextInt();

                    mod.setR_Correctas(R_Correctas);
                    mod.setR_Incorrectas(R_Incorrectas);
                    mod.setR_En_Blanco(R_En_Blanco);

                    mod.Operaciones(); //Se debe ejecutar el metodo en el que se estan haceciendo las operaciones para activar las varibles que alli se crean y se envian

                    System.out.print("\nPuntaje final: " + mod.getPuntaje_final() +"/"+mod.getPuntaje_Maximo()+ "\n");
            
        }else if(Opcion==3){
            
                    Modelo_E3 mod = new Modelo_E3 ();
                    int produccion; 

                Scanner sc =new Scanner(System.in);
                System.out.println("Ingrese la cantidad de unidades logradas esta semana ");
                produccion = sc.nextInt();
                mod.setProduccion(produccion);
                mod.operaciones();
                System.out.println("Este es el producido: " + mod.getProduccion());
                System.out.println("Este es el incentivo: " + mod.getIncentivo());
                System.out.println("Este es el salario total: " + mod.getNeto());
        
        }else if(Opcion==4){    
                    
        //Programa desarrollado por Nicolas Corredor Moya

        Modelo_E4 mod = new Modelo_E4();
        
        int dias, nueve_grados = 0;
        
        double  t_max = 0, t_min = 0, total_temps=0, porcentaje_error = 0;
        
            System.out.println("\nDigite el número de dias de los que se registraron temperaturas: ");
            dias = entrada.nextInt();
            System.out.println("(Nota: la pareja fin de temperaturas es 0,0)");
                System.out.println("");
            
                
                mod.grados.clear();
                
                for (int i = 0; i < dias; i++) {
                    
                    do {
                    
                    System.out.print("Digite la temperatura minima del día " + (i+1) + ": ");
                    t_min = entrada.nextDouble();
                    entrada.nextLine();
                    mod.grados.add(t_min);
                    total_temps = total_temps +1;
                    
                    System.out.print("Digite la temperatura maxima del día " + (i+1) + ": ");
                    t_max = entrada.nextDouble();
                    entrada.nextLine();
                    mod.grados.add(t_max);
                    total_temps = total_temps +1;
                    
                    System.out.println("");
                    
                        if(t_min ==0 && t_max==0){
                            i = mod.grados.size();
                            break;
                        }
                        
                        if(t_min == 9){
                            System.out.println("Las temperaturas de 9 grados no son validas, favor hacer el registro de nuevo \n");
                            mod.grados.clear();
                            nueve_grados = nueve_grados + 1;
                            i=0;
                            total_temps = 0;
                            total_temps = total_temps +2;
                        }
                        
                        if(t_max == 9){
                            System.out.println("Las temperaturas de 9 grados no son validas, favor hacer el registro de nuevo \n");
                            mod.grados.clear();
                            nueve_grados = nueve_grados + 1;
                            i=0;
                            total_temps = 0;
                            total_temps = total_temps +1;
                        }
                        
                    }while (t_min == 9 || t_max == 9);
                    
                }
                
                
                System.out.println("____________________________________________________________________________________________________________");    
                System.out.println("TEMPERATURAS REGISTRADAS: \n");
                System.out.println(mod.grados + "En grados °C");
                
                        for (int i = 0; i < mod.grados.size(); i++) {
                            mod.total = mod.total + mod.grados.get(i);
                        }

                        mod.media = mod.total / mod.grados.size();
                        porcentaje_error = (nueve_grados * 100) / total_temps;
                
                System.out.println("\nTotal de las temperaturas: " + mod.total);        
                System.out.println("\nPorcentaje de las temperaturas: " + mod.media + "°");
                System.out.println("\nNúmero de errores en la digitación: " + nueve_grados);
                System.out.println("\nPorcentaje de error de las temperaturas de 9°: " + porcentaje_error+"%\n");
        
                }else if(Opcion==5){
                            Modelo_E5 mod = new Modelo_E5 ();
                Scanner sc = new Scanner(System.in);
                int[] numeros = new int[10];
                int pos = 0, neg = 0, cero = 0; 
                int i = 0;


                System.out.println("Ingrese los numeros en el array ");


                    mod.setNumeros(numeros);
                    mod.operaciones();
                System.out.println("Positivos: " + mod.getPos());                                                                  
                System.out.println("Negativos: " + mod.getNeg());
                System.out.println("Ceros: " + mod.getCero());
                    

                }else if(Opcion==6){

                    int contador_personas = 0, edad = 0, c_niños = 0, c_jovenes = 0, c_adultos = 0, c_viejos = 0, total =0;
                    double peso=0, promedio_peso = 0, total_p_niños = 0, total_p_jovenes = 0, total_p_adultos = 0, total_p_viejos = 0, promedio_p_niños = 0, promedio_p_jovenes = 0, promedio_p_adultos = 0, promedio_p_viejos = 0;

                    ArrayList <Double> niños  = new ArrayList<Double>();
                    ArrayList <Double> jovenes  = new ArrayList<Double>();
                    ArrayList <Double> adultos = new ArrayList<Double>();
                    ArrayList <Double> viejos = new ArrayList<Double>();

                    Controlador_E6 con = new Controlador_E6();
                    Modelo_E6 mod = new Modelo_E6();
    
    String continuar = "";
        
    System.out.println("B I E N V E N I D O");
    
        do {        
            
                do {                
                    System.out.print("\nDigite la edad de la persona " + (contador_personas+1) + ": ");
                    edad = entrada.nextInt();
                    entrada.nextLine();
                    mod.setEdad(edad);
                } while (edad <0);

                do {                
                    System.out.print("\nDigite el peso de la persona " + (contador_personas+1) +": ");
                    peso = entrada.nextDouble();
                    entrada.nextLine();
                    mod.setPeso(peso);
                    
                    System.out.println("\nRegistro agregado... desea agregar otro, digite ´si´ o ´no´");
                    continuar = entrada.nextLine();
                    
                } while (peso<=0);
                
                        if (edad>= 0 && edad<=13) {
                            c_niños = c_niños +1;
                            niños.add(peso);
                        }else if(edad>= 14 && edad<=30){
                            c_jovenes = c_jovenes +1;
                            jovenes.add(peso);
                        }else if(edad>= 31 && edad<=60){
                            c_adultos = c_adultos + 1;
                            adultos.add(peso);
                        }else if(edad>= 61){
                            c_viejos = c_viejos + 1;
                            viejos.add(peso);
                        }
                        
            contador_personas = contador_personas +1;

        } while (continuar.equals("si"));
        
                for (int i = 0; i < niños.size(); i++) {
                    total_p_niños = total_p_niños + niños.get(i);
                }

                for (int i = 0; i < jovenes.size(); i++) {
                    total_p_jovenes = total_p_jovenes + jovenes.get(i);
                }
                
                for (int i = 0; i < adultos.size(); i++) {
                    total_p_adultos = total_p_adultos + adultos.get(i);
                }
                
                for (int i = 0; i < viejos.size(); i++) {
                    total_p_viejos = total_p_viejos + viejos.get(i);
                }
                
                total = c_niños + c_jovenes + c_adultos + c_viejos;
                
                    promedio_p_niños = total_p_niños / niños.size();
                    promedio_p_jovenes = total_p_jovenes / jovenes.size();
                    promedio_p_adultos = total_p_adultos / adultos.size();
                    promedio_p_viejos = total_p_viejos / viejos.size();
                    
                    
                    System.out.println("_____________________________________________________________________________________________________");
                    System.out.println("\nTOTALES Y PROMEDIOS: ");
                
                
                    System.out.print("\n  • Cantidad de niños en su zona habitacional: " + c_niños + "\n");
                    System.out.print("  • Promedio de peso de los niños: " + promedio_p_niños+ "\n");
                    
                    System.out.print("\n  • Cantidad de jovenes en su zona habitacional: " + c_jovenes+ "\n");
                    System.out.print("  • Promedio de peso de los jovenes: " + promedio_p_jovenes+ "\n");
                    
                    System.out.print("\n  • Cantidad de adultos en su zona habitacional: " + c_adultos+ "\n");
                    System.out.print("  • Promedio de peso de los adultos: " + promedio_p_adultos+ "\n");
                    
                    System.out.print("\n  • Cantidad de viejos en su zona habitacional: " + c_viejos+ "\n");
                    System.out.print("  • Promedio de peso de los viejos: " + promedio_p_viejos+ "\n");
                    
                    System.out.println("\n");

                }else if(Opcion==7){
                    Modelo_E7 mod = new Modelo_E7 ();
                int gallinas, dias ;
                Scanner sc =new Scanner(System.in);
                
                System.out.println("B I E N V E N I D O \n");
                
                System.out.print("Ingrese la cantidad de gallinas: ");
                        gallinas = sc.nextInt();
                        mod.setGallinas(gallinas);
                        mod.operaciones();
                System.out.print("\nIngrese el numero de dias: ");
                        dias= sc.nextInt();
                        mod.setDias(dias);
                        mod.operaciones();
                
                System.out.print("\nEl producido para "+gallinas + " gallinas en " + dias + " dias es: " + mod.getEnigma());
                
                System.out.println("\n");
                    
                    
                    
                }else if(Opcion==8){
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    Controlador_E8 con = new Controlador_E8();
                    // Variables
            int opcion=1;
            while (opcion >= 1 && opcion <= 6) {
                System.out.println("Universidad ECCI");
                System.out.println("Nomina de Empleados");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1. Ingresar Empleado");
                System.out.println("2. Buscar Empleado");
                System.out.println("3. Modificar Empleado");
                System.out.println("4. Eliminar Empleado");
                System.out.println("5. Ver Base de Datos de Empleados");
                System.out.println("6. Salir");
                System.out.println("Digite la Opción:");
                opcion = Integer.parseInt(br.readLine());
                
                switch (opcion) {
                    case 1:                         
                        Modelo_E8 mod = new Modelo_E8();
                        String nombre, cedula;
                        double salario, prestamos, auxilio_transporte, sueldo;
                        int dias, hed, hen, hef;
                        //cargar datos usando nuevo
                        System.out.println("Digite la Cedula de Ciudadania del Empleado");
                        cedula = br.readLine();
                        mod.setCedula(cedula);
                        System.out.println("Digite el nombre del Empleado");
                        nombre = br.readLine();
                        mod.setNombre(nombre);
                        System.out.println("Digite el salario del Empleado");
                        salario = Double.parseDouble(br.readLine());
                        mod.setSalario(salario);
                        System.out.println("Digite los dias laborados por el Empleado");
                        dias = Integer.parseInt(br.readLine());
                        mod.setDias(dias);
                        System.out.println("Digite el numero de horas extras diurnas");
                        hed = Integer.parseInt(br.readLine());
                        mod.setHed(hed);
                        System.out.println("Digite el numero de horas extras nocturnas");
                        hen = Integer.parseInt(br.readLine());
                        mod.setHen(hen);
                        System.out.println("Digite el numero de horas extras festivas");
                        hef = Integer.parseInt(br.readLine());
                        mod.setHef(hef);
                        System.out.println("Digite el valor de los prestamos generados por el empleado");
                        prestamos = Double.parseDouble(br.readLine());
                        if (salario <= salario *2)
                            auxilio_transporte = 106454 / 30 * dias;
                        else
                            auxilio_transporte = 0;
                        mod.setAuxilio_transporte(auxilio_transporte);
                        sueldo = salario / 30 * dias;
                        mod.setSueldo(sueldo);
                        con.insertarEmpleado(mod);
                        break;
                        
                        case 2:                         
                        System.out.println("Buscar Empleado");
                        //BUSCAR por correo institucional
                        System.out.println("Ingresar Cedula de Ciudadania:");
                        String buscar = br.readLine();
                        Modelo_E8 encontrado = con.obtenerEmpleado(buscar);
                        if (encontrado != null) {
                            System.out.println("Información del empleado");
                            System.out.println("Cedula:" + encontrado.getCedula());
                            System.out.println("Nombre:" + encontrado.getNombre());
                            System.out.println("Salario:" + encontrado.getSalario());
                            System.out.println("Dias:" + encontrado.getDias());
                            System.out.println("Horas Extras Diurnas:" + encontrado.getHed());
                            System.out.println("Horas Extras Nocturnas:" + encontrado.getHen());
                            System.out.println("Horas Extras Festivas:" + encontrado.getHef());
                            System.out.println("Prestamos:" + encontrado.getPrestamos());
                            System.out.println("Prestamos:" + encontrado.getAuxilio_transporte());
                            System.out.println("Prestamos:" + encontrado.getSueldo());
                            
                            
                        } else {
                            System.out.println("Empleado no encontrado");
                        }
                        break;
                        
                        case 3:
                        //MODIFICAR
                        System.out.println("Modificar Empleado");
                        Modelo_E8 actualizar = new Modelo_E8();
                        System.out.println("Ingresar Cedula de Ciudadania:");
                        buscar = br.readLine();
                        actualizar = con.obtenerEmpleado(buscar);
                        System.out.println("Ingresar nombre del empleado");
                        actualizar.setNombre(br.readLine());
                        System.out.println("Ingresar Salario del Empleado:");
                        actualizar.setSalario(Double.parseDouble(br.readLine()));
                        System.out.println("Ingresar dias laborados:");
                        actualizar.setDias(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Horas Extras Diurnas:");
                        actualizar.setHed(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Horas Extras Nocturnas:");
                        actualizar.setHen(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Ingresar Horas Extras Festivas:");
                        actualizar.setHef(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Los Prestamos:");
                        actualizar.setPrestamos(Double.parseDouble(br.readLine()));
                        con.actualizarEmpleado(actualizar);
                    break;
                        case 4:
                        //ELIMINAR
                        System.out.println("Eliminar empleado");
                        System.out.println("Digite la Cedula de Ciudadnia:");
                        buscar = br.readLine();
                        Modelo_E8 emp = con.obtenerEmpleado(buscar);
                        con.eliminarEmpleado(emp);
                        System.out.println("Se eliminó el empleado");
                        
                    break;
        
                    
                    case 5:
                            System.out.println("El directorio de los empleados");
                            System.out.println(con.imprimirEmpleado());
                        //});
                        break;
                    

                    case 6:
                        //SALIR
                        System.out.println("Hasta Pronto");
                        break;
                    
                    default:
                        System.out.println("Opcion no valida");
                }
                
        
        break;
        
        }
     
    }
            else if(Opcion==9){
                System.out.println("Hasta pronto");
            }
            
        }while (Opcion >= 1 && Opcion <= 8 );
        
        
        
        
    }
    
}
