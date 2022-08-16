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
import vista.Facturas;
import vista.ModificarCliente;
import vista.ModificarTelefonosCli;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModClientes implements ActionListener {
    
    ModificarCliente vista = new ModificarCliente();
    VentanaClientes2 vCli = new VentanaClientes2();
    consultas modelo = new consultas();
    ResultSet rsModCli;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    Facturas ventFac=new Facturas();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProvedores ventProv=new ventanaProvedores();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ModificarTelefonosCli vModTelC = new ModificarTelefonosCli();
    int row;

    public controlModClientes(ModificarCliente vent, consultas model, VentanaClientes2 ventCli, int row){
        this.vista = vent;
        this.modelo = model;
        this.row = row;
        this.valor = String.valueOf(ventCli.tablaClientes.getValueAt(row, 0));
        this.rsModCli = this.modelo.VrClientes(this.valor);
        this.vista.btnModTelefono.addActionListener(this);
        this.vista.btnModTelefono.addActionListener(this);
        this.vista.btnGuardarModCli.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
        this.vista.btnProveedores.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
    }

    public void IniciarVista(){
        vista.setTitle("Modificar cliente");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        try{
            this.vista.txtNombre.setText(this.rsModCli.getString("Nombre"));
            this.vista.txtApellido.setText(this.rsModCli.getString("Apellidos"));
            this.vista.txtCalle.setText(this.rsModCli.getString("calle"));
            this.vista.txtColonia.setText(this.rsModCli.getString("Colonia"));
            this.vista.txtNumC.setText(this.rsModCli.getString("numCasa"));
            this.vista.txtCiudad.setText(this.rsModCli.getString("Ciudad"));
            this.vista.txtEstado.setText(this.rsModCli.getString("Estado"));
            this.vista.txtCP.setText(this.rsModCli.getString("Codigo_postal"));
            this.vista.tablaTelefonos.setModel(this.modelo.numCliente(this.valor));
            this.vista.tablaCorreos.setModel(this.modelo.correoCliente(this.valor));
        } catch(SQLException e){
            System.out.println("Error ModCli: " + e);
        }
        vista.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardarModCli == evento.getSource()){
            this.modelo.modCliente(this.vista.txtNombre.getText(), this.vista.txtApellido.getText(), this.vista.txtCalle.getText(), 
                                    this.vista.txtColonia.getText(), this.vista.txtNumC.getText(), this.vista.txtCP.getText(), 
                                    this.vista.txtCiudad.getText(), this.vista.txtEstado.getText(), this.valor);
            controlVentanaClientes ctCli = new controlVentanaClientes(this.vCli, this.modelo);
            ctCli.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnModTelefono == evento.getSource()){
            controlModTelCliente ctModTelCli = new controlModTelCliente(this.vModTelC, this.vista, this.modelo, this.vista.tablaTelefonos.getSelectedRow(), this.row);
            ctModTelCli.IniciarVista();
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
        else if(vista.btnFacturas==evento.getSource()){
            try{
                controlFacturas ctFac=new controlFacturas(ventFac,modelo);
                ctFac.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(this.vista.btnEmpleados==evento.getSource()){
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
    }
}
