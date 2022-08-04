/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import vista.ventanaAgProducto;
import modelo.consultas;
import java.awt.event.ActionListener;

public class controlAgProductos implements ActionListener{
    
    ventanaAgProducto ventAg;
    consultas modelo;

    public controlAgProductos(consultas model, ventanaAgProducto vista){
        this.modelo = model;
        this.ventAg = vista;
        this.ventAg.btnGuardarProducto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        modelo.AgProducto(1, "Coca", "Una coca", "Coca", 2, 15, "Mazatlán", "Coca", 1, 1, 1, 1);
    }

}
