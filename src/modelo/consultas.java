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

    public void AgProducto(int idProd, String nomProd, String desProd, String marProd, int Stock, float precio, String local, String color, int cate, int tipoTela, int prov, int tipoStock){
        Connection conex = null;
        String consulta = "call(?,?,?,?,?,?,?,?,?,?,?,?);";
        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, Integer.toString(idProd));
            sentencia.setString(2, nomProd);
            sentencia.setString(3, desProd);
            sentencia.setString(4, marProd);
            sentencia.setString(5, Integer.toString(Stock));
            sentencia.setString(6, Float.toString(precio));
            sentencia.setString(7, local);
            sentencia.setString(8, color);
            sentencia.setString(9, Integer.toString(cate));
            sentencia.setString(10, Integer.toString(tipoTela));
            sentencia.setString(11, Integer.toString(prov));
            sentencia.setString(12, Integer.toString(tipoStock));

            sentencia.executeUpdate();

        }catch(SQLException e){

        }
    }
    
}
