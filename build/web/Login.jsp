<%@page contentType="text/html" import="java.sql.*"%>
<html><body>
<h1>Registration JSP Page</h1>
<%
 String uname=request.getParameter("email");
 String pass = request.getParameter("pass");
 try{
 Class.forName("org.apache.derby.jdbc.ClientDriver");
 Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CERegistration","root","root");
 Statement stmt=con.createStatement();
 
 ResultSet rs=stmt.executeQuery("SELECT PASSWORD FROM ROOT.REGISTRATION WHERE EMAIL='"+uname+"'");

 if(rs.next()){
 if(pass.equals(rs.getString(1)))
 {
 out.println("<h1>~~~ LOGIN SUCCESSFULLL ~~~ </h1>");
 response.sendRedirect("Dashboard.html");
 }
 }
 else{
 out.println("<h1>User Name not exist !!!!!</h1>");
 %>
<jsp:include page="Registration.html" ></jsp:include>
<%
 }
 }catch(Exception e){out.println(e);}
 %>
</body></html>

