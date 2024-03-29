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
import vista.Caja;
import vista.Facturas;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaModProducto;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModProducto implements ActionListener {
    
    ventanaModProducto ventMod;
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    ResultSet rs;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();

    public controlModProducto(ventanaModProducto ventMod, consultas model, int row, ventanaProductos1 venProd){
        this.ventMod = ventMod;
        this.modelo = model;
        this.ventProd = venProd;
        this.ventMod.btnGuardarProducto.addActionListener(this);
        this.ventMod.btnEliminarProducto.addActionListener(this);
        valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        this.rs = modelo.VrProductos(valor);
        this.ventMod.btnFacturas.addActionListener(this);
        this.ventMod.btnProveedores.addActionListener(this);
        this.ventMod.btnClientes.addActionListener(this);
        this.ventMod.btnEmpleados.addActionListener(this);
        this.ventMod.btnInicio.addActionListener(this);
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
        ventMod.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.ventMod.btnGuardarProducto == evento.getSource()){
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            modelo.prodUpdate(this.valor,ventMod.txtNombreProd.getText(),ventMod.txtDescripcion.getText(),ventMod.txtMarca.getText(), ventMod.txtStock.getValue().toString(),ventMod.txtPrecio.getValue().toString(), ventMod.txtLocal.getSelectedItem().toString(), ventMod.txtColor.getText(), Integer.toString(ventMod.txtCategoria.getSelectedIndex()+1), Integer.toString(ventMod.txtTipoTela.getSelectedIndex()+1),Integer.toString(ventMod.txtProveedor.getSelectedIndex()+1), Integer.toString(ventMod.txtTipoStock.getSelectedIndex()+1));
            ventMod.setVisible(false);
            ctProd.IniciarVista();
        }
        else if(this.ventMod.btnEliminarProducto == evento.getSource()){
            modelo.EliminProd(this.valor);
            ventMod.setVisible(false);
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();

        }
        else if(ventMod.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventMod.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventMod.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventMod.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventMod.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventMod.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventMod.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventMod.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventMod.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventMod.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }

}
