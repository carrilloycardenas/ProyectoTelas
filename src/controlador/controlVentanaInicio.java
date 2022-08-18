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

/**
 *
 * @author daniel
 */
public class controlVentanaInicio implements ActionListener,Runnable{
    
    ventanaInicio vista=new ventanaInicio();
    consultas modelo=new consultas();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    ResultSet rsVrCant;
    Thread h1;
    
    
    public controlVentanaInicio(ventanaInicio vist, consultas model){
        this.vista = vist;
        this.modelo = model;
        this.vista.btnProveedores.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.rsVrCant = this.modelo.ventanaInicio();
    }
    
    public void IniciarVista(){
        vista.setTitle("Inicio");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.lblFecha.setText(ctRel.calFecha());
        
        //reloj
        h1=new Thread(this);
        h1.start();
        
        try{
            vista.lblNumClient.setText(this.rsVrCant.getString("Cli"));
            vista.lblNumEmplea.setText(this.rsVrCant.getString("Emp"));
            vista.lblNumProdu.setText(this.rsVrCant.getString("Prod"));
            vista.lblNumProv.setText(this.rsVrCant.getString("Prov"));
            vista.lblDin.setText(this.rsVrCant.getString("Venta"));
        }catch(SQLException e){
            System.out.println("Error mostrando la cuenta? "+e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(vista.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(vista.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProd1=new controlVentanaProductos1(ventProd1,modelo);
                ctProd1.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(vista.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
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
    }

    @Override
    public void run() {
        Thread ct=Thread.currentThread();
        
        while(ct==h1){
            vista.lblReloj.setText(ctRel.calcula());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error durmiendo el hilo");
            }
        }
    }
    
}
