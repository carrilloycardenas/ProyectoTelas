/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Facturas;

public class controlVentanaFacturas implements ActionListener {
    
    controladorReloj ctR = new controladorReloj();
    Facturas vista = new Facturas();
    consultas modelo = new consultas();

    public controlVentanaFacturas(Facturas vist, consultas model){
        this.vista = vist;
        this.modelo = model;
    }

    public void IniciarVista(){
        this.vista.setTitle("Clientes");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.lblFecha.setText(ctR.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
