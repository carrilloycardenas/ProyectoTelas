/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.VentanaClientes2;

public class testAgProductos {
    public static void main(String[] args) {
        
        consultas modelo = new consultas();
        VentanaClientes2 vista = new VentanaClientes2();
        controlVentanaClientes controlador = new controlVentanaClientes(vista, modelo);
        controlador.IniciarVista();

    }
    
}
