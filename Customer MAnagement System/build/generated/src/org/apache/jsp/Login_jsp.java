package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("             html{\n");
      out.write("                background:url(\"C:\\\\Users\\\\dell\\\\Pictures\\\\Saved Pictures\\\\crm.jpg\") no-repeat center center fixed;\n");
      out.write("                -webkit-background-size:cover;\n");
      out.write("                -moz-background-size:cover;\n");
      out.write("                -o-background-size:cover;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                color:Black;\n");
      out.write("                margin: 50px 50px 50px 80px;\n");
      out.write("            }\n");
      out.write("            .login{\n");
      out.write("                margin: 100px 1000px 100px 400px;\n");
      out.write("                padding:60px;\n");
      out.write("                background-color:lightgray;\n");
      out.write("                width: 500px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-size: 60x;\n");
      out.write("                color:black;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-style: normal;\n");
      out.write("            }\n");
      out.write("            input[type=submit]{\n");
      out.write("                color: black;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-family: arial;\n");
      out.write("        \n");
      out.write("                background-color:burlywood;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: 1px;;\n");
      out.write("                font-size:20px ;\n");
      out.write("                margin-top:20px;\n");
      out.write("            }\n");
      out.write("            input[type=text]\n");
      out.write("            {\n");
      out.write("                padding: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input[type=password]\n");
      out.write("            {\n");
      out.write("                padding: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input[type=select]\n");
      out.write("            {\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("#sub:hover{\n");
      out.write("    opacity: 0.7;\n");
      out.write("\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("            <h1>Login Here</h1>\n");
      out.write("            <div class=\"Login\">\n");
      out.write("           \n");
      out.write("            <form action=\"verify\" method=\"GET\">\n");
      out.write("              \n");
      out.write("                 <label>   Email  </label> <br> \n");
      out.write("                  <input type=\"text\" name=\"email\"  placeholder=\"abc@gmail.com\"/> <br>\n");
      out.write(" \n");
      out.write("                  <label>   password </label><br>\n");
      out.write("                  <input type=\"password\" name=\"pass\" placeholder=\"enter password\"/><br>\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("                           <input type=\"submit\" id=\"sub\" value=\"Login\"/>\n");
      out.write("                 </form>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("            </body>\n");
      out.write("            </html>");
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
