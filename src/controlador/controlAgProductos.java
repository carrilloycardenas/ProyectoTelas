/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import vista.ventanaAgProducto;
import modelo.consultas;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.ventanaAgProducto;

public class controlAgProductos implements ActionListener{
    
    ventanaAgProducto ventAg;
    consultas modelo;

    public controlAgProductos(ventanaAgProducto ventAg, consultas modelo) {
        this.ventAg = ventAg;
        this.modelo = modelo;
        this.ventAg.btnGuardarProducto.addActionListener(this);
    }

    

    public void IniciarVista(){
        ventAg.setTitle("Agregar producto");
        ventAg.pack();
        ventAg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAg.setLocationRelativeTo(null);
        ventAg.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventAg.btnGuardarProducto == evento.getSource()) {
            modelo.AgProducto(2, "Coca", "Una coca", "Coca", 2, 15, "Mazatlán", "Coca", 1, 1, 1, 1);
        }
    }

}
