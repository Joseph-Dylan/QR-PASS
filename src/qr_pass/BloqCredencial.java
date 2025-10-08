/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qr_pass;

import java.awt.Window;
import javax.swing.SwingUtilities;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class BloqCredencial extends javax.swing.JFrame {


    public BloqCredencial() {
        initComponents();
        bloquear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desbloquear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boleta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        desbloquear = new javax.swing.JButton();
        bloquear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 104));

        jLabel1.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bloquear credencial");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoqr (4).png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/istockphoto-1387844564-170667a (1).jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        content.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Ingresar boleta");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        content.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 160, 30));

        jLabel5.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel5.setText("Boleta");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 120, 40));
        content.add(boleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 160, 30));

        jLabel6.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel6.setText("Alumno");
        content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 40));
        content.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel7.setText("Grupo");
        content.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        content.add(grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, 30));

        desbloquear.setBackground(new java.awt.Color(204, 0, 0));
        desbloquear.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        desbloquear.setForeground(new java.awt.Color(255, 255, 255));
        desbloquear.setText("Desbloquear credencial");
        desbloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click_desbloq(evt);
            }
        });
        content.add(desbloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        bloquear.setBackground(new java.awt.Color(204, 0, 0));
        bloquear.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        bloquear.setForeground(new java.awt.Color(255, 255, 255));
        bloquear.setText("Bloquear credencial");
        bloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click_bloq(evt);
            }
        });
        content.add(bloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem opcion1 = new JMenuItem("Registro manual/automático");
        opcion1.addActionListener(e -> {
            Registro ventana = new Registro();
            ventana.setVisible(true);
            Window window = SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }

        });

        JMenuItem opcion2 = new JMenuItem("Buscar alumno");
        opcion2.addActionListener(e -> {
            BuscarAlumno ventana = new BuscarAlumno();
            ventana.setVisible(true);
            Window window = SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }

        });

        JMenuItem opcion3 = new JMenuItem("Bloquear credencial");
        opcion3.addActionListener(e -> {
            BloqCredencial ventana = new BloqCredencial();
            ventana.setVisible(true);
            Window window = SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }

        });

        JMenuItem opcion4 = new JMenuItem("Incidencias");
        opcion4.addActionListener(e -> {
            Incidencias ventana = new Incidencias();
            ventana.setVisible(true);
            Window window = SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }

        });

        JMenuItem opcion5 = new JMenuItem("Guardar");
        opcion5.addActionListener(e -> {
            DescargarBase ventana = new DescargarBase();
            ventana.setVisible(true);
            Window window = SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }

        });

        popupMenu.add(opcion1);
        popupMenu.add(opcion2);
        popupMenu.add(opcion3);
        popupMenu.add(opcion4);
        popupMenu.add(opcion5);

        jButton2.addActionListener(e -> {

            popupMenu.show(jButton2, 0, jButton2.getHeight());

            ImageIcon icono = new ImageIcon(getClass().getResource("/img/istockphoto-1387844564-170667a (1).jpg"));
            jButton2.setIcon(icono);
            jButton2.setText("");

        })
        ;
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/istockphoto-1387844564-170667a (1).jpg"));
        jButton2.setIcon(icono);
        jButton2.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            DataBaseConection DBC = new DataBaseConection();
            try (Connection con = DBC.conectar()) {
                int Boleta = Integer.parseInt(txt1.getText());
            String query = "SELECT nombre, grupo, boleta FROM Alumnos WHERE boleta = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setInt(1, Boleta);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                // Extrae los datos
                    String nomb = rs.getString("nombre");
                    String grp = rs.getString("grupo");
                    int boletaRes = rs.getInt("boleta");

                // Setea en la UI
                    nombre.setText(nomb);
                    grupo.setText(grp);
                    boleta.setText(String.valueOf(boletaRes));
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erro: Alumno no encontrado");
                }
            }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error en la búsqueda: " + e);
            }
        }
    }//GEN-LAST:event_Enter

    private void click_bloq(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_bloq
        DataBaseConection DBC = new DataBaseConection();
            try (Connection con = DBC.conectar()) {
                int Boleta = Integer.parseInt(txt1.getText());
            String query = "SELECT bloqueado FROM Alumnos WHERE boleta = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setInt(1, Boleta);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    boolean bloqueado = rs.getBoolean("bloqueado");
                    if(bloqueado){
                        javax.swing.JOptionPane.showMessageDialog(this, "Error: La boleta ya se encuentra bloqueada");
                    }
                    else{
                        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de bloquear esta boleta?", "Confirmar", JOptionPane.YES_NO_OPTION);
                        if (confirm != JOptionPane.YES_OPTION) {
                            return;
                        }
                        String queryb = "UPDATE Alumnos SET bloqueado = 1 WHERE boleta = ?";
                        try (PreparedStatement pst2 = con.prepareStatement(queryb)) {
                        pst2.setInt(1, Boleta);
                        pst2.executeUpdate();
                        
                        javax.swing.JOptionPane.showMessageDialog(this, "Boleta bloqueada con éxito");
                        } catch (SQLException e) {
                            javax.swing.JOptionPane.showMessageDialog(this, "Error al bloquear alumno: " + e);
                        }
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error: Alumno no encontrado");
                }
            }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error en la búsqueda: " + e);
            }
    }//GEN-LAST:event_click_bloq

    private void click_desbloq(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_desbloq
        DataBaseConection DBC = new DataBaseConection();
        try (Connection con = DBC.conectar()) {
            int Boleta = Integer.parseInt(txt1.getText());
            String query = "SELECT bloqueado FROM Alumnos WHERE boleta = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setInt(1, Boleta);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    boolean bloqueado = rs.getBoolean("bloqueado");
                    if (!bloqueado) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error: La boleta se encuentra desbloqueada");
                    } else {
                        int confirm = JOptionPane.showConfirmDialog(this,"¿Estás seguro de desbloquear esta boleta?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm != JOptionPane.YES_OPTION) {
                        return;
                    }
                    String queryb = "UPDATE Alumnos SET bloqueado = 0 WHERE boleta = ?";
                    try (PreparedStatement pst2 = con.prepareStatement(queryb)) {
                        pst2.setInt(1, Boleta);
                        pst2.executeUpdate();

                        javax.swing.JOptionPane.showMessageDialog(this, "Boleta desbloqueada con éxito");
                    } catch (SQLException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Error al desbloquear alumno: " + e);
                    }
                    }
                } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Alumno no encontrado");
                }
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la búsqueda: " + e);
        }
    }//GEN-LAST:event_click_desbloq

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bloquear;
    private javax.swing.JTextField boleta;
    private javax.swing.JPanel content;
    private javax.swing.JButton desbloquear;
    private javax.swing.JTextField grupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
