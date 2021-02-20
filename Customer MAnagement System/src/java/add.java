
import java.io.IOException;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet {
                
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try{
     Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
     String sql="insert into addcus values(?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(sql);
      
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("empid");
        String s2=request.getParameter("name");
        String s3=request.getParameter("Age");
        String s4=request.getParameter("email");
        
        String s5=request.getParameter("phone");
        String s6=request.getParameter("addr");
        String s7=request.getParameter("gender");
        String s8=request.getParameter("Adhar");
        String s9=request.getParameter("pass");
        
      ps.setInt(1,Integer.parseInt(s1));
     ps.setString(2,s2);
     ps.setInt(3,Integer.parseInt(s3));
     ps.setString(4,s4); 
     ps.setInt(5,Integer.parseInt(s5));
    ps.setString(6,s6);
    ps.setString(7,s7);
     ps.setInt(8,Integer.parseInt(s8));
      ps.setString(9,s9);
      
     ps.executeUpdate();
     out.println("<html>");
              out.println("<body>");
              out.println("<hr>");
              out.println("<h1 style=text-align:center;>Customer Added successfully</h1>");
            
              out.println("<h2 style=text-align:center;><a href=operation.jsp>Home-Page</a></h2>");
               
             
            out.println("<hr>");
              out.println("</body>");
              out.println("</html>");
                              
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
