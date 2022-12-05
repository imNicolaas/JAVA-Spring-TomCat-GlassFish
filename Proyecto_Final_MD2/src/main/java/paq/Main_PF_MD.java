
package paq;

import javax.swing.JOptionPane;

public class Main_PF_MD extends javax.swing.JFrame {

    public Main_PF_MD() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_filas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_columnas = new javax.swing.JTextField();
        boton_calcular_ = new javax.swing.JButton();
        Boton_matriz_random_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_imprimir = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Proyecto final matematicas discretas");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Digite las filas que tendrá la matriz:");

        campo_filas.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Digite las columnas que tendrá la matriz:");

        campo_columnas.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N

        boton_calcular_.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        boton_calcular_.setText("Calcular");
        boton_calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_calcular_ActionPerformed(evt);
            }
        });

        Boton_matriz_random_.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        Boton_matriz_random_.setText("Generar matriz aleatoria y calcular");
        Boton_matriz_random_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_matriz_random_ActionPerformed(evt);
            }
        });

        area_imprimir.setColumns(20);
        area_imprimir.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        area_imprimir.setRows(5);
        jScrollPane1.setViewportView(area_imprimir);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Programa desarrollado por Nicolas Corredor Moya");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_filas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_calcular_)
                                .addGap(34, 34, 34)
                                .addComponent(Boton_matriz_random_, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campo_filas)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campo_columnas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_calcular_)
                    .addComponent(Boton_matriz_random_))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int filas =0, columnas =0, random =0, diagonal =0, unos =0, contador_simetrica =0, diagonal_2=0, contador_transitiva =0, aaa=0;
    String matriz_imp = "", relaciones ="", reflexiva ="", anti_reflexiva ="", simetrica ="", asimetrica = "", antisimetrica = "", transitiva ="";
            
    private void Boton_matriz_random_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_matriz_random_ActionPerformed
    
            filas = (int) (Math.random() * 85);
            columnas = filas;
        
                campo_filas.setText(null);
                campo_columnas.setText(null);
                area_imprimir.setText(null);
                
                int a[][] = new int [filas][columnas];
                    
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        
                        a[i][j] = (int) (Math.random() * 2);
                        
                    }
                }

                    for (int i = 0; i < filas; i++) {

                        for (int j = 0; j < columnas; j++) {
                            matriz_imp+= a[i][j]+"   ";
                            
                                if(a[i][j] ==1){
                                    relaciones+= "(" +(i+1)+","+(j+1)+") ";
                                }
                                if(i==j && a[i][j] ==1){
                                    diagonal = diagonal + 1;                                    
                                }
                                
                        }

                        matriz_imp += "\n";
                    }
                
                if(diagonal == filas){
                    reflexiva = "Esta matriz es reflexiva, ya que su diagonal principal es comprendida \nexclusivamente de unos.";
                }
                area_imprimir.setText("Matriz: \n" + matriz_imp + "\nRelaciones de la matriz:\n\n" + "R=[ " +relaciones + "]" + "\n\n" + reflexiva);
                
            matriz_imp ="";
            relaciones = "";
            reflexiva ="";
            diagonal  = 0;            
        
        
    }//GEN-LAST:event_Boton_matriz_random_ActionPerformed

    private void boton_calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_calcular_ActionPerformed
        
        
        
        if (campo_filas.getText().isEmpty() || campo_columnas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
        }else{
            
            filas = Integer.parseInt(campo_filas.getText());
            columnas = Integer.parseInt(campo_columnas.getText());
        
            if(filas != columnas){
                JOptionPane.showMessageDialog(null, "las filas deben ser iguales a las columas");
                campo_filas.setText(null);
                campo_columnas.setText(null);
            }else{
                
                campo_filas.setText(null);
                campo_columnas.setText(null);
                area_imprimir.setText(null);
                
                int a[][] = new int [filas][columnas];
                    
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        
                        do{
                            a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion [" + (i+1) + "," + (j+1) + "] de la matriz"));
                            
                                if(a[i][j] >1 || a[i][j]<0){
                                    JOptionPane.showMessageDialog(null, "la matriz solo puede contener elementos 0 y 1");
                                }
                                
                        }while(a[i][j] >1 || a[i][j]<0);
                        
                    }
                }

                    for (int i = 0; i < filas; i++) {

                        for (int j = 0; j < columnas; j++) {
                            matriz_imp+= a[i][j]+"   ";
                            
                                if(a[i][j] ==1){
                                    relaciones+= "(" +(i+1)+","+(j+1)+") ";
                                    unos = unos +1;
                                }
                                
                                if(i==j && a[i][j] ==1){
                                    diagonal = diagonal + 1;
                                }else if(i==j && a[i][j] ==0){
                                    diagonal_2 = diagonal_2 +1;
                                }else if((a[i][j] == a[j][i] && a[i][j]==1) || (i==j && a[i][j] ==1)){
                                    contador_simetrica = contador_simetrica +1;
                                }else if(a[i][j] == 1 && a[j][i] ==1 && a[i][i] ==1 && a[j][j] ==1){
                                    contador_transitiva = contador_transitiva +1;
                                    aaa = aaa+1;
                                }
                                
                        }

                        matriz_imp += "\n";
                    }
                
                if(diagonal == filas){
                    reflexiva = "Esta matriz es reflexiva, ya que su diagonal principal es comprendida \nexclusivamente de unos.";
                }
                if(diagonal_2 == filas){
                    anti_reflexiva = "Esta matriz es anti reflexiva, ya que su diagonal principal es comprendida \nexclusivamente de ceros.";
                }
                if(unos == contador_simetrica){
                    simetrica = "Esta matriz es simetrica, ya que cada una de sus relaciones \ntiene su respectivo reciproco.";
                }
                if(contador_simetrica > 0 && contador_simetrica != unos){
                    asimetrica = "esta matriz es asimetrica ya que no todas sus relaciones tienen\nsu reciproco";
                }
                if(contador_simetrica ==0){
                    antisimetrica = "esta matriz es antisimetrica ya que ninguna de sus relaciones posee\nun reciproco";
                }
                if(contador_transitiva == aaa && contador_transitiva != 0){
                    transitiva = "esta matriz es transitiva";
                }
                area_imprimir.setText("Matriz: \n" + matriz_imp + "\nRelaciones de la matriz:\n\n" + "R=[ " +relaciones + "]" + "\n\n" + reflexiva+ "\n\n" + anti_reflexiva + "\n\n" + simetrica+ "\n\n" + asimetrica+ "\n\n" + antisimetrica + "\n\n" + transitiva);
            }
            
        matriz_imp ="";
        relaciones = "";
        reflexiva ="";
        anti_reflexiva ="";
        simetrica ="";
        asimetrica ="";
        antisimetrica ="";
        transitiva = "";
        
        diagonal  = 0;            
        diagonal_2  = 0;            
        contador_simetrica =0;
        contador_transitiva =0;
        unos =0;
        aaa=0;

        }
        

        
    }//GEN-LAST:event_boton_calcular_ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_PF_MD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_PF_MD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_PF_MD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_PF_MD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_PF_MD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_matriz_random_;
    private javax.swing.JTextArea area_imprimir;
    private javax.swing.JButton boton_calcular_;
    private javax.swing.JTextField campo_columnas;
    private javax.swing.JTextField campo_filas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
