    package CapaPresentacion;
import CapaLogica.BitacoraCero;
import javax.swing.JOptionPane;


public class Materia extends javax.swing.JFrame {
    private BitacoraCero bitacora;

    public Materia(BitacoraCero bitacora) {
        initComponents();
        this.bitacora = bitacora;
        setLocationRelativeTo(null);
    }

    private Materia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Licencia.class.getName());
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        noc = new java.awt.Checkbox();
        mat = new java.awt.Checkbox();
        ves = new java.awt.Checkbox();
        jLabel8 = new javax.swing.JLabel();
        materia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        grupos = new javax.swing.JTextField();
        listo1 = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de Licencia");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 10, 236, 57);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOmbre de la materia");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 340, 300, 31);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vespertino");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 230, 130, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nocturno");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 270, 107, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matutino");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 180, 103, 27);

        noc.setLabel("checkbox1");
        jPanel1.add(noc);
        noc.setBounds(170, 270, 20, 20);

        mat.setLabel("checkbox1");
        jPanel1.add(mat);
        mat.setBounds(170, 180, 20, 20);

        ves.setLabel("checkbox1");
        jPanel1.add(ves);
        ves.setBounds(170, 230, 20, 20);

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Turno:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 140, 120, 31);

        materia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaActionPerformed(evt);
            }
        });
        jPanel1.add(materia);
        materia.setBounds(120, 370, 290, 50);

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grupos:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 130, 120, 31);

        grupos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposActionPerformed(evt);
            }
        });
        jPanel1.add(grupos);
        grupos.setBounds(320, 160, 150, 50);

        listo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listo1.setText("LISTO");
        listo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listo1ActionPerformed(evt);
            }
        });
        jPanel1.add(listo1);
        listo1.setBounds(30, 490, 84, 36);

        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(10, 20, 76, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materiaActionPerformed

    private void gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gruposActionPerformed

    private void listo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listo1ActionPerformed
         String materiaTxt = materia.getText().trim();
        String gruposTxt  = grupos.getText().trim();

        String turno = "";
        if (mat.getState()) turno = "Matutino";
        else if (ves.getState()) turno = "Vespertino";
        else if (noc.getState()) turno = "Nocturno";

        if (materiaTxt.isEmpty() || gruposTxt.isEmpty() || turno.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor, completa todos los campos y selecciona un turno.",
                "Datos incompletos",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Si querés guardar desde aquí, deberías pasar nombre/tipoLicencia/tiempo desde Licencia
        // bitacora.agregarRegistro(nombre, tipoLicencia, tiempo, gruposTxt, materiaTxt);

        JOptionPane.showMessageDialog(this,
            "Datos de materia y turno registrados.",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);

        materia.setText("");
        grupos.setText("");
        mat.setState(false);
        ves.setState(false);
        noc.setState(false);

        this.dispose();
        new Eleccion().setVisible(true);
    }//GEN-LAST:event_listo1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
        new Licencia(bitacora).setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Materia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField grupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listo1;
    private java.awt.Checkbox mat;
    private javax.swing.JTextField materia;
    private java.awt.Checkbox noc;
    private java.awt.Checkbox ves;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
