/*
 * Descripción: Ventana para ver información de un proveedor
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
public class ventanaVerProveedores extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public ventanaVerProveedores() {
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

        lbl16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        barraSup = new javax.swing.JPanel();
        jPanel3 = new FondoPanel();
        lblFecha = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        btnEmpleados = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel29 = new IconoCerrarSesion();
        jPanel21 = new IconoInicio();
        btnInicio = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel37 = new IconoFacturas();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel40 = new IconoFacturas();
        jButton3 = new javax.swing.JButton();
        jPanel25 = new IconoProveedores();
        jPanel27 = new IconoFacturas();
        btnFacturas = new javax.swing.JButton();
        lblNombreProv = new javax.swing.JLabel();
        lblCalleProveedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolverProveedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblColoniaProveedor = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblNumeroProveedor = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblCiudadProveedor = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblEstadoProveedor = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lblCPProveedor = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblIdProveedor = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lblCiudad3 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lbl29 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        btnElimProv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTelefonos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCorreos = new javax.swing.JTable();

        lbl16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl16.setText("Número:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Ver proveedor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(119, 119, 119));
        lblFecha.setText("25 Junio 2022");
        barraSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, 20));

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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 10));

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cerrar sesión");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 499, 200, 60));

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
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        btnInicio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel35.setBackground(new java.awt.Color(34, 19, 101));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(34, 19, 101));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setBackground(new java.awt.Color(38, 18, 137));
        jButton13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Facturas");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel36.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 60));
        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        jPanel38.setBackground(new java.awt.Color(34, 19, 101));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(34, 19, 101));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setBackground(new java.awt.Color(38, 18, 137));
        jButton14.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Facturas");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel39.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 60));
        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        jPanel35.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        jButton3.setBackground(new java.awt.Color(38, 18, 137));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Proveedores");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel35.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));
        jPanel35.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 60));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));

        btnFacturas.setBackground(new java.awt.Color(38, 18, 137));
        btnFacturas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Caja");
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 570));

        lblNombreProv.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblNombreProv.setText("Silvana Distribuidora");
        jPanel1.add(lblNombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        lblCalleProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCalleProveedor.setText("Andador Palomas");
        jPanel1.add(lblCalleProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("|   Proveedores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 22, 130));
        jLabel4.setText("Información del proveedor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        btnVolverProveedor.setBackground(new java.awt.Color(181, 194, 254));
        btnVolverProveedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVolverProveedor.setForeground(new java.awt.Color(21, 8, 79));
        btnVolverProveedor.setText("Volver a Proveedores");
        jPanel1.add(btnVolverProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 190, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        lbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl.setText("Calle:");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        lblColoniaProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblColoniaProveedor.setText("Infonavit Alarcón");
        jPanel1.add(lblColoniaProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        lbl1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl1.setText("Colonia:");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        lbl2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl2.setText("Número:");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        lblNumeroProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumeroProveedor.setText("321");
        jPanel1.add(lblNumeroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, -1, -1));

        lbl3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl3.setText("Ciudad:");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        lblCiudadProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCiudadProveedor.setText("Mazatlán");
        jPanel1.add(lblCiudadProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        lbl4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl4.setText("Estado:");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        lblEstadoProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEstadoProveedor.setText("Sinaloa");
        jPanel1.add(lblEstadoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        lbl5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl5.setText("CP:");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        lblCPProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCPProveedor.setText("82132");
        jPanel1.add(lblCPProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        lbl6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl6.setText("ID:");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        lblIdProveedor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblIdProveedor.setText("00012");
        jPanel1.add(lblIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        lbl15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl15.setText("Correos");
        jPanel1.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        lblCiudad3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCiudad3.setText("6692727998");
        jPanel1.add(lblCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lbl19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl19.setText("Número:");
        jPanel1.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 530, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 760, 490, 10));

        lbl29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl29.setText("Teléfonos");
        jPanel1.add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 770, -1, -1));

        lbl25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl25.setText("Teléfonos");
        jPanel1.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        btnElimProv.setBackground(new java.awt.Color(181, 194, 254));
        btnElimProv.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnElimProv.setForeground(new java.awt.Color(189, 0, 0));
        btnElimProv.setText("Eliminar");
        btnElimProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 0, 0)));
        btnElimProv.setContentAreaFilled(false);
        jPanel1.add(btnElimProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 30));

        tablaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tablaTelefonos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 530, 130));

        tablaCorreos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tablaCorreos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 530, 130));

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
            java.util.logging.Logger.getLogger(ventanaVerProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaVerProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSup;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnElimProv;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnVolverProveedor;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    public javax.swing.JLabel lblCPProveedor;
    public javax.swing.JLabel lblCalleProveedor;
    private javax.swing.JLabel lblCiudad3;
    public javax.swing.JLabel lblCiudadProveedor;
    public javax.swing.JLabel lblColoniaProveedor;
    public javax.swing.JLabel lblEstadoProveedor;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblIdProveedor;
    public javax.swing.JLabel lblNombreProv;
    public javax.swing.JLabel lblNumeroProveedor;
    public javax.swing.JTable tablaCorreos;
    public javax.swing.JTable tablaTelefonos;
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



    class FotoProveedor extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/fotoProveedores.png")).getImage();
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
