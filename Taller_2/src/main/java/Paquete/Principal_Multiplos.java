package Paquete;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal_Multiplos {

    public static void main(String[] args) {

        int Error = 0, numero_inicial, SumaMul_4 = 0, SumaMul_5 = 0, SumaMul_6 = 0, Salir = 0;
        Component frame = null;

        Scanner leer = new Scanner(System.in);

        while (Error <= 3 && Salir != 2) {

            System.out.println(" Ingrese el numero a capturar: ");
            numero_inicial = leer.nextInt();

            if (numero_inicial % 4 == 0) {
                System.out.println("");
                System.out.println("El número "+ numero_inicial + " es valido y es multiplo de 4 :)");
                System.out.println("");
                SumaMul_4 = SumaMul_4 + numero_inicial;
            } else if (numero_inicial % 5 == 0) {
                System.out.println("");
                System.out.println("El número "+ numero_inicial + " es valido y es multiplo de 5 :)");
                System.out.println("");
                SumaMul_5 = SumaMul_5 + numero_inicial;
            } else if (numero_inicial % 6 == 0) {
                System.out.println("");
                System.out.println("El número "+ numero_inicial + " es valido y es multiplo de 6 :)");
                System.out.println("");
                SumaMul_6 = SumaMul_6 + numero_inicial;
            } else if (numero_inicial % 4 != 0 && numero_inicial % 5 != 0 && numero_inicial % 6 != 0) {
                System.out.println("");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("El número es invalido, digite un número multiplo de 4, 5 ó 6");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("");
                Error = Error + 1;

                if (Error == 4) {
                    System.out.println("");
                    System.out.println("********************************************************");
                    System.out.println("Ha excedido el numero de intentos, vuelva mas tarde. ");
                    System.out.println("********************************************************");
                    System.out.println("");
                }
            }

            System.out.println(" • La suma de los numeros multiplos de 4 es: " + SumaMul_4);
            System.out.println("");
            System.out.println(" • La suma de los numeros multiplos de 5 es: " + SumaMul_5);
            System.out.println("");
            System.out.println(" • La suma de los numeros multiplos de 6 es: " + SumaMul_6);
            System.out.println("");
            System.out.println("Digite 1 para Continuar o 2 para Salir");
            Salir = leer.nextInt();

            for (int i = 0; i < 20; i++) {
                System.out.println();
            }

        }
    }

}
