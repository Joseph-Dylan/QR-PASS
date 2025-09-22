
package qr_pass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class DesbloqCredencialSeg extends javax.swing.JPanel {
private String boletaTexto, nombreTexto, grupoTexto;

public DesbloqCredencialSeg(String boleta, String nombre, String grupo) {
    initComponents();
    this.boletaTexto = boleta;
    this.nombreTexto = nombre;
    this.grupoTexto = grupo;
}


    public DesbloqCredencialSeg() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        jLabel1.setText("Estas seguro que deseas desbloquear al alumno?");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        jButton1.setText("NO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Oswald", 1, 15)); // NOI18N
        jButton2.setText("SI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        content.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                              
    try {
    int boletaNum = Integer.parseInt(boletaTexto);

    String url = "jdbc:mysql://localhost:3306/prueba"; 
    String usuario = "root"; 
    String contraseña = "Qeqrqt131415"; 

    Connection conn = DriverManager.getConnection(url, usuario, contraseña);

   
    PreparedStatement psCheck = conn.prepareStatement("SELECT * FROM Bloqueados WHERE Boleta = ?");
    psCheck.setInt(1, boletaNum);
    ResultSet rsCheck = psCheck.executeQuery();

    if (!rsCheck.next()) {
        JOptionPane.showMessageDialog(this, "El alumno no está bloqueado.");
        rsCheck.close();
        psCheck.close();
        conn.close();
        return;
    }

    rsCheck.close();
    psCheck.close();

    
    PreparedStatement psDeleteBloqueado = conn.prepareStatement("DELETE FROM Bloqueados WHERE Boleta = ?");
    psDeleteBloqueado.setInt(1, boletaNum);
    psDeleteBloqueado.executeUpdate();
    psDeleteBloqueado.close();

    PreparedStatement psDeleteHorarioBloqueado = conn.prepareStatement("DELETE FROM Horario_Bloqueados WHERE Boleta = ?");
    psDeleteHorarioBloqueado.setInt(1, boletaNum);
    psDeleteHorarioBloqueado.executeUpdate();
    psDeleteHorarioBloqueado.close();

 
    

    JOptionPane.showMessageDialog(this, "Alumno desbloqueado correctamente.");

    conn.close();

    Main menuFrame = new Main();
    menuFrame.setVisible(true);

    SwingUtilities.getWindowAncestor(this).dispose();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error al desbloquear: " + e.getMessage());
}


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Main menuFrame = new Main();
    menuFrame.setVisible(true);

SwingUtilities.getWindowAncestor(this).dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
