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
import vista.ModificarProveedor;
import vista.ModificarTelefonosProv;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

/**
 *
 * @author daniel
 */
public class controlModTelProveedores implements ActionListener{
    
    ventanaProvedores vProv=new ventanaProvedores();
    ModificarProveedor modProv=new ModificarProveedor();
    ModificarTelefonosProv vista=new ModificarTelefonosProv();
    consultas modelo = new consultas();
    int rowTel;
    Facturas ventFac=new Facturas();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    
    public controlModTelProveedores(ModificarTelefonosProv modTE, ModificarProveedor modProv,consultas model,int rowT, int rowC){
        this.vista=modTE;
        this.modelo=model;
        this.modProv=modProv;
        this.rowTel=this.modProv.tablaTelefonos.getSelectedRow();
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnProveedores.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
    }
    public void IniciarVista(){
        this.vista.setTitle("Modificar telefono");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            this.vista.txtNumMod.setText(String.valueOf(this.modProv.tablaTelefonos.getValueAt(this.rowTel, 0)));
            this.vista.txtNomMod.setText(String.valueOf(this.modProv.tablaTelefonos.getValueAt(this.rowTel, 1)));
        }catch(Exception e){
            System.out.println("Error modTelCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnGuardarModTel == evento.getSource()){
            try{
                this.modelo.modTelProv((String.valueOf(this.modProv.tablaTelefonos.getValueAt(this.rowTel, 1))), this.vista.txtNumMod.getText(), 
                                        this.vista.txtNomMod.getText());
                controlVentanaProvedores ctEm = new controlVentanaProvedores(this.vProv, this.modelo);
                ctEm.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("btnGuardarModTel: " + e);
            }
            
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaProvedores ctEm = new controlVentanaProvedores(this.vProv, this.modelo);
            ctEm.IniciarVista();
            this.vista.setVisible(false);
        }
        
        else if(vista.btnFacturas==evento.getSource()){
            try{
                controlFacturas ctFac=new controlFacturas(ventFac,modelo);
                ctFac.IniciarVista();
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
        else if(vista.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
    
}
