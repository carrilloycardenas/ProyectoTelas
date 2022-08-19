/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

import vista.ventanaVerClientes;
/**
 *
 * @author Josselin
 */
public class controlVrClientes implements ActionListener {
    
    ventanaVerClientes ventVr;
    consultas modelo =new consultas();
    VentanaClientes2 ventClien;
    ResultSet rs;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();

    public controlVrClientes(ventanaVerClientes ventVr,consultas modelo,VentanaClientes2 ventClien, int row){
        this.ventClien= ventClien;
        this.ventVr=ventVr;
        this.modelo=modelo;
        this.ventVr.btnEliminarCliente.addActionListener(this);
        this.ventVr.btnVolverClientes.addActionListener(this);
        this.ventVr.btnFacturas.addActionListener(this);
        this.valor = String.valueOf(ventClien.tablaClientes.getValueAt(row, 0));
        //System.out.println(valor);
        this.rs = modelo.VrClientes(this.valor);  
        this.ventVr.btnEmpleados.addActionListener(this);
        this.ventVr.btnProveedores.addActionListener(this);
        this.ventVr.btnProductos.addActionListener(this);
        this.ventVr.btnInicio.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventVr.setTitle("Mostrar Cliente");
        ventVr.pack();
        ventVr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventVr.setLocationRelativeTo(null);
        ventVr.setVisible(true);
        try{
            ventVr.lblidCliente.setText(rs.getString("idClientes"));            
            ventVr.lblNombre.setText(rs.getString("Nombre"));
            ventVr.lblApellido.setText(rs.getString("Apellidos"));
            ventVr.lblCalleCliente.setText(rs.getString("calle"));
            ventVr.lblColoniaCliente.setText(rs.getString("Colonia"));
            ventVr.lblNumeroCliente.setText(rs.getString("numCasa"));
            ventVr.lblCiudadCliente.setText(rs.getString("Ciudad"));
            ventVr.lblEstadoCliente.setText(rs.getString("Estado"));
            ventVr.lblCP.setText(this.rs.getString("Codigo_postal"));
            ventVr.tablaTelefonosCli.setModel(this.modelo.numCliente(this.valor));
            ventVr.tablaCorreoCli.setModel(this.modelo.correoCliente(this.valor));
        }catch(SQLException e){
            System.out.println("error en controlVrClientes: " + e);
             
        }
        ventVr.lblFecha.setText(ctRel.calFechaC());
    }
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVr.btnVolverClientes == evento.getSource() ){
            controlVentanaClientes ctClien = new controlVentanaClientes (ventClien, modelo);
            ctClien.IniciarVista();
            this.ventVr.setVisible(false);
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
        else if(this.ventVr.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventVr.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
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
        
        else if(ventVr.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProd1=new controlVentanaProductos1(ventProd1,modelo);
                ctProd1.IniciarVista();
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
    }
    
    
}
