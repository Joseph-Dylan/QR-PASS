
package qr_pass;
import java.awt.Window;
import java.sql.*;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class BloqCredencial1 extends javax.swing.JPanel {
private javax.swing.JTextField boletaTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField grupoTextField;


Redondo panelRedondo = new Redondo();


    
    public BloqCredencial1() {
        initComponents();
   

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Ingresabol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boleta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
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

        Ingresabol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresabolActionPerformed(evt);
            }
        });
        content.add(Ingresabol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 160, 30));

        jLabel5.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel5.setText("Boleta");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 120, 40));
        content.add(boleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 160, 30));

        jLabel6.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel6.setText("Alumno");
        content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 40));
        content.add(alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel7.setText("Grupo");
        content.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        content.add(grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, 30));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Bloquear credencial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IngresabolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresabolActionPerformed
String boletaIngresada = Ingresabol.getText();

    String url = "jdbc:mysql://localhost:3306/prueba"; 
    String usuario = "root"; 
    String contraseña = "Qeqrqt131415"; 

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

        String consultaBloqueado = "SELECT Boleta, Nombre, Grupo FROM Bloqueados WHERE Boleta = ?";
        PreparedStatement psBloqueado = conexion.prepareStatement(consultaBloqueado);
        psBloqueado.setInt(1, Integer.parseInt(boletaIngresada));
        ResultSet rsBloqueado = psBloqueado.executeQuery();

        if (rsBloqueado.next()) {
            String boletaStr = String.valueOf(rsBloqueado.getInt("Boleta"));
            String nombreStr = rsBloqueado.getString("Nombre");
            String grupoStr = rsBloqueado.getString("Grupo");

            DesbloqCredencial desbloqPanel = new DesbloqCredencial(boletaStr, nombreStr, grupoStr);
            int ancho = 800;
            int alto = 500;
            int x = (content.getWidth() - ancho) / 2;
            int y = (content.getHeight() - alto) / 2;

            desbloqPanel.setSize(ancho, alto);
            content.removeAll();
            content.add(desbloqPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, ancho, alto));
            content.revalidate();
            content.repaint();

        } else {
            
            String consultaAlumno = "SELECT Boleta, Nombre, Grupo FROM Alumnos WHERE Boleta = ?";
            PreparedStatement psAlumno = conexion.prepareStatement(consultaAlumno);
            psAlumno.setInt(1, Integer.parseInt(boletaIngresada));
            ResultSet rsAlumno = psAlumno.executeQuery();

            if (rsAlumno.next()) {
                boleta.setText(String.valueOf(rsAlumno.getInt("Boleta")));
                alumno.setText(rsAlumno.getString("Nombre"));
                grupo.setText(rsAlumno.getString("Grupo"));
            } else {
                JOptionPane.showMessageDialog(this, "Alumno no encontrado.");
                boleta.setText("");
                alumno.setText("");
                grupo.setText("");
            }

            rsAlumno.close();
            psAlumno.close();
        }

        rsBloqueado.close();
        psBloqueado.close();
        conexion.close();

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "La boleta debe ser un número entero.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_IngresabolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String bol = boleta.getText();
    String nom = alumno.getText();
    String grp = grupo.getText();

    if (bol.isEmpty() || nom.isEmpty() || grp.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Primero busca un alumno válido.");
        return;
    }

    BloqCredencialSeg bs = new BloqCredencialSeg(bol, nom, grp);

    int ancho = 470;
    int alto = 200;
    int x = (content.getWidth() - ancho) / 2;
    int y = (content.getHeight() - alto) / 2;

    bs.setSize(ancho, alto);
    content.removeAll();
    content.add(bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, ancho, alto));
    content.revalidate();
    content.repaint();    }//GEN-LAST:event_jButton1ActionPerformed

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
        BloqCredencial1 ventana = new BloqCredencial1();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ingresabol;
    private javax.swing.JTextField alumno;
    private javax.swing.JTextField boleta;
    private javax.swing.JPanel content;
    private javax.swing.JTextField grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
