/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.consultas;
import vista.ventanaAgProducto;

public class testAgProductos {
    public static void main(String[] args) {
        
        consultas modelo = new consultas();
        ventanaAgProducto vista = new ventanaAgProducto();
        controlAgProductos controlador = new controlAgProductos(vista, modelo);
        controlador.IniciarVista();

    }
    
}
