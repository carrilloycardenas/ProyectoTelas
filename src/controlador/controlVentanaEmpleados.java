/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarEmpleado;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

/**
 *
 * @author daniel
 */
public class controlVentanaEmpleados implements ActionListener{
    
    ventanaEmpleados ventEm=new ventanaEmpleados();
    AgregarEmpleado agEm=new AgregarEmpleado();
    consultas modelo=new consultas();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    
    public controlVentanaEmpleados(ventanaEmpleados ventEm, consultas model){
        this.ventEm=ventEm;
        this.modelo=model;
        this.ventEm.btnAgregarEmpleado.addActionListener(this);
        this.ventEm.btnModificarEmpleado.addActionListener(this);
        this.ventEm.btnVerEmpleado.addActionListener(this);
        this.ventEm.btnProveedores.addActionListener(this);
        this.ventEm.btnClientes.addActionListener(this);
        this.ventEm.btnProductos.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventEm.setTitle("Productos");
        ventEm.pack();
        ventEm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventEm.setLocationRelativeTo(null);
        ventEm.tablaempleados.setModel(modelo.verEmpleados());
        ventEm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.ventEm.btnAgregarEmpleado == evento.getSource()){
            controlAgEmpleados ctAgE = new controlAgEmpleados(this.agEm, this.modelo);
            ctAgE.IniciarVista();
            this.ventEm.setVisible(false);
        }
        
        else if(ventEm.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventEm.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventEm.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctEmp=new controlVentanaProductos1(ventProd1,modelo);
                ctEmp.IniciarVista();
                ventEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
    
}