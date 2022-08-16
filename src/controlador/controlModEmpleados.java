/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ModificarEmpleado;
import vista.ventanaEmpleados;

public class controlModEmpleados implements ActionListener {
    
    ventanaEmpleados venEmp = new ventanaEmpleados();
    ModificarEmpleado vista = new ModificarEmpleado();
    consultas modelo = new consultas();
    String valor;
    ResultSet rsEmp, rsDirEmp;

    public controlModEmpleados(ModificarEmpleado vist, consultas model, ventanaEmpleados vEmp, int row){
        this.vista = vist;
        this.modelo = model;
        this.venEmp = vEmp;
        this.valor = String.valueOf(this.venEmp.tablaempleados.getValueAt(row, 0));
        this.rsEmp = this.modelo.VrEmpleados(this.valor);
        this.rsDirEmp = this.modelo.idDirEmpleado(this.valor);
        this.vista.btnGuardar.addActionListener(this);
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
            this.vista.txtFecha.setText(this.rsEmp.getString("FechaNacimiento"));
            this.vista.txtNSS.setText(this.rsEmp.getString("NumSS"));
            this.vista.txtFechaCon.setText(this.rsEmp.getString("FechaContratacion"));
            switch(this.rsEmp.getString("NombrePuesto")){
                case "Gerente general":
                    this.vista.cbPuesto.setSelectedIndex(0);
                    break;
                case "Supervisor":
                    this.vista.cbPuesto.setSelectedIndex(1);
                    break;
                case "Gerente":
                    this.vista.cbPuesto.setSelectedIndex(2);
                    break;
                case "Encargado de ventas":
                    this.vista.cbPuesto.setSelectedIndex(3);
                    break;
                case "Cajero":
                    this.vista.cbPuesto.setSelectedIndex(4);
                    break;
                case "Vendedor":
                    this.vista.cbPuesto.setSelectedIndex(5);
                    break;
                case "Almacenista":
                    this.vista.cbPuesto.setSelectedIndex(6);
                    break;
            }
            this.vista.txtUsuario.setText(this.rsEmp.getString("Usuario"));
            this.vista.txtContra.setText(this.rsEmp.getString("Contraseña"));
            this.vista.txtCalle.setText(this.rsEmp.getString("calle"));
            this.vista.txtColonia.setText(this.rsEmp.getString("Colonia"));
            this.vista.txtNumC.setText(this.rsEmp.getString("numCasa"));
            this.vista.txtCiudad.setText(this.rsEmp.getString("Ciudad"));
            this.vista.txtEstado.setText(this.rsEmp.getString("Estado"));
            this.vista.txtCP.setText(this.rsEmp.getString("Codigo_postal"));
        }catch(Exception e){
            System.out.println("ModEmp: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(vista.btnGuardar==evento.getSource()){
            try {
                this.modelo.modEmp(this.vista.txtNombre.getText(), this.vista.txtApellidos.getText(), this.vista.txtFecha.getText(), 
                                    this.vista.txtFechaCon.getText(), this.vista.txtNSS.getText(), this.vista.txtUsuario.getText(), 
                                    this.vista.txtContra.getText(), Integer.toString(this.vista.cbPuesto.getSelectedIndex()+1), 
                                    this.rsDirEmp.getString("idDireccionEmp"), this.vista.txtCalle.getText(), this.vista.txtColonia.getText(), 
                                    this.vista.txtNumC.getText(), this.vista.txtCP.getText(), this.vista.txtCiudad.getText(), 
                                    this.vista.txtEstado.getText(), this.valor);
                controlVentanaEmpleados ctEmp = new controlVentanaEmpleados(this.venEmp, this.modelo);
                ctEmp.IniciarVista();
                this.vista.setVisible(false);
            } catch(SQLException e){
                System.out.println("btnGuardarEmp: " + e);
            }
            
        }
    }

}
