
package paq;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class lienzo extends JPanel implements MouseListener{
    private Vector<nodo>vectorNodos;
    private Vector<enlace>vectorEnlaces;
    private Point p1, p2;
    
    public lienzo(){
        this.vectorNodos = new Vector<>();
        this.vectorEnlaces = new Vector<>();
        this.addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g){
        for (nodo nodos : vectorNodos) {
            nodos.pintar(g);
        }
        
        for (enlace enlace : vectorEnlaces) {
            enlace.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo: ");
            this.vectorNodos.add(new nodo(e.getX(), e.getY(), nombre));
            repaint();
        }
        
        if(e.getButton() == MouseEvent.BUTTON3) {
            for (nodo nodo : vectorNodos) {
                
                if(new Rectangle(nodo.getX() - nodo.d/2, nodo.getY() - nodo.d/2, nodo.d, nodo.d).contains(e.getPoint())){
                    if(p1 == null)
                            p1=new Point(nodo.getX(), nodo.getY());
                    else{
                            p2=new Point(nodo.getX(), nodo.getY());
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre conector: ");
                            this.vectorEnlaces.add(new enlace(p1.x, p1.y, p2.x, p2.y, nombre));
                            repaint();
                            p1 = null;
                            p2 = null;
                            
                    }
                }
                
            }
        }
        
    }   

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
