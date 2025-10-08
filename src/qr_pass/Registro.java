/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qr_pass;

import java.sql.Time;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Registro extends javax.swing.JFrame {

    private javax.swing.Timer limpiarTimer;

    public Registro() {
        
        initComponents();
        
        
        
        JPopupMenu popupMenu = new JPopupMenu();

    JMenuItem opcion1 = new JMenuItem("Registro manual/automático");
    opcion1.addActionListener(e -> {
        Registro ventana = new Registro();
        ventana.setVisible(true);
        Registro.this.dispose();
    });
    
    JMenuItem opcion2 = new JMenuItem("Buscar alumno");
    opcion2.addActionListener(e -> {
        BuscarAlumno ventana = new BuscarAlumno();
        ventana.setVisible(true);
        Registro.this.dispose();
    });
    
    JMenuItem opcion3 = new JMenuItem("Reportar credencial");
    opcion3.addActionListener(e -> {
        BloqCredencial panel = new BloqCredencial();
        JFrame frame = new JFrame("Reportar credencial");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Registro.this.dispose();
    });
    
    JMenuItem opcion4 = new JMenuItem("Incidencias");
    opcion4.addActionListener(e -> {
        Incidencias ventana = new Incidencias();
        ventana.setVisible(true);
        Registro.this.dispose();
    });
    
    JMenuItem opcion5 = new JMenuItem("Guardar");
    opcion5.addActionListener(e -> {
        DescargarBase ventana = new DescargarBase();
        ventana.setVisible(true);
        Registro.this.dispose();
    });

    popupMenu.add(opcion1);
    popupMenu.add(opcion2);
    popupMenu.add(opcion3);
    popupMenu.add(opcion4);
    popupMenu.add(opcion5);
    
    jButton1.addActionListener(e -> {
    
    popupMenu.show(jButton1, 0, jButton1.getHeight());
})
            ;
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/Menu.png"));
    jButton1.setIcon(icono);
    jButton1.setText("");
        
        
        setLocationRelativeTo(null);
        ButtonGroup puerta = new ButtonGroup();
        puerta.add(Mar);
        puerta.add(Mex);
        
        ButtonGroup tipo = new ButtonGroup();
        tipo.add(Entrada);
        tipo.add(Salida);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Grupo = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        boleta = new javax.swing.JEditorPane();
        Circulo = new javax.swing.JPanel();
        Registro = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Horario = new javax.swing.JEditorPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Mex = new javax.swing.JRadioButton();
        Mar = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Entrada = new javax.swing.JRadioButton();
        Salida = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Retardos = new javax.swing.JTextField();
        SinCred = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Entermanu(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel1.setText("Registro por QR");

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel2.setText("Registro Manual");

        Grupo.setEditable(false);
        jScrollPane2.setViewportView(Grupo);

        boleta.setEditable(false);
        jScrollPane3.setViewportView(boleta);

        Registro.setEditable(false);

        javax.swing.GroupLayout CirculoLayout = new javax.swing.GroupLayout(Circulo);
        Circulo.setLayout(CirculoLayout);
        CirculoLayout.setHorizontalGroup(
            CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CirculoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CirculoLayout.setVerticalGroup(
            CirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CirculoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Horario.setEditable(false);
        jScrollPane4.setViewportView(Horario);

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel4.setText("Boleta");

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel5.setText("Grupo");

        jLabel6.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel6.setText("Horario");

        Nombre.setEditable(false);

        jLabel7.setText("Puerta de ingreso");

        Mex.setText("México-Tacuba");

        Mar.setText("Mar-Mediterraneo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(88, 88, 88))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mex))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel8.setText("Tipo");

        Entrada.setText("Entrada");

        Salida.setText("Salida");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Salida)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(88, 88, 88))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrada))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel9.setText("Retardos");

        jLabel10.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel10.setText("Sin credencial");

        Retardos.setEditable(false);
        Retardos.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N

        SinCred.setEditable(false);
        SinCred.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(102, 0, 51));

        jButton1.setText("jButton1");

        jLabel11.setFont(new java.awt.Font("Oswald", 0, 48)); // NOI18N
        jLabel11.setText("Registro de alumnos");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoqr (4).png"))); // NOI18N
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(jScrollPane4)
                                .addComponent(jScrollPane3)
                                .addComponent(Nombre)
                                .addComponent(txt1)
                                .addComponent(jLabel1)
                                .addComponent(txt2))
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Retardos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SinCred, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Retardos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(SinCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Mex.isSelected() && !Mar.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Ninguna puerta seleccionada");
            return;
            }
 
            if (!Entrada.isSelected() && !Salida.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Sin tipo de registro seleccionado");
            return;
            }

            String link = txt1.getText();
            String[] partes = link.split("=");

            if (partes.length <= 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Formato de enlace inválido");
                return;
            }

            String resultado = partes[1];
            try {
                int Boleta = Integer.parseInt(resultado);
                Registro(Boleta);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
            }
        }
    }//GEN-LAST:event_Enter

    private void Entermanu(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entermanu
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Mex.isSelected() && !Mar.isSelected()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Puerta no seleccionada");
                return;
            }

            if (!Entrada.isSelected() && !Salida.isSelected()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Sin tipo de registro seleccionado");
                return;
            }
    
            try {
                String boleta_str = txt2.getText();
                int Boleta = Integer.parseInt(boleta_str);
                RegistroMan(Boleta);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingrese solo números");
            }
}

    }//GEN-LAST:event_Entermanu

