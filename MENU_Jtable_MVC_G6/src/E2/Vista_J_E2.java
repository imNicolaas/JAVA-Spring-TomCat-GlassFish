
package E2;

import PAQ_MENU_J_G6.Vista_Menu_J_G6;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_J_E2 extends javax.swing.JFrame {

    public Vista_J_E2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Campo_R_Incorrectas = new javax.swing.JTextField();
        Campo_R_Correctas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Campo_R_en_Blanco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Campo_P_Total = new javax.swing.JTextField();
        Boton_volver_menu_ = new javax.swing.JButton();
        Boton_agregar_ = new javax.swing.JButton();
        Boton_limpiar = new javax.swing.JButton();
        Boton_eliminar_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite los siguientes datos");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Respuestas correctas:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Respuestas incorrectas:");

        Campo_R_Incorrectas.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        Campo_R_Correctas.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Respuestas en blanco:");

        Campo_R_en_Blanco.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        jButton1.setText("Calcular puntaje total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Puntaje total:");

        Campo_P_Total.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N

        Boton_volver_menu_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_volver_menu_.setText("Volver al menú");
        Boton_volver_menu_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_volver_menu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_volver_menu_ActionPerformed(evt);
            }
        });

        Boton_agregar_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        Boton_agregar_.setText("Agregar");
        Boton_agregar_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_agregar_ActionPerformed(evt);
            }
        });

        Boton_limpiar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        Boton_limpiar.setText("Limpiar");
        Boton_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_limpiarActionPerformed(evt);
            }
        });

        Boton_eliminar_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        Boton_eliminar_.setText("Eliminar");
        Boton_eliminar_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_eliminar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_eliminar_ActionPerformed(evt);
            }
        });

        Tabla_datos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Respuestas correctas", "Respuestas incorrectas", "Respuestas en blanco", "Puntaje final"
            }
        ));
        jScrollPane2.setViewportView(Tabla_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(Campo_P_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(313, 313, 313)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(Campo_R_en_Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Campo_R_Incorrectas, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Campo_R_Correctas, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_volver_menu_))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(Boton_agregar_)
                                .addGap(54, 54, 54)
                                .addComponent(Boton_limpiar)
                                .addGap(60, 60, 60)
                                .addComponent(Boton_eliminar_)
                                .addGap(276, 276, 276))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Boton_volver_menu_)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Campo_R_Correctas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campo_R_Incorrectas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Campo_R_en_Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(Campo_P_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_agregar_)
                    .addComponent(Boton_limpiar)
                    .addComponent(Boton_eliminar_))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Modelo_E2 mod = new Modelo_E2();
        
        int R_Correctas, R_Incorrectas, R_En_Blanco;
        
        
        
        R_Correctas = Integer.parseInt(Campo_R_Correctas.getText());
        
        R_Incorrectas = Integer.parseInt(Campo_R_Incorrectas.getText());
        
        R_En_Blanco = Integer.parseInt(Campo_R_en_Blanco.getText());
        
        mod.setR_Correctas(R_Correctas);
        mod.setR_Incorrectas(R_Incorrectas);
        mod.setR_En_Blanco(R_En_Blanco);
        
        mod.Operaciones(); //Se debe ejecutar el metodo en el que se estan haceciendo las operaciones para activar las varibles que alli se crean y se envian
        
        System.out.print("\nPuntaje final: " + mod.getPuntaje_final() +"/"+mod.getPuntaje_Maximo()+ "\n");
        
        Campo_P_Total.setText(String.valueOf(mod.getPuntaje_final())+"/" + String.valueOf(mod.getPuntaje_Maximo()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Boton_volver_menu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_volver_menu_ActionPerformed
        Vista_Menu_J_G6 menu = new Vista_Menu_J_G6();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_volver_menu_ActionPerformed

    private void Boton_agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_agregar_ActionPerformed

        

        //Se ingresan los datos dentro del vector obteniendoles de los campos de informacion
        
        if (Campo_R_Correctas.getText().isEmpty() || Campo_R_Incorrectas.getText().isEmpty() || Campo_R_en_Blanco.getText().isEmpty()|| Campo_P_Total.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debe haber informacion en los campos para agregar un registro" );
            
        } else {
            
            DefaultTableModel modelo = (DefaultTableModel) Tabla_datos.getModel(); //Se crea un modelo de tabla con el modelo de la tabla que tenemos para manejar el ingreso de datos

            Object[] fila = new Object[4]; // Se crea un vector con el tamaño de las columnas de contenido donde se almacenaran los registros individuales de cada fila            

                fila [0] = Integer.parseInt(Campo_R_Correctas.getText());
                fila [1] = Integer.parseInt(Campo_R_Incorrectas.getText());
                fila [2] = Integer.parseInt(Campo_R_en_Blanco.getText());
                fila [3] = Campo_P_Total.getText();


                modelo.addRow(fila); // Se agreda una fila al modelo de tabla de la tabla original donde el contenido de la fila que se esta agragando es la contenida en el vector
                Tabla_datos.setModel(modelo);            
        }


    }//GEN-LAST:event_Boton_agregar_ActionPerformed

    private void Boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_limpiarActionPerformed

        Campo_R_Correctas.setText(null);
        Campo_R_Incorrectas.setText(null);
        Campo_R_en_Blanco.setText(null);
        Campo_P_Total.setText(null);
        

        Campo_R_Correctas.requestFocus();
    }//GEN-LAST:event_Boton_limpiarActionPerformed

    private void Boton_eliminar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_eliminar_ActionPerformed

        DefaultTableModel model = (DefaultTableModel) Tabla_datos.getModel();

        int a = Tabla_datos.getSelectedRow();

        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla" );
        }

        else {
            int confirmar=JOptionPane.showConfirmDialog(null,  "Esta seguro que desea Eliminar el registro ?");

            if(JOptionPane.OK_OPTION==confirmar) {
                model.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado" );
            }

        }
    }//GEN-LAST:event_Boton_eliminar_ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_J_E2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_J_E2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_agregar_;
    private javax.swing.JButton Boton_eliminar_;
    private javax.swing.JButton Boton_limpiar;
    private javax.swing.JButton Boton_volver_menu_;
    private javax.swing.JTextField Campo_P_Total;
    private javax.swing.JTextField Campo_R_Correctas;
    private javax.swing.JTextField Campo_R_Incorrectas;
    private javax.swing.JTextField Campo_R_en_Blanco;
    private javax.swing.JTable Tabla_datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
