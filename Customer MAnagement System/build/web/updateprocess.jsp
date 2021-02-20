<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/cms";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String s1=request.getParameter("empid");
        String s2=request.getParameter("name");
        String s3=request.getParameter("Age");
        String s4=request.getParameter("email");
        
        String s5=request.getParameter("phone");
        String s6=request.getParameter("addr");
        String s7=request.getParameter("gender");
        String s8=request.getParameter("Adhar");
        String s9=request.getParameter("pass");
    
    
    if(s1!= null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(s1);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update users set id=?,first_name=?,last_name=?,city_name=?,email=? where id="+s1;
ps = con.prepareStatement(sql);

         ps.setInt(1,Integer.parseInt(s1));
     ps.setString(2,s2);
     ps.setInt(3,Integer.parseInt(s3));
     ps.setString(4,s4); 
     ps.setInt(5,Integer.parseInt(s5));
    ps.setString(6,s6);
    ps.setString(7,s7);
     ps.setInt(8,Integer.parseInt(s8));
      ps.setString(9,s9);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>