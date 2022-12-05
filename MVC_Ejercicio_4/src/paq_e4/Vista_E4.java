
package paq_e4;

import java.util.Scanner;

public class Vista_E4 {

    public static void main(String[] args) {
        
        //Programa desarrollado por Nicolas Corredor Moya
        
        Scanner entrada = new Scanner(System.in);
        Modelo_E4 mod = new Modelo_E4();
        
        int dias, nueve_grados = 0;
        
        double  t_max = 0, t_min = 0, total_temps=0, porcentaje_error = 0;
        
            System.out.println("Digite el número de dias de los que se registraron temperaturas: ");
            dias = entrada.nextInt();
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
                
                
                
        
    }
    
}
