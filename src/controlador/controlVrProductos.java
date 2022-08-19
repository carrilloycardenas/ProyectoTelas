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
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerProducto;

/**
 *
 * @author daniel
 */
public class controlVrProductos implements ActionListener{

    ventanaVerProducto ventVr;
    consultas modelo = new consultas();
    ventanaProductos1 ventProd;
    ResultSet rs;
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    

    public controlVrProductos(ventanaVerProducto ventVr, consultas modelo, int row,ventanaProductos1 ventProd){
        this.ventProd = ventProd;
        this.ventVr = ventVr;
        this.modelo = modelo;
        this.ventVr.btnEliminar.addActionListener(this);
        this.ventVr.btnVolver.addActionListener(this);
        //System.out.println(row);
        String valor = String.valueOf(ventProd.tablaproductos.getValueAt(row, 0));
        //System.out.println(valor);
        this.rs = modelo.VrProductos(valor);
        //this.rs = modelo.VrProductos("1");
        this.ventVr.btnProveedores.addActionListener(this);
        this.ventVr.btnClientes.addActionListener(this);
        this.ventVr.btnEmpleados.addActionListener(this);
        this.ventVr.btnInicio.addActionListener(this);
        this.ventVr.btnFacturas.addActionListener(this);
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
            System.out.println("error en controlVrProducto "+e);
        }
        ventVr.lblFecha.setText(ctRel.calFechaC());
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVr.btnVolver == evento.getSource()){
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventVr.setVisible(false);
        }
        else if(ventVr.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventVr.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventVr.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventVr.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventVr.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(this.ventVr.btnEliminar == evento.getSource()){
            try{
                this.modelo.EliminProd(this.rs.getString("idProductos"));
                controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
                ctProd.IniciarVista();
                ventVr.setVisible(false);
            }catch(SQLException e){
                System.out.println("Error ElimProd:" + e);
            }  
        }
    }
}

