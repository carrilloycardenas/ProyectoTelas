/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ModificarEmpleado;
import vista.ventanaEmpleados;

public class controlModEmpleados implements ActionListener {
    
    ventanaEmpleados venEmp = new ventanaEmpleados();
    ModificarEmpleado vista = new ModificarEmpleado();
    consultas modelo = new consultas();
    String valor;
    ResultSet rsEmp;

    public controlModEmpleados(ModificarEmpleado vist, consultas model, ventanaEmpleados vEmp, int row){
        this.vista = vist;
        this.modelo = model;
        this.venEmp = vEmp;
        this.valor = String.valueOf(this.venEmp.tablaempleados.getValueAt(row, 0));
        this.rsEmp = this.modelo.VrEmpleados(this.valor);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar empleado");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{
            this.vista.txtNombre.setText(this.rsEmp.getString("Nombre"));
            this.vista.txtApellidos.setText(this.rsEmp.getString("Apellidos"));
            this.vista.txtFecha.setText(this.rsEmp.getString("FechaN"));
            this.vista.txtCalle.setText(this.rsEmp.getString("calle"));
            this.vista.txtColonia.setText(this.rsEmp.getString("Colonia"));
        }catch(Exception e){
            System.out.println("ModEmp: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
