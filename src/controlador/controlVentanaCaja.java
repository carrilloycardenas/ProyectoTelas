/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;

public class controlVentanaCaja implements ActionListener {
    
    controladorReloj ctRel = new controladorReloj();
    Caja vista = new Caja();
    consultas modelo = new consultas();

    public controlVentanaCaja(Caja vist, consultas model){
        this.vista = vist;
        this.modelo = model;
    }

    public void IniciarVista(){
        this.vista.setTitle("Productos");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){

    }

}
