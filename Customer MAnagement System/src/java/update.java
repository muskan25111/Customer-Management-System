import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class update extends HttpServlet {

   
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        int status=0; 
        try{
         Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
      
       String s1=request.getParameter("empid");
        String s2=request.getParameter("name");
        String s3=request.getParameter("Age");
        String s4=request.getParameter("email");
        
        String s5=request.getParameter("phone");
        String s6=request.getParameter("addr");
        String s7=request.getParameter("gender");
        String s8=request.getParameter("Adhar");
        String s9=request.getParameter("pass");
    
    
      
    String sql="update addcus set name=?,Age?,email=?,phone=?,addr=?,gender=?,Adhar=?,pass=? where id=?";
    PreparedStatement ps=con.prepareStatement(sql);
    PrintWriter out=response.getWriter();
       
    
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
              out.println("<h3>Record Updated successfully</h3>");
              out.println("<a href=>Home-Page</a><br>");
              out.println("<a href=Home.jsp>Home-Page</a>");
               out.println("<a href=Adminpage>Back</a>");
             
            out.println("<hr>");
              out.println("</body>");
              out.println("</html>");
     
    
        
}  
catch(Exception e)
        {
            e.printStackTrace();
        }
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}