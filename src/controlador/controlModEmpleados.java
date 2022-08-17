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
import vista.ModificarCorreosEm;
import vista.ModificarEmpleado;
import vista.ModificarTelefonosEm;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModEmpleados implements ActionListener {
    
    ventanaEmpleados venEmp = new ventanaEmpleados();
    ModificarEmpleado vista = new ModificarEmpleado();
    consultas modelo = new consultas();
    String valor;
    ResultSet rsEmp, rsDirEmp;
    Facturas ventFac=new Facturas();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ModificarCorreosEm modCorEm = new ModificarCorreosEm();
    ModificarTelefonosEm vModTelEm = new ModificarTelefonosEm();
    int row;

    public controlModEmpleados(ModificarEmpleado vist, consultas model, ventanaEmpleados vEmp, int row){
        this.vista = vist;
        this.modelo = model;
        this.venEmp = vEmp;
        this.valor = String.valueOf(this.venEmp.tablaempleados.getValueAt(row, 0));
        this.rsEmp = this.modelo.VrEmpleados(this.valor);
        this.rsDirEmp = this.modelo.idDirEmpleado(this.valor);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnProveedores.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar empleado");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{
            this.vista.txtNombre.setText(this.rsEmp.getString("Nombre"));
            this.vista.txtApellidos.setText(this.rsEmp.getString("Apellidos"));
            this.vista.txtFecha.setText(this.rsEmp.getString("FechaNacimiento"));
            this.vista.txtNSS.setText(this.rsEmp.getString("NumSS"));
            this.vista.txtFechaCon.setText(this.rsEmp.getString("FechaContratacion"));
            switch(this.rsEmp.getString("NombrePuesto")){
                case "Gerente general":
                    this.vista.cbPuesto.setSelectedIndex(0);
                    break;
                case "Supervisor":
                    this.vista.cbPuesto.setSelectedIndex(1);
                    break;
                case "Gerente":
                    this.vista.cbPuesto.setSelectedIndex(2);
                    break;
                case "Encargado de ventas":
                    this.vista.cbPuesto.setSelectedIndex(3);
                    break;
                case "Cajero":
                    this.vista.cbPuesto.setSelectedIndex(4);
                    break;
                case "Vendedor":
                    this.vista.cbPuesto.setSelectedIndex(5);
                    break;
                case "Almacenista":
                    this.vista.cbPuesto.setSelectedIndex(6);
                    break;
            }
            this.vista.txtUsuario.setText(this.rsEmp.getString("Usuario"));
            this.vista.txtContra.setText(this.rsEmp.getString("Contraseña"));
            this.vista.txtCalle.setText(this.rsEmp.getString("calle"));
            this.vista.txtColonia.setText(this.rsEmp.getString("Colonia"));
            this.vista.txtNumC.setText(this.rsEmp.getString("numCasa"));
            this.vista.txtCiudad.setText(this.rsEmp.getString("Ciudad"));
            this.vista.txtEstado.setText(this.rsEmp.getString("Estado"));
            this.vista.txtCP.setText(this.rsEmp.getString("Codigo_postal"));
            this.vista.tablaTelefonos.setModel(this.modelo.numEmpleado(this.valor));
            this.vista.tablaCorreos.setModel(this.modelo.correoEmpleado(this.valor));
        }catch(Exception e){
            System.out.println("ModEmp: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(vista.btnGuardar==evento.getSource()){
            try {
                this.modelo.modEmp(this.vista.txtNombre.getText(), this.vista.txtApellidos.getText(), this.vista.txtFecha.getText(), 
                                    this.vista.txtFechaCon.getText(), this.vista.txtNSS.getText(), this.vista.txtUsuario.getText(), 
                                    this.vista.txtContra.getText(), Integer.toString(this.vista.cbPuesto.getSelectedIndex()+1), 
                                    this.rsDirEmp.getString("idDireccionEmp"), this.vista.txtCalle.getText(), this.vista.txtColonia.getText(), 
                                    this.vista.txtNumC.getText(), this.vista.txtCP.getText(), this.vista.txtCiudad.getText(), 
                                    this.vista.txtEstado.getText(), this.valor);
                controlVentanaEmpleados ctEmp = new controlVentanaEmpleados(this.venEmp, this.modelo);
                ctEmp.IniciarVista();
                this.vista.setVisible(false);
            } catch(SQLException e){
                System.out.println("btnGuardarEmp: " + e);
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
        else if(this.vista.btnModTelefono == evento.getSource()){
            controlModTelEmpleado ctModTelCli = new controlModTelEmpleado(this.vModTelEm, this.vista, this.modelo, this.vista.tablaTelefonos.getSelectedRow(), this.row);
            ctModTelCli.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnModCorreo == evento.getSource()){
            controlModCorreoEmpleado ctModCorCli = new controlModCorreoEmpleado(this.modCorEm, this.vista, this.modelo, this.vista.tablaCorreos.getSelectedRow(), this.row);
            ctModCorCli.IniciarVista();
            this.vista.setVisible(false);
        }
    }

}
