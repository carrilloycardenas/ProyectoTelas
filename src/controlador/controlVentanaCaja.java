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

public class controlVentanaCaja implements ActionListener {
    
    controladorReloj ctRel = new controladorReloj();
    ventanaInicio ini = new ventanaInicio();
    Caja vista = new Caja();
    consultas modelo = new consultas();
    ResultSet rs, rsCli;
    controlGenFactura fact = new controlGenFactura();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    VentanaClientes2 ventCli=new VentanaClientes2();

    public controlVentanaCaja(Caja vist, consultas model){
        this.vista = vist;
        this.modelo = model;
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscarCli.addActionListener(this);
        this.vista.btnGenTicket.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnProveedores.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Productos");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnBuscar == evento.getSource()){
            try{
                this.rs = this.modelo.VrProductos(this.vista.txtIdProd.getText());
                this.vista.txtNomProd.setText(this.rs.getString("Nombre"));
                this.vista.txtStock.setText(this.rs.getString("Stock"));
                
            }catch(SQLException e){
                System.out.println("BuscarProd (Caja): " + e);
            }
        } else if(this.vista.btnBuscarCli == evento.getSource()){
            try{
                this.rsCli = this.modelo.setCliente(this.vista.txtIdCli.getText());
                this.vista.btnBuscar.setEnabled(true);
                this.vista.btnCancelar.setEnabled(true);
                this.vista.btnAgregar.setEnabled(true);
                this.vista.spinCantidad.setEnabled(true);
                this.vista.btnAgregar.setEnabled(true);
                this.vista.txtIdCli.setEditable(false);
                this.vista.txtIdEmp.setEditable(false);
                this.vista.cbPago.setEnabled(false);
                this.vista.txtNomCli.setText(this.rsCli.getString("Nombre"));
                this.modelo.genFactura(this.ctRel.calFechaISO(), this.vista.txtIdCli.getText(), String.valueOf(this.vista.cbPago.getSelectedIndex()+1), 
                                        this.vista.txtIdEmp.getText());
            }catch(Exception e){
                System.out.println("btnBuscarProd: " + e);
            }
        } else if(this.vista.btnAgregar == evento.getSource()){
            this.modelo.setRegistra(this.vista.txtIdProd.getText(), String.valueOf(this.vista.spinCantidad.getValue()));
            this.vista.tablaProductosCaja.setModel(this.modelo.setTablaRegistra());
        }
        else if(this.vista.btnGenTicket==evento.getSource()){
            fact.pdf(this.vista.txtNomCli.getText(),this.modelo.setTablaRegistra());
        } else if(this.vista.btnCancelar == evento.getSource()){
            this.vista.setVisible(false);
            controlVentanaInicio ctIni = new controlVentanaInicio(this.ini, this.modelo);
            ctIni.IniciarVista();
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
        else if(ventCli.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(this.vista.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli, modelo);
                ctCli.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
    }

}
