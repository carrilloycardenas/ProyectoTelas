/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.ventanaProductos1;

public class testVentanaProd1 {

    public static void main(String[] args) {
        
        consultas modelo = new consultas();
        ventanaProductos1 vista = new ventanaProductos1();
        controlVentanaProductos1 controlador = new controlVentanaProductos1(vista, modelo);
        controlador.IniciarVista();

    }
    
}
