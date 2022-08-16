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

    public DefaultTableModel verClientes(){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTodosClientes();");//aqui se pone la consulta a sql
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
            System.out.println("Tabla clientes: " + e);
            return null;
        }
    }

    public DefaultTableModel numCliente(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTelefonosCliente("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Telefonos Cli: " + e);
            return null;
        }
    }

    public DefaultTableModel correoCliente(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarCorreosCliente("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Correos Cli: " + e);
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
    //CLIENTES
    public ResultSet VrClientes(String id){
        PreparedStatement ps=null;
        ResultSet rs = null;
        try{
            conexion conn=new conexion();
            Connection con=conn.conectar();
            
            ps=con.prepareStatement("call MostrarClientes(?);");
            ps.setString(1, id);
            rs=ps.executeQuery();
            rs.next();
        }catch(SQLException e){
            System.out.println("error en consultas "+e);
        }
        return rs;
    }
    
        public int AgClientes(String NomCli,String Apell,String Calle,String Colonia,String NumeroDire,String Ciudad,String Estado,String CP,String TelNum,String NomDue,String Correo){
    
            int resultado = 0;
            Connection conex = null;

            String consulta = "call AltasClientes(?,?,?,?,?,?,?,?,?,?);";

                try{
                    conex = con.conectar();
                    sentencia = conex.prepareStatement(consulta);
                    sentencia.setString(1, NomCli);
                    sentencia.setString(2, Apell);
                    sentencia.setString(3, Correo);
                    sentencia.setString(4, TelNum);
                    sentencia.setString(5, Calle);
                    sentencia.setString(6, Colonia);
                    sentencia.setString(7, NumeroDire);
                    sentencia.setString(8, CP);
                    sentencia.setString(9, Ciudad);
                    sentencia.setString(10, Estado);

                    resultado = sentencia.executeUpdate();

                }catch(SQLException e){
                    System.out.println("Agregar: " + e);
                }

            return resultado;

    }
        
    
        public int AgEmpleados(String NomCli,String Apell,String Calle,String Colonia,String NumeroDire,String Ciudad,String Estado,String CP,String TelNum,String NomDue,String Parent,String Correo){
    
            int resultado = 0;
            Connection conex = null;

            String consulta = "call AltasClientes(?,?,?,?,?,?,?,?,?,?);";

                try{
                    conex = con.conectar();
                    sentencia = conex.prepareStatement(consulta);
                    sentencia.setString(1, NomCli);
                    sentencia.setString(2, Apell);
                    sentencia.setString(3, Correo);
                    sentencia.setString(4, TelNum);
                    sentencia.setString(5, Calle);
                    sentencia.setString(6, Colonia);
                    sentencia.setString(7, NumeroDire);
                    sentencia.setString(8, CP);
                    sentencia.setString(9, Ciudad);
                    sentencia.setString(10, Estado);

                    resultado = sentencia.executeUpdate();

                }catch(SQLException e){
                    System.out.println("Agregar: " + e);
                }

            return resultado;

        }
        
        
        public int AgProveedores(String nom, String calle, String colonia, String numD, String ciudad, String estado, String cp, String TelNum, String NomDue, String puestoN, String correo, String nomDC, String puestoC, String pais){
            int resultado=0;
            Connection conex =null;
            
            String consulta="call AltasProveedores(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            try{
                conex = con.conectar();
                sentencia = conex.prepareStatement(consulta);
                sentencia.setString(1, nom);
                sentencia.setString(2, correo);
                sentencia.setString(3, nomDC);
                sentencia.setString(4, puestoC);
                sentencia.setString(5, calle);
                sentencia.setString(6, colonia);
                sentencia.setString(7, numD);
                sentencia.setString(8, cp);
                sentencia.setString(9, ciudad);
                sentencia.setString(10, estado);
                sentencia.setString(11, pais);
                sentencia.setString(12, TelNum);
                sentencia.setString(13, NomDue);
                sentencia.setString(14, puestoN);
                
                resultado = sentencia.executeUpdate();
            }catch(SQLException e){
                System.out.println("Error en consultas (agregarPro): " + e);
            }
            
            
            return resultado;
        }
        
        
        public DefaultTableModel venProv(){
            try{
                PreparedStatement ps=null;
                conexion conn=new conexion();
                Connection con=conn.conectar();
                Statement s=con.createStatement();

                ResultSet rs=s.executeQuery("call MostrarTodosProveedores();");//aqui se pone la consulta a sql
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
        
        public int AgEmpleados(String nom, String apellido, String fechaN, String numSS, 
                String fechaDCon, String puesto, String user, String pass, String calle, String col, 
                String numDire, String ciudad, String estado, String cp, String telNum, String correo){
            int resultado=0;
            Connection conex =null;
            
            String consulta="call AltasEmpleados(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            try{
                conex = con.conectar();
                sentencia = conex.prepareStatement(consulta);
                sentencia.setString(1, nom);
                sentencia.setString(2, apellido);
                sentencia.setString(3, fechaN);
                sentencia.setString(4, fechaDCon);
                sentencia.setString(5, numSS);
                sentencia.setString(6, user);
                sentencia.setString(7, pass);
                sentencia.setString(8, puesto);
                sentencia.setString(9, correo);
                sentencia.setString(10, calle);
                sentencia.setString(11, col);
                sentencia.setString(12, numDire);
                sentencia.setString(13, cp);
                sentencia.setString(14, ciudad);
                sentencia.setString(15, estado);
                sentencia.setString(16, telNum);
                
                resultado = sentencia.executeUpdate();
            }catch(SQLException e){
                System.out.println("Error en consultas (agregarEmp): " + e);
            }
            
            
            return resultado;
        }
        
    public DefaultTableModel verEmpleados(){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTodosEmpleados();");//aqui se pone la consulta a sql
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
            System.out.println("Tabla clientes: " + e);
            return null;
        }
    }
    
    public int modCliente(String nom, String ape, String calle, String col, String numC, String CP, String ciudad, String estado, String id){
        
        int resultado=0;
        Connection conex =null;

        String consulta="call ModificarClientes(?,?,?,?,?,?,?,?,?);";

        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, nom);
            sentencia.setString(2, ape);
            sentencia.setString(3, calle);
            sentencia.setString(4, col);
            sentencia.setString(5, numC);
            sentencia.setString(6, CP);
            sentencia.setString(7, ciudad);
            sentencia.setString(8, estado);
            sentencia.setString(9, id);

            resultado = sentencia.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error en consultas (ModCli): " + e);
        }


        return resultado;

    }

    public int elimCli(String id){

        int resultado=0;
        Connection conex =null;

        String consulta="call EliminarClientes(?);";

        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, id);

            resultado = sentencia.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error en consultas (ElimCli): " + e);
        }

        return resultado;

    }
    
    public int elimProveedor(String id){

        int resultado=0;
        Connection conex =null;

        String consulta="call EliminarProveedor(?);";

        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, id);

            resultado = sentencia.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error en consultas (ElimProv): " + e);
        }

        return resultado;

    }
    
    public ResultSet VrEmpleados(String id){
        PreparedStatement ps=null;
        ResultSet rs = null;
        try{
            conexion conn=new conexion();
            Connection con=conn.conectar();
            
            ps=con.prepareStatement("call MostrarEmpleados(?);");
            ps.setString(1, id);
            rs=ps.executeQuery();
            rs.next();
        }catch(SQLException e){
            System.out.println("error en consultas "+e);
        }
        return rs;
    }
    
    public ResultSet VrProveedores(String id){
        PreparedStatement ps=null;
        ResultSet rs = null;
        try{
            conexion conn=new conexion();
            Connection con=conn.conectar();
            
            ps=con.prepareStatement("call MostrarProveedores(?);");
            ps.setString(1, id);
            rs=ps.executeQuery();
            rs.next();
        }catch(SQLException e){
            System.out.println("error en consultas "+e);
        }
        return rs;
    }
        
    public DefaultTableModel numProveedor(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTelefonosProveedor("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Telefonos Prov: " + e);
            return null;
        }
    }

    public DefaultTableModel correoProveedor(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarCorreosProveedor("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Correos Prov: " + e);
            return null;
        }
    }

    public DefaultTableModel numEmpleado(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarTelefonosEmpleado("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Telefonos Emp: " + e);
            return null;
        }
    }

    public DefaultTableModel correoEmpleado(String id){
        try{
            PreparedStatement ps=null;
            conexion conn=new conexion();
            Connection con=conn.conectar();
            Statement s=con.createStatement();
            
            ResultSet rs=s.executeQuery("call MostrarCorreosEmpleado("+id+");");//aqui se pone la consulta a sql
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
            System.out.println("Correos Emp: " + e);
            return null;
        }
    }

    public int modProveedores(String nom, String calle, String colonia, String numC, String ciudad, String estado, String cp, String pais, String id){
            
            int resultado=0;
            Connection conex =null;
            
            String consulta="call ModificarProveedores(?,?,?,?,?,?,?,?,?);";
            
            try{
                conex = con.conectar();
                sentencia = conex.prepareStatement(consulta);
                sentencia.setString(1, nom);
                sentencia.setString(2, calle);
                sentencia.setString(3, colonia);
                sentencia.setString(4, numC);
                sentencia.setString(5, cp);
                sentencia.setString(6, ciudad);
                sentencia.setString(7, estado);
                sentencia.setString(8, pais);
                sentencia.setString(9, id);
                
                resultado = sentencia.executeUpdate();
            }catch(SQLException e){
                System.out.println("Error en consultas(ModProv): " + e);
            }
            
            
            return resultado;
        }

        public int modEmp(String nomEmp, String apEmp, String fechaN, String fechaC, String NSS, String usuario, String contra, String puesto, String idDir, String calle, String col, String numC, String CP, String ciudad, String estado, String idEmp){
        int resultado=0;
        Connection conex=null;
        
        String consulta="call ModificarEmpleados(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try{
            conex = con.conectar();
            sentencia = conex.prepareStatement(consulta);
            sentencia.setString(1, nomEmp);
            sentencia.setString(2, apEmp);
            sentencia.setString(3, fechaN);
            sentencia.setString(4, fechaC);
            sentencia.setString(5, NSS);
            sentencia.setString(6, usuario);
            sentencia.setString(7, contra);
            sentencia.setString(8, puesto);
            sentencia.setString(9, idDir);
            sentencia.setString(10, calle);
            sentencia.setString(11, col);
            sentencia.setString(12, numC);
            sentencia.setString(13, CP);
            sentencia.setString(14, ciudad);
            sentencia.setString(15, estado);
            sentencia.setString(16, idEmp);

            resultado = sentencia.executeUpdate();

        }catch(SQLException e){
            System.out.println("Error modEmp: " + e.toString());
        }
        return resultado;
    }

    public ResultSet idDirEmpleado(String id){
        PreparedStatement ps=null;
        ResultSet rs = null;
        try{
            conexion conn=new conexion();
            Connection con=conn.conectar();
            
            ps=con.prepareStatement("call MostrarIdDireccionEmpleado(?);");
            ps.setString(1, id);
            rs=ps.executeQuery();
            rs.next();
        }catch(SQLException e){
            System.out.println("Error idDirEmp: " + e);
        }
        return rs;
    }

}
