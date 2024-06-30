/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Table {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
           // st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200), name varchar(200), dob varchar(50), mobileNumber varchar(50), email varchar(200), username varchar(200), password varchar(50), address varchar(200))");
          st.executeUpdate("Insert into appuser(userRole, name, dob, mobileNumber, email, username, password, address) values('Admin', 'Admin', '15-11-2001', '01708015296', 'admin@gmail.com', 'admin', 'admin', 'Sylhet')");
            
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
