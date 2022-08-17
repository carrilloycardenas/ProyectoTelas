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
public class controlAgEmpleados implements ActionListener{
    AgregarEmpleado ventAgE=new AgregarEmpleado();
    consultas modelo = new consultas();
    ventanaEmpleados ventE=new ventanaEmpleados();
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlAgEmpleados(AgregarEmpleado ventAgE, consultas modelo){
        this.ventAgE=ventAgE;
        this.modelo=modelo;
        this.ventAgE.btnAgregar.addActionListener(this);
        this.ventAgE.btnCancelar.addActionListener(this);
        this.ventAgE.btnFacturas.addActionListener(this);
        this.ventAgE.btnProveedores.addActionListener(this);
        this.ventAgE.btnClientes.addActionListener(this);
        this.ventAgE.btnProductos.addActionListener(this);
        this.ventAgE.btnInicio.addActionListener(this);
        this.ventAgE.btnFacturas.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventAgE.setTitle("Agregar Empleados");
        ventAgE.pack();
        ventAgE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgE.setLocationRelativeTo(null);
        ventAgE.setVisible(true);
        ventAgE.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgE.btnAgregar==evento.getSource()){
            try{
                //System.out.println(ventAgP.txtNomP.getText()+ ventAgP.txtCalle.getText()+ ventAgP.txtColonia.getText()+ ventAgP.txtNumDir.getText()+ ventAgP.txtCiudad.getText()+ ventAgP.txtEstado.getText()+ ventAgP.txtPais.getText()+ ventAgP.txtNumTel.getText()+ ventAgP.txtNomDueño.getText()+ ventAgP.txtPuesto.getText()+ ventAgP.txtCorreo.getText()+ventAgP.txtNomDueñoC.getText()+ventAgP.txtPuestoC.getText()+ventAgP.txtPais.getText());
                modelo.AgEmpleados(ventAgE.txtNomE.getText(),ventAgE.txtApell.getText(),
                        ventAgE.txtFechaN.getText(),ventAgE.txtNumSS.getText(),ventAgE.txtFechaDCon.getText(),
                        Integer.toString(ventAgE.txtPuesto.getSelectedIndex()+1),ventAgE.txtUser.getText(),
                        ventAgE.txtPassword.getText(),ventAgE.txtCalle.getText(),ventAgE.txtColonia.getText(),
                        ventAgE.txtNumDire.getText(),ventAgE.txtCiudad.getText(),ventAgE.txtEstado.getText(),
                        ventAgE.txtCp.getText(),ventAgE.txtTelNume.getText(),ventAgE.txtCorreo.getText());
                controlVentanaEmpleados ctCli=new controlVentanaEmpleados(ventE,modelo);
                ctCli.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en btn agregar Empleados: "+e);
            }
        }
        else if(ventAgE.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventAgE.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventAgE.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventAgE.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctEmp=new controlVentanaProductos1(ventProd1,modelo);
                ctEmp.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(ventAgE.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
