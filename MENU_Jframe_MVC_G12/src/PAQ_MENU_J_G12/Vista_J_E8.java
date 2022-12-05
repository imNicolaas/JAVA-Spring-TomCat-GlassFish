
package PAQ_MENU_J_G12;

import java.util.ArrayList;

public class Vista_J_E8 extends javax.swing.JFrame {

    public Vista_J_E8() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_nota_M1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_nota_M2 = new javax.swing.JTextField();
        campo_nota_M3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_nota_M4 = new javax.swing.JTextField();
        campo_nota_M5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_nota_M6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campo_nota_M7 = new javax.swing.JTextField();
        btn_ag_registro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campo_imprimir = new javax.swing.JTextArea();
        btn_calcular_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        campo_promedio_m = new javax.swing.JTextField();
        campo_promedio_individual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Boton_volver_menu_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite los siguientes datos");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Digite el nombre del estudiante:");

        campo_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Nota en Bases De Datos:");

        campo_nota_M1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Nota en Algoritmos:");

        campo_nota_M2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        campo_nota_M3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Nota en Fisica:");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Nota en Matematicas:");

        campo_nota_M4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        campo_nota_M5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Nota en Ingles I:");

        campo_nota_M6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Nota en Catedra ECCI:");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Nota en Programacion Avanzada III:");

        campo_nota_M7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        btn_ag_registro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        btn_ag_registro.setText("Agregar registro");
        btn_ag_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ag_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ag_registroActionPerformed(evt);
            }
        });

        Campo_imprimir.setColumns(20);
        Campo_imprimir.setRows(5);
        jScrollPane1.setViewportView(Campo_imprimir);

        btn_calcular_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        btn_calcular_.setText("Calcular promedio y listar");
        btn_calcular_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Promedio todas las materias:");

        campo_promedio_m.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        campo_promedio_individual.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel13.setText("Promedio individual de  materias:");

        Boton_volver_menu_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_volver_menu_.setText("Volver al menú");
        Boton_volver_menu_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_volver_menu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_volver_menu_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_volver_menu_))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_nota_M3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_nota_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_nota_M1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campo_nota_M7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(campo_nota_M5))
                                                    .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_nota_M6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(campo_promedio_m, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(campo_promedio_individual, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campo_nota_M4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)
                                        .addComponent(btn_ag_registro))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(btn_calcular_)))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Boton_volver_menu_)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campo_nota_M1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campo_nota_M2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campo_nota_M3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_nota_M4))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campo_nota_M5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(campo_nota_M6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_nota_M7)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ag_registro)))
                .addGap(18, 18, 18)
                .addComponent(btn_calcular_)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_promedio_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_promedio_individual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String nombre;
    
    Double nota_m1, nota_m2, nota_m3, nota_m4, nota_m5, nota_m6, nota_m7, total;
    
    
    Modelo_J_E8 mod = new Modelo_J_E8();
    
    private void btn_ag_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ag_registroActionPerformed
        
        nombre = campo_nombre.getText();
        mod.nombres.add(nombre);
        nota_m1 = Double.parseDouble(campo_nota_M1.getText());
        mod.notas.add(nota_m1);
        nota_m2 = Double.parseDouble(campo_nota_M2.getText());
        mod.notas.add(nota_m2);
        nota_m3 = Double.parseDouble(campo_nota_M3.getText());
        mod.notas.add(nota_m3);
        nota_m4 = Double.parseDouble(campo_nota_M4.getText());
        mod.notas.add(nota_m4);
        nota_m5 = Double.parseDouble(campo_nota_M5.getText());
        mod.notas.add(nota_m5);
        nota_m6 = Double.parseDouble(campo_nota_M6.getText());
        mod.notas.add(nota_m6);
        nota_m7 = Double.parseDouble(campo_nota_M7.getText());
        mod.notas.add(nota_m7);
        
        campo_nombre.setText(null);
        campo_nota_M1.setText(null);
        campo_nota_M2.setText(null);
        campo_nota_M3.setText(null);
        campo_nota_M4.setText(null);
        campo_nota_M5.setText(null);
        campo_nota_M6.setText(null);
        campo_nota_M7.setText(null);
        
    }//GEN-LAST:event_btn_ag_registroActionPerformed

    int contador = 1;
    
    Double total_m =0.0, promedio_m =0.0, promedio_indi =0.0;
    
    private void btn_calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_ActionPerformed
        
        for (int i = 0; i < mod.notas.size(); i++) { //En este for se calculan los totales de todas las materias

            total_m = total_m + mod.notas.get(i);
            
        }
        
        promedio_m = total_m / mod.notas.size();
        campo_promedio_m.setText(String.valueOf(promedio_m));
        
        promedio_indi = promedio_m / 7;
        campo_promedio_individual.setText(String.valueOf(promedio_indi));
        
        
        
        for (int i = 0; i < mod.notas.size(); i+=7) {
            
            
            
            Campo_imprimir.setText(String.valueOf(mod.nombres +"-"+ mod.notas +"\n\nTotal de todas las materias: "+total_m+ "\n" + "\nE S T U D I A N T E "+contador +": \n"+  "\nBases de datos: "+mod.notas.get(i) 
                                                                                                                                        +  "\nAlgoritmos: "+mod.notas.get(i+1) 
                                                                                                                                        +  "\nFisica: "+mod.notas.get(i+2)  
                                                                                                                                        +  "\nMatematicas: "+mod.notas.get(i+3)  
                                                                                                                                        +  "\nIngles I: "+mod.notas.get(i+4)  
                                                                                                                                        +  "\nCatedra ECCI: "+mod.notas.get(i+5) 
                                                                                                                                        +  "\nProgramacion Avanzada III: "+mod.notas.get(i+6)));
            
            contador = contador + 1;
        }
        
    }//GEN-LAST:event_btn_calcular_ActionPerformed

    private void Boton_volver_menu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_volver_menu_ActionPerformed
        Vista_Menu_J_G12 menu = new Vista_Menu_J_G12();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_volver_menu_ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_J_E8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_J_E8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_volver_menu_;
    private javax.swing.JTextArea Campo_imprimir;
    private javax.swing.JButton btn_ag_registro;
    private javax.swing.JButton btn_calcular_;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nota_M1;
    private javax.swing.JTextField campo_nota_M2;
    private javax.swing.JTextField campo_nota_M3;
    private javax.swing.JTextField campo_nota_M4;
    private javax.swing.JTextField campo_nota_M5;
    private javax.swing.JTextField campo_nota_M6;
    private javax.swing.JTextField campo_nota_M7;
    private javax.swing.JTextField campo_promedio_individual;
    private javax.swing.JTextField campo_promedio_m;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
