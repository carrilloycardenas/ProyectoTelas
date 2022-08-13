/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarProveedor;
import vista.ventanaProvedores;

/**
 *
 * @author daniel
 */
class controlVentanaProvedores implements ActionListener{
    ventanaProvedores ventProv=new ventanaProvedores();
    AgregarProveedor ventAgP=new AgregarProveedor();
    consultas modelo=new consultas();
    int row;
    
    public controlVentanaProvedores(ventanaProvedores ventP, consultas model){
        this.ventProv=ventP;
        this.modelo=model;
        this.ventProv.btnAgregarProveedor.addActionListener(this);
        this.ventProv.btnModificarProveedor.addActionListener(this);
        this.ventProv.btnVerProveedor.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventProv.setTitle("Proveedores");
        ventProv.pack();
        ventProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventProv.setLocation(null);
        ventProv.tablaempleados.setModel(modelo.venProv());
        ventProv.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
