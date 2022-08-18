/*
 * Descripción: Ventana de inicio, primera vista al entrar a la interfaz
 * Fecha: 27 de Junio 2022
 * Nombre de integrantes:
 *  - Elizabeth Ramírez Lizárraga
 *  - Alessandra Ramírez Lizárraga
 *  - Elvira Josselin Estrada Lizárraga
 *  - Daniel Andrés Cardenas Alarcón
 *  - Jorge Luis Carrillo Cuevas
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author luis-
 */
public class ventanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public ventanaInicio() {
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
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new IconoInicio();
        jButton9 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel25 = new IconoProveedores();
        jPanel27 = new IconoFacturas();
        jPanel29 = new IconoCerrarSesion();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new FondoClientes();
        lblNumClient = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new FondoEmpleados();
        lblNumEmplea = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel13 = new FondoProv();
        lblNumProv = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new FondoCaja();
        lblDin = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new FondoProductos();
        lblNumProdu = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblReloj = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel32 = new FondoVentas();
        lblDinVentas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("25 Junio 2022");
        barraSup.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jPanel1.add(barraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        jPanel2.setBackground(new java.awt.Color(38, 18, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleados.setBackground(new java.awt.Color(38, 18, 137));
        btnEmpleados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setFocusPainted(false);
        jPanel2.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        btnProveedores.setBackground(new java.awt.Color(38, 18, 137));
        btnProveedores.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        btnFacturas.setBackground(new java.awt.Color(38, 18, 137));
        btnFacturas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Caja");
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

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

        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Inicio");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 20));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 20, 20));

        btnClientes.setBackground(new java.awt.Color(38, 18, 137));
        btnClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        btnProductos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 20, 20));
        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 20, 20));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 570));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel1.setText("Bienvenida Melissa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Sumario del sistema:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 194, 254), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(38, 18, 137));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clientes");
        jPanel6.add(jLabel5);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));
        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblNumClient.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblNumClient.setForeground(new java.awt.Color(189, 0, 0));
        lblNumClient.setText("Muchos");
        jPanel5.add(lblNumClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 110, 130));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 194, 254), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(38, 18, 137));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empleados");
        jPanel8.add(jLabel6);

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));
        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblNumEmplea.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblNumEmplea.setForeground(new java.awt.Color(189, 0, 0));
        lblNumEmplea.setText("Poquitos");
        jPanel7.add(lblNumEmplea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, 130));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 194, 254), 2));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(38, 18, 137));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedores");
        jPanel12.add(jLabel7);

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));
        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblNumProv.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblNumProv.setForeground(new java.awt.Color(189, 0, 0));
        lblNumProv.setText("Menos");
        jPanel11.add(lblNumProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 110, 130));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 194, 254), 2));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(38, 18, 137));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Caja");
        jPanel15.add(jLabel9);

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));
        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblDin.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblDin.setForeground(new java.awt.Color(189, 0, 0));
        lblDin.setText("No sé");
        jPanel14.add(lblDin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 110, 130));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(181, 194, 254), 2, true));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(38, 18, 137));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Productos");
        jPanel18.add(jLabel11);

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));
        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblNumProdu.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblNumProdu.setForeground(new java.awt.Color(189, 0, 0));
        lblNumProdu.setText("Muchisimos");
        jPanel17.add(lblNumProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 110, 130));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 750, 10));

        lblReloj.setFont(new java.awt.Font("Century Gothic", 0, 75)); // NOI18N
        lblReloj.setText("06:42:35");
        jPanel1.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(38, 18, 137));
        lblFecha.setText("Sábado, 25 de Junio de 2022");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 194, 254), 2));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(38, 18, 137));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ventas");
        jPanel31.add(jLabel17);

        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        lblDinVentas.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblDinVentas.setForeground(new java.awt.Color(189, 0, 0));
        lblDinVentas.setText("MaoMeno");
        jPanel30.add(lblDinVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 110, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSup;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lblDin;
    public javax.swing.JLabel lblDinVentas;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblNumClient;
    public javax.swing.JLabel lblNumEmplea;
    public javax.swing.JLabel lblNumProdu;
    public javax.swing.JLabel lblNumProv;
    public javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/iconoTedemaz.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoInicioSesion extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/fondoPanelLateral.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoIconoInicio extends JPanel {

        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/homeIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }
    class FondoVentas extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/ventasIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoUsuario extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/fotoUsuario.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoClientes extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/clientIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoEmpleados extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/workerIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoProv extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/provIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoCaja extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/cajaIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class FondoProductos extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/prodIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoInicio extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/InicioIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoProductos extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Productos_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoClientes extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Clientes_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoEmpleados extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Empleados_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoProveedores extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Proveedores_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoCaja extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Caja_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoFacturas extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Facturas_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoReporte extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/Reporte_icono_Menu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

    class IconoCerrarSesion extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/cerrarSesion_icon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), rootPane);
            setOpaque(false);
            super.paint(g);
        }

    }

}
