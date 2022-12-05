package PAQUETE_TALLER_3;

import java.util.Scanner;

public class Peajes_Bogota {

    public void PEAJE() {

        int Num_Autos, Ulti_Digito, Opcion = 0, Total_Autos = 0, Nums_Placa = 0, opcion = 0, TA_AMARILLO = 0, TA_ROSA = 0, TA_ROJO = 0, TA_VERDE = 0, TA_AZUL = 0;

        String L_Expedicion, Letras_Placa;

        Scanner leer = new Scanner(System.in);

        while (opcion != 2) {

            System.out.println("  • Digite el lugar de expedicion del vehiculo: ");
            L_Expedicion = leer.nextLine();

            System.out.println("  • Digite las LETRAS de la placa de su vehiculo:  ");
            Letras_Placa = leer.nextLine();

            System.out.println("  • Digite los NUMEROS de la placa de su vehiculo:  ");
            Nums_Placa = leer.nextInt();
            leer.nextLine();

            Ulti_Digito = Nums_Placa % 10;

            System.out.println("");
            
                      if (Nums_Placa >=1000) {
                        System.out.println("Error, debe digitar solo tres numeros para una placa \n");
                        
                        Ulti_Digito = 0;
                    } else if (Nums_Placa <100) {
                        System.out.println("Error, debe digitar almenos tres numeros para una placa \n");
                        Ulti_Digito = 0;
                    }

            if ((Ulti_Digito >= 1) && (Ulti_Digito <= 2)) {
                System.out.println("Se le asigna una calcomania AMARILLA al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_AMARILLO = TA_AMARILLO + 1;
            } else if ((Ulti_Digito >= 3) && (Ulti_Digito <= 4)) {
                System.out.println("Se le asigna una calcomania ROSA al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_ROSA = TA_ROSA + 1;
            } else if ((Ulti_Digito >= 5) && (Ulti_Digito <= 6)) {
                System.out.println("Se le asigna una calcomania ROJA al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_ROJO = TA_ROJO + 1;
            } else if ((Ulti_Digito >= 7) && (Ulti_Digito <= 8)) {
                System.out.println("Se le asigna una calcomania VERDE al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_VERDE = TA_VERDE + 1;
            } else if ((Ulti_Digito == 9) ) {
                System.out.println("Se le asigna una calcomania AZUL al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_AZUL = TA_AZUL + 1;
            } else if (Ulti_Digito == 0) {
                System.out.println("Se le asigna una calcomania AZUL al automovil con placa " + Letras_Placa + "-" + Nums_Placa + " Expedido en " + L_Expedicion);
                Total_Autos = Total_Autos + 1;
                TA_AZUL = TA_AZUL + 1;
            } else {
                System.out.println("Datos erroneos, favor registrar nuevamente el vehiculo");
            }

            System.out.println("");
            
            
            System.out.println("_______________________________________________________________");
            System.out.println("¿ Desea procesar otro vehiculo ? Digite 1 para SI ó 2 para NO");
            opcion = leer.nextInt();
            leer.nextLine();

            for (int i = 0; i < 20; i++) {
                System.out.println("");
            }
        }

        System.out.println("EL TOTAL DE VEHICULOS PROCESADOS FUERON: " + Total_Autos);
        System.out.println("");
        System.out.println("    • El total de autos con calcomania AMARILLA son: " + TA_AMARILLO);
        System.out.println("    • El total de autos con calcomania ROSA son: " + TA_ROSA);
        System.out.println("    • El total de autos con calcomania ROJA son: " + TA_ROJO);
        System.out.println("    • El total de autos con calcomania VERDE son: " + TA_VERDE);
        System.out.println("    • El total de autos con calcomania AZUL son: " + TA_AZUL);
        System.out.println("");

    }
}
