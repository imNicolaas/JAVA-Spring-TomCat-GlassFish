
package paq_e6;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista_E6 {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

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
                    
        
    }
    
}
