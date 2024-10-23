<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.http.HttpSession" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<!DOCTYPE html>

<html>

<head>
  <title>F23</title>
  <link rel="stylesheet" href="template/css/bs.css" type="text/css" />
  <link rel="stylesheet" href="template/css/style.css" type="text/css" />
  <script src="template/js/bootstrap.min.js"></script>
  <script src="template/js/holder.js"></script>
  <script src="template/js/blue.js"></script>
</head>

<body>

<div class="tophead">
<div class="row">
  <div class="col-md-3 col-md-offset-3"><h1 class="etitle pull-right"><font color="#FF0000">Web</font><font color="#FF9900">Man</font></h1></div>
  <div class="col-md-3 col-md-offset-3"><a class="glyphicon glyphicon-envelope btn-lg pull-left" href="#"></a></div>
</div>
</div>

<br /><br /><div class="text">WJD F23</div>
<div class="border" style="width: 100%;"></div>
                                               <br />
<div class="row" style="margin: auto; width: 85%;">

  <div class="col-sm-6 col-md-3" style="width: 250px; float: left;">
    <div class="thumbnail">
        <img src="template/img/1.jpg"/>
      <div class="caption">
        
      </div>
    </div>
  </div>

  <div class="col-sm-6 col-md-3" style="width: 250px; float: left;">
    <div class="thumbnail">
      <img src="template/img/2.jpg"/>
      <div class="caption">
        
      </div>
    </div>
  </div>

    <div class="col-sm-6 col-md-3" style="width: 250px; float: left;">
    <div class="thumbnail">
      <img src="template/img/3.jpg"/>
      <div class="caption">
      </div>
    </div>
  </div>

    <div class="col-sm-6 col-md-3" style="width: 250px; float: left;">
    <div class="thumbnail">
      <img src="template/img/4.jpg"/>
      <div class="caption">
        
  <hr />
       
      </div>
    </div>
  </div>

</div>

<br /><div class="border" style="width: 100%;"></div>
<div class="text">
    <center>
    <form name="login" action="delcourse" method="POST">
                            <table border="1" style="font-size: 22px;text-align: center">
    <thead>
        <th>course</th>
        <th>student name</th>
        <th>mark</th>
        <th>attendes</th>
    </thead>
        <%
        String URL="jdbc:mysql:3306//localhost/coursedb";
        String name="root";
        String pass="";
        Connection con=DriverManager.getConnection(URL,name,pass);
        Statement st=con.createStatement();
        //int ID=Integer.parseInt(request.getParameter("ID"));
        String sql="select CourseName, fullname, mark, attendes from courses,studentcourseattend, studentcourses, students where courses.ID=studentcourseattend.CID and students.ID=studentcourseattend.SID and studentcourses.SID=students.ID and studentcourses.CID=courses.ID";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
        %>
        <tr>
            <td>
                    <%=rs.getString("CourseName")%>
            </td>
            <td>
                    <%=rs.getString("fullname")%>
            </td>
            <td>
                    <%=rs.getString("mark")%>
            </td>
            <td>
                    <%=rs.getString("attendes")%>
            </td>
            
        </tr>
            <%}%>

            <tr style="text-align: center">
                <td colspan="3"><a href="adminhome.jsp" target="_blank">back</a></td>
            </tr>

            
    </table>

                        </form>
</center>

</div>
<div class="border" style="width: 100%;"></div>

<div class="cont1">
<img data-src="blue.js/913x270" alt="...">
<div class="row social">
  <div class="col-xs-6 tr-bg"><a href="#" class="tr"><img src="template/img/tr.png" width="40" /></a></div>
  <div class="col-xs-6 fb-bg"><a href="#" class="fb"><img src="template/img/fb.png" width="40" /></a></div>
</div>
</div>

<center></center>

 <br /><br />
</body>

</html>
