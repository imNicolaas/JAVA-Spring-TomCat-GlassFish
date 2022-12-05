package PAQUETE_TALLER_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {

    public String materia;
    public String nombre;
    public long codigo;
    public long nota_1;
    public long nota_2;
    public long nota_3;
    public long promedio;
    public long definitiva;

    public int total_estudiantes = 0;
    

    public int Num_Estudiantes;

    public void Solicitar_Estudiantes() {

        Scanner leer = new Scanner(System.in);

        System.out.println("        BIENVENIDO");

        do {
            System.out.println("Cuantos estudiantes desea ingresar:");
            Num_Estudiantes = leer.nextInt();
            leer.nextLine();
        } while (Num_Estudiantes < 1);

        Estudiante e[] = new Estudiante[Num_Estudiantes];

        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }

        System.out.println("*******************************************************");
        System.out.println("POR FAVOR DIGITE LOS DATOS DE LOS ESTUDIANTES");
        System.out.println("*******************************************************");
        System.out.println("");

        for (int i = 0; i < Num_Estudiantes; i++) {

            System.out.println("_________________________________________________________");
            e[i] = new Estudiante();

            System.out.println("  • Digite el nombre del estudiante " + (i + 1) + ": ");
            e[i].nombre = leer.nextLine();
            System.out.println("  • Digite el codigo de estudiante " + (i + 1) + ": ");
            e[i].codigo = leer.nextInt();
            leer.nextLine();

            System.out.println("    • Digite la NOTA 1 del estudiante " + e[i].nombre + ": ");
            e[i].nota_1 = leer.nextInt();
            leer.nextLine();
            System.out.println("    • Digite la NOTA 2 del estudiante " + e[i].nombre + ": ");
            e[i].nota_2 = leer.nextInt();
            leer.nextLine();
            System.out.println("    • Digite la NOTA 3 del estudiante " + e[i].nombre + ": ");
            e[i].nota_3 = leer.nextInt();
            leer.nextLine();
            
            total_estudiantes = total_estudiantes + 1;
            
            e[i].promedio= e[i].nota_1 + e[i].nota_2 + e[i].nota_3; 
            e[i].definitiva = e[i].promedio / 3;

            

        }

        System.out.println("");
        System.out.println("");

        System.out.println("ESTUDIANTES REGISTRADOS: ");

        for (int i = 0; i < Num_Estudiantes; i++) {
            System.out.println(e[i].nombre + " - Codigo: " + e[i].codigo + " - Notas: " + e[i].nota_1+" - "+e[i].nota_2+" - "+e[i].nota_3 +" -> DEFINITIVA: " + e[i].definitiva );
        }

        System.out.println("");
        System.out.println("");

        System.out.println("¿desea buscar un estudiante y mostrar su info? Digite 1 para SI ó 2 para NO");
        int eleccion = leer.nextInt();
        leer.nextLine();

        int Num_a_buscar;

        if (eleccion == 1) {
            System.out.println("");
            
                do {
                    System.out.println("Digite la posicion del estudiante a buscar: (sin tener en cuenta la logica informatica)");
                    Num_a_buscar = leer.nextInt();
                    leer.nextLine();
                    
                } while (Num_a_buscar > total_estudiantes);
                
                System.out.println("");
                System.out.println("  • Se encontro el estudiante: " + e[Num_a_buscar - 1].nombre  + "\n  • codigo: " + e[Num_a_buscar - 1].codigo + "\n  "
                        + "• notas: " + e[Num_a_buscar - 1].nota_1+" - "+e[Num_a_buscar - 1].nota_2+" - "+e[Num_a_buscar - 1].nota_3 + "\n  • DEFINITIVA: " + e[Num_a_buscar - 1].definitiva);
                System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        
        
        System.out.println("¿desea eliminar un estudiante y su info? Digite 1 para SI ó 2 para NO");
        int eleccion_3 = leer.nextInt();
        leer.nextLine();

        int Num_a_Eliminar;

        if (eleccion_3 == 1) {
            System.out.println("");
            
                do {
                    System.out.println("Digite la posicion del estudiante a eliminar: (sin tener en cuenta la logica informatica)");
                    Num_a_Eliminar = leer.nextInt();
                    leer.nextLine();
                    
                } while (Num_a_Eliminar > total_estudiantes);
                
                    e[Num_a_Eliminar-1].nombre = "*Registro Eliminado* ";
                    e[Num_a_Eliminar-1].codigo = 000000; 
                    e[Num_a_Eliminar-1].nota_1 = 00; 
                    e[Num_a_Eliminar-1].nota_2 = 00; 
                    e[Num_a_Eliminar-1].nota_3 = 00; 
                    e[Num_a_Eliminar-1].definitiva = 00;
                
                System.out.println("");
                System.out.println("");
                System.out.println("REGISTRO ELIMINADO CON EXITO\n");
                total_estudiantes = total_estudiantes -1;
                
                System.out.println("•ESTUDIANTES REGISTRADOS: \n");

                    for (int i = 0; i < Num_Estudiantes; i++) {
                        System.out.println(e[i].nombre + " - Codigo: " + e[i].codigo + " - Notas: " + e[i].nota_1+" - "+e[i].nota_2+" - "+e[i].nota_3 +" ->  DEFINITIVA: " + e[i].definitiva );
                    }
        
        }

        System.out.println("");
        System.out.println("");
        

        System.out.println("¿desea agregar un estudiante? Digite 1 para SI ó 2 para NO");
        int eleccion_2 = leer.nextInt();
        leer.nextLine();

        if (eleccion_2 == 1) {

                System.out.println("  • Digite el nombre del estudiante nuevo:");
                String nombre_f = leer.nextLine();
                System.out.println("  • Digite el codigo de estudiante nuevo: ");
                int codigo_f = leer.nextInt();
                leer.nextLine();

                System.out.println("    • Digite la NOTA 1 del estudiante: ");
                int nota_1_f = leer.nextInt();
                leer.nextLine();
                System.out.println("    • Digite la NOTA 2 del estudiante: ");
                int nota_2_f = leer.nextInt();
                leer.nextLine();
                System.out.println("    • Digite la NOTA 3 del estudiante: ");
                int nota_3_f = leer.nextInt();
                leer.nextLine();
                
                total_estudiantes = total_estudiantes + 1;
                
                int promedio_2 = nota_1_f + nota_2_f + nota_3_f;
                
                int definitva_2;
                definitva_2 = promedio_2/3;

            
            
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------------------------");

            System.out.println("TOTAL ESTUDIANTES REGISTRADOS:");
            System.out.println("--------------------------------------------------------------");
            
                    for (int i = 0; i < Num_Estudiantes; i++) {
                        System.out.println("  "+e[i].nombre + " - Codigo: " + e[i].codigo + " - Notas: " + e[i].nota_1+" - "+e[i].nota_2+" - "+e[i].nota_3 + " -> DEFINITIVA: " + e[i].definitiva);
                    }
                    
            System.out.println("  "+nombre_f + " - Codigo: " + codigo_f +" - Notas: " + nota_1_f+" - " +nota_2_f+" - " +nota_3_f + " -> DEFINITIVA: "  + definitva_2);

            System.out.println("");
            System.out.println("EL TOTAL DE ESTUDIANTES ES: " + total_estudiantes);
            System.out.println("");
        }else{
        
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------------------------");

            System.out.println("TOTAL ESTUDIANTES REGISTRADOS:");
            System.out.println("--------------------------------------------------------------");
            
                    for (int i = 0; i < Num_Estudiantes; i++) {
                        System.out.println("  "+e[i].nombre + " - Codigo: " + e[i].codigo + " - Notas: " + e[i].nota_1+" - "+e[i].nota_2+" - "+e[i].nota_3 + " -> DEFINITIVA: " + e[i].definitiva);
                    }
                    

            System.out.println("");
            System.out.println("EL TOTAL DE ESTUDIANTES ES: " + total_estudiantes);
            System.out.println("");
        }

    }

    public void eliminarAlumno(int Num_a_Eliminar) {
        if (Num_a_Eliminar >= 0) {
            System.out.println(" >>> Registro eliminado <<<\n");
        } else {
            System.out.println(" >>> No se ha encontrado registro <<<\n");
        }
    }

    public void Imprimir_Estudiantes(ArrayList<Estudiante> arre) {

        for (int i = 0; i < Num_Estudiantes; i++) {

            System.out.println(arre.get(i).nombre + " - " + arre.get(i).codigo + " - " + arre.get(i).nota_1);

        }
    }
}
