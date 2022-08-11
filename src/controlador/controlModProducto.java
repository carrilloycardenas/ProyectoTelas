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
            int stock = Integer.parseInt(rs.getString("Stock"));            
            ventMod.txtStock.setValue(stock);
            ventMod.txtPrecio.setValue(Float.parseFloat(rs.getString("precioUnitario")));
            String local=rs.getString("Localidad");
            if(local.equals("Mazatlán")){
                ventMod.txtLocal.setSelectedIndex(1);
            } else if(local.equals("Culiacán")){
                ventMod.txtLocal.setSelectedIndex(0);
            }
            String cat = rs.getString("NombreCategoria");
            if(cat.equals("Telas")){
                ventMod.txtCategoria.setSelectedIndex(0);
            } else {
                ventMod.txtCategoria.setSelectedIndex(1);
            }
            ventMod.txtColor.setText(rs.getString("Color"));
            String tipo = rs.getString("NombreTipo");
            if(tipo.equals("Acrilico")){
                ventMod.txtTipoTela.setSelectedIndex(0);
            } else if (tipo.equals("Lino")){
                ventMod.txtTipoTela.setSelectedIndex(1);
            } else if (tipo.equals("Algodón")){
                ventMod.txtTipoTela.setSelectedIndex(2);
            } else if (tipo.equals("Abaca")){
                ventMod.txtTipoTela.setSelectedIndex(3);
            }
            String tipoS =rs.getString("NombreTipoStock");
            if(tipoS.equals("Metro")){
                ventMod.txtTipoStock.setSelectedIndex(0);
            } else if(tipoS.equals("Rollo")){
                ventMod.txtTipoStock.setSelectedIndex(1);
            }
            String prov = rs.getString("Marca");
            if(prov.equals("Silvana")){
                ventMod.txtProveedor.setSelectedIndex(0);
            } else if(prov.equals("Devatex")){
                ventMod.txtProveedor.setSelectedIndex(1);
            }
        } catch(SQLException e){
            System.out.println("Mod: " + e);
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
