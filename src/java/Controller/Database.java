package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;

public class Database {
    
    String URL="jdbc:mysql://localhost:3306/coursesdb";
        String name="root";
        String pass="";
    Connection con;
    
    public Database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(URL,name,pass);
        }
        catch(Exception ex)
        {
            System.out.println("Database  "+ex.toString());
        }
    }
    
    public ResultSet getresults(String command) throws SQLException
    {
        ResultSet set=null;
        PreparedStatement ps=con.prepareStatement(command);
        set=ps.executeQuery();
        return set;
    }
    public int getIDs(String command) throws SQLException
    {
        int res=0;
        PreparedStatement ps=con.prepareStatement(command);
        res=ps.executeUpdate();
        return res;
    }
    
}