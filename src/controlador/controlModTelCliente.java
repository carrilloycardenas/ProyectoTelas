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
import vista.ModificarTelefonosCli;
import vista.VentanaClientes2;

public class controlModTelCliente implements ActionListener {

    ModificarTelefonosCli vista = new ModificarTelefonosCli();
    VentanaClientes2 vCli = new VentanaClientes2();
    consultas modelo = new consultas();
    ModificarCliente modCli = new ModificarCliente();
    int rowTel, rowCli;

    public controlModTelCliente(ModificarTelefonosCli modTC, ModificarCliente modCli, consultas model, int rowT, int rowC){
        this.vista = modTC;
        this.modelo = model;
        this.modCli = modCli;
        this.rowTel = this.modCli.tablaTelefonos.getSelectedRow();
        this.rowCli = rowC;
        this.vista.btnGuardarModTel.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Modificar telefono");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        try{
            this.vista.txtNumMod.setText(String.valueOf(this.modCli.tablaTelefonos.getValueAt(this.rowTel, 0)));
            this.vista.txtNomMod.setText(String.valueOf(this.modCli.tablaTelefonos.getValueAt(this.rowTel, 1)));
        }catch(Exception e){
            System.out.println("Error modTelCli: " + e);
        }
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnGuardarModTel == evento.getSource()){
            try{
                this.modelo.modTelCli((String.valueOf(this.modCli.tablaTelefonos.getValueAt(this.rowTel, 1))), this.vista.txtNumMod.getText(), 
                                        this.vista.txtNomMod.getText());
                controlVentanaClientes ctCli = new controlVentanaClientes(this.vCli, this.modelo);
                ctCli.IniciarVista();
                this.vista.setVisible(false);
            }catch(Exception e){
                System.out.println("btnGuardarModTel: " + e);
            }
            
        } else if(this.vista.btnCancelar == evento.getSource()){
            controlVentanaClientes ctCli = new controlVentanaClientes(this.vCli, this.modelo);
            ctCli.IniciarVista();
            this.vista.setVisible(false);
        }
    }

}