public void Registro(int Boleta) {
    if (limpiarTimer != null && limpiarTimer.isRunning()) {
        limpiarTimer.stop();
    }
    
    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();
    
    if(Entrada.isSelected()){
     
    String query = "SELECT * FROM Alumnos WHERE boleta = ?";
    try (PreparedStatement pst = con.prepareStatement(query)) {
        pst.setInt(1, Boleta);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            Nombre.setText(rs.getString("nombre"));
            Grupo.setText(rs.getString("grupo"));
            String grupo = Grupo.getText();
            int u = rs.getInt("boleta");
            boleta.setText(String.valueOf(u));
            int ret = rs.getInt("retardos");
            int sin = rs.getInt("sin_credencial");
            boolean bloqueado = rs.getBoolean("bloqueado");
            boolean puertaAbierta = rs.getBoolean("puerta_abierta");
            SinCred.setText(String.valueOf(sin));
            

            if (bloqueado) {
                Registro.setText("Boleta bloqueada");
                Circulo.setBackground(Color.red);
                return;
            }
            
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            LocalTime horaActual = fechaHoraActual.toLocalTime();
            DayOfWeek diaSemana = fechaHoraActual.getDayOfWeek();

            if (!grupo.isEmpty()) {
                //String dia = diaSemana.toString();
                String dia = "Friday";
                String queryHorario = "SELECT " + dia + ", " + dia + "_Salida FROM Horario WHERE boleta = ?";

                try (PreparedStatement pstHorario = con.prepareStatement(queryHorario)) {
                    pstHorario.setInt(1, u);
                    ResultSet rsHorario = pstHorario.executeQuery();

                    if (rsHorario.next()) {
                        Time horaEntrada = rsHorario.getTime(1);
                        Time horaSalida = rsHorario.getTime(2);
                        LocalTime entradaPermitida = horaEntrada.toLocalTime();
                        LocalTime salidaPermitida = horaSalida.toLocalTime();
                        
                        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                        String horarioTexto = entradaPermitida.format(timeFormat) + " - " + salidaPermitida.format(timeFormat);
                        Horario.setText(horarioTexto);

                        String tipoRegistro = "Entrada";
                        int Tret = ret + 1;

                        if (horaActual.isBefore(entradaPermitida.plusMinutes(10))) {
                            tipoRegistro = "Entrada exitosa";
                        } else {
                                String query3 = "UPDATE Alumnos SET Retardos = ? WHERE Boleta = ?";
                                try(PreparedStatement pstret = con.prepareStatement(query3)){
                                    pstret.setInt(1, Tret);
                                    pstret.setInt(2, Boleta);
                                    pstret.executeUpdate();
                                    
                                    tipoRegistro = "Retardo";
                                } catch (SQLException e) {
                                    javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
                                }
                        }

                        Retardos.setText(String.valueOf(Tret));
                        
                        String insertQuery = "INSERT INTO Registros (boleta, nombre, grupo, puerta, fecha, tipo) VALUES (?, ?, ?, ?, ?, ?)";
                        try (PreparedStatement pstInsert = con.prepareStatement(insertQuery)) {
                            pstInsert.setInt(1, Boleta);
                            pstInsert.setString(2, rs.getString("Nombre"));
                            pstInsert.setString(3, rs.getString("Grupo"));
                            
                            if(Mar.isSelected()){
                                pstInsert.setString(4, "MarMediterraneo");
                            }
                            else{
                                pstInsert.setString(4, "Mexico-Tacuba");
                            }
                            
                            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                            pstInsert.setString(5, fechaHoraActual.format(formato));
                            pstInsert.setString(6, tipoRegistro);

                            pstInsert.executeUpdate();
                            Registro.setText("Registro exitoso");
                            Circulo.setBackground(Color.GREEN);
                            
                            limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
                            limpiarTimer.setRepeats(false); // solo se ejecuta una vez
                            limpiarTimer.start();
                            
                            limpiarTimer = new javax.swing.Timer(5000, e -> limpiarCampos());
                            limpiarTimer.setRepeats(false);
                            limpiarTimer.start();
                        }
                    }
                } catch (SQLException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
                }
            }
        } else {
            Circulo.setBackground(Color.GRAY);
            Registro.setText("Alumno no inscrito");
            
            limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
            limpiarTimer.setRepeats(false); // solo se ejecuta una vez
            limpiarTimer.start();
        }
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
    }
    }
    else{
        String query = "SELECT * FROM Alumnos WHERE boleta = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, Boleta);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Nombre.setText(rs.getString("Nombre"));
                Grupo.setText(rs.getString("Grupo"));
                int u = rs.getInt("boleta");
                boleta.setText(String.valueOf(u));

                String grupo = Grupo.getText();
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                LocalTime horaActual = fechaHoraActual.toLocalTime();
                DayOfWeek diaSemana = fechaHoraActual.getDayOfWeek();

                if (!grupo.isEmpty()) {
                    String dia = "Friday";
                    //String dia = diaSemana.toString();
                    String queryHorario = "SELECT " + dia + ", " + dia + "_Salida FROM Horario WHERE Boleta = ?";

                try (PreparedStatement pstHorario = con.prepareStatement(queryHorario)) {
                    pstHorario.setInt(1, u);
                    ResultSet rsHorario = pstHorario.executeQuery();

                    if (rsHorario.next()) {
                        Time horaEntrada = rsHorario.getTime(1);
                        Time horaSalida = rsHorario.getTime(2);
                        LocalTime entradaPermitida = horaEntrada.toLocalTime();
                        LocalTime salidaPermitida = horaSalida.toLocalTime();
                        
                        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                        String horarioTexto = entradaPermitida.format(timeFormat) + " - " + salidaPermitida.format(timeFormat);
                        Horario.setText(horarioTexto);

                        String insertQuery = "INSERT INTO Registros (boleta, nombre, grupo, puerta, fecha, tipo) VALUES (?, ?, ?, ?, ?, ?)";
                        try (PreparedStatement pstInsert = con.prepareStatement(insertQuery)) {
                            pstInsert.setInt(1, Boleta);
                            pstInsert.setString(2, rs.getString("Nombre"));
                            pstInsert.setString(3, rs.getString("Grupo"));
                            
                            if(Mar.isSelected()){
                                pstInsert.setString(4, "MarMediterraneo");
                            }
                            else{
                                pstInsert.setString(4, "Mexico-Tacuba");
                            }
                            
                            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                            pstInsert.setString(5, fechaHoraActual.format(formato));
                            pstInsert.setString(6, "Salida");

                            pstInsert.executeUpdate();
                            Registro.setText("Salida exitosa");
                            Circulo.setBackground(Color.GREEN);
                            
                            limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
                            limpiarTimer.setRepeats(false);
                            limpiarTimer.start();
            
                            limpiarTimer = new javax.swing.Timer(5000, e -> limpiarCampos());
                            limpiarTimer.setRepeats(false);
                            limpiarTimer.start();
                        }
                    }
                } catch (SQLException e) {
                }
            }
        } else {
            Circulo.setBackground(Color.GRAY);
            Registro.setText("Alumno no inscrito");
            
            limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
            limpiarTimer.setRepeats(false);
            limpiarTimer.start();
        }
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
    }
        
    }
}

