/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.AgregarProveedor;
import vista.ventanaProvedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class controlAgProveedores implements ActionListener{
    AgregarProveedor ventAgP = new AgregarProveedor();
    consultas modelo = new consultas();
    ventanaProvedores ventProv=new ventanaProvedores();
    
    public controlAgProveedores(AgregarProveedor ventAgP, consultas modelo){
        this.ventAgP=ventAgP;
        this.modelo=modelo;
        this.ventAgP.btnAgregar.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventAgP.setTitle("Agregar Proveedores");
        ventAgP.pack();
        ventAgP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgP.setLocationRelativeTo(null);
        ventAgP.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgP.btnAgregar==evento.getSource()){
            try{
            modelo.AgProveedores(ventAgP.txtNomP.getText(), ventAgP.txtCalle.getText(), ventAgP.txtColonia.getText(), ventAgP.txtNumDir.getText(), ventAgP.txtCiudad.getText(), ventAgP.txtEstado.getText(), ventAgP.txtPais.getText(), ventAgP.txtNumTel.getText(), ventAgP.txtNomDueño.getText(), ventAgP.txtPuesto.getText(), ventAgP.txtCorreo.getText(),ventAgP.txtNomDueñoC.getText(),ventAgP.txtPuestoC.getText(),ventAgP.txtPais.getText());
            controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
            ctProv.IniciarVista();
            ventAgP.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en btn agregar proveedor: "+e);
            }
        }
    }
}
