
package paq;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
       JFrame ventana = new JFrame("GRAFO");
       ventana.add(new lienzo());
       ventana.setSize(620, 520);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
       
       
               
        
    }
    
}
