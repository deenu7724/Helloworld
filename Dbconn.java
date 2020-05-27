/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.proton.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Pankaj
 */
public class Dbconn
{

    static Connection conn;

    public static Connection getconnection()
    {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            return null;
        }

        try
        {
            String url = "jdbc:mysql://localhost:3306/gelect";
            conn = DriverManager.getConnection(url, "root", "root");
            return conn;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    public static void closeConnection()
    {
        try
        {
            conn.close();
        }
        catch (Exception ex)
        {
            
        }
    }
}