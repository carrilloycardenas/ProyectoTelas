/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarEmpleado;
import vista.ventanaEmpleados;

/**
 *
 * @author daniel
 */
public class controlAgEmpleados implements ActionListener{
    AgregarEmpleado ventAgE=new AgregarEmpleado();
    consultas modelo = new consultas();
    ventanaEmpleados ventE=new ventanaEmpleados();
    
    public controlAgEmpleados(AgregarEmpleado ventAgE, consultas modelo){
        this.ventAgE=ventAgE;
        this.modelo=modelo;
        this.ventAgE.btnAgregar.addActionListener(this);
        this.ventAgE.btnCancelar.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventAgE.setTitle("Agregar Empleados");
        ventAgE.pack();
        ventAgE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgE.setLocationRelativeTo(null);
        ventAgE.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAgE.btnAgregar==evento.getSource()){
            try{
                //System.out.println(ventAgP.txtNomP.getText()+ ventAgP.txtCalle.getText()+ ventAgP.txtColonia.getText()+ ventAgP.txtNumDir.getText()+ ventAgP.txtCiudad.getText()+ ventAgP.txtEstado.getText()+ ventAgP.txtPais.getText()+ ventAgP.txtNumTel.getText()+ ventAgP.txtNomDueño.getText()+ ventAgP.txtPuesto.getText()+ ventAgP.txtCorreo.getText()+ventAgP.txtNomDueñoC.getText()+ventAgP.txtPuestoC.getText()+ventAgP.txtPais.getText());
                modelo.AgEmpleados(ventAgE.txtNomE.getText(),ventAgE.txtApell.getText(),
                        ventAgE.txtFechaN.getText(),ventAgE.txtNumSS.getText(),ventAgE.txtFechaDCon.getText(),
                        Integer.toString(ventAgE.txtPuesto.getSelectedIndex()+1),ventAgE.txtUser.getText(),
                        ventAgE.txtPassword.getText(),ventAgE.txtCalle.getText(),ventAgE.txtColonia.getText(),
                        ventAgE.txtNumDire.getText(),ventAgE.txtCiudad.getText(),ventAgE.txtEstado.getText(),
                        ventAgE.txtCp.getText(),ventAgE.txtTelNume.getText(),ventAgE.txtCorreo.getText());
                controlVentanaEmpleados ctCli=new controlVentanaEmpleados(ventE,modelo);
                ctCli.IniciarVista();
                ventAgE.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en btn agregar Empleados: "+e);
            }
        }
    }
}
