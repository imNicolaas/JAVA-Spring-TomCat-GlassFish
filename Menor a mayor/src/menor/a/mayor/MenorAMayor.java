
package menor.a.mayor;

import java.util.Scanner;


public class MenorAMayor {

    public static void main(String[] args) {
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
