/*
 * Descripción: Ventana para ver información de un empleado
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
public class ventanaVerEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public ventanaVerEmpleado() {
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
        jPanel1 = new javax.swing.JPanel();
        barraSup = new javax.swing.JPanel();
        jPanel3 = new FondoPanel();
        jLabel15 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel2 = new FondoInicioSesion();
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel25 = new IconoProveedores();
        jPanel29 = new IconoCerrarSesion();
        jPanel21 = new IconoInicio();
        btnInicio = new javax.swing.JButton();
        jPanel27 = new IconoFacturas();
        btnFacturas = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel37 = new IconoFacturas();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel40 = new IconoFacturas();
        lblApell = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lblCodigoP = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblFecNacimiento = new javax.swing.JLabel();
        lblNumSocial = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lblFecContratacion = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lblCiudad3 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lbl29 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTelefonos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCorreos = new javax.swing.JTable();
        lblNombre1 = new javax.swing.JLabel();

        lbl16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl16.setText("Número:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Ver empleados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setText("Melissa Garza");
        barraSup.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(119, 119, 119));
        lblFecha.setText("25 Junio 2022");
        barraSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

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
        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 20, 20));
        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 20));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        btnInicio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));
        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 20, 20));

        btnFacturas.setBackground(new java.awt.Color(38, 18, 137));
        btnFacturas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Facturas");
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

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

        jPanel2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 570));

        lblApell.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblApell.setText("apellido");
        jPanel1.add(lblApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, -1));

        lblCalle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCalle.setText("Andador Palomas");
        jPanel1.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("|   Empleados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 22, 130));
        jLabel4.setText("Información del empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(181, 194, 254));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(189, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 0, 0)));
        btnEliminar.setContentAreaFilled(false);
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 110, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        lbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl.setText("Calle:");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        lblColonia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblColonia.setText("Infonavit Alarcón");
        jPanel1.add(lblColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        lbl1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl1.setText("Colonia:");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        lbl2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl2.setText("Número:");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        lblNumero.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumero.setText("321");
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, -1, -1));

        lbl3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl3.setText("Ciudad:");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        lblCiudad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCiudad.setText("Mazatlán");
        jPanel1.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        lbl4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl4.setText("Estado:");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        lblEstado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEstado.setText("Sinaloa");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        lbl5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl5.setText("CP:");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        lblCodigoP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCodigoP.setText("82132");
        jPanel1.add(lblCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        lbl6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl6.setText("ID:");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        lblID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblID.setText("0001");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        lbl7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl7.setText("Fecha de nacimiento:");
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        lblFecNacimiento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblFecNacimiento.setText("23/03/1993");
        jPanel1.add(lblFecNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        lblNumSocial.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumSocial.setText("72795608040");
        jPanel1.add(lblNumSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        lbl8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl8.setText("Número social:");
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        lblFecContratacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblFecContratacion.setText("13/08/2017");
        jPanel1.add(lblFecContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        lbl9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl9.setText("Fecha de contratación:");
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        lblPuesto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPuesto.setText("Gerente");
        jPanel1.add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        lbl10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl10.setText("Puesto:");
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lbl11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl11.setText("Sueldo:");
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        lblSueldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSueldo.setText("$8,000.00");
        jPanel1.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        lbl12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl12.setText("Usuario:");
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblUsuario.setText("MelissaGarzas");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        lbl13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl13.setText("Contraseña:");
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        lblPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPassword.setText("12345");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

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

        btnVolver.setBackground(new java.awt.Color(181, 194, 254));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(21, 8, 79));
        btnVolver.setText("Volver a Empleados");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 190, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 530, 140));

        tablaCorreos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tablaCorreos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 530, 130));

        lblNombre1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNombre1.setText("Melissa");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 635));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaVerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaVerEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSup;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
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
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    public javax.swing.JLabel lblApell;
    public javax.swing.JLabel lblCalle;
    public javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCiudad3;
    public javax.swing.JLabel lblCodigoP;
    public javax.swing.JLabel lblColonia;
    public javax.swing.JLabel lblEstado;
    public javax.swing.JLabel lblFecContratacion;
    public javax.swing.JLabel lblFecNacimiento;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblID;
    public javax.swing.JLabel lblNombre1;
    public javax.swing.JLabel lblNumSocial;
    public javax.swing.JLabel lblNumero;
    public javax.swing.JLabel lblPassword;
    public javax.swing.JLabel lblPuesto;
    public javax.swing.JLabel lblSueldo;
    public javax.swing.JLabel lblUsuario;
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



    class FotoEmpleadoFacturas extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/vista/fotoEmpleado.png")).getImage();
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
