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
import vista.ModificarCliente;
import vista.VentanaClientes2;

public class controlModClientes implements ActionListener {
    
    ModificarCliente vista = new ModificarCliente();
    consultas modelo = new consultas();
    ResultSet rsModCli;
    String valor;

    public controlModClientes(ModificarCliente vent, consultas model, VentanaClientes2 ventCli, int row){
        this.vista = vent;
        this.modelo = model;
        this.valor = String.valueOf(ventCli.tablaClientes.getValueAt(row, 0));
        this.rsModCli = this.modelo.VrClientes(this.valor);
        this.vista.btnModTelefono.addActionListener(this);
        this.vista.btnModTelefono.addActionListener(this);
        this.vista.btnGuardarModCli.addActionListener(this);
    }

    public void IniciarVista(){
        vista.setTitle("Modificar cliente");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        try{
            
        } catch(Exception e){
            System.out.println("Error ModCli: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
