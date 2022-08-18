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
import vista.ventanaVerEmpleado;

/**
 *
 * @author daniel
 */
public class controlVrEmpleados implements ActionListener{
    
    ventanaVerEmpleado ventVrEm;
    consultas modelo=new consultas();
    ventanaEmpleados ventEm;
    ResultSet rs;
    String valor;
    controladorReloj ctRel=new controladorReloj();
    Caja ventCaja=new Caja();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlVrEmpleados(ventanaVerEmpleado ventVrEm, consultas modelo, int row,ventanaEmpleados ventEm){
        this.ventEm = ventEm;
        this.ventVrEm = ventVrEm;
        this.modelo = modelo;
        this.ventVrEm.btnEliminar.addActionListener(this);
        this.ventVrEm.btnVolver.addActionListener(this);
        //System.out.println(row);
        valor = String.valueOf(ventEm.tablaempleados.getValueAt(row, 0));
        System.out.println(valor);
        this.rs = modelo.VrEmpleados(this.valor);
        //this.rs = modelo.VrProductos("1");
        this.ventVrEm.btnFacturas.addActionListener(this);
        this.ventVrEm.btnProveedores.addActionListener(this);
        this.ventVrEm.btnClientes.addActionListener(this);
        this.ventVrEm.btnProductos.addActionListener(this);
        this.ventVrEm.btnInicio.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventVrEm.setTitle("Mostrar empleado");
        ventVrEm.pack();
        ventVrEm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventVrEm.setLocationRelativeTo(null);
        ventVrEm.setVisible(true);
        try {
            ventVrEm.lblNombre1.setText(rs.getString("Nombre"));
            ventVrEm.lblApell.setText(rs.getString("Apellidos"));
            ventVrEm.lblID.setText(rs.getString("idEmpleados"));
            ventVrEm.lblFecNacimiento.setText(rs.getString("FechaNacimiento"));
            ventVrEm.lblNumSocial.setText(rs.getString("NumSS"));
            ventVrEm.lblFecContratacion.setText(rs.getString("FechaContratacion"));
            ventVrEm.lblPuesto.setText(rs.getString("NombrePuesto"));
            ventVrEm.lblSueldo.setText(rs.getString("Sueldo"));
            ventVrEm.lblUsuario.setText(rs.getString("Usuario"));
            ventVrEm.lblPassword.setText(rs.getString("Contraseña"));
            ventVrEm.lblCalle.setText(rs.getString("calle"));
            ventVrEm.lblColonia.setText(rs.getString("Colonia"));
            ventVrEm.lblNumero.setText(rs.getString("numCasa"));
            ventVrEm.lblCiudad.setText(rs.getString("Ciudad"));
            ventVrEm.lblEstado.setText(rs.getString("Estado"));
            ventVrEm.lblCodigoP.setText(rs.getString("Codigo_postal"));
            this.ventVrEm.tablaTelefonos.setModel(this.modelo.numEmpleado(this.valor));
            this.ventVrEm.tablaCorreos.setModel(this.modelo.correoEmpleado(this.valor));
            
            
        } catch(SQLException e){
            System.out.println("error en controlVrProducto "+e);
        }
        ventVrEm.lblFecha.setText(ctRel.calFechaC());
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVrEm.btnVolver == evento.getSource()){
            controlVentanaEmpleados ctEm = new controlVentanaEmpleados(ventEm, modelo);
            ctEm.IniciarVista();
            ventVrEm.setVisible(false);
        }
        else if(ventVrEm.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventVrEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventVrEm.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventVrEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventVrEm.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventVrEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventVrEm.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctEmp=new controlVentanaProductos1(ventProd1,modelo);
                ctEmp.IniciarVista();
                ventVrEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        
        else if(ventVrEm.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventVrEm.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
