/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;
import vista.Facturas;
import vista.ModificarEmpleado;
import vista.ModificarTelefonosEm;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

/**
 *
 * @author daniel
 */
public class controlModTelEmpleado implements ActionListener{
    
    ModificarTelefonosEm vista=new ModificarTelefonosEm();
    ventanaEmpleados vEm=new ventanaEmpleados();
    consultas modelo=new consultas();
    ModificarEmpleado modEm=new ModificarEmpleado();
    int rowTel;
    Caja ventCaja=new Caja();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlModTelEmpleado(ModificarTelefonosEm modTE, ModificarEmpleado modEm,consultas model,int rowT, int rowC){
        this.vista=modTE;
        this.modelo=model;
        this.modEm=modEm;
        this.rowTel=this.modEm.tablaTelefonos.getSelectedRow();
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnProveedores.addActionListener(this);
    }
    public void IniciarVista(){
        this.vista.setTitle("Modificar telefono");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            this.vista.txtNumMod.setText(String.valueOf(this.modEm.tablaTelefonos.getValueAt(this.rowTel, 0)));
            String op=(String.valueOf(this.modEm.tablaTelefonos.getValueAt(this.rowTel, 1)));
            switch(op){
                case "Personal":
                    this.vista.txtNomTipo.setSelectedIndex(0);
                    break;
                case "Casa":
                    this.vista.txtNomTipo.setSelectedIndex(1);
                    break;
                case "Emergencia":
                    this.vista.txtNomTipo.setSelectedIndex(2);
                    break;
            }
        }catch(Exception e){
            System.out.println("Error modTelCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnGuardarModTel == evento.getSource()){
            try{
                this.modelo.modTelEm((String.valueOf(this.modEm.tablaTelefonos.getValueAt(this.rowTel, 0))), this.vista.txtNumMod.getText(), 
                                        String.valueOf(this.vista.txtNomTipo.getSelectedIndex()+1));
                controlVentanaEmpleados ctEm = new controlVentanaEmpleados(this.vEm, this.modelo);
                ctEm.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("btnGuardarModTel: " + e);
            }
            
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaEmpleados ctEm = new controlVentanaEmpleados(this.vEm, this.modelo);
            ctEm.IniciarVista();
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
        else if(vista.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
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
        
        else if(vista.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctEmp=new controlVentanaProductos1(ventProd1,modelo);
                ctEmp.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(vista.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
    
}
