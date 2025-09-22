
package qr_pass;

import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;


public class DesbloqCredencial extends javax.swing.JPanel {
    
public DesbloqCredencial(String boleta, String nombre, String grupo) {
    initComponents(); 
    
    
    this.boleta.setText(boleta); 
    this.alumno.setText(nombre);
    this.grupo.setText(grupo);
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 104));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMaximumSize(new java.awt.Dimension(800, 500));
        content.setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 104));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desbloquear credencial");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoqr (4).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 130));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/istockphoto-1387844564-170667a (1).jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Ingresar boleta");

        Ingresabol.setPreferredSize(new java.awt.Dimension(64, 26));
        Ingresabol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresabolActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 0, 0));
        jLabel5.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel5.setText("Boleta");

        jLabel6.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel6.setText("Alumno");

        jLabel7.setFont(new java.awt.Font("Oswald", 1, 24)); // NOI18N
        jLabel7.setText("Grupo");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cr7.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(255, 250));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Oswald", 1, 22)); // NOI18N
        jButton1.setText("Desbloquear credencial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ingresabol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boleta)
                            .addComponent(alumno)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7))
                            .addComponent(grupo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(127, 127, 127))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ingresabol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boleta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

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
    
    private void IngresabolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresabolActionPerformed
      
    }//GEN-LAST:event_IngresabolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                     
    String bol = boleta.getText();
    String nom = alumno.getText();
    String grp = grupo.getText();

    if (bol.isEmpty() || nom.isEmpty() || grp.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Primero busca un alumno bloqueado válido.");
        return;
    }

    DesbloqCredencialSeg ds = new DesbloqCredencialSeg(bol, nom, grp);

    int ancho = 470;
    int alto = 200;
    int x = (content.getWidth() - ancho) / 2;
    int y = (content.getHeight() - alto) / 2;

    ds.setSize(ancho, alto);
    content.removeAll();
    content.add(ds, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, ancho, alto));
    content.revalidate();
    content.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