public void limpiarCampos() {
    Nombre.setText("");
    Grupo.setText("");
    boleta.setText("");
    Horario.setText("");
    Registro.setText("");
    Retardos.setText("");
    SinCred.setText("");
    Circulo.setBackground(Color.GRAY);
}

public void RegistroMan(int Boleta) {
    if (limpiarTimer != null && limpiarTimer.isRunning()) {
        limpiarTimer.stop();
    }

    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();

    if (Entrada.isSelected()) {
        String query = "SELECT * FROM Alumnos WHERE boleta = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, Boleta);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Nombre.setText(rs.getString("Nombre"));
                Grupo.setText(rs.getString("Grupo"));
                int u = rs.getInt("boleta");
                boleta.setText(String.valueOf(u));
                int ret = rs.getInt("Retardos");
                int sin = rs.getInt("Sin_credencial");
                int Tsin = sin + 1;
                boolean bloqueado = rs.getBoolean("bloqueado");
                boolean puertaAbierta = rs.getBoolean("puerta_abierta");
                
                if (bloqueado) {
                    Registro.setText("Boleta bloqueada");
                    Circulo.setBackground(Color.red);
                    return;
                }

                if (Tsin < 4) {
                    String grupo = Grupo.getText();
                    LocalDateTime fechaHoraActual = LocalDateTime.now();
                    LocalTime horaActual = fechaHoraActual.toLocalTime();
                    DayOfWeek diaSemana = fechaHoraActual.getDayOfWeek();

                    String query2 = "UPDATE Alumnos SET Sin_credencial = ? WHERE Boleta = ?";
                    try (PreparedStatement pstsin = con.prepareStatement(query2)) {
                        pstsin.setInt(1, Tsin);
                        pstsin.setInt(2, Boleta);
                        pstsin.executeUpdate();
                    } catch (SQLException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
                    }

                    SinCred.setText(String.valueOf(Tsin));

                    if (!grupo.isEmpty()) {
                        String dia = "Friday";
                        //String dia = diaSemana.toString();
                        String queryHorario = "SELECT " + dia + ", " + dia + "_Salida FROM Horario WHERE boleta = ?";

                        try (PreparedStatement pstHorario = con.prepareStatement(queryHorario)) {
                            pstHorario.setInt(1, u);
                            ResultSet rsHorario = pstHorario.executeQuery();

                            if (rsHorario.next()) {
                                Time horaEntrada = rsHorario.getTime(1);
                                Time horaSalida = rsHorario.getTime(2);
                                LocalTime entradaPermitida = horaEntrada.toLocalTime();
                                LocalTime salidaPermitida = horaSalida.toLocalTime();

                                DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                                String horarioTexto = entradaPermitida.format(timeFormat) + " - " + salidaPermitida.format(timeFormat);
                                Horario.setText(horarioTexto);

                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                String insertQuery = "INSERT INTO Registros (boleta, nombre, grupo, puerta, fecha, tipo) VALUES (?, ?, ?, ?, ?, ?)";

                                try (PreparedStatement pstInsert = con.prepareStatement(insertQuery)) {
                                    pstInsert.setInt(1, Boleta);
                                    pstInsert.setString(2, rs.getString("Nombre"));
                                    pstInsert.setString(3, rs.getString("Grupo"));
                                    
                                    if(Mar.isSelected()){
                                        pstInsert.setString(4, "MarMediterraneo");
                                    }
                                    else{
                                        pstInsert.setString(4, "Mexico-Tacuba");
                                    }
                                    
                                    pstInsert.setString(5, fechaHoraActual.format(formato));
                                    pstInsert.setString(6, "Sin credencial");
                                    pstInsert.executeUpdate();
                                }

                                if (!horaActual.isBefore(entradaPermitida.plusMinutes(10))) {
                                    int Tret = ret + 1;

                                    String query3 = "UPDATE Alumnos SET Retardos = ? WHERE Boleta = ?";
                                    try (PreparedStatement pstret = con.prepareStatement(query3)) {
                                        pstret.setInt(1, Tret);
                                        pstret.setInt(2, Boleta);
                                        pstret.executeUpdate();
                                    };

                                    Retardos.setText(String.valueOf(Tret));

                                    try (PreparedStatement pstInsertRet = con.prepareStatement(insertQuery)) {
                                        pstInsertRet.setInt(1, Boleta);
                                        pstInsertRet.setString(2, rs.getString("Nombre"));
                                        pstInsertRet.setString(3, rs.getString("Grupo"));
                                        
                                        String puerta = "";
                                        
                                        if(Mar.isSelected()){
                                            puerta = "MarMediterraneo";
                                        }else{
                                            puerta = "Mexico-Tacuba";
                                        }
                                        
                                        pstInsertRet.setString(4, puerta);
                                        pstInsertRet.setString(5, fechaHoraActual.format(formato));
                                        pstInsertRet.setString(6, "Retardo");
                                        pstInsertRet.executeUpdate();
                                    }
                                }
                                else{
                                    Retardos.setText(String.valueOf(ret));
                                }

                                Registro.setText("Registro con incidencia");
                                Circulo.setBackground(Color.RED);

                                limpiarTimer = new javax.swing.Timer(250, e -> txt2.setText(""));
                                limpiarTimer.setRepeats(false);
                                limpiarTimer.start();

                                limpiarTimer = new javax.swing.Timer(5000, e -> limpiarCampos());
                                limpiarTimer.setRepeats(false);
                                limpiarTimer.start();
                            }
                        } catch (SQLException e) {
                            javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
                        }
                    }
                } else {
                    int retardos = rs.getInt("Retardos");
                    int sinCredencial = rs.getInt("Sin_credencial");

                    Retardos.setText(String.valueOf(retardos));
                    SinCred.setText(String.valueOf(sinCredencial));
                    
                    String dia = "Friday"; 
                    // String dia = diaSemana.toString();
                    String queryHorario = "SELECT " + dia + ", " + dia + "_Salida FROM Horario WHERE boleta = ?";
            
                    try (PreparedStatement pstHorario = con.prepareStatement(queryHorario)) {
                        pstHorario.setInt(1, Boleta);
                        ResultSet rsHorario = pstHorario.executeQuery();

                        if (rsHorario.next()) {
                            Time horaEntrada = rsHorario.getTime(1);
                            Time horaSalida = rsHorario.getTime(2);
                            LocalTime entradaPermitida = horaEntrada.toLocalTime();
                            LocalTime salidaPermitida = horaSalida.toLocalTime();
    
                            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                            String horarioTexto = entradaPermitida.format(timeFormat) + " - " + salidaPermitida.format(timeFormat);
                            Horario.setText(horarioTexto);
                        }
                    } catch (SQLException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
                    }

                    limpiarTimer = new javax.swing.Timer(250, e -> txt2.setText(""));
                    limpiarTimer.setRepeats(false);
                    limpiarTimer.start();
    
                    limpiarTimer = new javax.swing.Timer(5000, e -> limpiarCampos());
                    limpiarTimer.setRepeats(false);
                    limpiarTimer.start();
                    
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "El Alumno alcanzó el limite de incidencias sin credencial");
                }
            } else {
                Circulo.setBackground(Color.GRAY);
                Registro.setText("Alumno no inscrito");

                limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
                limpiarTimer.setRepeats(false);
                limpiarTimer.start();
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    } else {
        String query = "SELECT * FROM Alumnos WHERE boleta = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, Boleta);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Nombre.setText(rs.getString("Nombre"));
                Grupo.setText(rs.getString("Grupo"));
                int u = rs.getInt("boleta");
                boleta.setText(String.valueOf(u));
                Retardos.setText(String.valueOf("Retardos"));
                SinCred.setText(String.valueOf("Sin_credencial"));

                String grupo = Grupo.getText();
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                LocalTime horaActual = fechaHoraActual.toLocalTime();
                DayOfWeek diaSemana = fechaHoraActual.getDayOfWeek();

                if (!grupo.isEmpty()) {
                    String dia = "Friday";
                    //String dia = diaSemana.toString();
                    String queryHorario = "SELECT " + dia + ", " + dia + "_Salida FROM Horario WHERE Boleta = ?";

                    try (PreparedStatement pstHorario = con.prepareStatement(queryHorario)) {
                        pstHorario.setInt(1, u);
                        ResultSet rsHorario = pstHorario.executeQuery();

                        if (rsHorario.next()) {
                            Time horaEntrada = rsHorario.getTime(1);
                            Time horaSalida = rsHorario.getTime(2);
                            LocalTime entradaPermitida = horaEntrada.toLocalTime();
                            LocalTime salidaPermitida = horaSalida.toLocalTime();

                            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                            String horarioTexto = entradaPermitida.format(timeFormat) + " - " + salidaPermitida.format(timeFormat);
                            Horario.setText(horarioTexto);

                            String insertQuery = "INSERT INTO Registros (boleta, nombre, grupo, puerta, fecha, tipo) VALUES (?, ?, ?, ?, ?, ?)";
                            try (PreparedStatement pstInsert = con.prepareStatement(insertQuery)) {
                                pstInsert.setInt(1, Boleta);
                                pstInsert.setString(2, rs.getString("Nombre"));
                                pstInsert.setString(3, rs.getString("Grupo"));
                                
                                if(Mar.isSelected()){
                                    pstInsert.setString(4, "MarMediterraneo");
                                }
                                else{
                                    pstInsert.setString(4, "Mexico-Tacuba");
                                }
                                
                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                pstInsert.setString(5, fechaHoraActual.format(formato));
                                pstInsert.setString(6, "Salida");
                                pstInsert.executeUpdate();

                                Registro.setText("Salida exitosa");
                                Circulo.setBackground(Color.GREEN);

                                limpiarTimer = new javax.swing.Timer(250, e -> txt2.setText(""));
                                limpiarTimer.setRepeats(false);
                                limpiarTimer.start();

                                limpiarTimer = new javax.swing.Timer(5000, e -> limpiarCampos());
                                limpiarTimer.setRepeats(false);
                                limpiarTimer.start();
                            }
                        }
                    } catch (SQLException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
                    }
                }
            } else {
                Circulo.setBackground(Color.GRAY);
                Registro.setText("Alumno no inscrito");

                limpiarTimer = new javax.swing.Timer(250, e -> txt1.setText(""));
                limpiarTimer.setRepeats(false);
                limpiarTimer.start();
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al consultar registros: " + e);
        }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Circulo;
    private javax.swing.JRadioButton Entrada;
    private javax.swing.JEditorPane Grupo;
    private javax.swing.JEditorPane Horario;
    private javax.swing.JRadioButton Mar;
    private javax.swing.JRadioButton Mex;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Registro;
    private javax.swing.JTextField Retardos;
    private javax.swing.JRadioButton Salida;
    private javax.swing.JTextField SinCred;
    private javax.swing.JEditorPane boleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
