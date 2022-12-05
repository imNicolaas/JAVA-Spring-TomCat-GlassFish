package Final;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    public static LinkedList contenedor = new LinkedList();
    public int buscar;

    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Campo_Nombre = new javax.swing.JTextField();
        Campo_Usuario = new javax.swing.JTextField();
        Campo_Contraseña = new javax.swing.JTextField();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Mostrar_Lista = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Campo_Saldo = new javax.swing.JTextField();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saldo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        Campo_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Campo_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 160, -1));

        Campo_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Campo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_UsuarioActionPerformed(evt);
            }
        });
        Campo_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_UsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(Campo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        Campo_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Campo_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, -1));

        Boton_Guardar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        Boton_Modificar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_Modificar.setText("Modificar");
        Boton_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        Boton_Eliminar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        Boton_Mostrar_Lista.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        Boton_Mostrar_Lista.setText("Mostrar Lista ");
        Boton_Mostrar_Lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Mostrar_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Mostrar_ListaActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Mostrar_Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jButton5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jButton5.setText("Cerrar Sesion");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 27));

        Campo_Saldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Campo_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 160, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd2.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Login pc = new Login();//Se crea el objeto "pc" le cual contiene en si el JFrame de login, se usara despues para hacerlo visible al darle Cerrar Sesion

        int dialog = JOptionPane.YES_NO_OPTION;// Se crea un Joption pane de tipo si o no para la confirmacion de cierre de sesion
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la sesión", "Cerrar Sesión", dialog);

        if (result == 0) {// Estructura condicional que evalua la respuesta del Joption pane y de ser si hace visible el option pane de login y cierra el jframe actual 
            pc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Boton_Mostrar_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Mostrar_ListaActionPerformed
        // TODO add your handling code here:

        Admin Panel_Admin = new Admin();// Se crea el objeto que contiene  el jframe de del administrador
        Tabla_Usuarios Panel_Tabla = new Tabla_Usuarios();// Se crea el objeto que contiene  el jframe de de la tabla de usuarios 

        Panel_Admin.setVisible(false);// se hace la propiedad visible del Panel del administrador falsa para que se deje de ver
        Panel_Tabla.setVisible(true);//  Se hace visible el Jframe que contiene la tabla ya que este es el boton que muestra la tabla
        this.dispose();// se cierra el panel el admin para que no se abran mas ventanas  es decir 

    }//GEN-LAST:event_Boton_Mostrar_ListaActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed

        String Usuario = Campo_Usuario.getText();// Se obtiene la informacion de la los campos de texto de cada casilla para guardarlos
        String Contraseña = Campo_Contraseña.getText();
        String Nombre = Campo_Nombre.getText();
        String Saldo = Campo_Saldo.getText();

        Clase_Usuario Clase_Usuario_ez = new Clase_Usuario(Usuario, Contraseña, Nombre, Saldo);// se crea el objeto de la clase donde estan los obtenedores y asignaciones de cada apartado del registro 
        contenedor.add(Clase_Usuario_ez);

        Campo_Usuario.setText("");
        Campo_Contraseña.setText("");// se limpian los campos de texto despues de registrar un usuario 
        Campo_Nombre.setText("");
        Campo_Saldo.setText("");
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Campo_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_UsuarioKeyTyped

        int press = evt.getKeyChar();// se crea la variable obtiene el valor de la tecla presionada

        if (press == 10) {
            String Usuario_Igual = Campo_Usuario.getText().trim();
            Clase_Usuario a;

            for (int i = 0; i < contenedor.size(); i++) {// se crea el for que obtiene la informacion de las casillas en orden empezadno por la primera
                a = (Clase_Usuario) contenedor.get(i);

                if (Usuario_Igual.equalsIgnoreCase(a.getUsuario())) {// se compara la informacion de la casilla de usuario la cual es la referente en el analisis de datos y de ser igual a alguna que ya se hayya registrado antes se asigna los datos de las demas casillas a las que se tengan guardadas con esas referencias
                    Campo_Contraseña.setText(a.getContraseña());
                    Campo_Nombre.setText(a.getNombre());
                    Campo_Saldo.setText(a.getSaldo());
                    buscar = i;
                    break;
                }

            }
        }

    }//GEN-LAST:event_Campo_UsuarioKeyTyped

    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
        // TODO add your handling code here:
        String Usuario = Campo_Usuario.getText();
        String Contraseña = Campo_Contraseña.getText();// se obtiene la informacion de los campos 
        String Nombre = Campo_Nombre.getText();
        String Saldo = Campo_Saldo.getText();

        Clase_Usuario a = new Clase_Usuario(Usuario, Contraseña, Nombre, Saldo);// Se crea el objeto con la clase que obtiene y asigna la informacion a los campos creados

        contenedor.set(buscar, a);// se encuatra la casilla que coincida con la informacion y se cambian los datos encima de la misma 

        //despue se limpian las casillas despues de modificar 
        Campo_Usuario.setText(null);
        Campo_Contraseña.setText(null);
        Campo_Nombre.setText(null);
        Campo_Saldo.setText(null);

    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        // TODO add your handling code here:

        contenedor.remove(buscar);// se encuatra la casilla que coincida con la informacion y se cambian los datos encima de la misma 

        Campo_Usuario.setText(null);
        Campo_Contraseña.setText(null);
        Campo_Nombre.setText(null);
        Campo_Saldo.setText(null);

    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void Campo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_UsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Modificar;
    private javax.swing.JButton Boton_Mostrar_Lista;
    private javax.swing.JTextField Campo_Contraseña;
    private javax.swing.JTextField Campo_Nombre;
    private javax.swing.JTextField Campo_Saldo;
    private javax.swing.JTextField Campo_Usuario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Fondo;
    // End of variables declaration//GEN-END:variables
}
