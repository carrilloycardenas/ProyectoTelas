/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import modelo.conexion;

public class consultas {

    conexion con = new conexion();

    PreparedStatement sentencia;
    ResultSet resultado;
    String query; 
    int nResultado = 0;

    public int AgProducto(String idProd, String nomProd, String desProd, String marProd, String Stock, String precio, String local, String color, String cate, String tipoTela, String prov, String tipoStock){
    
        int resultado = 0;
        Connection conex = null;

        String consulta = "call AltaProductos(?,?,?,?,?,?,?,?,?,?,?,?);";

        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, idProd);
            sentencia.setString(2, nomProd);
            sentencia.setString(3, desProd);
            sentencia.setString(4, marProd);
            sentencia.setString(5, Stock);
            sentencia.setString(6, precio);
            sentencia.setString(7, local);
            sentencia.setString(8, color);
            sentencia.setString(9, cate);
            sentencia.setString(10, tipoTela);
            sentencia.setString(11, prov);
            sentencia.setString(12, tipoStock);

            resultado = sentencia.executeUpdate();

        }catch(SQLException e){
            System.out.println(e);
        }

        return resultado;

    }
    
}
