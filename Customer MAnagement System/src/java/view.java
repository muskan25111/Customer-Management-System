
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class view extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        try{
     Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
     String sql="select * from addcus";
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(sql);
      
     PrintWriter out=response.getWriter();
        out.println("<html>");
       out.println("<body>");
       out.println("<center>");
     out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th>");out.println("Emp_Id");out.println("</th>");
         out.println("<th>");out.println("Emp_name");out.println("</th>");
          out.println("<th>");out.println("Age");out.println("</th>");
           out.println("<th>");out.println("Email");out.println("</th>");
            out.println("<th>");out.println("Phone");out.println("</th>");
             out.println("<th>");out.println("Address");out.println("</th>");
              out.println("<th>");out.println("Gender");out.println("</th>");
               out.println("<th>");out.println("Adhar");out.println("</th>");
                out.println("<th>");out.println("password");out.println("</th>");
              
     while(rs.next())
     {
      
 out.println("<tr>");
        
         out.println("<td>");
         out.println(rs.getInt(1));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getString(2));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getInt(3));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getString(4));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getInt(5));
         out.println("</td>");
        
         out.println("<td>");
         out.println(rs.getString(6));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getString(7));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getInt(8));
         out.println("</td>");
         out.println("<td>");
         out.println(rs.getString(9));
         out.println("</td>");
         out.println("</tr>");
         
     }
         out.println("</table>");
         out.println("</center>");
         out.println("</body>");
         out.println("</html>");
        
        }catch(Exception e)
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
