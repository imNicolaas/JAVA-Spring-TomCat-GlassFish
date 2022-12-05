
package Taller1;


public class Taller1 extends javax.swing.JFrame {

    Taller1M operar = new Taller1M();
    int ici1;
    int ici2;
    int ici3;
    int ici4;
    int ici5;
    int ici6;
    int ici7;
    int ici8;
    int ici9;
    int ici10;
    int ici11;
    int ici12;
    int ici13;
    int ici14;
    int ici15;
    int ici16;
    
    public Taller1() {
        initComponents();
    }
    public void entrada(){
      ici1 = Integer.parseInt(LuisC.getText());
      ici2=  Integer.parseInt(LuisL.getText());
      ici3 = Integer.parseInt(LuisM.getText());
      ici4 = Integer.parseInt(LuisP.getText());
      ici5 = Integer.parseInt(PedroC.getText());
      ici6 = Integer.parseInt(PedroL.getText());
      ici7 = Integer.parseInt(PedroM.getText());
      ici8 = Integer.parseInt(PedroP.getText());
      ici9 = Integer.parseInt(JoseC.getText());
      ici10 = Integer.parseInt(JoseL.getText());
      ici11 = Integer.parseInt(JoseM.getText());
      ici12 = Integer.parseInt(JoseP.getText());
      ici13 = Integer.parseInt(AnaC.getText());
      ici14 = Integer.parseInt(AnaL.getText());
      ici15 = Integer.parseInt(AnaM.getText());
      ici16 = Integer.parseInt(AnaP.getText());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PedroP = new javax.swing.JTextField();
        TotalPedro = new javax.swing.JTextField();
        JoseC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JoseL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AnaC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AnaL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AnaM = new javax.swing.JTextField();
        AnaP = new javax.swing.JTextField();
        TotalAna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TotalC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TotalL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TotalM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TotalP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Totaltotal = new javax.swing.JTextField();
        LuisC = new javax.swing.JTextField();
        JoseM = new javax.swing.JTextField();
        LuisL = new javax.swing.JTextField();
        JoseP = new javax.swing.JTextField();
        LuisM = new javax.swing.JTextField();
        LuisP = new javax.swing.JTextField();
        TotalJose = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TotalLuis = new javax.swing.JTextField();
        PedroC = new javax.swing.JTextField();
        PedroL = new javax.swing.JTextField();
        PedroM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PedroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedroPActionPerformed(evt);
            }
        });

        TotalPedro.setEditable(false);
        TotalPedro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPedroActionPerformed(evt);
            }
        });

        JoseC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoseCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Luis");

        JoseL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoseLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Pedro");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Jose");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Ana");

        AnaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaMActionPerformed(evt);
            }
        });

        TotalAna.setEditable(false);
        TotalAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAnaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Carne");

        TotalC.setEditable(false);
        TotalC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Leche");

        TotalL.setEditable(false);
        TotalL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalLActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Milo");

        TotalM.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Panela");

        TotalP.setEditable(false);
        TotalP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Totales");

        Totaltotal.setEditable(false);
        Totaltotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Totaltotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltotalActionPerformed(evt);
            }
        });

        JoseP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JosePActionPerformed(evt);
            }
        });

        LuisP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuisPActionPerformed(evt);
            }
        });

        TotalJose.setEditable(false);
        TotalJose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalJoseActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton1.setText("C A L C U L A R   T O T A L ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TotalLuis.setEditable(false);

        PedroL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedroLActionPerformed(evt);
            }
        });

        PedroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedroMActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nicolas Rey Moya Ramirez y Nicolas Corredor Moya ");

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel12.setText("Programa desarrollado por:  ");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel11.setText("SUPERMERCADO COLSUBSIDIO");

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel13.setText("Venta por cajeros mes de Agosto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(LuisC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PedroC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(JoseC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(AnaC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(TotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(TotalLuis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TotalPedro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TotalJose, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(TotalAna, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Totaltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LuisL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LuisM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LuisP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PedroL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PedroM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PedroP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JoseL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JoseM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JoseP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnaL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnaM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnaP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LuisC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PedroC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JoseC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AnaC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LuisL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(LuisM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(LuisP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PedroL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(PedroM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(PedroP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JoseL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(JoseM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(JoseP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnaL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(AnaM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(AnaP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(TotalM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(TotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Totaltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalLuis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPedro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalJose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalAna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PedroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedroPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedroPActionPerformed

    private void TotalPedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPedroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPedroActionPerformed

    private void JoseCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoseCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JoseCActionPerformed

    private void AnaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnaMActionPerformed

    private void TotalAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAnaActionPerformed

    private void TotalCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalCActionPerformed

    private void TotalLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalLActionPerformed

    private void JosePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JosePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JosePActionPerformed

    private void LuisPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuisPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LuisPActionPerformed

    private void TotalJoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalJoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalJoseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        entrada();
        operar.Matriz(ici1, ici2,ici3,ici4,ici5,ici6,ici7,ici8,ici9,ici10,ici11,ici12,ici13,ici14,ici15,ici16);
        LuisC.setText(String.valueOf(operar.LuisC));
        LuisL.setText(String.valueOf(operar.LuisL));
        LuisM.setText(String.valueOf(operar.LuisM));
        LuisP.setText(String.valueOf(operar.LuisP));
        PedroC.setText(String.valueOf(operar.PedroC));
        PedroL.setText(String.valueOf(operar.PedroL));
        PedroM.setText(String.valueOf(operar.PedroM));
        PedroP.setText(String.valueOf(operar.PedroP));
        JoseC.setText(String.valueOf(operar.JoseC));
        JoseL.setText(String.valueOf(operar.JoseL));
        JoseM.setText(String.valueOf(operar.JoseM));
        JoseP.setText(String.valueOf(operar.JoseP));
        AnaC.setText(String.valueOf(operar.AnaC));
        AnaL.setText(String.valueOf(operar.AnaL));
        AnaM.setText(String.valueOf(operar.AnaM));
        AnaP.setText(String.valueOf(operar.AnaP));
        TotalLuis.setText(String.valueOf(operar.TotalLuis));
        TotalPedro.setText(String.valueOf(operar.TotalPedro));
        TotalJose.setText(String.valueOf(operar.TotalJose));
        TotalAna.setText(String.valueOf(operar.TotalAna));
        TotalC.setText(String.valueOf(operar.TotalC));
        TotalL.setText(String.valueOf(operar.TotalL));
        TotalM.setText(String.valueOf(operar.TotalM));
        TotalP.setText(String.valueOf(operar.TotalP));
        Totaltotal.setText(String.valueOf(operar.Totaltotal));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PedroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedroLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedroLActionPerformed

    private void PedroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedroMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedroMActionPerformed

    private void JoseLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoseLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JoseLActionPerformed

    private void TotalPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPActionPerformed

    private void TotaltotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltotalActionPerformed

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
            java.util.logging.Logger.getLogger(Taller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taller1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnaC;
    private javax.swing.JTextField AnaL;
    private javax.swing.JTextField AnaM;
    private javax.swing.JTextField AnaP;
    private javax.swing.JTextField JoseC;
    private javax.swing.JTextField JoseL;
    private javax.swing.JTextField JoseM;
    private javax.swing.JTextField JoseP;
    private javax.swing.JTextField LuisC;
    private javax.swing.JTextField LuisL;
    private javax.swing.JTextField LuisM;
    private javax.swing.JTextField LuisP;
    private javax.swing.JTextField PedroC;
    private javax.swing.JTextField PedroL;
    private javax.swing.JTextField PedroM;
    private javax.swing.JTextField PedroP;
    private javax.swing.JTextField TotalAna;
    private javax.swing.JTextField TotalC;
    private javax.swing.JTextField TotalJose;
    private javax.swing.JTextField TotalL;
    private javax.swing.JTextField TotalLuis;
    private javax.swing.JTextField TotalM;
    private javax.swing.JTextField TotalP;
    private javax.swing.JTextField TotalPedro;
    private javax.swing.JTextField Totaltotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
