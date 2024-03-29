/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerProveedores;

public class controlVrProveedor implements ActionListener {
    
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ventanaVerProveedores vista = new ventanaVerProveedores();
    ventanaProvedores vtProv = new ventanaProvedores();
    consultas modelo = new consultas();
    ResultSet rsVrPorv;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    
    public controlVrProveedor(ventanaVerProveedores vist, consultas model, ventanaProvedores vtPro, int row){
        this.vista = vist;
        this.modelo = model;
        this.valor = String.valueOf(vtPro.tablaempleados.getValueAt(row, 0));
        this.rsVrPorv = this.modelo.VrProveedores(this.valor);
        this.vista.btnVolverProveedor.addActionListener(this);
        this.vista.btnElimProv.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Ver proveedor");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{
            this.vista.lblNombreProv.setText(this.rsVrPorv.getString("Nombre"));
            this.vista.lblIdProveedor.setText(this.valor);
            this.vista.lblCalleProveedor.setText(this.rsVrPorv.getString("calle"));
            this.vista.lblColoniaProveedor.setText(this.rsVrPorv.getString("Colonia"));
            this.vista.lblNumeroProveedor.setText(this.rsVrPorv.getString("numCasa"));
            this.vista.lblCiudadProveedor.setText(this.rsVrPorv.getString("Ciudad"));
            this.vista.lblEstadoProveedor.setText(this.rsVrPorv.getString("Estado"));
            this.vista.lblCPProveedor.setText(this.rsVrPorv.getString("Codigo_postal"));
            this.vista.tablaTelefonos.setModel(this.modelo.numProveedor(this.valor));
            this.vista.tablaCorreos.setModel(this.modelo.correoProveedor(this.valor));
        }catch(Exception e){
            System.out.println("Error ctVrProv: " + e);
        }
        vista.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnVolverProveedor == evento.getSource()){
            controlVentanaProvedores ctPro = new controlVentanaProvedores(this.vtProv, this.modelo);
            ctPro.IniciarVista();
            this.vista.setVisible(false);
        }
        else if(vista.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(this.vista.btnElimProv == evento.getSource()){
            this.modelo.elimProveedor(this.valor);
            controlVentanaProvedores ctPro = new controlVentanaProvedores(this.vtProv, this.modelo);
            ctPro.IniciarVista();
            this.vista.setVisible(false);
        }
        else if(this.vista.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProv=new controlVentanaProductos1(ventProd1, modelo);
                ctProv.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(this.vista.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli, modelo);
                ctCli.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(this.vista.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp, modelo);
                ctEmp.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }else if(this.vista.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni, modelo);
                ctIni.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(this.vista.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja, modelo);
                ctCaj.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
    }
    
}
