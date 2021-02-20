package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("    ::-webkit-scrollbar {\n");
      out.write("  width: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Track */\n");
      out.write("::-webkit-scrollbar-track {\n");
      out.write("  background: #f1f1f1; \n");
      out.write("}\n");
      out.write(" \n");
      out.write("/* Handle */\n");
      out.write("::-webkit-scrollbar-thumb {\n");
      out.write("  background: #888; \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Handle on hover */\n");
      out.write("::-webkit-scrollbar-thumb:hover {\n");
      out.write("  background: #555; \n");
      out.write("}\n");
      out.write("    *{\n");
      out.write("        margin:0;\n");
      out.write("        padding: 0;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        text-align:center;\n");
      out.write("        padding: 10px;\n");
      out.write("        color:black;\n");
      out.write("    }\n");
      out.write("        .register{\n");
      out.write("        background:graytext;\n");
      out.write("        width: 500px;\n");
      out.write("        margin: 0px 0px 0px 400px;\n");
      out.write("        color:white;\n");
      out.write("        font-size: 18px;\n");
      out.write("        padding: 15px;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        padding-bottom: 20px;;\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #register{\n");
      out.write("        margin-left:50px ;\n");
      out.write("    }\n");
      out.write("    label{\n");
      out.write("        color:white;\n");
      out.write("        font-size: 12px;\n");
      out.write("        font-family: sans-serif;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #name{\n");
      out.write("        width:300px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        outline: 0;\n");
      out.write("        padding: 3px;\n");
      out.write("    }\n");
      out.write("    #ph{\n");
      out.write("        width: 65px;\n");
      out.write("        padding: 3px;\n");
      out.write("        border:none;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        outline:0;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("\n");
      out.write("        background-image: url(\"img/crm2.jpg\");\n");
      out.write("        background-size: 100% 700px;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("    }\n");
      out.write("    #sub{\n");
      out.write("        width: 230px;\n");
      out.write("        padding: 3px;\n");
      out.write("        border:none;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        outline:0;}\n");
      out.write("\n");
      out.write("        #sub{\n");
      out.write("        width: 200px;\n");
      out.write("        padding: 3px;\n");
      out.write("        border:none;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        outline:0;\n");
      out.write("        font-size: 16px;\n");
      out.write("        font-family: sans-serif;\n");
      out.write("        font-weight: 600;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        #sub:hover{\n");
      out.write("            opacity:0.7;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       input[type=text]\n");
      out.write("            {\n");
      out.write("                padding:4px;\n");
      out.write("            }\n");
      out.write("input[type=email],input[type=password],input[type=select]\n");
      out.write("            {\n");
      out.write("                padding:7px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Update Record</h1>\n");
      out.write("    <div class=\"register\">\n");
      out.write("     \n");
      out.write("        <form action=\"update\" method=\"get\" id=\"register\">\n");
      out.write("            <label>Customer ID</label><br>\n");
      out.write("            <input type=\"text\" name=\"empid\" placeholder=\"Enter name here\"><br><br>\n");
      out.write("            \n");
      out.write("            <label>Customer Name</label><br>\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Enter name here\"><br><br>\n");
      out.write("            <label>Age</label><br>\n");
      out.write("            <input type=\"text\" name=\"Age\" placeholder=\"Enter age here\"><br><br>\n");
      out.write("            <label>Email </label><br>\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Enter email\"><br><br>\n");
      out.write("        \n");
      out.write("            <label>Phone Number</label><br>\n");
      out.write("            <select id=\"ph\">\n");
      out.write("                <option>+91</option>\n");
      out.write("                <option>+92</option>\n");
      out.write("                <option>+93</option>\n");
      out.write("                </select>\n");
      out.write("            <input type=\"number\" name=\"phone\" placeholder=\"Enter Mobile Number\"><br><br>\n");
      out.write("            <label>Address</label><br>\n");
      out.write("<input type=\"text\" name=\"addr\" placeholder=\"Enter Adress\"><br><br>\n");
      out.write("\n");
      out.write("<label>Gender</label><br>\n");
      out.write("<select id=\"gender\" name=\"gender\">\n");
      out.write("    <option>Male</option>\n");
      out.write("    <option>Female</option>\n");
      out.write("    </select><br><br>\n");
      out.write("    <label>Adhar no.</label><br>\n");
      out.write("    <input type=\"text\" name=\"Adhar\" placeholder=\"Enter adhar card number \"><br><br>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <label>Password</label><br>\n");
      out.write("            <input type=\"password\" name=\"pass\" placeholder=\"Enter password\"><br><br>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Save\" id=\"sub\"name=\"submit\">\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("</body>+\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
