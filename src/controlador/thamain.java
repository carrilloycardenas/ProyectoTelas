/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.ventanaInicioSesion;
import vista.ventanaProductos1;

/**
 *
 * @author daniel
 */
public class thamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        consultas modelo = new consultas();
        ventanaInicioSesion vista = new ventanaInicioSesion();
        controlVentanaInicioSesion controlador = new controlVentanaInicioSesion(vista, modelo);
        controlador.IniciarVista();
    }
    
}
