/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarProveedor;
import vista.Caja;
import vista.ModificarProveedor;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerProveedores;

/**
 *
 * @author daniel
 */
class controlVentanaProvedores implements ActionListener{

    ModificarProveedor vtP = new ModificarProveedor();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaVerProveedores vrPro = new ventanaVerProveedores();
    AgregarProveedor ventAgP=new AgregarProveedor();
    consultas modelo=new consultas();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    Caja ventCaja=new Caja();
    int row;
    controladorReloj ctRel=new controladorReloj();
    
    public controlVentanaProvedores(ventanaProvedores ventP, consultas model){
        this.ventProv=ventP;
        this.modelo=model;
        this.ventProv.btnAgregarProveedor.addActionListener(this);
        this.ventProv.btnModificarProveedor.addActionListener(this);
        this.ventProv.btnVerProveedor.addActionListener(this);
        this.ventProv.btnProductos.addActionListener(this);
        this.ventProv.btnClientes.addActionListener(this);
        this.ventProv.btnEmpleados.addActionListener(this);
        this.ventProv.btnEliminarProveedor.addActionListener(this);
        this.ventProv.btnInicio.addActionListener(this);
        this.ventProv.btnFacturas.addActionListener(this);
        this.ventProv.btnBuscar.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventProv.setTitle("Proveedores");
        ventProv.pack();
        ventProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventProv.setLocationRelativeTo(null);
        ventProv.tablaempleados.setModel(modelo.venProv());
        ventProv.setVisible(true);
        ventProv.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventProv.btnAgregarProveedor==evento.getSource()){
            try{
                controlAgProveedores agProv=new controlAgProveedores(ventAgP,modelo);
                agProv.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en iniciar ventana Ag Proveedores: "+e);
            }
        } else if(ventProv.btnModificarProveedor == evento.getSource()){
            try{
                controlModProveedores ctModP = new controlModProveedores(this.vtP, this.modelo, this.ventProv, this.row);
                ctModP.IniciarVista();
                this.ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error btnModProv: " + e);
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
        
        else if(ventProv.btnEliminarProveedor==evento.getSource()){
            try {
                this.row = ventProv.tablaempleados.getSelectedRow();
                //System.out.println(this.row); //debug line
                String valor = String.valueOf(ventProv.tablaempleados.getValueAt(row, 0));
                //System.out.println(valor); //debug line
                this.modelo.elimProveedor(valor);
                ventProv.setVisible(false);
                this.IniciarVista();
            } catch(Exception e){
                System.out.println("Error btnEliminar en proveedores: " + e);
            }
        } else if(ventProv.btnVerProveedor == evento.getSource()){
            try{
                this.row = ventProv.tablaempleados.getSelectedRow();
                controlVrProveedor ctVrProv = new controlVrProveedor(this.vrPro, this.modelo, this.ventProv, this.row);
                ctVrProv.IniciarVista();
                this.ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("VerProv: " + e);
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
        else if(ventProv.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventProv.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(this.ventProv.btnBuscar == evento.getSource()){
            switch(this.ventProv.txtTipoB.getSelectedIndex()){
                case 0:
                    ventProv.tablaempleados.setModel(modelo.venProv());
                    break;
                case 1:
                    this.ventProv.tablaempleados.setModel(this.modelo.buscarProv(this.ventProv.txtBuscar.getText()));
                    break;
                case 2:
                    this.ventProv.tablaempleados.setModel(this.modelo.buscarProvNom(this.ventProv.txtBuscar.getText()));
                    break;
            }
        }
    }
    
}
