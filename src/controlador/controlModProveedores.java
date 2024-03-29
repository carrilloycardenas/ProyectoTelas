/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;
import vista.ModificarCorreosProv;
import vista.ModificarProveedor;
import vista.ModificarTelefonosProv;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModProveedores implements ActionListener{
    
    ModificarProveedor vista = new ModificarProveedor();
    ventanaProvedores vPro = new ventanaProvedores();
    consultas modelo = new consultas();
    ResultSet rsModP;
    String valor;       
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ModificarCorreosProv modCorProv = new ModificarCorreosProv();
    ModificarTelefonosProv vModTelP = new ModificarTelefonosProv();
    int row;

    public controlModProveedores(ModificarProveedor modP, consultas model, ventanaProvedores vPro, int row){
        this.vista = modP;
        this.modelo = model;
        this.row = row;
        this.valor = String.valueOf(vPro.tablaempleados.getValueAt(row, 0));
        this.rsModP = this.modelo.VrProveedores(this.valor);
        this.vista.btnModTelefono.addActionListener(this);
        this.vista.btnModCorreo.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar proveedor");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{
            this.vista.txtNombre.setText(this.rsModP.getString("Nombre"));
            this.vista.txtCalle.setText(this.rsModP.getString("calle"));
            this.vista.txtColonia.setText(this.rsModP.getString("Colonia"));
            this.vista.txtNumC.setText(this.rsModP.getString("numCasa"));
            this.vista.txtCiudad.setText(this.rsModP.getString("Ciudad"));
            this.vista.txtEstado.setText(this.rsModP.getString("Estado"));
            this.vista.txtCP.setText(this.rsModP.getString("Codigo_postal"));
            this.vista.txtPais.setText(this.rsModP.getString("pais"));
            this.vista.tablaTelefonos.setModel(this.modelo.numProveedor(this.valor));
            this.vista.tablaCorreos.setModel(this.modelo.correoProveedor(this.valor));
        }catch(Exception e){
            System.out.println("Error ModProv: " + e);
        }
        vista.lblFecha.setText(ctRel.calFechaC());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardar == evento.getSource()){
            this.modelo.modProveedores(this.vista.txtNombre.getText(), this.vista.txtCalle.getText(), this.vista.txtColonia.getText(), 
                                        this.vista.txtNumC.getText(), this.vista.txtCiudad.getText(), this.vista.txtEstado.getText(), 
                                        this.vista.txtCP.getText(), this.vista.txtPais.getText(), this.valor);
            controlVentanaProvedores ctP = new controlVentanaProvedores(this.vPro, this.modelo);
            ctP.IniciarVista();
            this.vista.setVisible(false);
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
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
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
        
        else if(vista.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(this.vista.btnModTelefono == evento.getSource()){
            controlModTelProveedores ctModTelCli = new controlModTelProveedores(this.vModTelP, this.vista, this.modelo, this.vista.tablaTelefonos.getSelectedRow(), this.row);
            ctModTelCli.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnModCorreo == evento.getSource()){
            controlModCorreoProveedores ctModCorCli = new controlModCorreoProveedores(this.modCorProv, this.vista, this.modelo, this.vista.tablaCorreos.getSelectedRow(), this.row);
            ctModCorCli.IniciarVista();
            this.vista.setVisible(false);
        }
    }
}
