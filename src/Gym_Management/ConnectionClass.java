package Gym_Management;

import java.sql.*;
public class ConnectionClass 
{
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym_Management","root","root");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String s[])
    {
        new ConnectionClass();
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
