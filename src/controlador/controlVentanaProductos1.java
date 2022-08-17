/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Facturas;
import vista.VentanaClientes2;
import vista.ventanaAgProducto;
import vista.ventanaAgStock;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaModProducto;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerProducto;

public class controlVentanaProductos1 implements ActionListener{
    
    ventanaModProducto ventMod = new ventanaModProducto();
    ventanaVerProducto ventVrProd =new ventanaVerProducto();
    ventanaAgProducto ventAgProd = new ventanaAgProducto();
    ventanaProductos1 ventProd1 = new ventanaProductos1();
    ventanaAgStock ventSt = new ventanaAgStock();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();
    Facturas ventFac=new Facturas();
    consultas modelo = new consultas();
    int row;
    controladorReloj ctRel=new controladorReloj();

    public controlVentanaProductos1(ventanaProductos1 vent, consultas model){
        this.ventProd1 = vent;
        this.modelo = model;
        //this.row = ventProd1.tablaproductos.getSelectedRow();
        this.ventProd1.btnAgregarProducto.addActionListener(this);
        this.ventProd1.btnAgregarStock.addActionListener(this);
        this.ventProd1.btnModificarProducto.addActionListener(this);
        this.ventProd1.btnVerProducto.addActionListener(this);
        this.ventProd1.btnEliminarProducto.addActionListener(this);
        this.ventProd1.btnProveedores.addActionListener(this);
        this.ventProd1.btnClientes.addActionListener(this);
        this.ventProd1.btnEmpleados.addActionListener(this);
        this.ventProd1.btnInicio.addActionListener(this);
        this.ventProd1.btnFacturas.addActionListener(this);
        this.ventProd1.btnBuscar.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventProd1.setTitle("Productos");
        ventProd1.pack();
        ventProd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventProd1.setLocationRelativeTo(null);
        ventProd1.tablaproductos.setModel(modelo.venProd());
        ventProd1.setVisible(true);
        ventProd1.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventProd1.btnAgregarProducto == evento.getSource()) {
            try {
                controlAgProductos agProd = new controlAgProductos(ventAgProd, modelo);
                agProd.IniciarVista();
                ventProd1.setVisible(false);
            } catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ventProd1.btnVerProducto == evento.getSource()){
            try {
                this.row = ventProd1.tablaproductos.getSelectedRow();
                //System.out.println(this.row);
                controlVrProductos vrProd = new controlVrProductos(ventVrProd, modelo, row,ventProd1);
                vrProd.IniciarVista();
                ventProd1.setVisible(false);
            } catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ventProd1.btnModificarProducto == evento.getSource()){
            try {
                this.row = ventProd1.tablaproductos.getSelectedRow();
                controlModProducto ctMod = new controlModProducto(ventMod, modelo, row, ventProd1);
                ctMod.IniciarVista();
                ventProd1.setVisible(false);
            } catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ventProd1.btnAgregarStock == evento.getSource()){
            try {
                this.row = ventProd1.tablaproductos.getSelectedRow();
                controlAgStock ctStock = new controlAgStock(ventSt, modelo, this.row, this.ventProd1);
                ctStock.IniciarVista();
                ventProd1.setVisible(false);
            } catch(Exception e){
                
            }
        }
        else if(ventProd1.btnEliminarProducto == evento.getSource()){
            try {
                this.row = ventProd1.tablaproductos.getSelectedRow();
                //System.out.println(this.row);
                String valor = String.valueOf(ventProd1.tablaproductos.getValueAt(row, 0));
                //System.out.println(valor);
                this.modelo.EliminProd(valor);
                ventProd1.setVisible(false);
                this.IniciarVista();
            } catch(Exception e){
                System.out.println("btnEliminar: " + e);
            }
            
        }
        
        else if(ventProd1.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventProd1.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventProd1.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventProd1.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventProd1.btnFacturas==evento.getSource()){
            try{
                controlFacturas ctFac=new controlFacturas(ventFac,modelo);
                ctFac.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(this.ventProd1.btnBuscar == evento.getSource()){
            switch(this.ventProd1.txtTipoB.getSelectedIndex()){
                case 0:
                    ventProd1.tablaproductos.setModel(modelo.venProd());
                    break;
                case 1:
                    this.ventProd1.tablaproductos.setModel(this.modelo.buscarProd(this.ventProd1.txtBuscar.getText()));
                    break;
                case 2:
                    this.ventProd1.tablaproductos.setModel(this.modelo.buscarProd(this.ventProd1.txtBuscar.getText()));
                    break;
            }
        }
    }
}