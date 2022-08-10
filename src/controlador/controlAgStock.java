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
import modelo.consultas;
import vista.ventanaAgStock;
import vista.ventanaProductos1;

public class controlAgStock implements ActionListener {
    
    ventanaAgStock ventSt;
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    ResultSet rs;

    public controlAgStock(ventanaAgStock ventSt, consultas model, int row, ventanaProductos1 ventProd){
        this.ventSt = ventSt;
        this.modelo = model;
        this.ventProd = ventProd;
        String valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        this.rs = modelo.VrProductos(valor);
    }

    public void IniciarVista(){
        ventSt.setTitle("Mostrar producto");
        ventSt.pack();
        ventSt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventSt.setLocationRelativeTo(null);
        ventSt.setVisible(true);
        try {
            ventSt.lblNombre.setText(rs.getString("Nombre"));
            ventSt.lblID.setText(rs.getString("idProductos"));
            ventSt.lblCategoria.setText(rs.getString("NombreCategoria"));
            ventSt.lblDescripcion.setText(rs.getString("Descripcion"));
            ventSt.lblLocal.setText(rs.getString("Localidad"));
            ventSt.lblMarca.setText(rs.getString("Marca"));
            ventSt.lblPrecio.setText(rs.getString("precioUnitario"));
        } catch(SQLException e){
            System.out.println("error en controlVrProducto "+e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        
    }

}
