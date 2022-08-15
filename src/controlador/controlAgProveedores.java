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
import vista.Facturas;

/**
 *
 * @author daniel
 */
public class controlAgProveedores implements ActionListener{
    AgregarProveedor ventAgP = new AgregarProveedor();
    consultas modelo = new consultas();
    ventanaProvedores ventProv=new ventanaProvedores();
    controladorReloj ctRel=new controladorReloj();
    Facturas ventFac=new Facturas();
    
    public controlAgProveedores(AgregarProveedor ventAgP, consultas modelo){
        this.ventAgP=ventAgP;
        this.modelo=modelo;
        this.ventAgP.btnAgregar.addActionListener(this);
        this.ventAgP.btnCancelar.addActionListener(this);
        this.ventAgP.btnFacturas.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventAgP.setTitle("Agregar Proveedores");
        ventAgP.pack();
        ventAgP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgP.setLocationRelativeTo(null);
        ventAgP.setVisible(true);
        ventAgP.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgP.btnAgregar==evento.getSource()){
            try{
                //System.out.println(ventAgP.txtNomP.getText()+ ventAgP.txtCalle.getText()+ ventAgP.txtColonia.getText()+ ventAgP.txtNumDir.getText()+ ventAgP.txtCiudad.getText()+ ventAgP.txtEstado.getText()+ ventAgP.txtPais.getText()+ ventAgP.txtNumTel.getText()+ ventAgP.txtNomDueño.getText()+ ventAgP.txtPuesto.getText()+ ventAgP.txtCorreo.getText()+ventAgP.txtNomDueñoC.getText()+ventAgP.txtPuestoC.getText()+ventAgP.txtPais.getText());
                modelo.AgProveedores(ventAgP.txtNomP.getText(), ventAgP.txtCalle.getText(), 
                        ventAgP.txtColonia.getText(), ventAgP.txtNumDir.getText(), ventAgP.txtCiudad.getText(),
                        ventAgP.txtEstado.getText(), ventAgP.txtCp.getText(), ventAgP.txtNumTel.getText(),
                        ventAgP.txtNomDueño.getText(), ventAgP.txtPuesto.getText(), ventAgP.txtCorreo.getText(),
                        ventAgP.txtNomDueñoC.getText(),ventAgP.txtPuestoC.getText(),ventAgP.txtPais.getText());
                controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
                ctProv.IniciarVista();
                ventAgP.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en btn agregar proveedor: "+e);
            }
        } else if(this.ventAgP.btnCancelar == evento.getSource()){
            controlVentanaProvedores ctProv=new controlVentanaProvedores(ventProv,modelo);
            ctProv.IniciarVista();
            ventAgP.setVisible(false);
        }
        else if(ventAgP.btnFacturas==evento.getSource()){
            try{
                controlFacturas ctFac=new controlFacturas(ventFac,modelo);
                ctFac.IniciarVista();
                ventAgP.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
        }
    }
}
