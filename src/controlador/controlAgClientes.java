/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.consultas;
import vista.AgregarCliente;
import vista.VentanaClientes2;

/**
 *
 * @author daniel
 */
public class controlAgClientes implements ActionListener{
    
    AgregarCliente ventAgC =new AgregarCliente();
    consultas modelo=new consultas();
    VentanaClientes2 ventCli=new VentanaClientes2();
    
    public controlAgClientes(AgregarCliente ventAgC, consultas modelo){
        this.ventAgC=ventAgC;
        this.modelo=modelo;
        this.ventAgC.btnAgregar.addActionListener(this);
        this.ventAgC.btnCancelar.addActionListener(this);
    }

    public void IniciarVista(){
        ventAgC.setTitle("Agregar Clientes");
        ventAgC.pack();
        ventAgC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventAgC.setLocationRelativeTo(null);
        ventAgC.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(ventAgC.btnAgregar==e.getSource()){
            modelo.AgProducto(ventAg.txtNombreProd.getText(),ventAg.txtDescripcion.getText(),ventAg.txtMarca.getText(), ventAg.txtStock.getValue().toString(),ventAg.txtPrecio.getValue().toString(), ventAg.txtLocal.getSelectedItem().toString(), ventAg.txtColor.getText(), Integer.toString(ventAg.txtCategoria.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria2.getSelectedIndex()+1),Integer.toString(ventAg.txtCategoria4.getSelectedIndex()+1), Integer.toString(ventAg.txtCategoria3.getSelectedIndex()+1));
        }
    }
    
}
