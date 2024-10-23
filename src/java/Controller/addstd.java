/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "addstd", urlPatterns = {"/addstd"})
public class addstd extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        if(request.getParameter("addstd")!=null)
        {
            String fullName=request.getParameter("fullName");
            String sAddress=request.getParameter("sAddress");
            String sBirthday=request.getParameter("sBirthday");
            
            Students s=new Students();
            int res=s.addSTD(fullName, sAddress, sBirthday);
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