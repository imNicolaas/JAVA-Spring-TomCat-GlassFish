package Paquete;

import java.util.Scanner;

public class Hemoglobina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double edad_en_meses, nivel_de_hemoglobina, rango_menor ;
        int genero;
        System.out.print("Ingrese el genero: ");
        in.nextLine();
        System.out.print("Ingrese el valor de edad en meses: ");
        edad_en_meses = in.nextDouble();
        in.nextLine();
        System.out.print("Ingrese el valor de nivel de hemoglobina: ");
        nivel_de_hemoglobina = in.nextDouble();
        in.nextLine();
        rango_menor=0;
        if(edad_en_meses<=1)
            rango_menor=13;
        if(edad_en_meses>1&&edad_en_meses<=6)
            rango_menor=10;
        if(edad_en_meses>6&&edad_en_meses<=12)
            rango_menor=11;
        if(edad_en_meses>12&&edad_en_meses<=60)
            rango_menor=11.5;
        if(edad_en_meses>30&&edad_en_meses<=120)
            rango_menor=12.6;
        if(edad_en_meses>120&&edad_en_meses<=180)
            rango_menor=13;
        if(nivel_de_hemoglobina<rango_menor)
            System.out.println("Positivo en anemia");
        else
            System.out.println("Negativo en anemia");
        System.out.println("Valor de rango menor: " + rango_menor);
        
    }

}