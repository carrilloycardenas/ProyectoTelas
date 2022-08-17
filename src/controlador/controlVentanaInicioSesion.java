/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    
    public void IniciarVista(){
        vista.setTitle("Inicio de sesion");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnEntrar==evento.getSource()){
            if(this.modelo.login(vista.txtUsuario.getText(),vista.txtContraIS.getText())==true){
            try{
                controlVentanaInicio ctIni=new controlVentanaInicio(ventIni,modelo);
                ctIni.IniciarVista();
                vista.setVisible(false);
            }catch(Exception e){
                System.out.println("Error iniciando ventana Empleados: "+e);
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraceña incorrecto");
            }
        }
    }
}
