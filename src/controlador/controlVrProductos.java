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

    ventanaVerProducto ventVr;
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    ResultSet rs;

    public controlVrProductos(ventanaVerProducto ventVr, consultas modelo, int row,ventanaProductos1 ventProd){
        this.ventProd=ventProd;
        this.ventVr = ventVr;
        this.modelo = modelo;
        this.ventVr.btnEliminar.addActionListener(this);
        this.ventVr.btnVolver.addActionListener(this);
        //System.out.println(row);
        String valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        System.out.println(valor);
        this.rs = modelo.VrProductos(valor);
        //this.rs = modelo.VrProductos("1");
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
            System.out.println("error en controlVrProducto"+e);
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

