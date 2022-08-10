/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import vista.ventanaModProducto;
import vista.ventanaProductos1;
import modelo.consultas;

public class controlModProducto implements ActionListener {
    
    ventanaModProducto ventMod;
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    ResultSet rs;

    public controlModProducto(ventanaModProducto ventMod, consultas model, int row, ventanaProductos1 venProd){
        this.ventMod = ventMod;
        this.modelo = model;
        this.ventProd = venProd;
        this.ventMod.btnGuardarProducto.addActionListener(this);
        this.ventMod.btnEliminarProducto.addActionListener(this);
        String valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        System.out.println(valor);
        this.rs = modelo.VrProductos(valor);
    }

    public void IniciarVista(){
        this.ventMod.setTitle("Modificar producto");
        this.ventMod.pack();
        this.ventMod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventMod.setLocationRelativeTo(null);
        this.ventMod.setVisible(true);
        try {
            ventMod.txtNombreProd.setText(rs.getString("Nombre"));
            ventMod.txtMarca.setText(rs.getString("Marca"));
            ventMod.txtDescripcion.setText(rs.getString("Descripcion"));
            ventMod.txtStock.setValue(rs.getString("Stock"));
            ventMod.txtPrecio.setValue(rs.getString("precioUnitario"));
            ventMod.txtLocal.setSelectedItem(rs.getString("Localidad"));
            ventMod.txtCategoria.setSelectedItem(rs.getString("NombreCategoria"));
            ventMod.txtColor.setText(rs.getString("Color"));
            //ventMod.txtTipoTela.setSelectedItem(rs.getString(""));
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.ventMod.btnGuardarProducto == evento.getSource()){

        }
        else if(this.ventMod.btnEliminarProducto == evento.getSource()){

        }
    }

}
