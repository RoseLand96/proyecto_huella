/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jett-Jeffson
 */
public class conection {
    private static Connection conn;
private static final String driver = "com.mysql.jdbc.Driver";
private static final String user = "root";
private static final String password ="";
private static final String url ="jdbc:mysql://localhost:3306/ecole_data";

    public conection() {
        conn = null;
        try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        if (conn != null){
            System.out.println("Conexion establecida..");
            
        }
        
        
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("error al conectar" + e);
    }

    }
    //este metodo nos retorna la conexion
public Connection getConnection() {
return conn;
}

//con este metodo nos desconectamos a la base de datos
public void desconectar() {
conn = null;
if (conn == null){
System.out.println("Conexion terminada");
}
}
    
}
