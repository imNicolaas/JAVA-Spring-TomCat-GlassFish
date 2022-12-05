
package PAQ_MENU_J_G12;

import javax.swing.JOptionPane;
import mvcnominaforms7bn.vista;

public class Vista_Menu_J_G12 extends javax.swing.JFrame {

    public Vista_Menu_J_G12() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_Opcion_ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btn_ingresar_opc = new javax.swing.JButton();
        Boton_salir_del_todo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite una opcion:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Digite 1 para ejecutar el ejercicio 1 Jframe MVC");

        Campo_Opcion_.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Digite 2 para ejecutar el ejercicio 2 Jframe MVC");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Digite 3 para ejecutar el ejercicio 3 Jframe MVC");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Digite 4 para ejecutar el ejercicio 4 Jframe MVC");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Digite 5 para ejecutar el ejercicio 5 Jframe MVC");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Digite 6 para ejecutar el ejercicio 6 Jframe MVC");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Digite 7 para ejecutar el ejercicio 7 Jframe MVC");

        Btn_ingresar_opc.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        Btn_ingresar_opc.setText("Ingresar opcion");
        Btn_ingresar_opc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_ingresar_opc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ingresar_opcActionPerformed(evt);
            }
        });

        Boton_salir_del_todo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_salir_del_todo.setText("Salir");
        Boton_salir_del_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salir_del_todoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Digite 8 para ejecutar el ejercicio 8 Jframe MVC");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Digite 9 para ejecutar el ejercicio 9 Jframe MVC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(267, 267, 267)
                        .addComponent(Boton_salir_del_todo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_Opcion_, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_ingresar_opc, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGap(218, 218, 218))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Boton_salir_del_todo))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addComponent(Campo_Opcion_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_ingresar_opc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int Opcion =0;
    
    
    Vista_J_E1 Vista_J_E1 = new Vista_J_E1();
    Vista_J_E2 Vista_J_E2 = new Vista_J_E2();
    Vista_J_E3 Vista_J_E3 = new Vista_J_E3();
    Vista_J_E4 Vista_J_E4 = new Vista_J_E4();
    Vista_J_E5 Vista_J_E5 = new Vista_J_E5();
    Vista_J_E6 Vista_J_E6 = new Vista_J_E6();
    Vista_J_E7 Vista_J_E7 = new Vista_J_E7();
    Vista_J_E8 Vista_J_E8 = new Vista_J_E8();
    vista Vista_J_E9 = new vista();
    
    
    private void Btn_ingresar_opcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ingresar_opcActionPerformed
        
        
                
        Opcion = Integer.parseInt(Campo_Opcion_.getText());
        
        if (Opcion ==1) {
            this.dispose();
            Vista_J_E1.setVisible(true);
            
        } else if(Opcion==2) {
            this.dispose();
            Vista_J_E2.setVisible(true);
            
        } else if(Opcion==3) {
            this.dispose();
            Vista_J_E3.setVisible(true);
            
        } else if(Opcion==4) {
            this.dispose();
            Vista_J_E4.setVisible(true);
            
        } else if(Opcion==5) {
            this.dispose();
            Vista_J_E5.setVisible(true);
            
        } else if(Opcion==6) {
            this.dispose();
            Vista_J_E6.setVisible(true);
            
        } else if(Opcion==7) {
            this.dispose();
            Vista_J_E7.setVisible(true);
            
        } else if(Opcion==8) {
            this.dispose();
            Vista_J_E8.setVisible(true);
            
        } else if(Opcion==9) {
            this.dispose();
            Vista_J_E9.setVisible(true);
            
        }
    }//GEN-LAST:event_Btn_ingresar_opcActionPerformed

    private void Boton_salir_del_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salir_del_todoActionPerformed
        
        int dialog = JOptionPane.YES_NO_OPTION;// Se crea un Joption pane de tipo si o no para la confirmacion de cierre de sesion
        int result = JOptionPane.showConfirmDialog(null, "Desea terminar la ejecucion del programa", "Terminar ejecución", dialog);

        if (result == 0) {// Estructura condicional que evalua la respuesta del Joption pane y de ser si hace visible el option pane de login y cierra el jframe actual 
            System.exit(0);
        }
    }//GEN-LAST:event_Boton_salir_del_todoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Menu_J_G12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_J_G12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_J_G12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Menu_J_G12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Menu_J_G12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_salir_del_todo;
    private javax.swing.JButton Btn_ingresar_opc;
    private javax.swing.JTextField Campo_Opcion_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
