/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.ventanaProvedores;
import vista.ventanaVerProveedores;

public class controlVrProveedor implements ActionListener {
    
    ventanaVerProveedores vista = new ventanaVerProveedores();
    ventanaProvedores vtProv = new ventanaProvedores();
    consultas modelo = new consultas();
    
    public controlVrProveedor(ventanaVerProveedores vist, consultas model, ventanaProvedores vtPro, int row){
        this.vista = vist;
        this.modelo = model;
        this.vista.btnVolverProveedor.addActionListener(this);
        this.vista.btnElimProv.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Ver proveedor");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        try{

        }catch(Exception e){
            System.out.println("Error ctVrProv: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        
    }
    
}
