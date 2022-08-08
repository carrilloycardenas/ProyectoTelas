/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ventanaProductos1;
import vista.ventanaVerProducto;
import java.awt.event.ActionListener;

/**
 *
 * @author daniel
 */
public class controlVrProductos implements ActionListener{
    ventanaVerProducto ventVr = new ventanaVerProducto();
    consultas modelo=new consultas();
    ventanaProductos1 ventProd = new ventanaProductos1();
    int ids;
    
    public controlVrProductos(ventanaVerProducto ventVr,consultas modelo,int ids){
        this.ventVr=ventVr;
        this.modelo=modelo;
        this.ventVr.btnEliminar.addActionListener(this);
        this.ventVr.btnVolver.addActionListener(this);
        this.ids=ids;
    }
    public void IniciarVista(){
        ventVr.setTitle("Mostrar producto");
        ventVr.pack();
        ventVr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventVr.setLocationRelativeTo(null);
        ventVr.setVisible(true);
        String id = ventProd.tablaproductos.getValueAt(ids, 0).toString();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(ventVr.btnVolver==evento.getSource()){
            controlVentanaProductos1 ctProd = new controlVentanaProductos1(ventProd, modelo);
            ctProd.IniciarVista();
            ventVr.setVisible(false);
        }
    }
}

