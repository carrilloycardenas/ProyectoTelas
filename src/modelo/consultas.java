/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import vista.ventanaProductos1;

public class consultas {

    conexion con = new conexion();

    PreparedStatement sentencia;
    ResultSet resultado;
    String query; 
    int nResultado = 0;

    public int AgProducto(String idProd, String nomProd, String desProd, String marProd, String Stock, String precio, String local, String color, String cate, String tipoTela, String prov, String tipoStock){
    
        int resultado = 0;
        Connection conex = null;

        String consulta = "call AltasProductos(?,?,?,?,?,?,?,?,?,?,?,?);";

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

    public DefaultTableModel venProd(){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTodosProductos();");//aqui se pone la consulta a sql
            DefaultTableModel dtm=new DefaultTableModel();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int columnas=rsMd.getColumnCount();
            
            //ciclo de las columnas
            for(int i=1;i<=columnas;i++){
                dtm.addColumn(rsMd.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila=new Object[columnas];
                for(int i=0;i<columnas;i++){
                    fila[i]=rs.getObject(i+1);
                }
                dtm.addRow(fila);
            }
            return dtm;
            
            
        }catch(SQLException e){
            return null;
        }
    }
    
}
