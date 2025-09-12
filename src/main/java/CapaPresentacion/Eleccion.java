package CapaPresentacion;

import CapaLogica.BitacoraCero;

public class Eleccion extends javax.swing.JFrame {
    
    private BitacoraCero bitacora = new BitacoraCero();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Eleccion.class.getName());

    
    
    public Eleccion() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        docente = new javax.swing.JButton();
        adscripto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 214748367));
        jPanel1.setMinimumSize(new java.awt.Dimension(427, 40));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("Selecciona");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 40, 327, 57);

        docente.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        docente.setText("Docente");
        docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteActionPerformed(evt);
            }
        });
        jPanel1.add(docente);
        docente.setBounds(150, 330, 230, 110);

        adscripto.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        adscripto.setText("Adscripto");
        adscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adscriptoActionPerformed(evt);
            }
        });
        jPanel1.add(adscripto);
        adscripto.setBounds(150, 190, 230, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteActionPerformed
Licencia L = new Licencia(bitacora);
    L.setVisible(true);
    dispose();
    }//GEN-LAST:event_docenteActionPerformed

    private void adscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adscriptoActionPerformed

        dispose();
    Adscripto A = new Adscripto();
  A.setVisible(true);
  

    }//GEN-LAST:event_adscriptoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Eleccion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adscripto;
    private javax.swing.JButton docente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
