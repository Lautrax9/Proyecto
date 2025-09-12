
package CapaPresentacion;
import CapaLogica.BitacoraCero;
import javax.swing.JOptionPane;

public class Licencia extends javax.swing.JFrame {
    private BitacoraCero bitacora;

    public Licencia(BitacoraCero bitacora) {
        initComponents();
        this.bitacora = bitacora;
    }

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Licencia.class.getName());

    
    private Licencia() {
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        licencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setText("Licencia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 40, 258, 57);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setText("Tiempo (Inicio-Fin)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 270, 213, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de Licencia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 190, 60);

        tiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tiempo);
        tiempo.setBounds(350, 320, 150, 60);

        licencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        licencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenciaActionPerformed(evt);
            }
        });
        jPanel1.add(licencia);
        licencia.setBounds(10, 150, 230, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setText("Cedula");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 320, 78, 60);

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(10, 250, 230, 60);

        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(10, 10, 76, 30);

        listo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listo.setText("LISTO");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel1.add(listo);
        listo.setBounds(20, 490, 84, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setText("Nombre Completo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 211, 60);

        cedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel1.add(cedula);
        cedula.setBounds(10, 360, 230, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void licenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenciaActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
  Eleccion E = new Eleccion();
  E.setVisible(true);
  this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
        
         Materia M = new Materia(bitacora);
    M.setVisible(true);
    dispose();
        
        
         String nombreTxt     = nombre.getText().trim();
        String tipoLicencia  = licencia.getText().trim(); // JTextField, no JComboBox
        String tiempoTxt     = tiempo.getText().trim();
          // Asegurate de declarar y agregarlo

        if (nombreTxt.isEmpty() || tipoLicencia.isEmpty() ||
            tiempoTxt.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor, completa todos los campos.",
                "Datos incompletos",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        bitacora.agregarRegistro(nombreTxt, tipoLicencia, tiempoTxt);

        JOptionPane.showMessageDialog(this,
            "Registro guardado correctamente.",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);

        nombre.setText("");
        licencia.setText("");
        tiempo.setText("");
       

        this.dispose();
        new Eleccion().setVisible(true);
        
       
        
    }//GEN-LAST:event_listoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Licencia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licencia;
    private javax.swing.JButton listo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tiempo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
