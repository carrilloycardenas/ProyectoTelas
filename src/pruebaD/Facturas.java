/*
Descripción: Ventana de inicio de facturas. Avance del proyecto para el corte 2.
* Fecha: 27 de Junio 2022
 * Nombre de integrantes:
 *  - Elizabeth Ramírez Lizárraga
 *  - Alessandra Ramírez Lizárraga
 *  - Elvira Josselin Estrada Lizárraga
 *  - Daniel Andrés Cardenas Alarcón
 *  - Jorge Luis Carrillo Cuevas
 */
package pruebaD;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author luis-
 */
public class Facturas extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public Facturas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraSup = new javax.swing.JPanel();
        jPanel3 = new FondoPanel();
        jPanel4 = new FondoUsuario();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new IconoInicio();
        jButton5 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel25 = new IconoProveedores();
        jPanel26 = new IconoCaja();
        jPanel28 = new IconoReporte();
        jPanel29 = new IconoCerrarSesion();
        jButton9 = new javax.swing.JButton();
        jPanel27 = new IconoFacturas();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregarFac = new javax.swing.JButton();
        btnModificarFac = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificarFac1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Facturas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));
        barraSup.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 50));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setText("Melissa Garza");
        barraSup.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(119, 119, 119));
        jLabel16.setText("25 Junio 2022");
        barraSup.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jPanel1.add(barraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        jPanel2.setBackground(new java.awt.Color(38, 18, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(38, 18, 137));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Empleados");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        jButton3.setBackground(new java.awt.Color(38, 18, 137));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Proveedores");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        jButton4.setBackground(new java.awt.Color(38, 18, 137));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Caja");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Reporte");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 10));

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cerrar sesión");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 499, 200, 60));

        jPanel20.setBackground(new java.awt.Color(34, 19, 101));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jButton5.setBackground(new java.awt.Color(38, 18, 137));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Facturas");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 20));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 20, 20));

        jButton1.setBackground(new java.awt.Color(38, 18, 137));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clientes");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Productos");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 20, 20));
        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 20, 20));
        jPanel2.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));
        jPanel2.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 20, 20));
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Inicio");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 570));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Facturas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setText("Lista de facturas");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 350, 20));

        jTable1.setBackground(new java.awt.Color(21, 8, 79));
        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Folio", "Factura "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 550, 360));

        btnAgregarFac.setBackground(new java.awt.Color(181, 194, 254));
        btnAgregarFac.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAgregarFac.setForeground(new java.awt.Color(21, 8, 79));
        btnAgregarFac.setText("Agregar facturas");
        btnAgregarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFacActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 150, 40));

        btnModificarFac.setBackground(new java.awt.Color(181, 194, 254));
        btnModificarFac.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnModificarFac.setForeground(new java.awt.Color(21, 8, 79));
        btnModificarFac.setText("Ver Facturas");
        btnModificarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFacActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 150, 40));

        btnEliminar.setBackground(new java.awt.Color(189, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar factura");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 140, 40));

        jLabel2.setText("No oprimir al menos que se desee eliminar la factura seleccionada.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 430, 60));

        btnModificarFac1.setBackground(new java.awt.Color(181, 194, 254));
        btnModificarFac1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnModificarFac1.setForeground(new java.awt.Color(21, 8, 79));
        btnModificarFac1.setText("Modificar Facturas");
        btnModificarFac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFac1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarFac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnModificarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFacActionPerformed
        ventanaVerFacturas abrir= new ventanaVerFacturas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarFacActionPerformed

    private void btnAgregarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacActionPerformed
        AgregarFacturas abrir= new AgregarFacturas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarFacActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarFac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFac1ActionPerformed
        ModificarFacturas abrir= new ModificarFacturas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarFac1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSup;
    private javax.swing.JButton btnAgregarFac;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificarFac;
    private javax.swing.JButton btnModificarFac1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/iconoTedemaz.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoInicioSesion extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/fondoPanelLateral.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoIconoInicio extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/homeIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoUsuario extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/fotoUsuario.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoClientes extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/clientIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoEmpleados extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/workerIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoProv extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/provIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoCaja extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/cajaIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoProductos extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/prodIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }
    class FondoVentas extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/ventasIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoInicio extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/InicioIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoProductos extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Productos_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoClientes extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Clientes_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoEmpleados extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Empleados_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoProveedores extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Proveedores_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoCaja extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Caja_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoFacturas extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Facturas_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoReporte extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/Reporte_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoCerrarSesion extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pruebaD/cerrarSesion_icon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

}
