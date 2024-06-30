/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author fhnab
 */
public class ConnectionProvider {
     
    public static   Connection getCon(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phar?useSSL=false","root","fuad43002");
             return con;
        }
        catch(ClassNotFoundException | SQLException e){
           System.out.println(e);
           return null;
        }
    }
    public static void main(String args[]){
        ConnectionProvider dr = new ConnectionProvider();
    
    }
}
