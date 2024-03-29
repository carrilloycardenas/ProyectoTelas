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
import vista.Caja;
import vista.ModificarCliente;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;
import vista.ventanaVerClientes;

public class controlVentanaClientes implements ActionListener{

    VentanaClientes2 ventCli = new VentanaClientes2();
    AgregarCliente agCli = new AgregarCliente();
    ventanaVerClientes vrCli = new ventanaVerClientes();
    ModificarCliente modCli = new ModificarCliente();
    consultas modelo = new consultas();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    Caja ventCaja=new Caja();
    int row;
    controladorReloj ctRel=new controladorReloj();

    public controlVentanaClientes(VentanaClientes2 ventCl, consultas model){
        this.ventCli = ventCl;
        this.modelo = model;
        this.ventCli.btnAgregarCliente.addActionListener(this);
        this.ventCli.btnModificarCliente.addActionListener(this);
        this.ventCli.btnVercliente.addActionListener(this);
        this.ventCli.btnEliminarcliente.addActionListener(this);
        this.ventCli.btnEmpleados.addActionListener(this);
        this.ventCli.btnProveedores.addActionListener(this);
        this.ventCli.btnProductos.addActionListener(this);
        this.ventCli.btnInicio.addActionListener(this);
        this.ventCli.btnFacturas.addActionListener(this);
        this.ventCli.btnBuscar.addActionListener(this);
    }

    public void IniciarVista(){
        ventCli.setTitle("Clientes");
        ventCli.pack();
        ventCli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventCli.setLocationRelativeTo(null);
        //ventCli.tablaClientes.setModel(modelo.verClientes());
        ventCli.setVisible(true);
        ventCli.lblFecha.setText(ctRel.calFechaC());
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
        } else if(this.ventCli.btnModificarCliente == evento.getSource()){
            this.row = this.ventCli.tablaClientes.getSelectedRow();
            controlModClientes ctModCli = new controlModClientes(this.modCli, this.modelo, this.ventCli, this.row);
            ctModCli.IniciarVista();
            this.ventCli.setVisible(false);
        } else if(this.ventCli.btnBuscar == evento.getSource()){
            switch(this.ventCli.txtTipoB.getSelectedIndex()){
                case 0:
                    ventCli.tablaClientes.setModel(modelo.verClientes());
                    break;
                case 1:
                    this.ventCli.tablaClientes.setModel(this.modelo.buscarCli(this.ventCli.txtBuscar.getText()));
                    break;
                case 2:
                    this.ventCli.tablaClientes.setModel(this.modelo.buscarCliNom(this.ventCli.txtBuscar.getText()));
                    break;
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
        
        else if(ventCli.btnEliminarcliente==evento.getSource()){
            try {
                this.row = ventCli.tablaClientes.getSelectedRow();
                //System.out.println(this.row); //debug line
                String valor = String.valueOf(ventCli.tablaClientes.getValueAt(row, 0));
                //System.out.println(valor); //debug line
                this.modelo.elimCli(valor);
                ventProd1.setVisible(false);
                this.IniciarVista();
            } catch(Exception e){
                System.out.println("Error btnEliminar: " + e);
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
        else if(ventCli.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventCli.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
    }
}
