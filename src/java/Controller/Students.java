/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


public class Students {
    
    public Students(){}
    
    public int addSTD(String fullName, String sAddress, String sBirthday)
    {
        int res=0;
        String command="insert into students (fullname, birthdate, address) values ('"+fullName+"','"+sBirthday+"','"+sAddress+"')";
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
    
    public int addstudenttoCourse(int SID, int CID)
    {
        int res=0;
        String command="insert into studentcourses (SID, CID, mark) values ('"+SID+"','"+CID+"',0)";
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
    
    public int addstudentattend(int SID, int CID)
    {
        int res=0;
        String command="insert into studentcourseattend (SID, CID, sessiondate,attendes) values ('"+SID+"','"+CID+"',CURDATE(),'yes')";
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
    
    public int studentmark(int SID, int CID,int mark)
    {
        int res=0;
        String command="update studentcourses set mark='"+mark+"' where SID='"+SID+"' and CID='"+CID+"'";
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
