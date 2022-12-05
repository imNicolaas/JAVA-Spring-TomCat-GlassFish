package Paquete_8_03;

public class Principal_8_03 {

    public static void main(String[] args) {
        
            int i = 4;
            Estudiante e[] = new Estudiante[i];

            e[0] = new Estudiante();
            e[0].documento = 111111;
            e[0].nombre = "Camilo ";
            e[0].materia = "Lenguaje I";

            e[1] = new Estudiante();
            e[1].documento = 2222222;
            e[1].nombre = "Jorge ";
            e[1].materia = "Lenguaje II";

            e[2] = new Estudiante();
            e[2].documento = 3333333;
            e[2].nombre = "Martha ";
            e[2].materia = "Electiva Técnica";

            e[3] = new Estudiante();
            e[3].documento = 44444;
            e[3].nombre = "Gustavo";
            e[3].materia = "Estructuras de datos";

            for (i = 0; i < e.length; i++) {
                System.out.println("  • NOMBRE DEL ESTUDIANTE: " + e[i].nombre);
                System.out.println("  • DOCUMENTO DEL ESTUDIANTE: " + e[i].documento);
                System.out.println("  • LA MATERIA ES: " + e[i].materia);
                System.out.println("");
            }
    }
}
