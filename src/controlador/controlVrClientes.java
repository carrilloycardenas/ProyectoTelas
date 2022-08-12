/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import modelo.consultas;
import vista.VentanaClientes2;

import vista.ventanaVerClientes;
/**
 *
 * @author Josselin
 */
public class controlVrClientes implements ActionListener {
    
    ventanaVerClientes ventVr;
    consultas modelo =new consultas();
    VentanaClientes2 ventClien;
    ResultSet rs;
    
    public controlVrClientes(ventanaVerClientes ventVr,consultas modelo,VentanaClientes2 ventClien, int row){
        this.ventClien= ventClien;
        this.ventVr=ventVr;
        this.modelo=modelo;
        this.ventVr.btnEliminarCliente.addActionListener(this);
        this.ventVr.btnVolverClientes.addActionListener(this);
        
        String valor = String.valueOf(ventClien.tablaClientes.getValueAt(row, 0));
        System.out.println(valor);
        this.rs = modelo.VrClientes( valor);  
    }
     public void IniciarVista(){
         ventVr.setTitle("Mostrar Cliente");
         ventVr.pack();
         ventVr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ventVr.setLocationRelativeTo(null);
         ventVr.setVisible(true);
         try{
             ventVr.lblidCliente.setText(rs.getString("ID"));            
             ventVr.lblNombre.setText(rs.getString("Nombre"));
             ventVr.lblApellido.setText(rs.getString("Apellidos"));
             ventVr.lblCalleCliente.setText(rs.getString("Calle"));
             ventVr.lblColoniaCliente.setText(rs.getString("Colonia"));
             ventVr.lblNumeroCliente.setText(rs.getString("Número"));
             ventVr.lblCiudadCliente.setText(rs.getString("Ciudad"));
             ventVr.lblEstadoCliente.setText(rs.getString("Estado"));
             ventVr.lblNumero1.setText(rs.getString("Número"));
             ventVr.lblNombre1.setText(rs.getString("Nombre"));
             ventVr.lblNumero2.setText(rs.getString("Número"));
             ventVr.lblNombre2.setText(rs.getString("Nombre"));
             ventVr.lblCorreo1.setText(rs.getString("Correo"));
             ventVr.lblCorreo2.setText(rs.getString("Correo"));      
         }catch(SQLException e){
             System.out.println("error en controlVrClientes" + e);
             
         }
     }
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVr.btnVolverClientes == evento.getSource() ){
            controlVentanaClientes2 ctClien = new controlVentanaClientes2 (ventClien, modelo);
            
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
