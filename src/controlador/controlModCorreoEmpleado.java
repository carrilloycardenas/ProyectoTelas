/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Facturas;
import vista.ModificarCorreosEm;
import vista.ModificarEmpleado;
import vista.VentanaClientes2;
import vista.ventanaEmpleados;
import vista.ventanaInicio;
import vista.ventanaProductos1;
import vista.ventanaProvedores;

public class controlModCorreoEmpleado implements ActionListener {
    
    ventanaEmpleados vEm=new ventanaEmpleados();
    ModificarEmpleado modEm=new ModificarEmpleado();
    ModificarCorreosEm vista=new ModificarCorreosEm();
    consultas modelo = new consultas();
    int rowCor, rowCli;
    Facturas ventFac=new Facturas();
    ventanaProvedores ventProv=new ventanaProvedores();
    VentanaClientes2 ventCli=new VentanaClientes2();
    ventanaProductos1 ventProd1=new ventanaProductos1();
    ventanaInicio ventIni=new ventanaInicio();

    public controlModCorreoEmpleado(ModificarCorreosEm vist, ModificarEmpleado cli, consultas model, int rowC, int rowCli){
        this.vista = vist;
        this.modelo = model;
        this.modEm = cli;
        this.rowCor = rowC;
        this.rowCli = rowCli;
        this.rowCor = this.modEm.tablaCorreos.getSelectedRow();
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar correo");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        try{
            this.vista.txtCorreo.setText(String.valueOf(this.modEm.tablaCorreos.getValueAt(this.rowCor, 0)));
            this.vista.txtNomMod.setText(String.valueOf(this.modEm.tablaCorreos.getValueAt(this.rowCor, 1)));
        }catch(Exception e){
            System.out.println("Error modCorCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardarModTel == evento.getSource()){
            this.modelo.modCorCli((String.valueOf(this.modEm.tablaCorreos.getValueAt(this.rowCor, 1))), this.vista.txtCorreo.getText(), 
                                    this.vista.txtNomMod.getText());
            controlVentanaEmpleados ctEm = new controlVentanaEmpleados(this.vEm, this.modelo);
            ctEm.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaEmpleados ctEm = new controlVentanaEmpleados(this.vEm, this.modelo);
            ctEm.IniciarVista();
            this.vista.setVisible(false);
        }
    }

}
