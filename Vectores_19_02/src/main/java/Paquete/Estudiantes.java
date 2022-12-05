package Paquete;

import java.util.Scanner;

public class Estudiantes {

    public static void main(String[] args) {

        int Num_Notas, notas = 0, promedio, Acum = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero de notas: ");
        Num_Notas = teclado.nextInt();

        int[] Estuduantes = new int[Num_Notas];

        System.out.println("");

        System.out.println("Introduzca las notas");
        for (int i = 0; i < Num_Notas; i++) {
            System.out.println("Nota " + (i + 1));
            Estuduantes[i] = teclado.nextInt();

            if (Estuduantes[i] >= 1 && Estuduantes[i] <= 10) {
                Acum = Acum + Estuduantes[i];
            } else {
                System.out.println("Error,  Nota Invalida");
                i--;
            }
        }
           System.out.println("Las notas son ");
                for (int i = 0; i < Num_Notas; i++) {
                        System.out.println(Estuduantes[i]  +"   ");
        }
                
                promedio = Acum / Num_Notas;
                System.out.println("El promedio del curso es: " + promedio);
    }
}
