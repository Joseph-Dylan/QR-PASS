package qr_pass;


import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;


public class Incidencias extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    
   public Incidencias() {
        initComponents();
        
        
         JPopupMenu popupMenu = new JPopupMenu();

    JMenuItem opcion1 = new JMenuItem("Registro manual/automático");
    opcion1.addActionListener(e -> {
        Registro ventana = new Registro();
        ventana.setVisible(true);
        Incidencias.this.dispose();
    });
    
    JMenuItem opcion2 = new JMenuItem("Buscar alumno");
    opcion2.addActionListener(e -> {
        BuscarAlumno ventana = new BuscarAlumno();
        ventana.setVisible(true);
        Incidencias.this.dispose();
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

        Incidencias.this.dispose();
    });
    
    JMenuItem opcion4 = new JMenuItem("Incidencias");
    opcion4.addActionListener(e -> {
        Incidencias ventana = new Incidencias();
        ventana.setVisible(true);
        Incidencias.this.dispose();
    });
    
    JMenuItem opcion5 = new JMenuItem("Guardar");
    opcion5.addActionListener(e -> {
        DescargarBase ventana = new DescargarBase();
        ventana.setVisible(true);
        Incidencias.this.dispose();
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
    
});
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/Menu.png"));
    jButton1.setIcon(icono);
    jButton1.setText("");
        
        setLocationRelativeTo(null);
        
        jComboBox1.setEditable(false);
        
        String ids [] = {"Puerta","Fecha","Tipo"};
        model.setColumnIdentifiers(ids);
        tabla.setModel(model);
        
        tabla.setDefaultEditor(Object.class, null);
        
        //Texto
        justselec.setText("<html><center>Justificar<br>selección</center></html>");
        justret.setText("<html><center>Justificar<br>retardos</center></html>");
        justsin.setText("<html><center>Justificar<br>sin credencial</center></html>");
        justall.setText("<html><center>Justificar<br>todo</center></html>");
        
        //Opciones del JComboBox
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Selecciona una justificación...",
            "El tutor se presentó para tratar la situación en la SSEIS",
            "El alumno se presentó en la SSEIS para tratar la situación",
            "Error en el registro"
        }));
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        justselec = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        grupo = new javax.swing.JTextField();
        boletatxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        justret = new javax.swing.JButton();
        justsin = new javax.swing.JButton();
        justall = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Puerta", "Fecha", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(125);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(125);
            tabla.getColumnModel().getColumn(0).setMaxWidth(125);
            tabla.getColumnModel().getColumn(1).setMinWidth(125);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(125);
            tabla.getColumnModel().getColumn(1).setMaxWidth(125);
            tabla.getColumnModel().getColumn(2).setMinWidth(125);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(125);
            tabla.getColumnModel().getColumn(2).setMaxWidth(125);
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        justselec.setText("justselec");
        justselec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jusselec(evt);
            }
        });

        nombre.setEditable(false);

        grupo.setEditable(false);

        boletatxt.setEditable(false);

        jLabel1.setText("Boleta");

        jLabel2.setText("Grupo");

        jLabel3.setText("Alumno");

        justret.setText("justret");
        justret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justret(evt);
            }
        });

        justsin.setText("justsin");
        justsin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justsin(evt);
            }
        });

        justall.setText("justall");
        justall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justall(evt);
            }
        });

        jLabel4.setText("Ingrese boleta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(grupo)
                        .addComponent(nombre)
                        .addComponent(boletatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(justselec)
                        .addGap(18, 18, 18)
                        .addComponent(justret)
                        .addGap(27, 27, 27)
                        .addComponent(justsin)
                        .addGap(18, 18, 18)
                        .addComponent(justall)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boletatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(justret)
                    .addComponent(justselec)
                    .addComponent(justall)
                    .addComponent(justsin))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 790, 540));

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        jButton1.setText("jButton1");

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 48)); // NOI18N
        jLabel5.setText("Incidencias");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoqr (4).png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                int boleta = Integer.parseInt(txt1.getText());
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
                txt1.setText("");
                mostrar(boleta);
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingrese solo números");
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + ex.getMessage());
        }
        }
    }//GEN-LAST:event_Enter

    private void Jusselec(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jusselec
        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.");
            return;
        }

        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex <= 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una justificación válida.");
            return;
        }

        String justificacion = jComboBox1.getSelectedItem().toString();
        int boleta = Integer.parseInt(boletatxt.getText());
        String fecha = tabla.getValueAt(fila, 1).toString();
        String tipo = tabla.getValueAt(fila, 2).toString();

        DataBaseConection DBC = new DataBaseConection();
        Connection con = DBC.conectar();

        try {
            con.setAutoCommit(false);

            PreparedStatement insert = con.prepareStatement(
            "INSERT INTO Reportes (Boleta, Fecha, Motivo, Solucion) VALUES (?, ?, ?, ?)");
            insert.setInt(1, boleta);
            insert.setString(2, fecha);
            insert.setString(3, tipo);
            insert.setString(4, justificacion);
            insert.executeUpdate();

            PreparedStatement delete = con.prepareStatement(
            "DELETE FROM Registros WHERE Boleta = ? AND Fecha = ? AND Tipo = ?");
            delete.setInt(1, boleta);
            delete.setString(2, fecha);
            delete.setString(3, tipo);
            delete.executeUpdate();

            PreparedStatement update = con.prepareStatement(
            tipo.equalsIgnoreCase("Sin credencial")
            ? "UPDATE Alumnos SET Sin_credencial = GREATEST(0, Sin_credencial - 1) WHERE Boleta = ?"
            : "UPDATE Alumnos SET Retardos = GREATEST(0, Retardos - 1) WHERE Boleta = ?");
            update.setInt(1, boleta);
            update.executeUpdate();

            con.commit();

            JOptionPane.showMessageDialog(this, "Justificación registrada correctamente.");
            jComboBox1.setSelectedIndex(0);
            mostrar(boleta);

        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al hacer rollback: " + ex);
            }
            JOptionPane.showMessageDialog(this, "Error al justificar: " + e);
        }
    }//GEN-LAST:event_Jusselec

    private void justret(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justret
        int boleta;

    try {
        boleta = Integer.parseInt(boletatxt.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Boleta inválida.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de justificar todos los retardos?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String justificacion = jComboBox1.getSelectedItem().toString();
    int selectedIndex = jComboBox1.getSelectedIndex();
    if (selectedIndex <= 0) {
        JOptionPane.showMessageDialog(this, "Selecciona una justificación válida.");
        return;
    }

    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();

    try {
        con.setAutoCommit(false);

        String selectSQL = "SELECT Fecha FROM Registros WHERE Boleta = ? AND Tipo = ?";
        try (PreparedStatement pst = con.prepareStatement(selectSQL)) {
            pst.setInt(1, boleta);
            pst.setString(2, "Retardo");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String fecha = rs.getString("Fecha");

                try (PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO Reportes (Boleta, Fecha, Motivo, Solucion) VALUES (?, ?, ?, ?)")) {
                    insert.setInt(1, boleta);
                    insert.setString(2, fecha);
                    insert.setString(3, "Retardo");
                    insert.setString(4, justificacion);
                    insert.executeUpdate();
                }
            }
        }

        try (PreparedStatement delete = con.prepareStatement(
            "DELETE FROM Registros WHERE Boleta = ? AND Tipo = ?")) {
            delete.setInt(1, boleta);
            delete.setString(2, "Retardo");
            delete.executeUpdate();
        }

        try (PreparedStatement update = con.prepareStatement(
            "UPDATE Alumnos SET Retardos = 0 WHERE Boleta = ?")) {
            update.setInt(1, boleta);
            update.executeUpdate();
        }

        con.commit();

        JOptionPane.showMessageDialog(this, "Retardos justificados correctamente.");
        jComboBox1.setSelectedIndex(0);
        mostrar(boleta);

    } catch (SQLException e) {
        try {
            con.rollback();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al hacer rollback: " + ex);
        }
        JOptionPane.showMessageDialog(this, "Error al justificar retardos: " + e);
    }
    }//GEN-LAST:event_justret

    private void justsin(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justsin
            int boleta;

    try {
        boleta = Integer.parseInt(boletatxt.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Boleta inválida.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de justificar todas las incidencias sin credencial?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String justificacion = jComboBox1.getSelectedItem().toString();
    int selectedIndex = jComboBox1.getSelectedIndex();
    if (selectedIndex <= 0) {
        JOptionPane.showMessageDialog(this, "Selecciona una justificación válida.");
        return;
    }

    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();

    try {
        con.setAutoCommit(false);

        String selectSQL = "SELECT Fecha FROM Registros WHERE Boleta = ? AND Tipo = ?";
        try (PreparedStatement pst = con.prepareStatement(selectSQL)) {
            pst.setInt(1, boleta);
            pst.setString(2, "Sin credencial");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String fecha = rs.getString("Fecha");

                try (PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO Reportes (Boleta, Fecha, Motivo, Solucion) VALUES (?, ?, ?, ?)")) {
                    insert.setInt(1, boleta);
                    insert.setString(2, fecha);
                    insert.setString(3, "Sin credencial");
                    insert.setString(4, justificacion);
                    insert.executeUpdate();
                }
            }
        }

        try (PreparedStatement delete = con.prepareStatement(
            "DELETE FROM Registros WHERE Boleta = ? AND Tipo = ?")) {
            delete.setInt(1, boleta);
            delete.setString(2, "Sin credencial");
            delete.executeUpdate();
        }

        try (PreparedStatement update = con.prepareStatement(
            "UPDATE Alumnos SET Sin_credencial = 0 WHERE Boleta = ?")) {
            update.setInt(1, boleta);
            update.executeUpdate();
        }

        con.commit();

        JOptionPane.showMessageDialog(this, "Incidencias sin credencial justificados correctamente.");
        jComboBox1.setSelectedIndex(0);
        mostrar(boleta);

    } catch (SQLException e) {
        try {
            con.rollback();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al hacer rollback: " + ex);
        }
        JOptionPane.showMessageDialog(this, "Error al justificar retardos: " + e);
    }
    }//GEN-LAST:event_justsin

    private void justall(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justall
        int boleta = Integer.parseInt(boletatxt.getText());

    int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de justificar todos los registros?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    int selectedIndex = jComboBox1.getSelectedIndex();
    if (selectedIndex <= 0) {
        JOptionPane.showMessageDialog(this, "Selecciona una justificación válida.");
        return;
    }

    String justificacion = jComboBox1.getSelectedItem().toString();
    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();

    try {
        con.setAutoCommit(false);

        String selectSQL = "SELECT Fecha, Tipo FROM Registros WHERE Boleta = ? AND (Tipo = 'Retardo' OR Tipo = 'Sin credencial')";
        try (PreparedStatement pst = con.prepareStatement(selectSQL)) {
            pst.setInt(1, boleta);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String fecha = rs.getString("Fecha");
                String tipo = rs.getString("Tipo");

                try (PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO Reportes (Boleta, Fecha, Motivo, Solucion) VALUES (?, ?, ?, ?)")) {
                    insert.setInt(1, boleta);
                    insert.setString(2, fecha);
                    insert.setString(3, tipo);
                    insert.setString(4, justificacion);
                    insert.executeUpdate();
                }
            }
        }

        try (PreparedStatement delete = con.prepareStatement(
            "DELETE FROM Registros WHERE Boleta = ? AND (Tipo = ? OR Tipo = ?)")) {
            delete.setInt(1, boleta);
            delete.setString(2, "Retardo");
            delete.setString(3, "Sin credencial");
            delete.executeUpdate();
        }

        try (PreparedStatement updateRetardos = con.prepareStatement(
            "UPDATE Alumnos SET Retardos = 0 WHERE Boleta = ?")) {
            updateRetardos.setInt(1, boleta);
            updateRetardos.executeUpdate();
        }

        try (PreparedStatement updateSinCred = con.prepareStatement(
            "UPDATE Alumnos SET Sin_credencial = 0 WHERE Boleta = ?")) {
            updateSinCred.setInt(1, boleta);
            updateSinCred.executeUpdate();
        }

        con.commit();

        JOptionPane.showMessageDialog(this, "Todos los registros fueron justificados correctamente.");
        jComboBox1.setSelectedIndex(0);
        mostrar(boleta);

    } catch (SQLException e) {
        try {
            con.rollback();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al hacer rollback: " + ex);
        }
        JOptionPane.showMessageDialog(this, "Error al justificar todos los registros: " + e);
    }
    }//GEN-LAST:event_justall

    public void mostrar(int boleta) throws SQLException {
    DataBaseConection DBC = new DataBaseConection();
    Connection con = DBC.conectar();
    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    
    String sqlAlumno = "SELECT Nombre, Grupo FROM Alumnos WHERE Boleta = ?";
    try (PreparedStatement pstAlumno = con.prepareStatement(sqlAlumno)) {
        pstAlumno.setInt(1, boleta);
        ResultSet rsAlumno = pstAlumno.executeQuery();
        if (rsAlumno.next()) {
            nombre.setText(rsAlumno.getString("Nombre"));
            grupo.setText(rsAlumno.getString("Grupo"));
            boletatxt.setText(String.valueOf(boleta));
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la boleta en la base de datos.");
            return;
        }
    }

    String sql = "SELECT Puerta, Fecha, Tipo FROM Registros WHERE Boleta = ? AND (Tipo LIKE ? OR Tipo LIKE ?)";

    boolean hayResultados = false;

    try (PreparedStatement pst = con.prepareStatement(sql)) {
        pst.setInt(1, boleta);
        pst.setString(2, "Sin credencial");
        pst.setString(3, "Retardo");

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String[] datos = new String[3];
            datos[0] = rs.getString("Puerta");
            datos[1] = rs.getString("Fecha");
            datos[2] = rs.getString("Tipo");
            model.addRow(datos);
            hayResultados = true;
        }

        if (!hayResultados) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros para esa boleta.");
        }
        resizeColumnWidth();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar registros: " + e.toString());
    }
}  

    public void resizeColumnWidth() {
    final TableColumnModel columnModel = tabla.getColumnModel();
    for (int column = 0; column < tabla.getColumnCount(); column++) {
        int width = 15;
        for (int row = 0; row < tabla.getRowCount(); row++) {
            TableCellRenderer renderer = tabla.getCellRenderer(row, column);
            Component comp = tabla.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        if(width > 300)
            width=300;
        columnModel.getColumn(column).setPreferredWidth(width);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boletatxt;
    private javax.swing.JTextField grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton justall;
    private javax.swing.JButton justret;
    private javax.swing.JButton justselec;
    private javax.swing.JButton justsin;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
