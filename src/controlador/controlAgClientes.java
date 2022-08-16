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
public class controlAgClientes implements ActionListener{
    
    AgregarCliente ventAgC =new AgregarCliente();
    consultas modelo=new consultas();
    VentanaClientes2 ventCli=new VentanaClientes2();
    controladorReloj ctRel=new controladorReloj();
    Facturas ventFac=new Facturas();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlAgClientes(AgregarCliente ventAgC, consultas modelo){
        this.ventAgC=ventAgC;
        this.modelo=modelo;
        this.ventAgC.btnAgregar.addActionListener(this);
        this.ventAgC.btnCancelar.addActionListener(this);
        this.ventAgC.btnFacturas.addActionListener(this);
        this.ventAgC.btnEmpleados.addActionListener(this);
        this.ventAgC.btnProveedores.addActionListener(this);
        this.ventAgC.btnProductos.addActionListener(this);
        this.ventAgC.btnInicio.addActionListener(this);
        this.ventAgC.btnFacturas.addActionListener(this);
    }

    public void IniciarVista(){
        ventAgC.setTitle("Agregar Clientes");
        ventAgC.pack();
        ventAgC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgC.setLocationRelativeTo(null);
        ventAgC.setVisible(true);
        ventAgC.lblFecha.setText(ctRel.calFechaC());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgC.btnAgregar == evento.getSource()){
            try {
                modelo.AgClientes(ventAgC.txtNomCli.getText(),ventAgC.txtApell.getText(),ventAgC.txtCalle.getText(), ventAgC.txtColonia.getText(),
                                    ventAgC.txtNumeroDire.getText(), ventAgC.txtCiudad.getText(), ventAgC.txtEstado.getText(), ventAgC.txtCP.getText(), 
                                    ventAgC.txtTelNum.getText(),ventAgC.txtNomDue.getText(),ventAgC.txtCorreo.getText(), this.ventAgC.txtNomD.getText());
                controlVentanaClientes ctVentCli = new controlVentanaClientes(this.ventCli, this.modelo);
                ctVentCli.IniciarVista();
                this.ventAgC.setVisible(false);
            } catch(Exception e){
                System.out.println("btn: " + e);
            }
        } else if(ventAgC.btnCancelar == evento.getSource()){
            controlVentanaClientes ctVentCli = new controlVentanaClientes(this.ventCli, this.modelo);
            ctVentCli.IniciarVista();
            this.ventAgC.setVisible(false);
        }
        else if(ventCli.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventCli.btnFacturas==evento.getSource()){
            try{
                controlFacturas ctFac=new controlFacturas(ventFac,modelo);
                ctFac.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
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
