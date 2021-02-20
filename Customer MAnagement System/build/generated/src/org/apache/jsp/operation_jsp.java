package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("text-align: center;\n");
      out.write("font-size: 40px;\n");
      out.write("color:black;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    font-size: 30px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    padding: 30px 30px;\n");
      out.write("    background-color:lightsteelblue;\n");
      out.write("    color: black;\n");
      out.write("    margin-left:200px;\n");
      out.write("    margin-right:200px;\n");
      out.write("   \n");
      out.write("    \n");
      out.write("}\n");
      out.write("a:hover{\n");
      out.write("  opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2> Customer Management System </h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <a href=\"Add.jsp\">Add</a>\n");
      out.write("    <a href=\"update.jsp\">Update</a>\n");
      out.write("    <a href=\"delete.jsp\">Delete</a>\n");
      out.write("    <a href=\"view\">View</a>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
