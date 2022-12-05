
package a;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase_1 {

    public static void main(String[] args) {
        
        PrintStream salida = null;
        
        try {
            salida = new PrintStream("C:\\Users\\Yenny moya\\Desktop\\Nicolas C\\Nicolas.txt");
            
            salida.println("a");
            salida.println("aa");
            salida.println("aaa");
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Clase_1.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            
            salida.close();
        }
    }
    
}
