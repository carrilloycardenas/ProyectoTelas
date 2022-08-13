/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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
    
    public controlAgClientes(AgregarCliente ventAgC, consultas modelo){
        this.ventAgC=ventAgC;
        this.modelo=modelo;
        this.ventAgC.btnAgregar.addActionListener(this);
        this.ventAgC.btnCancelar.addActionListener(this);
    }

    public void IniciarVista(){
        ventAgC.setTitle("Agregar Clientes");
        ventAgC.pack();
        ventAgC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgC.setLocationRelativeTo(null);
        ventAgC.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgC.btnAgregar == evento.getSource()){
            try {
                modelo.AgClientes(ventAgC.txtNomCli.getText(),ventAgC.txtApell.getText(),ventAgC.txtCalle.getText(), ventAgC.txtColonia.getText(),ventAgC.txtNumeroDire.getText(), ventAgC.txtCiudad.getText(), ventAgC.txtEstado.getText(), ventAgC.txtCP.getText(), ventAgC.txtTelNum.getText(),ventAgC.txtNomDue.getText(),ventAgC.txtCorreo.getText());
                controlVentanaClientes ctVentCli = new controlVentanaClientes(this.ventCli, this.modelo);
                ctVentCli.IniciarVista();
                this.ventAgC.setVisible(false);
            } catch(Exception e){
                System.out.println("btn: " + e);
            }

            
        }
    }
    
}
