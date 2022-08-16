/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ModificarCliente;
import vista.ModificarCorreosCli;
import vista.VentanaClientes2;

public class controlModCorreoCliente implements ActionListener {
    
    VentanaClientes2 vCli = new VentanaClientes2();
    ModificarCliente modCli = new ModificarCliente();
    ModificarCorreosCli vista = new ModificarCorreosCli();
    consultas modelo = new consultas();
    int rowCor, rowCli;

    public controlModCorreoCliente(ModificarCorreosCli vist, ModificarCliente cli, consultas model, int rowC, int rowCli){
        this.vista = vist;
        this.modelo = model;
        this.modCli = cli;
        this.rowCor = rowC;
        this.rowCli = rowCli;
        this.rowCor = this.modCli.tablaCorreos.getSelectedRow();
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar correo");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        try{
            this.vista.txtCorreo.setText(String.valueOf(this.modCli.tablaCorreos.getValueAt(this.rowCor, 0)));
            this.vista.txtNomMod.setText(String.valueOf(this.modCli.tablaCorreos.getValueAt(this.rowCor, 1)));
        }catch(Exception e){
            System.out.println("Error modCorCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardarModTel == evento.getSource()){
            this.modelo.modCorCli((String.valueOf(this.modCli.tablaCorreos.getValueAt(this.rowCor, 1))), this.vista.txtCorreo.getText(), 
                                    this.vista.txtNomMod.getText());
            controlVentanaClientes ctCli = new controlVentanaClientes(this.vCli, this.modelo);
            ctCli.IniciarVista();
            this.vista.setVisible(false);
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaClientes ctCli = new controlVentanaClientes(this.vCli, this.modelo);
            ctCli.IniciarVista();
            this.vista.setVisible(false);
        }
    }

}
