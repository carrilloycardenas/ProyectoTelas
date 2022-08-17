/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.AgregarProveedor;
import vista.ventanaProvedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.Caja;
import vista.Facturas;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;

/**
 *
 * @author daniel
 */
public class controlAgProveedores implements ActionListener{
    AgregarProveedor ventAgP = new AgregarProveedor();
    consultas modelo = new consultas();
    ventanaProvedores ventProv=new ventanaProvedores();
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlAgProveedores(AgregarProveedor ventAgP, consultas modelo){
        this.ventAgP=ventAgP;
        this.modelo=modelo;
        this.ventAgP.btnAgregar.addActionListener(this);
        this.ventAgP.btnCancelar.addActionListener(this);
        this.ventAgP.btnInicio.addActionListener(this);
        this.ventAgP.btnFacturas.addActionListener(this);
        this.ventAgP.btnProductos.addActionListener(this);
        this.ventAgP.btnClientes.addActionListener(this);
        this.ventAgP.btnEmpleados.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventAgP.setTitle("Agregar Proveedores");
        ventAgP.pack();
        ventAgP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgP.setLocationRelativeTo(null);
        ventAgP.setVisible(true);
        ventAgP.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgP.btnAgregar==evento.getSource()){
            try{
                //System.out.println(ventAgP.txtNomP.getText()+ ventAgP.txtCalle.getText()+ ventAgP.txtColonia.getText()+ ventAgP.txtNumDir.getText()+ ventAgP.txtCiudad.getText()+ ventAgP.txtEstado.getText()+ ventAgP.txtPais.getText()+ ventAgP.txtNumTel.getText()+ ventAgP.txtNomDueño.getText()+ ventAgP.txtPuesto.getText()+ ventAgP.txtCorreo.getText()+ventAgP.txtNomDueñoC.getText()+ventAgP.txtPuestoC.getText()+ventAgP.txtPais.getText());
                modelo.AgProveedores(ventAgP.txtNomP.getText(), ventAgP.txtCalle.getText(), 
                        ventAgP.txtColonia.getText(), ventAgP.txtNumDir.getText(), ventAgP.txtCiudad.getText(),
                        ventAgP.txtEstado.getText(), ventAgP.txtCp.getText(), ventAgP.txtNumTel.getText(),
                        ventAgP.txtNomDueño.getText(), ventAgP.txtPuesto.getText(), ventAgP.txtCorreo.getText(),
                        ventAgP.txtNomDueñoC.getText(),ventAgP.txtPuestoC.getText(),ventAgP.txtPais.getText());
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventAgP.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en btn agregar proveedor: "+e);
            }
        } else if(this.ventAgP.btnCancelar == evento.getSource()){
            controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
            ctProv.IniciarVista();
            ventAgP.setVisible(false);
        }
        else if(ventAgP.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventAgP.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventProv.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventProv.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProv=new controlVentanaProductos1(ventProd1,modelo);
                ctProv.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventProv.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventProv.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
