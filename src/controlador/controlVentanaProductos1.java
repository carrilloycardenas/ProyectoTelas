/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ventanaProductos1;
import vista.ventanaAgProducto;
import vista.ventanaVerProducto;

public class controlVentanaProductos1 implements ActionListener{
    
    ventanaVerProducto ventVrProd =new ventanaVerProducto();
    ventanaAgProducto ventAgProd = new ventanaAgProducto();
    ventanaProductos1 ventProd1 = new ventanaProductos1();
    consultas modelo = new consultas();

    public controlVentanaProductos1(ventanaProductos1 vent, consultas model){
        this.ventProd1 = vent;
        this.modelo = model;
        this.ventProd1.btnAgregarProducto.addActionListener(this);
        this.ventProd1.btnAgregarStock.addActionListener(this);
        this.ventProd1.btnModificarProducto.addActionListener(this);
        this.ventProd1.btnVerProducto.addActionListener(this);
        this.ventProd1.btnEliminarProducto.addActionListener(this);
    }
    
    public void IniciarVista(){
        ventProd1.setTitle("Productos");
        ventProd1.pack();
        ventProd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventProd1.setLocationRelativeTo(null);
        ventProd1.tablaproductos.setModel(modelo.venProd());
        ventProd1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventProd1.btnAgregarProducto == evento.getSource()) {
            try {
                controlAgProductos agProd = new controlAgProductos(ventAgProd, modelo);
                agProd.IniciarVista();
                ventProd1.setVisible(false);
            } catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ventProd1.btnVerProducto==evento.getSource()){
            try{
                controlVrProductos vrProd = new controlVrProductos(ventVrProd,modelo,ventProd1.tablaproductos.getSelectedRow());
                vrProd.IniciarVista();
                ventProd1.setVisible(false);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}