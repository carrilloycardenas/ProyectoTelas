/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import modelo.consultas;
import vista.ventanaEmpleados;
import vista.ventanaVerEmpleado;

/**
 *
 * @author daniel
 */
public class controlVrEmpleados implements ActionListener{
    
    ventanaVerEmpleado ventVrEm;
    consultas modelo=new consultas();
    ventanaEmpleados ventEm;
    ResultSet rs;
    
    public controlVrEmpleados(ventanaVerEmpleado ventVrEm, consultas modelo, int row,ventanaEmpleados ventEm){
        this.ventEm = ventEm;
        this.ventVrEm = ventVrEm;
        this.modelo = modelo;
        this.ventVrEm.btnEliminar.addActionListener(this);
        this.ventVrEm.btnVolver.addActionListener(this);
        //System.out.println(row);
        String valor = String.valueOf(ventEm.tablaempleados.getValueAt(row, 0));
        System.out.println(valor);
        this.rs = modelo.VrEmpleados(valor);
        //this.rs = modelo.VrProductos("1");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
