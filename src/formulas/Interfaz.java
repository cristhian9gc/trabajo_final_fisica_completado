
package formulas;

public class Interfaz extends javax.swing.JFrame {
    
    operaciones operar = new operaciones();

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        vx1 = new javax.swing.JTextField();
        vx2 = new javax.swing.JTextField();
        vy1 = new javax.swing.JTextField();
        vy2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botoperar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        ModuloSuma = new javax.swing.JTextField();
        unitarioB = new javax.swing.JTextField();
        unitarioA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        moduloA = new javax.swing.JTextField();
        moduloB = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        sumay = new javax.swing.JTextField();
        restay = new javax.swing.JTextField();
        restax = new javax.swing.JTextField();
        sumax = new javax.swing.JTextField();
        jLabelfrom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("VECTORES");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        v1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 255, 255));
        v1.setText("VectorA:");
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        v2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        v2.setForeground(new java.awt.Color(255, 255, 255));
        v2.setText("VectorB:");
        getContentPane().add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(vx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, -1));
        getContentPane().add(vx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, -1));
        getContentPane().add(vy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, -1));

        vy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vy2ActionPerformed(evt);
            }
        });
        getContentPane().add(vy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(";");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 10, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(";");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("]");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 20, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("]");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 20, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("[");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 10, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("[");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 10, -1));

        botoperar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botoperar.setText("Calcular");
        botoperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoperarActionPerformed(evt);
            }
        });
        getContentPane().add(botoperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SUMA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RESTA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 50, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRODUCTO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MODULO DE LA SUMA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VECTOR UNITARIO B:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VECTOR UNITARIO A:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 140, 20));
        getContentPane().add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 230, -1));
        getContentPane().add(ModuloSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 170, -1));

        unitarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitarioBActionPerformed(evt);
            }
        });
        getContentPane().add(unitarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 180, -1));
        getContentPane().add(unitarioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 180, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MODULO DEL VECTOR B:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MODULO DEL VECTOR A:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        getContentPane().add(moduloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 170, -1));
        getContentPane().add(moduloB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("]");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 20, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("]");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 10, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(";");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 10, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(";");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("[");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("[");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        getContentPane().add(sumay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 60, -1));
        getContentPane().add(restay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, -1));
        getContentPane().add(restax, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 60, -1));
        getContentPane().add(sumax, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 60, -1));

        jLabelfrom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenFondo/dibujo2.jpg"))); // NOI18N
        getContentPane().add(jLabelfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 488));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vy2ActionPerformed

    private void unitarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitarioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitarioBActionPerformed

    private void botoperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoperarActionPerformed
        double vx10 = Double.parseDouble(vx1.getText());
        double vx20 = Double.parseDouble(vx2.getText());
        double vy10 = Double.parseDouble(vy1.getText());
        double vy20 = Double.parseDouble(vy2.getText());
        
        operar.calsuma(vx10, vx20, vy10, vy20);
        operar.calresta(vx10, vx20, vy10, vy20);
        operar.calmoduloA(vx10, vx20);
        operar.calmoduloB(vy10, vy20);
        operar.calmult(vx10, vx20, vy10, vy20);
        operar.modulosuma(vx10, vx20, vy10, vy20);
        
        
        sumax.setText(String.valueOf(operar.sumax));
        sumay.setText(String.valueOf(operar.sumay));
        
        restax.setText(String.valueOf(operar.restax));
        restay.setText(String.valueOf(operar.restay));
        
        moduloA.setText(String.valueOf(operar.moduloA));
        moduloB.setText(String.valueOf(operar.moduloB));
        
        producto.setText(String.valueOf(operar.multi));
        
        ModuloSuma.setText(String.valueOf(operar.modulosuma));
    }//GEN-LAST:event_botoperarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ModuloSuma;
    private javax.swing.JButton botoperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelfrom;
    private javax.swing.JTextField moduloA;
    private javax.swing.JTextField moduloB;
    private javax.swing.JTextField producto;
    private javax.swing.JTextField restax;
    private javax.swing.JTextField restay;
    private javax.swing.JTextField sumax;
    private javax.swing.JTextField sumay;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField unitarioA;
    private javax.swing.JTextField unitarioB;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JTextField vx1;
    private javax.swing.JTextField vx2;
    private javax.swing.JTextField vy1;
    private javax.swing.JTextField vy2;
    // End of variables declaration//GEN-END:variables
}
