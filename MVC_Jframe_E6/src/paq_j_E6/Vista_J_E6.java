
package paq_j_E6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vista_J_E6 extends javax.swing.JFrame {

    public Vista_J_E6() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_peso = new javax.swing.JTextField();
        btn_ag_registro = new javax.swing.JButton();
        btn_calcular_total = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campo_c_niños = new javax.swing.JTextField();
        promedio_peso_niños = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_c_jovenes = new javax.swing.JTextField();
        promedio_peso_jovenes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campo_c_adultos = new javax.swing.JTextField();
        promedio_peso_adultos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campo_c_viejos = new javax.swing.JTextField();
        promedio_peso_viejos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite los siguientes datos");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Digite la edad:");

        campo_edad.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Digite el peso:");

        campo_peso.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        btn_ag_registro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        btn_ag_registro.setText("Agregar registro");
        btn_ag_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ag_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ag_registroActionPerformed(evt);
            }
        });

        btn_calcular_total.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        btn_calcular_total.setText("Calcular total");
        btn_calcular_total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calcular_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_totalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Cantidad de niños en su zona habitacional:");

        campo_c_niños.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_niños.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Promedio de peso de los niños:");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Cantidad de jovenes en su zona habitacional:");

        campo_c_jovenes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_jovenes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Promedio de peso de los jovenes:");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Cantidad de adultos en su zona habitacional:");

        campo_c_adultos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_adultos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Promedio de peso de los adultos:");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Cantidad de viejos en su zona habitacional:");

        campo_c_viejos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_viejos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel13.setText("Promedio de peso de los viejos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(campo_c_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(promedio_peso_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(campo_c_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(promedio_peso_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(campo_c_viejos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(campo_c_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(promedio_peso_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_calcular_total)
                                .addComponent(btn_ag_registro))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(promedio_peso_viejos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campo_edad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campo_peso))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_ag_registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_calcular_total)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_c_niños, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(promedio_peso_niños))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_c_jovenes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(promedio_peso_jovenes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_c_adultos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(promedio_peso_adultos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campo_c_viejos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(promedio_peso_viejos))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        int contador_personas = 0, edad = 0, c_niños = 0, c_jovenes = 0, c_adultos = 0, c_viejos = 0, total =0;
    double peso=0, promedio_peso = 0, total_p_niños = 0, total_p_jovenes = 0, total_p_adultos = 0, total_p_viejos = 0, promedio_p_niños = 0, promedio_p_jovenes = 0, promedio_p_adultos = 0, promedio_p_viejos = 0;
    
    ArrayList <Double> niños  = new ArrayList<Double>();
    ArrayList <Double> jovenes  = new ArrayList<Double>();
    ArrayList <Double> adultos = new ArrayList<Double>();
    ArrayList <Double> viejos = new ArrayList<Double>();
    
    Controlador_E6 con = new Controlador_E6();
    Modelo_E6 mod = new Modelo_E6();
    
    private void btn_ag_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ag_registroActionPerformed
        
        edad = Integer.parseInt(campo_edad.getText());
        peso = Integer.parseInt(campo_peso.getText());
        
            if (edad>0) {
                mod.setEdad(edad);
            } else {
                JOptionPane.showMessageDialog(null, "debe digitar una edad mayor a 0");
            }
            
            if (peso>0) {
                mod.setPeso(peso);
            } else {
                JOptionPane.showMessageDialog(null, "debe digitar un peso mayor a 0");
            }
            
                        if (edad>= 0 && edad<=13) {
                            c_niños = c_niños +1;
                            niños.add(peso);
                        }else if(edad>= 14 && edad<=30){
                            c_jovenes = c_jovenes +1;
                            jovenes.add(peso);
                        }else if(edad>= 31 && edad<=60){
                            c_adultos = c_adultos + 1;
                            adultos.add(peso);
                        }else if(edad>= 61){
                            c_viejos = c_viejos + 1;
                            viejos.add(peso);
                        }            
            campo_edad.setText(null);//Se vacian los campos despues de hacer los calculos ya que de lo contrario se vacian las variables que se usan y por lo tanto da error
            campo_peso.setText(null);
    }//GEN-LAST:event_btn_ag_registroActionPerformed

    private void btn_calcular_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_totalActionPerformed
        
                for (int i = 0; i < niños.size(); i++) {
                    total_p_niños = total_p_niños + niños.get(i);
                }

                for (int i = 0; i < jovenes.size(); i++) {
                    total_p_jovenes = total_p_jovenes + jovenes.get(i);
                }
                
                for (int i = 0; i < adultos.size(); i++) {
                    total_p_adultos = total_p_adultos + adultos.get(i);
                }
                
                for (int i = 0; i < viejos.size(); i++) {
                    total_p_viejos = total_p_viejos + viejos.get(i);
                }
                
                total = c_niños + c_jovenes + c_adultos + c_viejos;
                
                    promedio_p_niños = total_p_niños / niños.size();
                    promedio_p_jovenes = total_p_jovenes / jovenes.size();
                    promedio_p_adultos = total_p_adultos / adultos.size();
                    promedio_p_viejos = total_p_viejos / viejos.size();
                    
                    
            campo_c_niños.setText(String.valueOf(c_niños));
            promedio_peso_niños.setText(String.valueOf(promedio_p_niños));
            
            campo_c_jovenes.setText(String.valueOf(c_jovenes));
            promedio_peso_jovenes.setText(String.valueOf(promedio_p_jovenes));
            
            campo_c_adultos.setText(String.valueOf(c_adultos));
            promedio_peso_adultos.setText(String.valueOf(promedio_p_adultos));
            
            campo_c_viejos.setText(String.valueOf(c_viejos));
            promedio_peso_viejos.setText(String.valueOf(promedio_p_viejos));
    }//GEN-LAST:event_btn_calcular_totalActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_J_E6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_J_E6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_J_E6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ag_registro;
    private javax.swing.JButton btn_calcular_total;
    private javax.swing.JTextField campo_c_adultos;
    private javax.swing.JTextField campo_c_jovenes;
    private javax.swing.JTextField campo_c_niños;
    private javax.swing.JTextField campo_c_viejos;
    private javax.swing.JTextField campo_edad;
    private javax.swing.JTextField campo_peso;
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
    private javax.swing.JTextField promedio_peso_adultos;
    private javax.swing.JTextField promedio_peso_jovenes;
    private javax.swing.JTextField promedio_peso_niños;
    private javax.swing.JTextField promedio_peso_viejos;
    // End of variables declaration//GEN-END:variables
}
