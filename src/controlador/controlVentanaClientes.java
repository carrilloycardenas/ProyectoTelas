/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.VentanaClientes2;

public class controlVentanaClientes implements ActionListener{

    VentanaClientes2 ventCli = new VentanaClientes2();
    consultas modelo = new consultas();

    public controlVentanaClientes(VentanaClientes2 ventCl, consultas model){
        this.ventCli = ventCl;
        this.modelo = model;
        this.ventCli.btnAgregarCliente.addActionListener(this);
        this.ventCli.btnModificarCliente.addActionListener(this);
        this.ventCli.btnVercliente.addActionListener(this);
        this.ventCli.btnEliminarcliente.addActionListener(this);
    }

    public void IniciarVista(){
        ventCli.setTitle("Productos");
        ventCli.pack();
        ventCli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventCli.setLocationRelativeTo(null);
        //ventCli.tablaClientes.setModel(modelo.venProd());
        ventCli.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
