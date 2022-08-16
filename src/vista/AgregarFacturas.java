/*
 * Descripción: Ventana para agregar facturas
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
public class AgregarFacturas extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public AgregarFacturas() {
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
        jLabel15 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new IconoInicio();
        jButton5 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel25 = new IconoProveedores();
        jPanel26 = new IconoCaja();
        jPanel28 = new IconoReporte();
        jPanel29 = new IconoCerrarSesion();
        btnInicio = new javax.swing.JButton();
        jPanel27 = new IconoFacturas();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextTotal = new javax.swing.JTextField();
        TextFecha = new javax.swing.JTextField();
        TextNumCuen1 = new javax.swing.JTextField();
        TextSubtotal1 = new javax.swing.JTextField();
        TextIVA1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        TextFormaPa2 = new javax.swing.JTextField();
        TextLugar1 = new javax.swing.JTextField();
        TextFolio1 = new javax.swing.JTextField();
        btnAgregarFac1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Agregar facturas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setText("Melissa Garza");
        barraSup.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(119, 119, 119));
        lblFecha.setText("25 Junio 2022");
        barraSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

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
        jPanel2.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));
        jPanel2.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 20, 20));
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        btnInicio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 570));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("|  Facturas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel19.setText("< Volver a facturas");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 110, 20));

        btnCancelar.setBackground(new java.awt.Color(181, 194, 254));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(21, 8, 79));
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(67, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(67, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 120, 40));

        btnEditar.setBackground(new java.awt.Color(181, 194, 254));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(21, 8, 79));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 110, 40));

        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(189, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 0, 0)));
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 120, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Lugar de expedición: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Fecha: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 60, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de producto", "Descripción", "Cantidad", "Precio"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 700, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Total:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Forma de págo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Número de cuenta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Subtotal:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("IVA: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, 20));

        TextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTotalActionPerformed(evt);
            }
        });
        jPanel1.add(TextTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 120, 30));

        TextFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFechaActionPerformed(evt);
            }
        });
        jPanel1.add(TextFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 230, 30));

        TextNumCuen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumCuen1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextNumCuen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 150, 30));

        TextSubtotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSubtotal1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextSubtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 120, 30));

        TextIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIVA1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextIVA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 120, 30));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "0.15", "0.16", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 60, -1));

        TextFormaPa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormaPa2ActionPerformed(evt);
            }
        });
        jPanel1.add(TextFormaPa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 150, 30));

        TextLugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLugar1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 310, 30));

        TextFolio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFolio1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextFolio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 230, 30));

        btnAgregarFac1.setBackground(new java.awt.Color(181, 194, 254));
        btnAgregarFac1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAgregarFac1.setForeground(new java.awt.Color(21, 8, 79));
        btnAgregarFac1.setText("+ Agregar ");
        btnAgregarFac1.setMaximumSize(new java.awt.Dimension(67, 25));
        btnAgregarFac1.setMinimumSize(new java.awt.Dimension(67, 25));
        btnAgregarFac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFac1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarFac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, 40));

        btnImprimir.setBackground(new java.awt.Color(181, 194, 254));
        btnImprimir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(21, 8, 79));
        btnImprimir.setText("Imprimir");
        btnImprimir.setMaximumSize(new java.awt.Dimension(67, 25));
        btnImprimir.setMinimumSize(new java.awt.Dimension(67, 25));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 120, 40));

        btnRegistrar.setBackground(new java.awt.Color(181, 194, 254));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(21, 8, 79));
        btnRegistrar.setText("Registrar ");
        btnRegistrar.setMaximumSize(new java.awt.Dimension(67, 25));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(67, 25));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 120, 40));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setText("Folio: ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 22, 130));
        jLabel9.setText("Agregar facturas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*ventanaVerEmpleado abrir= new ventanaVerEmpleado();
        abrir.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void TextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTotalActionPerformed

    private void TextFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFechaActionPerformed

    private void TextNumCuen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumCuen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNumCuen1ActionPerformed

    private void TextSubtotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSubtotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSubtotal1ActionPerformed

    private void TextIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIVA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIVA1ActionPerformed

    private void TextFormaPa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormaPa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormaPa2ActionPerformed

    private void TextLugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLugar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLugar1ActionPerformed

    private void TextFolio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFolio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFolio1ActionPerformed

    private void btnAgregarFac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFac1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarFac1ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextFolio1;
    private javax.swing.JTextField TextFormaPa2;
    private javax.swing.JTextField TextIVA1;
    private javax.swing.JTextField TextLugar1;
    private javax.swing.JTextField TextNumCuen1;
    private javax.swing.JTextField TextSubtotal1;
    private javax.swing.JTextField TextTotal;
    private javax.swing.JPanel barraSup;
    private javax.swing.JButton btnAgregarFac1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblFecha;
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
            imagen = new ImageIcon(getClass().getResource("/vista/clienteIcon.png")).getImage();
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
