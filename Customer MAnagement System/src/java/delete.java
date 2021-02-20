
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
import javax.servlet.http.HttpSession;

public class delete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
     Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
     String sql="delete from addcus where empid=?";
     PreparedStatement ps=con.prepareStatement(sql);
      
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("empid");
        ps.setString(1, s1);
 ps.executeUpdate();
    
            out.println("<html>");
            out.println("<body>");
            out.println("<hr>");
            out.println("<h1 style=text-align:center;>Customer Deleted successfully</h1>");
            
              out.println("<h2 style=text-align:center;><a href=operation.jsp>Home-Page</a></h2>");
               out.println("<hr>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
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
