/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


public class Teachers {
    
    
    public Teachers(){}
    
    public int addTeacher(String name, String cer, String date)
    {
        int res=0;
        String command="insert into teachers (fullname, certifecate, birthdate) values ('"+name+"','"+cer+"','"+date+"')";
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
    
    
    public int deleteTeacher(int ID)
    {
        int res=0;
        String command="delete from teachers where ID='"+ID+"'";
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
    
}
