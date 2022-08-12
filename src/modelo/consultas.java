/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class consultas {

    conexion con = new conexion();

    PreparedStatement sentencia;
    ResultSet resultado;
    String query; 
    int nResultado = 0;
    

    public int AgProducto(String nomProd, String desProd, String marProd, String Stock, String precio, String local, String color, String cate, String tipoTela, String prov, String tipoStock){
    
        int resultado = 0;
        Connection conex = null;

        String consulta = "call AltasProductos(?,?,?,?,?,?,?,?,?,?,?);";

        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, nomProd);
            sentencia.setString(2, desProd);
            sentencia.setString(3, marProd);
            sentencia.setString(4, Stock);
            sentencia.setString(5, precio);
            sentencia.setString(6, local);
            sentencia.setString(7, color);
            sentencia.setString(8, cate);
            sentencia.setString(9, tipoTela);
            sentencia.setString(10, prov);
            sentencia.setString(11, tipoStock);

            resultado = sentencia.executeUpdate();

        }catch(SQLException e){
            System.out.println("Agregar: " + e);
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
            System.out.println("Tabla: " + e);
            return null;
        }
    }
    
    public ResultSet VrProductos(String id){
        PreparedStatement ps=null;
        ResultSet rs = null;
        try{
            conexion conn=new conexion();
            Connection con=conn.conectar();
            
            ps=con.prepareStatement("call MostrarProductos(?);");
            ps.setString(1, id);
            rs=ps.executeQuery();
            rs.next();
        }catch(SQLException e){
            System.out.println("error en consultas "+e);
        }
        return rs;
    }

    public int stockUpdate(String sto, String id){
        int resultado=0;
        Connection conex = null;

        String consulta="update productos set Stock= ?+Stock where idProductos=?";
        
        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, sto);
            sentencia.setString(2, id);

            resultado = sentencia.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error en consultas: "+e);
        }

        return resultado;
    }
    
    public int prodUpdate(String idProd, String nomProd, String desProd, String marProd, String Stock, String precio, String local, String color, String cate, String tipoTela, String prov, String tipoStock){
        int resultado=0;
        Connection conex=null;
        
        String consulta="call ModificarProductos(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, nomProd);
            sentencia.setString(2, desProd);
            sentencia.setString(3, marProd);
            sentencia.setString(4, Stock);
            sentencia.setString(5, precio);
            sentencia.setString(6, local);
            sentencia.setString(7, color);
            sentencia.setString(8, cate);
            sentencia.setString(9, tipoTela);
            sentencia.setString(10, prov);
            sentencia.setString(11, tipoStock);
            sentencia.setString(12, idProd);

            resultado = sentencia.executeUpdate();

        }catch(SQLException e){
            System.out.println("Error en consultas: " + e.toString());
        }
        return resultado;
    }
    
    public void EliminProd(String idProd){
        Connection conex=null;
        System.out.println(idProd);
        
        String consulta="call EliminarProductos(?);";
        
        try{
            conex=con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, idProd);
            sentencia.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error eliminar: " + e);
        }
    }
    
}
