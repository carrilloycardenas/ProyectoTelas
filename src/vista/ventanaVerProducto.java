/*
Descripción: Ventana para ver la información de un producto registrado. Avance del proyecto para el corte 2.
* Fecha: 27 de Junio 2022
 * Nombre de integrantes:
 *  - Elizabeth Ramírez Lizárraga
 *  - Alessandra Ramírez Lizárraga
 *  - Elvira Josselin Estrada Lizárraga
 *  - Daniel Andrés Cardenas Alarcón
 *  - Jorge Luis Carrillo Cuevas
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ventanaVerProducto extends javax.swing.JFrame {

    String textoDesc = "<html><body>Tela metalizada color verde con <br> acabado inteso de 1.50m x 1.50m</body></html>";

    /**
     * Creates new form ventanaInicio
     */
    public ventanaVerProducto() {
        initComponents();
        lblDesProd.setText(textoDesc);
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
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel22 = new IconoProductos();
        jPanel23 = new IconoClientes();
        btnClientes = new javax.swing.JButton();
        jPanel24 = new IconoEmpleados();
        jPanel25 = new IconoProveedores();
        jPanel27 = new IconoFacturas();
        jPanel29 = new IconoCerrarSesion();
        btnInicio = new javax.swing.JButton();
        jPanel21 = new IconoInicio();
        btnVolver = new javax.swing.JButton();
        jPanel5 = new RoundedPanel(30, Color.white);
        lblStock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDesProd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tedemaz | Ver producto");

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        barraSup.setBackground(new java.awt.Color(255, 255, 255));
        barraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        barraSup.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(119, 119, 119));
        lblFecha.setText("25 Junio 2022");
        barraSup.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

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

        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Productos");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 20, 20));

        btnClientes.setBackground(new java.awt.Color(38, 18, 137));
        btnClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 20, 20));
        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 20, 20));
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

        btnVolver.setBackground(new java.awt.Color(181, 194, 254));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(38, 18, 137));
        btnVolver.setText("Volver a productos");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver.setBorderPainted(false);
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStock.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblStock.setText("55");
        jPanel5.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 18, 137));
        jLabel2.setText("Información de producto");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("| Productos");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 35)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Tela metalizada");
        jPanel5.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblID.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblID.setText("0001");
        jPanel5.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("ID:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Descripción:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblDesProd.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jPanel5.add(lblDesProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, 50));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Marca:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        lblMarca.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblMarca.setText("Telex");
        jPanel5.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Precio:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblPrecio.setText("$235.00");
        jPanel5.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("Localidad:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        lblLocal.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblLocal.setText("Culiacán");
        jPanel5.add(lblLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setText("Categoria:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        lblCat.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblCat.setText("Telas para muebles");
        jPanel5.add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setText("Stock:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(189, 0, 0));
        btnEliminar.setText("Eliminar producto");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 0, 0), 2));
        btnEliminar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraSup, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            java.util.logging.Logger.getLogger(ventanaVerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaVerProducto().setVisible(true);
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
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblCat;
    public javax.swing.JLabel lblDesProd;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblID;
    public javax.swing.JLabel lblLocal;
    public javax.swing.JLabel lblMarca;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblStock;
    // End of variables declaration//GEN-END:variables

    // Clase para la imagen con el logo de Tedemaz
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
    // Clase para la imagen del menú lateral
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
    // Clase para la imagen del usuario en la parte superior derecha
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
    /* Clase para los iconos del menú lateral */
    // Clase para el icono de incio
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
    // Clase para el icono de productos
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
    // Clase para el icono de clientes
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
    // Clase para el icono de empleados
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
    // Clase para el icono de proveedores
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
    // Clase para el icono de caja
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
    // Clase para el icono de facturas
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
    // Clase para el icono de reporte
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
    // Clase para el icono de cerrar sesión
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

    // Clase para paneles redondeados
    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
        
    }

}
