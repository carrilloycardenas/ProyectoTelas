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
import vista.VentanaClientes2;
import vista.ventanaAgStock;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlAgStock implements ActionListener {
    
    ventanaAgStock ventSt;
    ventanaProductos1 ventProd1 = new ventanaProductos1();
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    Caja ventCaja=new Caja();
    ResultSet rs;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlAgStock(ventanaAgStock ventSt, consultas model, int row, ventanaProductos1 ventProd){
        this.ventSt = ventSt;
        this.modelo = model;
        this.ventProd = ventProd;
        this.valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        this.rs = modelo.VrProductos(valor);
        this.ventSt.btnGuardarStock.addActionListener(this);
        this.ventSt.btnFacturas.addActionListener(this);
        this.ventSt.btnProveedores.addActionListener(this);
        this.ventSt.btnClientes.addActionListener(this);
        this.ventSt.btnEmpleados.addActionListener(this);
        this.ventSt.btnInicio.addActionListener(this);
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
        ventSt.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.ventSt.btnGuardarStock==evento.getSource()){
            controlVentanaProductos1 ventP1 = new controlVentanaProductos1(this.ventProd1, this.modelo);
            modelo.stockUpdate(ventSt.txtAgStock.getValue().toString(),this.valor);
            ventSt.setVisible(false);
            ventP1.IniciarVista();
        }
        else if(ventSt.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventSt.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventSt.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventSt.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventSt.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventSt.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventSt.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventSt.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventSt.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventSt.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }

}
