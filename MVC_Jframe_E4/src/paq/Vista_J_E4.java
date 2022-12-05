/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq;

import javax.swing.JOptionPane;

/**
 *
 * @author Yenny moya
 */
public class Vista_J_E4 extends javax.swing.JFrame {

    /**
     * Creates new form Vista_J_E4
     */
    public Vista_J_E4() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cam_temp_min = new javax.swing.JTextField();
        btn_ag_temps = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cam_temp_max = new javax.swing.JTextField();
        btn_calc_total = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        camp_t_temps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_porcen_temps = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        camp_errores_digitacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        camp_errores_9_grados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite los siguientes datos");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Digite la temperatura mínima del día:");

        cam_temp_min.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        btn_ag_temps.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        btn_ag_temps.setText("Agregar temperaturas");
        btn_ag_temps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ag_tempsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Digite la temperatura maxima del día:");

        cam_temp_max.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        btn_calc_total.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        btn_calc_total.setText("Calcular temperaturas");
        btn_calc_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calc_totalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Total de las temperaturas:");

        camp_t_temps.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Porcentaje de las temperaturas:");

        campo_porcen_temps.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Número de errores en la digitación:");

        camp_errores_digitacion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Número de errores temperaturas de 9 grados:");

        camp_errores_9_grados.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        camp_errores_9_grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_errores_9_gradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(campo_porcen_temps, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(camp_errores_digitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(camp_errores_9_grados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_calc_total)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(camp_t_temps, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cam_temp_min, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cam_temp_max, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btn_ag_temps)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cam_temp_min))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cam_temp_max)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_ag_temps)
                        .addGap(23, 23, 23)))
                .addGap(52, 52, 52)
                .addComponent(btn_calc_total)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(camp_t_temps, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_porcen_temps, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(camp_errores_digitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(camp_errores_9_grados, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(179, 179, 179))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Modelo_E4 mod = new Modelo_E4();
    
    int dias, nueve_grados = 0;
    
    double  t_max = 0, t_min = 0, total_temps=0, porcentaje_error = 0;
    
    private void btn_ag_tempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ag_tempsActionPerformed

        
                    t_min = Integer.parseInt(cam_temp_min.getText());
                    mod.grados.add(t_min);
                    total_temps = total_temps +1;
                    
                    t_max = Integer.parseInt(cam_temp_max.getText());
                    mod.grados.add(t_max);
                    total_temps = total_temps +1;
                    
                     if(t_min == 9){
                            JOptionPane.showMessageDialog(null, "Las temperaturas de 9 grados no son validas");
                            mod.grados.clear();
                            nueve_grados = nueve_grados + 1;
                            
                            total_temps = 0;
                            total_temps = total_temps +2;
                        }
                        
                        if(t_max == 9){
                            JOptionPane.showMessageDialog(null, "Las temperaturas de 9 grados no son validas");
                            mod.grados.clear();
                            nueve_grados = nueve_grados + 1;
                            
                            total_temps = 0;
                            total_temps = total_temps +1;
                        }
                        
            cam_temp_min.setText(null);
            cam_temp_max.setText(null);
         
        
    }//GEN-LAST:event_btn_ag_tempsActionPerformed

    private void btn_calc_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calc_totalActionPerformed
        
            for (int i = 0; i < mod.grados.size(); i++) {
                mod.total = mod.total + mod.grados.get(i);
            }
            
                mod.media = mod.total / mod.grados.size();
                porcentaje_error = (nueve_grados * 100) / total_temps;

                camp_t_temps.setText(String.valueOf(mod.total));
                campo_porcen_temps.setText(String.valueOf(mod.media));
                camp_errores_digitacion.setText(String.valueOf(nueve_grados));
                camp_errores_9_grados.setText(String.valueOf(porcentaje_error));
                
                mod.grados.clear();
    }//GEN-LAST:event_btn_calc_totalActionPerformed

    private void camp_errores_9_gradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_errores_9_gradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_errores_9_gradosActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_J_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_J_E4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ag_temps;
    private javax.swing.JButton btn_calc_total;
    private javax.swing.JTextField cam_temp_max;
    private javax.swing.JTextField cam_temp_min;
    private javax.swing.JTextField camp_errores_9_grados;
    private javax.swing.JTextField camp_errores_digitacion;
    private javax.swing.JTextField camp_t_temps;
    private javax.swing.JTextField campo_porcen_temps;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
