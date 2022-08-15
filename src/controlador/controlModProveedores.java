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
import vista.ModificarProveedor;
import vista.ventanaProvedores;

public class controlModProveedores implements ActionListener{
    
    ModificarProveedor vista = new ModificarProveedor();
    ventanaProvedores vPro = new ventanaProvedores();
    consultas modelo = new consultas();
    ResultSet rsModP;
    String valor;

    public controlModProveedores(ModificarProveedor modP, consultas model, ventanaProvedores vPro, int row){
        this.vista = modP;
        this.modelo = model;
        this.valor = String.valueOf(vPro.tablaempleados.getValueAt(row, 0));
        this.rsModP = this.modelo.VrProveedores(this.valor);
        this.vista.btnModTel.addActionListener(this);
        this.vista.btnModCorreo.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar proveedor");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{
            this.vista.txtNombre.setText(this.rsModP.getString("Nombre"));
            this.vista.txtCalle.setText(this.rsModP.getString("calle"));
            this.vista.txtColonia.setText(this.rsModP.getString("Colonia"));
            this.vista.txtNumC.setText(this.rsModP.getString("numCasa"));
            this.vista.txtCiudad.setText(this.rsModP.getString("Ciudad"));
            this.vista.txtEstado.setText(this.rsModP.getString("Estado"));
            this.vista.txtCP.setText(this.rsModP.getString("Codigo_postal"));
            this.vista.tablaTelefonos.setModel(this.modelo.numProveedor(this.valor));
            this.vista.tablaCorreos.setModel(this.modelo.correoProveedor(this.valor));
        }catch(Exception e){
            System.out.println("Error ModProv: " + e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardar == evento.getSource()){
            this.modelo.modProveedores(this.vista.txtNombre.getText(), this.vista.txtCalle.getText(), this.vista.txtColonia.getText(), 
                                        this.vista.txtNumC.getText(), this.vista.txtCiudad.getText(), this.vista.txtEstado.getText(), 
                                        this.vista.txtCP.getText(), "", this.valor);
        }
    }

}
