
package CapaPresentacion;

import CapaException.BDException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Adscripto extends javax.swing.JFrame {
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Adscripto.class.getName());

private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0); 

    try {
        CapaPersistencia.Conexion conexion = new CapaPersistencia.Conexion();
        try (Connection con = conexion.getConnection()) {
            var ps = con.prepareStatement("SELECT cedula, nombre, licencia, fecha, materia, grupos, turno FROM faltas.licencia");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] fila = new Object[] {
                    rs.getString("nombre"),
                    rs.getString("cedula"),
                    rs.getString("materia"),
                    rs.getString("fecha"),
                    rs.getString("licencia"),
                    rs.getString("turno")
                        
                };
                modelo.addRow(fila);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }   catch (BDException ex) {
            Logger.getLogger(Adscripto.class.getName()).log(Level.SEVERE, null, ex);
        }
}

   
    
public Adscripto() {
    initComponents();
    setLocationRelativeTo(null);
    cargarTabla(); // carga los datos al abrir la ventana
}


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(10, 490, 120, 40);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar);
        eliminar.setBounds(570, 490, 120, 40);

        tabla.setAutoCreateRowSorter(true);
        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Materia", "Nombre Completo", "Curso", "Tipo de Licencia", "Fechas", "Turno "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 650, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      int fila = tabla.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        return;
    }

    // Ajustá el índice si la cédula está en otra columna
    String cedula = tabla.getValueAt(fila, 1).toString();

    try {
        CapaLogica.FachadaLogica fachada = new CapaLogica.FachadaLogica();
        fachada.eliminarPorCedula(cedula);
        JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
        cargarTabla(); // refresca la tabla
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage());
    }

    }//GEN-LAST:event_eliminarActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new Adscripto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
