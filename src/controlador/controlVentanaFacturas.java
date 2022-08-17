/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.consultas;
import vista.Facturas;

public class controlVentanaFacturas implements ActionListener {
    
    Facturas vista = new Facturas();
    consultas modelo = new consultas();

    public controlVentanaFacturas(Facturas vist, consultas model){
        this.vista = vist;
        this.modelo = model;
    }

    public void IniciarVista(){

    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
