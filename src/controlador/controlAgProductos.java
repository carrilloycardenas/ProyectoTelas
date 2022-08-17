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
import vista.VentanaClientes2;
import vista.ventanaAgProducto;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlAgProductos implements ActionListener{
    
    ventanaAgProducto ventAg = new ventanaAgProducto();
    consultas modelo = new consultas();
    ventanaProductos1 ventProd = new ventanaProductos1();
    controladorReloj ctRel=new controladorReloj();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaEmpleados ventEmp=new ventanaEmpleados();
    ventanaInicio ventIni=new ventanaInicio();
    Caja ventCaja=new Caja();

    public controlAgProductos(ventanaAgProducto ventAg, consultas modelo) {
        this.ventAg = ventAg;
        this.modelo = modelo;
        this.ventAg.btnGuardarProducto.addActionListener(this);
        this.ventAg.btnCancelar.addActionListener(this);
        this.ventAg.btnFacturas.addActionListener(this);
        this.ventAg.btnProveedores.addActionListener(this);
        this.ventAg.btnClientes.addActionListener(this);
        this.ventAg.btnEmpleados.addActionListener(this);
        this.ventAg.btnInicio.addActionListener(this);
    }

    public void IniciarVista(){
        ventAg.setTitle("Agregar producto");
        ventAg.pack();
        ventAg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAg.setLocationRelativeTo(null);
        ventAg.setVisible(true);
        ventAg.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAg.btnGuardarProducto == evento.getSource()) {
            modelo.AgProducto(ventAg.txtNombreProd.getText(),ventAg.txtDescripcion.getText(),
                    ventAg.txtMarca.getText(), ventAg.txtStock.getValue().toString(),
                    ventAg.txtPrecio.getValue().toString(), ventAg.txtLocal.getSelectedItem().toString(),
                    ventAg.txtColor.getText(), Integer.toString(ventAg.txtCategoria.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria2.getSelectedIndex()+1),Integer.toString(ventAg.txtCategoria4.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria3.getSelectedIndex()+1));
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventAg.setVisible(false);
        } else if(ventAg.btnCancelar == evento.getSource()){
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventAg.setVisible(false);
        }
        else if(ventAg.btnFacturas==evento.getSource()){
            try{
                controlVentanaCaja ctCaj=new controlVentanaCaja(ventCaja,modelo);
                ctCaj.IniciarVista();
                ventAg.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Caja: "+e);
            }
        }
        else if(ventAg.btnProveedores==evento.getSource()){
            try{
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventAg.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana productos: "+e);
            }
        }
        
        else if(ventAg.btnClientes==evento.getSource()){
            try{
                controlVentanaClientes ctCli=new controlVentanaClientes(ventCli,modelo);
                ctCli.IniciarVista();
                ventAg.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana clientes: "+e);
            }
        }
        
        else if(ventAg.btnEmpleados==evento.getSource()){
            try{
                controlVentanaEmpleados ctEmp=new controlVentanaEmpleados(ventEmp,modelo);
                ctEmp.IniciarVista();
                ventAg.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
        else if(ventAg.btnInicio==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                ventAg.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }

}
