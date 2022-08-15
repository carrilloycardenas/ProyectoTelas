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
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

/**
 *
 * @author daniel
 */
public class controlFacturas implements ActionListener{
    Facturas ventFac=new Facturas();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();
    ventanaProductos1 ventProd=new ventanaProductos1();
    consultas modelo = new consultas();
    int row;
    controladorReloj ctRel=new controladorReloj();
    
    public controlFacturas(Facturas fac,consultas model) {
        this.ventFac=fac;
        this.modelo=model;
        this.ventFac.btnEliminar.addActionListener(this);
        this.ventFac.btnProveedores.addActionListener(this);
        this.ventFac.btnClientes.addActionListener(this);
        this.ventFac.btnEmpleados.addActionListener(this);
        this.ventFac.btnInicio.addActionListener(this);
        this.ventFac.btnProductos.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventFac.setTitle("Facturas");
        ventFac.pack();
        ventFac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventFac.setLocationRelativeTo(null);
        ventFac.tablaFacturas.setModel(modelo.venProd());
        ventFac.setVisible(true);
        ventFac.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventFac.btnEliminar == evento.getSource()){
            try {
                this.row = ventFac.tablaFacturas.getSelectedRow();
                //System.out.println(this.row);
                String valor = String.valueOf(ventFac.tablaFacturas.getValueAt(row, 0));
                //System.out.println(valor);
                this.modelo.EliminProd(valor);
                ventFac.setVisible(false);
                this.IniciarVista();
            } catch(Exception e){
                System.out.println("btnEliminar: " + e);
            }
            
        }
        
        else if(ventFac.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventFac.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventFac.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventFac.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventFac.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventFac.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventFac.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventFac.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventFac.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProd=new controlVentanaProductos1(ventProd,modelo);
                ctProd.IniciarVista();
                ventFac.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
