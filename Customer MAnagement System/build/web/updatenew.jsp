<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
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
%>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
statement=connection.createStatement();
String sql ="select * from addcus where empid="+empid;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>
<h1>Update data from database in jsp</h1>
<form method="post" action="updateprocess.jsp">
<input type="hidden" name="empid" value="<%=resultSet.getString("empid") %>">
<input type="text" name="empid" value="<%=resultSet.getString("empid") %>">
<br>
name:<br>
<input type="text" name="name" value="<%=resultSet.getString("last_name") %>">
<br>
Age:<br>
<input type="text" name="Age" value="<%=resultSet.getString("city_name") %>">
<br>
email:<br>
<input type="email" name="email" value="<%=resultSet.getString("email") %>">
<br>
phone:<br>
<input type="email" name="phone" value="<%=resultSet.getString("email") %>">
<br>
addr:<br>
<input type="email" name="addr" value="<%=resultSet.getString("email") %>">
<br>
gender:<br>
<input type="email" name="gender" value="<%=resultSet.getString("email") %>">
<br>
Adhar:<br>
<input type="email" name="Adhar" value="<%=resultSet.getString("email") %>">
<br>
pass:<br>
<input type="email" name="pass" value="<%=resultSet.getString("email") %>">
<br>
<br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>