/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.consultas;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.ventanaAgProducto;
import vista.ventanaProductos1;

public class controlAgProductos implements ActionListener{
    
    ventanaAgProducto ventAg = new ventanaAgProducto();
    consultas modelo = new consultas();
    ventanaProductos1 ventProd = new ventanaProductos1();

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
            modelo.AgProducto("6",ventAg.txtNombreProd.getText(),ventAg.txtDescripcion.getText(),ventAg.txtMarca.getText(), ventAg.txtStock.getValue().toString(),ventAg.txtPrecio.getValue().toString(), ventAg.txtLocal.getSelectedItem().toString(), ventAg.txtColor.getText(), Integer.toString(ventAg.txtCategoria.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria2.getSelectedIndex()+1),Integer.toString(ventAg.txtCategoria4.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria3.getSelectedIndex()+1));
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventAg.setVisible(false);
        }
    }

}
