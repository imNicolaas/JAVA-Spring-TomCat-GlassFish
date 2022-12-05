package Final;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Tabla_Usuarios extends javax.swing.JFrame {

    private DefaultTableModel modelo;// se crea el modelo de la tabla que usaremos 
    int contador = 0; 
    
    public Tabla_Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        CargarInterfaz();
        CargarDatos();
    }
    
    public void CargarInterfaz(){// se crea el metodo que cargara la tabla con las columnas que le pongamos 
    
            String datos[][]= {};// se crea una matriz para las filas y la informacion de los usuarios 
            String columna []={"Usuario", "Contraseña", "Nombre", "Saldo"};// se crean las columnas con las casillas de la informacion de los usuarios 
            modelo = new DefaultTableModel(datos, columna);// se crea el modelo de la tabla con los parametros de filas y columnas que anteriormente se crearon "Datos" "Columna"
            Tabla_Usuarios.setModel(modelo);// se le asigna el modelo que se acabo de crear a la tabla que tenemos en el jframe de la tabla llamada "Tabla_Usuarios"
            
    }
    
    public void CargarDatos(){
        
        Clase_Usuario a;
        
        for (int i = 0; i < Admin.contenedor.size(); i++) { // Se crea el for que cargara los datos de los usuraios que se registren por el administrador
            a=(Clase_Usuario)Admin.contenedor.get(i);
            modelo.insertRow(contador, new Object []{});// se inserta una nueva fila  
            
            modelo.setValueAt(a.getUsuario(),contador, 0);// se le da el valor a cada casilla empezando por lugar 0 que es el asignador de usuario depues el de Contraseña, Nombre y Saldo
            modelo.setValueAt(a.getContraseña(),contador, 1);
            modelo.setValueAt(a.getNombre(),contador, 2);
            modelo.setValueAt(a.getSaldo(),contador, 3);
            
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        Boton_Volver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        jLabel1.setText("Usuarios Registrados:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 27));

        Tabla_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Nombre", "Saldo"
            }
        ));
        Tabla_Usuarios.setRowHeight(26);
        jScrollPane1.setViewportView(Tabla_Usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 940, -1));

        Boton_Volver.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Back_64px.png"))); // NOI18N
        Boton_Volver.setText("Volver");
        Boton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd2.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VolverActionPerformed
        // este es el boton volver que volvera al ademin al panel donde pude agregar, borrar, modifica usuarios 
        Admin Panel_Admin = new Admin( );// se crea el objeto que contiene el panel del admin 
        Tabla_Usuarios Panel_Tabla_2 = new Tabla_Usuarios( ); // se crea el objeto que contiene el jframd e la tabla
        
        Panel_Admin.setVisible(true);// Se hace visible el panel de admin
        Panel_Tabla_2.setVisible(false);// Se quita la visibilidad de el panel de la tabla 
        this.dispose( ); // y ademas se cierra el jframe actual ya que de lo contrario producira errores 
        
    }//GEN-LAST:event_Boton_VolverActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Volver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Tabla_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
