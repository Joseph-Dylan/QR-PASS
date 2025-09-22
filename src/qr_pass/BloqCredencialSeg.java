
package qr_pass;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class BloqCredencialSeg extends javax.swing.JPanel {

   private String boletaTexto;
    private String nombreTexto;
    private String grupoTexto;

      public BloqCredencialSeg(String boleta, String nombre, String grupo) {
        this.boletaTexto = boleta;
        this.nombreTexto = nombre;
        this.grupoTexto = grupo;

        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btxno = new javax.swing.JButton();
        btxsi = new javax.swing.JButton();

        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        jLabel1.setText("Estas seguro que deses bloquear al alumno?");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btxno.setBackground(new java.awt.Color(204, 0, 0));
        btxno.setFont(new java.awt.Font("Oswald", 1, 15)); // NOI18N
        btxno.setText("NO");
        btxno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxnoActionPerformed(evt);
            }
        });
        content.add(btxno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 30));

        btxsi.setBackground(new java.awt.Color(0, 153, 0));
        btxsi.setFont(new java.awt.Font("Oswald", 1, 15)); // NOI18N
        btxsi.setText("SI");
        btxsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxsiActionPerformed(evt);
            }
        });
        content.add(btxsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btxsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxsiActionPerformed

 
    try {
        int boletaNum = Integer.parseInt(boletaTexto);

        String url = "jdbc:mysql://localhost:3306/prueba"; 
        String usuario = "root"; 
        String contraseña = "Qeqrqt131415"; 

        Connection conn = DriverManager.getConnection(url, usuario, contraseña);

        PreparedStatement psCheck = conn.prepareStatement("SELECT * FROM Bloqueados WHERE Boleta = ?");
        psCheck.setInt(1, boletaNum);
        ResultSet rsCheck = psCheck.executeQuery();
        if (rsCheck.next()) {
            JOptionPane.showMessageDialog(this, "El alumno ya está bloqueado.");
            rsCheck.close();
            conn.close();
            return;
        }
        rsCheck.close();
        

        PreparedStatement psDeleteRegistros = conn.prepareStatement("DELETE FROM Registros WHERE Boleta = ?");
        psDeleteRegistros.setInt(1, boletaNum);
        psDeleteRegistros.executeUpdate();
        psDeleteRegistros.close();


        PreparedStatement psDeleteHorario = conn.prepareStatement("DELETE FROM Horario WHERE Boleta = ?");
        psDeleteHorario.setInt(1, boletaNum);
        psDeleteHorario.executeUpdate();
        psDeleteHorario.close();


        PreparedStatement psDeleteAlumnos = conn.prepareStatement("DELETE FROM Alumnos WHERE Boleta = ?");
        psDeleteAlumnos.setInt(1, boletaNum);
        psDeleteAlumnos.executeUpdate();
        psDeleteAlumnos.close();

        JOptionPane.showMessageDialog(this, "Alumno bloqueado correctamente.");
conn.close();

    Main menuFrame = new Main();
    menuFrame.setVisible(true);

SwingUtilities.getWindowAncestor(this).dispose();


    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al bloquear: " + e.getMessage());
    }

    }//GEN-LAST:event_btxsiActionPerformed

    private void btxnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxnoActionPerformed
          Main menuFrame = new Main();
    menuFrame.setVisible(true);

SwingUtilities.getWindowAncestor(this).dispose();  
    }//GEN-LAST:event_btxnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btxno;
    private javax.swing.JButton btxsi;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
