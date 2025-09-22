package qr_pass;

public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        redondo1 = new qr_pass.Redondo();
        jLabel1 = new javax.swing.JLabel();
        redondo2 = new qr_pass.Redondo();
        jLabel2 = new javax.swing.JLabel();
        redondo3 = new qr_pass.Redondo();
        jLabel5 = new javax.swing.JLabel();
        redondo5 = new qr_pass.Redondo();
        jLabel7 = new javax.swing.JLabel();
        redondo4 = new qr_pass.Redondo();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Oswald", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(192, 79, 23));
        jLabel3.setText("QR PASS");
        content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 180, 90));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        content.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 20));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        content.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 770, -1));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        content.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 10, 500));

        jPanel4.setBackground(new java.awt.Color(51, 0, 0));
        jPanel4.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        content.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/037169f2-4df4-48b6-b4ee-1dbadfdbe24c-removebg-preview (2).png"))); // NOI18N
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, 90));

        redondo1.setBackground(new java.awt.Color(102, 0, 51));
        redondo1.setToolTipText("");
        redondo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Registro(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");

        javax.swing.GroupLayout redondo1Layout = new javax.swing.GroupLayout(redondo1);
        redondo1.setLayout(redondo1Layout);
        redondo1Layout.setHorizontalGroup(
            redondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        redondo1Layout.setVerticalGroup(
            redondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        content.add(redondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 250, 60));

        redondo2.setBackground(new java.awt.Color(102, 0, 51));
        redondo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incidencias(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Incidencias");

        javax.swing.GroupLayout redondo2Layout = new javax.swing.GroupLayout(redondo2);
        redondo2.setLayout(redondo2Layout);
        redondo2Layout.setHorizontalGroup(
            redondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        redondo2Layout.setVerticalGroup(
            redondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        content.add(redondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 60));

        redondo3.setBackground(new java.awt.Color(102, 0, 51));
        redondo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Busc(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar alumno");

        javax.swing.GroupLayout redondo3Layout = new javax.swing.GroupLayout(redondo3);
        redondo3.setLayout(redondo3Layout);
        redondo3Layout.setHorizontalGroup(
            redondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redondo3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(61, 61, 61))
        );
        redondo3Layout.setVerticalGroup(
            redondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        content.add(redondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 250, -1));

        redondo5.setBackground(new java.awt.Color(102, 0, 51));
        redondo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Down(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descargar base de datos");

        javax.swing.GroupLayout redondo5Layout = new javax.swing.GroupLayout(redondo5);
        redondo5.setLayout(redondo5Layout);
        redondo5Layout.setHorizontalGroup(
            redondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        redondo5Layout.setVerticalGroup(
            redondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        content.add(redondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, -1));

        redondo4.setBackground(new java.awt.Color(102, 0, 51));
        redondo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bloq(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bloquear credencial");

        javax.swing.GroupLayout redondo4Layout = new javax.swing.GroupLayout(redondo4);
        redondo4.setLayout(redondo4Layout);
        redondo4Layout.setHorizontalGroup(
            redondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redondo4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(39, 39, 39))
        );
        redondo4Layout.setVerticalGroup(
            redondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redondo4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        content.add(redondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void Registro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Registro
        this.setVisible(false);
        Registro regg = new Registro();
        regg.setVisible(true);
    }//GEN-LAST:event_Registro

    private void Busc(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Busc
        this.setVisible(false);
        BuscarAlumno busc = new BuscarAlumno();
        busc.setVisible(true);
    }//GEN-LAST:event_Busc

    private void Bloq(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloq

    content.removeAll();
    BloqCredencial1 bloq = new BloqCredencial1();
    content.add(bloq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, content.getWidth(), content.getHeight()));
    content.revalidate();
    content.repaint();

 
    }//GEN-LAST:event_Bloq

    private void Down(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Down
        this.setVisible(false);
        DescargarBase down = new DescargarBase();
        down.setVisible(true);
    }//GEN-LAST:event_Down

    private void incidencias(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incidencias
        this.setVisible(false);
        Incidencias inc = new Incidencias();
        inc.setVisible(true);
    }//GEN-LAST:event_incidencias

    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private qr_pass.Redondo redondo1;
    private qr_pass.Redondo redondo2;
    private qr_pass.Redondo redondo3;
    private qr_pass.Redondo redondo4;
    private qr_pass.Redondo redondo5;
    // End of variables declaration//GEN-END:variables
}
