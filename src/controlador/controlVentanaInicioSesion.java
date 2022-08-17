/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.consultas;
import vista.ventanaInicio;
import vista.ventanaInicioSesion;

/**
 *
 * @author daniel
 */
public class controlVentanaInicioSesion implements ActionListener{
    ventanaInicioSesion vista=new ventanaInicioSesion();
    consultas modelo=new consultas();
    ventanaInicio ventIni=new ventanaInicio();
    
    public controlVentanaInicioSesion(ventanaInicioSesion vist, consultas model){
        this.vista=vist;
        this.modelo=model;
        this.vista.btnEntrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnEntrar==evento.getSource()){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error en iniciar ventana inicio: "+e);
            }
        }
    }
}
