
package qr_pass;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


public class DescargarBase extends javax.swing.JFrame {

    
    
    public DescargarBase() {
        initComponents();
        
     
        
         JPopupMenu popupMenu = new JPopupMenu();

    JMenuItem opcion1 = new JMenuItem("Registro manual/automático");
    opcion1.addActionListener(e -> {
        Registro ventana = new Registro();
        ventana.setVisible(true);
        DescargarBase.this.dispose();
    });
    
    JMenuItem opcion2 = new JMenuItem("Buscar alumno");
    opcion2.addActionListener(e -> {
        BuscarAlumno ventana = new BuscarAlumno();
        ventana.setVisible(true);
        DescargarBase.this.dispose();
    });
    
    JMenuItem opcion3 = new JMenuItem("Reportar credencial");
    opcion3.addActionListener(e -> {
        BloqCredencial panel = new BloqCredencial();
        JFrame frame = new JFrame("Reportar credencial");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(800, 500); // o frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        DescargarBase.this.dispose();
    });
    
    JMenuItem opcion4 = new JMenuItem("Incidencias");
    opcion4.addActionListener(e -> {
        Incidencias ventana = new Incidencias();
        ventana.setVisible(true);
        DescargarBase.this.dispose();
    });
    
    JMenuItem opcion5 = new JMenuItem("Guardar");
    opcion5.addActionListener(e -> {
        DescargarBase ventana = new DescargarBase();
        ventana.setVisible(true);
        DescargarBase.this.dispose();
    });

    popupMenu.add(opcion1);
    popupMenu.add(opcion2);
    popupMenu.add(opcion3);
    popupMenu.add(opcion4);
    popupMenu.add(opcion5);
    
    jButton1.addActionListener(e -> {
    
    popupMenu.show(jButton1, 0, jButton1.getHeight());
    
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/Menu.png"));
    jButton1.setIcon(icono);
    jButton1.setText("");
    
})
            ;
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/Menu.png"));
    jButton1.setIcon(icono);
    jButton1.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnElegirCarpeta = new javax.swing.JButton();
        btnRespaldar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Content.setBackground(new java.awt.Color(255, 255, 255));

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Oswald Light", 0, 12)); // NOI18N
        txtRuta.setText("Ninguna carpeta seleccionada");
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        btnElegirCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Folder.png"))); // NOI18N
        btnElegirCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirCarpetaActionPerformed(evt);
            }
        });

        btnRespaldar.setFont(new java.awt.Font("Oswald Light", 0, 14)); // NOI18N
        btnRespaldar.setText("Descargar Respaldo");
        btnRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespaldarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oswald Light", 0, 15)); // NOI18N
        jLabel2.setText("<html>Seleccione la carpeta donde desea guardar el respaldo y presione 'Descargar Respaldo'<br>para guardar una copia de la base de datos.</html>");

        Header.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Respaldo de la Base de Datos ");

        jButton1.setText("jButton1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoqr (4).png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnElegirCarpeta))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnRespaldar)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElegirCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnRespaldar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespaldarActionPerformed
        String destino = txtRuta.getText();
    if (destino.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Primero selecciona una ubicación para guardar la base de datos.");
        return;
    }

    // Ruta del mysql dump
    String mysqldumpPath = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe"; // Cambia esta ruta
    String usuario = "root"; // Tu usuario de MySQL
    String contrasena = "IPNMYSQLJabs_116"; // Tu contraseña de MySQL
    String baseDeDatos = "prueba"; // Nombre de la base de datos


    File archivoDestino = new File(destino + File.separator + "respaldo.sql");

  
    String comando = String.format("\"%s\" -u %s -p%s %s -r \"%s\"", mysqldumpPath, usuario, contrasena, baseDeDatos, archivoDestino.getAbsolutePath());

    try {
        ProcessBuilder processBuilder = new ProcessBuilder(comando.split(" "));
        processBuilder.redirectErrorStream(true); 
        Process process = processBuilder.start();

        
        process.waitFor();

        JOptionPane.showMessageDialog(this, "Base de datos respaldada exitosamente en: " + archivoDestino.getAbsolutePath());
    } catch (IOException | InterruptedException e) {
        JOptionPane.showMessageDialog(this, "Error al realizar el respaldo de la base de datos: " + e.getMessage());
    }
      

    }//GEN-LAST:event_btnRespaldarActionPerformed

    private void btnElegirCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirCarpetaActionPerformed
    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona una carpeta para guardar el respaldo");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File carpeta = fileChooser.getSelectedFile();
            String rutaSeleccionada = carpeta.getAbsolutePath();
            txtRuta.setText(rutaSeleccionada);  
            txtRuta.setEditable(false);
           }    

    }//GEN-LAST:event_btnElegirCarpetaActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
    
    txtRuta.setEditable(false);    
        
    }//GEN-LAST:event_txtRutaActionPerformed
           
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnElegirCarpeta;
    private javax.swing.JButton btnRespaldar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
