/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ventanaProductos1;
import vista.ventanaVerProducto;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class controlVrProductos implements ActionListener{

    ventanaVerProducto ventVr = new ventanaVerProducto();
    consultas modelo = new consultas();
    ventanaProductos1 ventProd = new ventanaProductos1();
    ResultSet rs;

    public controlVrProductos(ventanaVerProducto ventVr, consultas modelo, int row){
        this.ventVr = ventVr;
        this.modelo = modelo;
        this.ventVr.btnEliminar.addActionListener(this);
        this.ventVr.btnVolver.addActionListener(this);
        //System.out.println(row);
        this.rs = modelo.VrProductos(ventProd.tablaproductos.getValueAt(0, 0));
    }
    public void IniciarVista(){
        ventVr.setTitle("Mostrar producto");
        ventVr.pack();
        ventVr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventVr.setLocationRelativeTo(null);
        ventVr.setVisible(true);
        try {
            ventVr.lblNombre.setText(rs.getString("Nombre"));
            ventVr.lblID.setText(rs.getString("idProductos"));
            ventVr.lblCat.setText(rs.getString("NombreCategoria"));
            ventVr.lblDesProd.setText(rs.getString("Descripcion"));
            ventVr.lblLocal.setText(rs.getString("Localidad"));
            ventVr.lblMarca.setText(rs.getString("Marca"));
            ventVr.lblPrecio.setText(rs.getString("precioUnitario"));
            ventVr.lblStock.setText(rs.getString("Stock"));
        } catch(SQLException e){
            System.out.println(e);
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVr.btnVolver == evento.getSource()){
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventVr.setVisible(false);
        }
    }
}

