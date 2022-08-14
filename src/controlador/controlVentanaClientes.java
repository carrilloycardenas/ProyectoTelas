/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarCliente;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerClientes;

public class controlVentanaClientes implements ActionListener{

    VentanaClientes2 ventCli = new VentanaClientes2();
    AgregarCliente agCli = new AgregarCliente();
    ventanaVerClientes vrCli = new ventanaVerClientes();
    consultas modelo = new consultas();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    int row;

    public controlVentanaClientes(VentanaClientes2 ventCl, consultas model){
        this.ventCli = ventCl;
        this.modelo = model;
        this.ventCli.btnAgregarCliente.addActionListener(this);
        this.ventCli.btnModificarCliente.addActionListener(this);
        this.ventCli.btnVercliente.addActionListener(this);
        this.ventCli.btnEliminarcliente.addActionListener(this);
    }

    public void IniciarVista(){
        ventCli.setTitle("Productos");
        ventCli.pack();
        ventCli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventCli.setLocationRelativeTo(null);
        ventCli.tablaClientes.setModel(modelo.verClientes());
        ventCli.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.ventCli.btnAgregarCliente == evento.getSource()){
            controlAgClientes ctAgC = new controlAgClientes(this.agCli, this.modelo);
            ctAgC.IniciarVista();
            this.ventCli.setVisible(false);
        } else if(this.ventCli.btnVercliente == evento.getSource()){
            this.row = this.ventCli.tablaClientes.getSelectedRow();
            controlVrClientes ctVCli = new controlVrClientes(this.vrCli, this.modelo, this.ventCli, this.row);
            ctVCli.IniciarVista();
            this.ventCli.setVisible(false);
        }
        
        else if(this.ventCli.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(ventCli.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventCli.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProd1=new controlVentanaProductos1(ventProd1,modelo);
                ctProd1.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
