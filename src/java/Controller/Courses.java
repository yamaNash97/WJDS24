package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Courses {
    
    private int CourseID;
    private String CourseName;
    private String CourseDes;
    private int CourseHour;
    
    
    public Courses(){}
    
    public Courses(int ID, String CourseName, String CourseDes, int CourseHour)
    {
        this.CourseDes=CourseDes;
        this.CourseHour=CourseHour;
        this.CourseID=ID;
        this.CourseName=CourseName;
    }
    
    public int addCourse(String cname, String des, int hour)
    {
        int res=0;
        String command="insert into courses (CourseName, Coursedes, Hourcounts) values ('"+cname+"','"+des+"','"+hour+"')";
        Database db=new Database();
        try
        {
            res=db.getIDs(command);
        }
        catch(Exception ex)
        {
            System.out.println("Database  "+ex.toString());
            res=0;
        }
        return res;
    }
    
    public int updateCourse(String name, String des, int hour, int ID)
    {
        int res=0;
        String command="update courses set CourseName='"+name+"', Coursedes='"+des+"', Hourcounts='"+hour+"' where ID='"+ID+"'";
        Database db=new Database();
        try
        {
            res=db.getIDs(command);
        }
        catch(Exception ex)
        {
            res=0;
        }
        return res;
    }
    
    public int deleteCourses(int ID)
    {
        int res=0;
        String command="delete from courses where ID='"+ID+"'";
        Database db=new Database();
        try
        {
            res=db.getIDs(command);
        }
        catch(Exception ex)
        {
            res=0;
        }
        return res;
    }
    
    public ResultSet getCourses()
    {
        String command="select * from courses";
        Database db=new Database();
        try
        {
            ResultSet rs=db.getresults(command);
            return rs;
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ResultSet rs=null;
            return rs;
        }
        
    }
    
    public ResultSet getCourses(int ID)
    {
        String command="select * from courses where ID='"+ID+"'";
        Database db=new Database();
        try
        {
            ResultSet rs=db.getresults(command);
            return rs;
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ResultSet rs=null;
            return rs;
        }
    }
    
    
    public int addteachercourse(int CID,int TID)
    {
        int res=0;
        String command="insert into coursesteacher (TID,CID) values ('"+TID+"','"+CID+"')";
        Database db=new Database();
        try
        {
            res=db.getIDs(command);
        }
        catch(Exception ex)
        {
            System.out.println("Database  "+ex.toString());
            res=0;
        }
        return res;
    }
    
}