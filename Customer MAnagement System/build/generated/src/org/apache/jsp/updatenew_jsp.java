package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class updatenew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String empid = request.getParameter("empid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "cms";
String userid = "root";
String password ="root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\n');

try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
statement=connection.createStatement();
String sql ="select * from addcus where empid="+empid;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>Update data from database in jsp</h1>\n");
      out.write("<form method=\"post\" action=\"updateprocess.jsp\">\n");
      out.write("<input type=\"hidden\" name=\"empid\" value=\"");
      out.print(resultSet.getString("empid") );
      out.write("\">\n");
      out.write("<input type=\"text\" name=\"empid\" value=\"");
      out.print(resultSet.getString("empid") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("name:<br>\n");
      out.write("<input type=\"text\" name=\"name\" value=\"");
      out.print(resultSet.getString("last_name") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Age:<br>\n");
      out.write("<input type=\"text\" name=\"Age\" value=\"");
      out.print(resultSet.getString("city_name") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("email:<br>\n");
      out.write("<input type=\"email\" name=\"email\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("phone:<br>\n");
      out.write("<input type=\"email\" name=\"phone\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("addr:<br>\n");
      out.write("<input type=\"email\" name=\"addr\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("gender:<br>\n");
      out.write("<input type=\"email\" name=\"gender\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Adhar:<br>\n");
      out.write("<input type=\"email\" name=\"Adhar\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("pass:<br>\n");
      out.write("<input type=\"email\" name=\"pass\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"submit\">\n");
      out.write("</form>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
