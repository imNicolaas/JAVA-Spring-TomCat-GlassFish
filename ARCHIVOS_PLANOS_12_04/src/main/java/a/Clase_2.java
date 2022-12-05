package a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase_2 {

    public static void main(String[] args) throws IOException {

        FileReader FR = null;
        try {

            FR = new FileReader("C:\\Users\\Yenny moya\\Desktop\\Nicolas C\\Nicolas.txt");
            BufferedReader Buffer = new BufferedReader(FR);

            String Texto = null;
            System.out.println("Texto: ");

            while (Texto != null) {

                Texto = Buffer.readLine();
                System.out.println(Texto);

                Texto = Buffer.readLine();
                System.out.println(Texto);

                Texto = Buffer.readLine();
                System.out.println(Texto);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                FR.close();
            } catch (IOException ex) {
                Logger.getLogger(Clase_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
