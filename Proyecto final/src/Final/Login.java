//Se utiliza el paquete con el nombre "Final" el cual seria el objeto leido para el uso del codigo.
package Final;
//Se importa la libreria que nos proveera la funcion de todo el panel J.
import javax.swing.JOptionPane;

//La clase con el nombre "Login" estaria usando la extension JFrame para generar el terreno de desarrollo.
public class Login extends javax.swing.JFrame {
int CONTADOR_ERROR;
//Se hace el inicio de los componentes, ademas coloca el sigueinte JFrame en una posicion elevada, con el agregado de Null 
    //Hacemos que esta propia ventana se centre. 
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

   
    //Se genera el codigo de los botones y Paneles de texto ingresados en el modelo estatico.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        EntrarAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ecci.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 380, 150));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 150, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        Entrar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Entrar.setText("Entrar como usuario");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 190, 40));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 150, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inicio de Sesion ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        EntrarAdmin.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        EntrarAdmin.setText("Entrar como administrador");
        EntrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
       // Try se utiliza para el transcursos de las excepciones.
       //Las cadenas o "Strings" son la verificacion correcta de las contraseñas puestas
       try{
            String usuario = User.getText();
            String paswd = jPassword.getText();
            
            Clase_Usuario h;
            
            for (int i = 0; i < Admin.contenedor.size(); i++) {
            h=(Clase_Usuario)Admin.contenedor.get(i);
            
            String user = h.getUsuario();
            String cont = h.getContraseña();
            
            if(usuario.equals(user) && paswd.equals(cont)){//se crea un if con el fin de comparar los datos en la tabla del administrador con el respectivo usuario y clave
                
                Usuario cd= new Usuario();
                cd.setVisible(true);
                this.dispose();
                //Se inserta el usuario (que ingreso el cliente) en la ventana de Usuario en la campo "nombre" 
                Usuario.nombre.setText(usuario);
                
         
            }else if (CONTADOR_ERROR == 3) {
                JOptionPane.showMessageDialog(null, "Ha exedido el numero de intentos, vuelva mas tarde.");//en caso de que no se cumpla la condicion inicial enviara esta notificacion 
                System.exit(0);
            }else{
                CONTADOR_ERROR = CONTADOR_ERROR +1;
                }
            
        }
             }catch(IllegalArgumentException mensaje){
        
            JOptionPane.showMessageDialog(null ,"Ha exedido el numero de intentos, vuelva mas tarde.");//al no cumplir la excepcion se enviara esta notificacion al usuario 
     
        }
        
  
        
        
    }//GEN-LAST:event_EntrarActionPerformed

    private void EntrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarAdminActionPerformed
          //Este boton es del propio administrador, en donde para ingresar se debe colocar los datos  correspondientes.
        String usuario = User.getText();
        String paswd = jPassword.getText();
        
        // Try se utiliza para el transcursos de las excepciones. 
        try{
            
            //Los if son abiertos de modo que el administradr solo tenga acceso.
            if(usuario.equals("admin") && paswd.equals("admin")){//se crea un if con el fin de comparar los datos ingresados con el respectivo usuario y clave

                Admin pc= new Admin();
                pc.setVisible(true);
                this.dispose(); 

            }else{//Else para completar el propio if.
                JOptionPane.showMessageDialog(null ,"Usuario o contraseña de administrador incorrecta");//en caso de que no se cumpla la condicion inicial enviara esta notificacion
            }if (CONTADOR_ERROR == 3) {
                JOptionPane.showMessageDialog(null, "Ha exedido el numero de intentos, vuelva mas tarde.");//en caso de que no se cumpla la condicion inicial enviara esta notificacion 
                System.exit(0);
            }else{
                CONTADOR_ERROR = CONTADOR_ERROR +1;
                }
        }catch(Exception e){

            JOptionPane.showMessageDialog(null ,"Usuario o contraseña de administrador incorrecta");//al no cumplir la excepcion se enviara esta notificacion al usuario

        }
    }//GEN-LAST:event_EntrarAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton EntrarAdmin;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
