/*
 * Descripción: Ventana para agregar proveedores
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
public class AgregarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public AgregarProveedor() {
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
        lblFecha = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        btnFacturas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel25 = new IconoProveedores();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnProductos = new javax.swing.JButton();
        jPanel27 = new IconoFacturas();
        jPanel29 = new IconoCerrarSesion();
        btnInicio = new javax.swing.JButton();
        jPanel21 = new IconoInicio();
        btnClientes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtColonia = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNumDir = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumTel = new javax.swing.JTextField();
        txtNomDueño = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtNomDueñoC = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtPuestoC = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtCp = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Agregar proveedor");

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(119, 119, 119));
        lblFecha.setText("25 Junio 2022");
        barraSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(38, 18, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton3.setBackground(new java.awt.Color(38, 18, 137));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Proveedores");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));
        jPanel20.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 20));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 20, 20));

        btnProductos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        btnInicio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        btnClientes.setBackground(new java.awt.Color(38, 18, 137));
        btnClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        btnEmpleados.setBackground(new java.awt.Color(38, 18, 137));
        btnEmpleados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setFocusPainted(false);
        jPanel2.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 20, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 22, 130));
        jLabel1.setText("Agregar proveedor");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("|  Proveedores");

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setInheritsPopupMenu(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(550, 444));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel6.add(txtNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, 182, -1));

        jSeparator2.setForeground(new java.awt.Color(170, 170, 170));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 20));
        jPanel6.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));
        jPanel6.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Calle:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Colonia:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Dirección");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel6.add(txtNumDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Numero:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, -1));
        jPanel6.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Ciudad:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, -1));
        jPanel6.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("Estado:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 60, -1));
        jPanel6.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setText("Pais:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 50, -1));

        jSeparator3.setForeground(new java.awt.Color(170, 170, 170));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 490, 10));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Telefonos");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setText("Números:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel6.add(txtNumTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));
        jPanel6.add(txtNomDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("Nombre de dueño:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        jPanel6.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("Puesto:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel6.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 230, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setText("Direccion de correo:");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setText("Correos");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(170, 170, 170));
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 588, 490, 0));
        jPanel6.add(txtNomDueñoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 110, -1));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setText("Nombre de dueño:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 140, -1));
        jPanel6.add(txtPuestoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 110, -1));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setText("Puesto:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 70, -1));
        jPanel6.add(txtCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel33.setText("CP:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 30, -1));

        jScrollPane1.setViewportView(jPanel6);

        btnAgregar.setBackground(new java.awt.Color(181, 194, 254));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(21, 8, 79));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(181, 194, 254));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(21, 8, 79));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(219, 219, 219)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*ventanaVerEmpleado abrir= new ventanaVerEmpleado();
        abrir.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSup;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtCiudad;
    public javax.swing.JTextField txtColonia;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCp;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtNomDueño;
    public javax.swing.JTextField txtNomDueñoC;
    public javax.swing.JTextField txtNomP;
    public javax.swing.JTextField txtNumDir;
    public javax.swing.JTextField txtNumTel;
    public javax.swing.JTextField txtPais;
    public javax.swing.JTextField txtPuesto;
    public javax.swing.JTextField txtPuestoC;
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
    
        class addIcon extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/icono_agregar.png")).getImage();
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
