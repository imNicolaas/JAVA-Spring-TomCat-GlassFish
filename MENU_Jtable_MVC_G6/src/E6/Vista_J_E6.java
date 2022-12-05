
package E6;

import PAQ_MENU_J_G6.Vista_Menu_J_G6;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        Boton_volver_menu_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Digite los siguientes datos");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        jLabel4.setText("Digite la edad:");

        campo_edad.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        jLabel5.setText("Digite el peso:");

        campo_peso.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        btn_ag_registro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad de niños:");

        campo_c_niños.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_niños.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Promedio de peso de niños:");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Cantidad de jovenes:");

        campo_c_jovenes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_jovenes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Promedio de peso de jovenes:");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Cantidad de adultos:");

        campo_c_adultos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_adultos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Promedio de peso de adultos:");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Cantidad de viejos:");

        campo_c_viejos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        promedio_peso_viejos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel13.setText("Promedio de peso de viejos:");

        Boton_volver_menu_.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        Boton_volver_menu_.setText("Volver al menú");
        Boton_volver_menu_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                "Edad", "Peso", "Cantidad niños", "Promedio peso niños", "Cantidad jovenes", "Promedio peso jovenes", "Cantidad adultos", "Promedio peso adultos", "Cantidad viejos", "Promedio peso viejos"
            }
        ));
        jScrollPane2.setViewportView(Tabla_datos);

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(btn_calcular_total))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(btn_ag_registro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(campo_c_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promedio_peso_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(campo_c_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(promedio_peso_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(campo_c_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promedio_peso_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(campo_c_viejos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promedio_peso_viejos)))
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 165, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(150, 150, 150)
                        .addComponent(Boton_volver_menu_)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButton1)
                .addGap(114, 114, 114)
                .addComponent(jButton2)
                .addGap(99, 99, 99)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_volver_menu_)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campo_edad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campo_peso)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_ag_registro)
                        .addGap(47, 47, 47)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calcular_total)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campo_c_niños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(promedio_peso_niños))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_c_jovenes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(promedio_peso_jovenes)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(promedio_peso_viejos))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
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
                        if(c_niños ==0) promedio_p_niños =0;
                    promedio_p_jovenes = total_p_jovenes / jovenes.size();
                        if(c_jovenes ==0) promedio_p_jovenes =0;
                    promedio_p_adultos = total_p_adultos / adultos.size();
                        if(c_adultos ==0) promedio_p_adultos =0;
                    promedio_p_viejos = total_p_viejos / viejos.size();
                        if(c_viejos ==0) promedio_p_viejos =0;
                    
                    
            campo_c_niños.setText(String.valueOf(c_niños));
            promedio_peso_niños.setText(String.valueOf(promedio_p_niños));
            
            campo_c_jovenes.setText(String.valueOf(c_jovenes));
            promedio_peso_jovenes.setText(String.valueOf(promedio_p_jovenes));
            
            campo_c_adultos.setText(String.valueOf(c_adultos));
            promedio_peso_adultos.setText(String.valueOf(promedio_p_adultos));
            
            campo_c_viejos.setText(String.valueOf(c_viejos));
            promedio_peso_viejos.setText(String.valueOf(promedio_p_viejos));
    }//GEN-LAST:event_btn_calcular_totalActionPerformed

    private void Boton_volver_menu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_volver_menu_ActionPerformed
        Vista_Menu_J_G6 menu = new Vista_Menu_J_G6();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_volver_menu_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (campo_c_niños.getText().isEmpty() || promedio_peso_niños.getText().isEmpty() || campo_c_jovenes.getText().isEmpty() || promedio_peso_jovenes.getText().isEmpty() || campo_c_adultos.getText().isEmpty() || promedio_peso_adultos.getText().isEmpty() || campo_c_viejos.getText().isEmpty() || promedio_peso_viejos.getText().isEmpty() ) {

            JOptionPane.showMessageDialog(null, "Debe haber informacion en los campos para agregar un registro" );
            
        } else {
            
            DefaultTableModel modelo = (DefaultTableModel) Tabla_datos.getModel();

            Object[] FILA = new Object[10];

            FILA[0] = edad;
            FILA[1] = peso;
            FILA[2] = c_niños;
            FILA[3] = promedio_p_niños;
            FILA[4] = c_jovenes;
            FILA[5] = promedio_p_jovenes;
            FILA[6] = c_adultos;
            FILA[7] = promedio_p_adultos;
            FILA[8] = c_viejos;
            FILA[9] = promedio_p_viejos;

            modelo.addRow(FILA);
            Tabla_datos.setModel(modelo);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        campo_edad.setText(null);
        campo_peso.setText(null);
        campo_c_niños.setText(null);
        promedio_peso_niños.setText(null);
        campo_c_jovenes.setText(null);
        promedio_peso_jovenes.setText(null);
        campo_c_adultos.setText(null);
        promedio_peso_adultos.setText(null);
        campo_c_viejos.setText(null);
        promedio_peso_viejos.setText(null);
        
        campo_edad.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
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
    }//GEN-LAST:event_jButton3ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_J_E6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_volver_menu_;
    private javax.swing.JTable Tabla_datos;
    private javax.swing.JButton btn_ag_registro;
    private javax.swing.JButton btn_calcular_total;
    private javax.swing.JTextField campo_c_adultos;
    private javax.swing.JTextField campo_c_jovenes;
    private javax.swing.JTextField campo_c_niños;
    private javax.swing.JTextField campo_c_viejos;
    private javax.swing.JTextField campo_edad;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField promedio_peso_adultos;
    private javax.swing.JTextField promedio_peso_jovenes;
    private javax.swing.JTextField promedio_peso_niños;
    private javax.swing.JTextField promedio_peso_viejos;
    // End of variables declaration//GEN-END:variables
}
