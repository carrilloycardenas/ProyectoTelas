/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;
import vista.ModificarCorreosProv;
import vista.ModificarProveedor;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModCorreoProveedores implements ActionListener {
    
    ventanaProvedores vProv=new ventanaProvedores();
    ModificarProveedor modProv=new ModificarProveedor();
    ModificarCorreosProv vista=new ModificarCorreosProv();
    consultas modelo = new consultas();
    int rowCor, rowCli;
    Caja ventCaja=new Caja();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();
    ventanaEmpleados ventEmp=new ventanaEmpleados();

    public controlModCorreoProveedores(ModificarCorreosProv vist, ModificarProveedor cli, consultas model, int rowC, int rowCli){
        this.vista = vist;
        this.modelo = model;
        this.modProv = cli;
        this.rowCor = rowC;
        this.rowCli = rowCli;
        this.rowCor = this.modProv.tablaCorreos.getSelectedRow();
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnInicio.addActionListener(this);
        this.vista.btnFacturas.addActionListener(this);
        this.vista.btnProductos.addActionListener(this);
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnEmpleados.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar correo");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        try{
            this.vista.txtCorreo.setText(String.valueOf(this.modProv.tablaCorreos.getValueAt(this.rowCor, 0)));
            this.vista.txtNomMod.setText(String.valueOf(this.modProv.tablaCorreos.getValueAt(this.rowCor, 1)));
        }catch(Exception e){
            System.out.println("Error modCorCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardarModTel == evento.getSource()){
            this.modelo.modCorProv((String.valueOf(this.modProv.tablaCorreos.getValueAt(this.rowCor, 1))), this.vista.txtCorreo.getText(), 
                                    this.vista.txtNomMod.getText());
            controlVentanaProvedores ctEm = new controlVentanaProvedores(this.vProv, this.modelo);
            ctEm.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaProvedores ctEm = new controlVentanaProvedores(this.vProv, this.modelo);
            ctEm.IniciarVista();
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
        else if(vista.btnProductos==evento.getSource()){
            try{
                controlVentanaProductos1 ctProv=new controlVentanaProductos1(ventProd1,modelo);
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
        
        else if(vista.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }

}
