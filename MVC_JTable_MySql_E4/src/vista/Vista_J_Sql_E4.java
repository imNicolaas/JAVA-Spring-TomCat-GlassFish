
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.Modelo_Sql_E4;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Vista_J_Sql_E4 extends javax.swing.JFrame {

    
    public Vista_J_Sql_E4() {
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
        Boton_volver_menu_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos = new javax.swing.JTable();
        boton_agregar_ = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();

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

        Boton_volver_menu_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_volver_menu_.setText("Salir");
        Boton_volver_menu_.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton_volver_menu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_volver_menu_ActionPerformed(evt);
            }
        });

        Tabla_datos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temperatura minima", "Temperatura maxima", "total de temperaturas", "Porcentaje de temperaturas", "Errores de digitacion", "Porcentaje errores"
            }
        ));
        jScrollPane2.setViewportView(Tabla_datos);

        boton_agregar_.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        boton_agregar_.setText("Agregar");
        boton_agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_ActionPerformed(evt);
            }
        });

        boton_limpiar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        boton_limpiar.setText("Limpiar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_eliminar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
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
                        .addComponent(btn_ag_temps))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(boton_agregar_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton_limpiar)
                                        .addGap(70, 70, 70)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(camp_errores_9_grados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(boton_eliminar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(campo_porcen_temps, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(camp_errores_digitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_calc_total)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(camp_t_temps, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_volver_menu_)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
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
                .addGap(18, 18, 18)
                .addComponent(btn_calc_total)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_agregar_)
                    .addComponent(boton_limpiar)
                    .addComponent(boton_eliminar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Modelo_Sql_E4 mod = new Modelo_Sql_E4();
    
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
        
    }//GEN-LAST:event_camp_errores_9_gradosActionPerformed

    private void Boton_volver_menu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_volver_menu_ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_Boton_volver_menu_ActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
            
            cam_temp_min.setText(null);
            cam_temp_max.setText(null);
            camp_t_temps.setText(null);
            campo_porcen_temps.setText(null);
            camp_errores_digitacion.setText(null);
            camp_errores_9_grados.setText(null);
            
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_ActionPerformed
     
        
        if (cam_temp_min.getText().isEmpty() || cam_temp_max.getText().isEmpty() || camp_t_temps.getText().isEmpty() ||campo_porcen_temps.getText().isEmpty() || camp_errores_digitacion.getText().isEmpty() || camp_errores_9_grados.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debe haber informacion en los campos para agregar un registro" );
            
        } else {
            
          DefaultTableModel modelo = (DefaultTableModel) Tabla_datos.getModel();

          Object[] FILA = new Object[6];

            FILA[0] = Double.parseDouble(cam_temp_min.getText());
            FILA[1] = Double.parseDouble(cam_temp_max.getText());
            FILA[2] = Double.parseDouble(camp_t_temps.getText());
            FILA[3] = Double.parseDouble(campo_porcen_temps.getText());
            FILA[4] = Double.parseDouble(camp_errores_digitacion.getText());
            FILA[5] = Double.parseDouble(camp_errores_9_grados.getText());

          modelo.addRow(FILA);
          Tabla_datos.setModel(modelo);
        
        }
        
        try{
            
            Connection cn = DriverManager.getConnection ("jdbc:mysql://localhost:3307/mvc_e4", "root", "");
            PreparedStatement pst = cn.prepareStatement ("insert into Registros_E4 values (?, ?, ?, ?, ?, ?) ");
            
                pst.setDouble(1, Double.parseDouble(cam_temp_min.getText().trim()));
                pst.setDouble(2, Double.parseDouble(cam_temp_max.getText().trim()));
                pst.setDouble(3, Double.parseDouble(camp_t_temps.getText().trim()));
                pst.setDouble(4, Double.parseDouble(campo_porcen_temps.getText().trim()));
                pst.setDouble(5, Double.parseDouble(camp_errores_digitacion.getText().trim()));
                pst.setDouble(6, Double.parseDouble(camp_errores_9_grados.getText().trim()));
                pst.executeUpdate();
            
                cam_temp_min.setText(null);
                cam_temp_max.setText(null);
                camp_t_temps.setText(null);
                campo_porcen_temps.setText(null);
                camp_errores_digitacion.setText(null);
                camp_errores_9_grados.setText(null);
            
         } catch (Exception e) {

        }        
        
    }//GEN-LAST:event_boton_agregar_ActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) Tabla_datos.getModel();

        int a = Tabla_datos.getSelectedRow();

        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla" );
        }

        else {
            int confirmar=JOptionPane.showConfirmDialog(null,  "Esta seguro que desea Eliminar el registro ?");

            if(JOptionPane.OK_OPTION==confirmar) {
                
                try {
                    
                    Double t_min = Double.parseDouble(cam_temp_min.getText());
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mvc_e4", "root", "");
                    PreparedStatement pst = cn.prepareStatement("delete from registro_e4 where temperatura minima =" +t_min);
                    
                } catch (Exception e) {
                }
                
                model.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado" );
            }

        }
        
    }//GEN-LAST:event_boton_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_J_Sql_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_J_Sql_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_J_Sql_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_J_Sql_E4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Vista_J_Sql_E4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_volver_menu_;
    private javax.swing.JTable Tabla_datos;
    private javax.swing.JButton boton_agregar_;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_limpiar;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
