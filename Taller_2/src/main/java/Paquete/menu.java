package Paquete;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        int opcion =0;
        Scanner leer = new Scanner(System.in);

        while (opcion != 5) {

            Secuencia_Principal Secuencia_Principal = new Secuencia_Principal();
            Principal_Multiplos Principal_Multiplos = new Principal_Multiplos();
            Hemoglobina Hemoglobina = new Hemoglobina();
            MenorAMayor MenorAMayor = new MenorAMayor();

            System.out.println("*************************************");
            System.out.println("                  M E N U ");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Bienvenido a el menu de opciones, digite una opcion");
            System.out.println("");
            System.out.println("  1. Ejecutar secuencia numerica");
            System.out.println("  2. Ejecutar identificador y sumador de multiplos (4, 5 y 6)");
            System.out.println("  3. Ejecutar Diagnosticador de Emoglobina");
            System.out.println("  4. Ejecutar Organizador numerico menor a mayor");
            System.out.println("  5. Salir ");
            opcion = leer.nextInt();
            for (int i = 0; i < 20; i++) {
                                        System.out.println();
                    }

            if (opcion == 1) {

                                for (int a = 10; a <= 50; a += 10) {
                                    System.out.print(a + " - ");
                                }
                                for (int b = 70; b < 90; b += 10) {
                                    System.out.print(b + " - ");
                                }
                                System.out.print("100");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                
            } else if (opcion == 2) {

                                int Error = 0, numero_inicial, SumaMul_4 = 0, SumaMul_5 = 0, SumaMul_6 = 0, Salir = 0;

                                while (Error <= 3 && Salir != 2) {

                                    System.out.println(" Ingrese el numero a capturar: ");
                                    numero_inicial = leer.nextInt();

                                    if (numero_inicial % 4 == 0) {
                                        System.out.println("");
                                        System.out.println("El número " + numero_inicial + " es valido y es multiplo de 4 :)");
                                        System.out.println("");
                                        SumaMul_4 = SumaMul_4 + numero_inicial;
                                    } else if (numero_inicial % 5 == 0) {
                                        System.out.println("");
                                        System.out.println("El número " + numero_inicial + " es valido y es multiplo de 5 :)");
                                        System.out.println("");
                                        SumaMul_5 = SumaMul_5 + numero_inicial;
                                    } else if (numero_inicial % 6 == 0) {
                                        System.out.println("");
                                        System.out.println("El número " + numero_inicial + " es valido y es multiplo de 6 :)");
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

            }else if(opcion ==3){
                
                
                
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
            
            }else if (opcion ==4){
                
                Scanner Num=new Scanner(System.in);
                                System.out.println("Ingresar Primer Numero");
                                int num1=Num.nextInt();
                                System.out.println("Ingresar Segundo Numero");
                                int num2=Num.nextInt();
                                System.out.println("Ingresar Tercer Numero");
                                int num3=Num.nextInt();
                                if (num1<num3 && num2<num3){
                                    System.out.println("Menor a mayor: "+num1+","+num2+","+num3) ;

                                }else if (num1<num3 && num3<num2){
                                    System.out.println("Menor a Mayor "+num1+","+num3+","+num2);
                                    }else if (num2<num1 && num1<num3){
                                    System.out.println("Menor a Mayor "+num2+","+num1+","+num3);
                                    }else if (num2<num3 && num3<num1){
                                    System.out.println("Menor a Mayor "+num2+","+num3+","+num1);
                                    }else if (num3<num1 && num1<num2){
                                    System.out.println("Menor a Mayor "+num3+","+num1+","+num2);
                                    }else if (num3<num2 && num2<num1){
                                    System.out.println("Menor a Mayor "+num3+","+num2+","+num1);
                                }
            
            }

        }

    }
}


