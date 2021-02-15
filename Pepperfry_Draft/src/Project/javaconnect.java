/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author MAYUR_DEBU
 */
public class javaconnect {
    Connection conn;
    PreparedStatement pst;
    ResultSet set;
    public static Connection connectDB() throws ClassNotFoundException, SQLException
    {
      
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","student");
            //users: database name
            //root: username
            //student: password of root user
              return (Connection) conn;
       
        
    }
     
}
