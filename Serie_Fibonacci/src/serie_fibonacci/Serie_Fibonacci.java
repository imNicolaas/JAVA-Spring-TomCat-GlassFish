package serie_fibonacci;

import java.util.Scanner;

public class Serie_Fibonacci {

    public static void main(String[] args) {

        // TODO code application logic here
        int n1 = 0, n2 = 1, n3 = 0, limite, resultado, TotalSumaDeImpares = 0, TotalSumaDePares = 0, total = 0, buscar = 0, encontrado = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas veces desea que se repita la serie Fibonacci ");
        limite = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese el numero a buscar");
        buscar = leer.nextInt();

        System.out.println("");

        for (int i = 0; i < limite; i++) {
            System.out.println(n1 + ",");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            total = total + i;

            if (buscar == n2) {
                encontrado++;
            }

            if (i % 2 == 0) {
                TotalSumaDePares = TotalSumaDePares + i;
            } else {
                TotalSumaDeImpares = TotalSumaDeImpares + i;
            }
        }
        System.out.println("");
        System.out.println("* La suma de todos los numeros es: " + total);
        System.out.println("");
        System.out.println("* La suma de los impares es: " + TotalSumaDeImpares);
        System.out.println("");
        System.out.println("* La suma de los pares es: " + TotalSumaDePares);
       
          if( encontrado>1){
              System.out.println("El número " + buscar + " No esta en la serie");
          }
          else{
              System.out.println("El número " + buscar + " Si esta en la serie");


    }
    }
}
