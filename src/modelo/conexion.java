/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.sql.*;

public class conexion {

    public Connection conectar(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/modeloBDProyecto", "root", "password");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return con;
    }
}
