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
public class controlVentanaEmpleados implements ActionListener{
    
    ventanaEmpleados ventEm=new ventanaEmpleados();
    AgregarEmpleado agEm=new AgregarEmpleado();
    consultas modelo=new consultas();
    
    public controlVentanaEmpleados(ventanaEmpleados ventEm, consultas model){
        this.ventEm=ventEm;
        this.modelo=model;
        this.ventEm.btnAgregarEmpleado.addActionListener(this);
        this.ventEm.btnModificarEmpleado.addActionListener(this);
        this.ventEm.btnVerEmpleado.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventEm.setTitle("Productos");
        ventEm.pack();
        ventEm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventEm.setLocationRelativeTo(null);
        ventEm.tablaempleados.setModel(modelo.verEmpleados());
        ventEm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.ventEm.btnAgregarEmpleado == evento.getSource()){
            controlAgEmpleados ctAgE = new controlAgEmpleados(this.agEm, this.modelo);
            ctAgE.IniciarVista();
            this.ventEm.setVisible(false);
        }
    }
    
}
