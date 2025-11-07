
package CapaPresentacion;
import CapaLogica.BitacoraCero;
import javax.swing.JOptionPane;

public class Licencia extends javax.swing.JFrame {
    private BitacoraCero bitacora;
    
         {
             
             this.bitacora = bitacora;
         
    }

    public Licencia(BitacoraCero bitacora) {
        initComponents();
        this.bitacora = bitacora;
    }
    public Licencia (){
        initComponents();
        setLocationRelativeTo(null);
        
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        licencia = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        grupos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        materia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        turno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Licencia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 30, 258, 57);

        tiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tiempo);
        tiempo.setBounds(470, 160, 150, 50);

        licencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(licencia);
        licencia.setBounds(10, 150, 230, 60);

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(nombre);
        nombre.setBounds(10, 310, 230, 60);

        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(10, 10, 100, 40);

        listo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listo.setText("Guardar");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel1.add(listo);
        listo.setBounds(954, 530, 110, 30);

        cedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(cedula);
        cedula.setBounds(420, 310, 230, 60);

        grupos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(grupos);
        grupos.setBounds(910, 140, 150, 50);

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grupos:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(930, 120, 120, 31);

        materia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(materia);
        materia.setBounds(780, 320, 290, 50);

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tiempo (Inicio-Fin)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 130, 260, 31);

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOmbre de la materia");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 290, 300, 31);

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 280, 110, 31);

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOmbre Completo");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 280, 250, 31);

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de licencia");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 120, 220, 31);

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Turno:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 460, 120, 31);

        turno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(turno);
        turno.setBounds(120, 450, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
  Eleccion E = new Eleccion();
  E.setVisible(true);
  this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
           
        
        
   
    
        BitacoraCero registro = new BitacoraCero();
registro.setNombre(nombre.getText().trim());
registro.setMateria(materia.getText().trim());
registro.setFecha(tiempo.getText().trim());
registro.setLicencia(licencia.getText().trim());
registro.setGrupo(grupos.getText().trim());
registro.setCedula(cedula.getText().trim());
registro.setTurno(turno.getText().trim());
try {
    CapaLogica.FachadaLogica fachada = new CapaLogica.FachadaLogica();
    fachada.guardarRegistro(registro);
    JOptionPane.showMessageDialog(this, "Registro guardado correctamente.");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
}

          
     

       if (nombre.getText().isEmpty()&& licencia.getText().isEmpty() && tiempo.getText().isEmpty() && cedula.getText().isEmpty() && materia.getText().isEmpty() && turno.getText().isEmpty()&& grupos.getText().isEmpty()) {
       
            JOptionPane.showMessageDialog(this,
                "Por favor, completa todos los campos.",
                "Datos incompletos",
                JOptionPane.WARNING_MESSAGE);
            
           
        } else{
           
       
        
              

      
        JOptionPane.showMessageDialog(this,
            "Registro guardado correctamente.",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);

        nombre.setText("");
        licencia.setText("");
        tiempo.setText("");
        grupos.setText("");
        cedula.setText("");
        materia.setText("");
       turno.setText(""); 


        this.dispose();
        new Eleccion().setVisible(true);
        
       }
        
    }//GEN-LAST:event_listoActionPerformed

    
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Licencia().setVisible(true));
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField grupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licencia;
    private javax.swing.JButton listo;
    private javax.swing.JTextField materia;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tiempo;
    private javax.swing.JTextField turno;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

   
}
