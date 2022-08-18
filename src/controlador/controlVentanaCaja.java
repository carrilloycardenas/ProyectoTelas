/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import modelo.consultas;
import vista.Caja;

public class controlVentanaCaja implements ActionListener {
    
    controladorReloj ctRel = new controladorReloj();
    Caja vista = new Caja();
    consultas modelo = new consultas();
    ResultSet rs, rsCli;

    public controlVentanaCaja(Caja vist, consultas model){
        this.vista = vist;
        this.modelo = model;
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscarCli.addActionListener(this);
    }

    public void IniciarVista(){
        this.vista.setTitle("Productos");
        this.vista.pack();
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.lblFecha.setText(ctRel.calFechaC());
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(this.vista.btnBuscar == evento.getSource()){
            try{
                this.rs = this.modelo.VrProductos(this.vista.txtIdProd.getText());
                this.vista.txtNomProd.setText(this.rs.getString("Nombre"));
                this.vista.txtStock.setText(this.rs.getString("Stock"));
                
            }catch(SQLException e){
                System.out.println("BuscarProd (Caja): " + e);
            }
        } else if(this.vista.btnBuscarCli == evento.getSource()){
            try{
                this.rsCli = this.modelo.setCliente(this.vista.txtIdCli.getText());
                this.vista.btnBuscar.setEnabled(true);
                this.vista.btnAgregar.setEnabled(true);
                this.vista.spinCantidad.setEnabled(true);
                this.vista.btnAgregar.setEnabled(true);
                this.vista.txtIdCli.setEditable(false);
                this.vista.txtIdEmp.setEditable(false);
                this.vista.cbPago.setEnabled(false);
                this.vista.txtNomCli.setText(this.rsCli.getString("Nombre"));
                this.modelo.genFactura(this.ctRel.calFechaISO(), this.vista.txtIdCli.getText(), String.valueOf(this.vista.cbPago.getSelectedIndex()+1), 
                                        this.vista.txtIdEmp.getText());
            }catch(Exception e){
                System.out.println("btnBuscarProd: " + e);
            }
        } else if(this.vista.btnAgregar == evento.getSource()){
            this.modelo.setRegistra(this.vista.txtIdProd.getText(), String.valueOf(this.vista.spinCantidad.getValue()));
            this.vista.tablaProductosCaja.setModel(this.modelo.setTablaRegistra());
        }
    }

}
