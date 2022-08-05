/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.consultas;
import vista.ventanaProductos1;

/**
 *
 * @author daniel
 */
public class controlVentanaProductos1 {
    
    ventanaProductos1 ventProd1;
    consultas modelo;

    public controlVentanaProductos1(ventanaProductos1 vent, consultas model){
        this.ventProd1 = vent;
        this.modelo = model;
    }
    
    public void IniciarVista(){
        ventProd1.setTitle("Productos");
        ventProd1.pack();
        ventProd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventProd1.setLocationRelativeTo(null);
        ventProd1.tablaproductos.setModel(modelo.venProd());
        ventProd1.setVisible(true);
    }
    
}
