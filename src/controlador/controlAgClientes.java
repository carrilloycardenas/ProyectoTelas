/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.consultas;
import vista.AgregarCliente;
import vista.VentanaClientes2;

/**
 *
 * @author daniel
 */
public class controlAgClientes implements ActionListener{
    
    AgregarCliente ventAgC =new AgregarCliente();
    consultas modelo=new consultas();
    VentanaClientes2 ventCli=new VentanaClientes2();

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
