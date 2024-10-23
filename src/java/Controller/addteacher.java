/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "addteacher", urlPatterns = {"/addteacher"})
public class addteacher extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if(request.getParameter("addteacher")!=null)
        {
            String name=request.getParameter("tname");
            String cer=request.getParameter("cer");
            String date=request.getParameter("date");
            Teachers t=new Teachers();
            int res=t.addTeacher(name, cer, date);
            if(res>=1)
            {
                response.sendRedirect("ok.jsp");
            }
            else
            {
                response.sendRedirect("error.jsp");
            }
        }
    }


}
