package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/cms";
String user = "root";
String psw = "";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

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

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
