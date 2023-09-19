<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 <html>
<head>
<title>When to eat</title>
</head>
<body>
    <h1>When to eat</h1>
    <p>This is just a small sample of the many foods that have calorific values. The calorific value of a food can vary depending on its preparation method, moisture content, and other factors.</p>
    
<sql:setDataSource var="db" driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527/CERegistration"
 user="root" password="root"/>
 <sql:query dataSource="${db}" var="rs">
select * from ROOT.WHATTOEAT
</sql:query>
 <table border="2" width="100%">
<tr>
<th>Meal</th>
<th>Time</th>
<th>Description</th>
</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.MEAL}"/></td>
<td><c:out value="${table.TIME}"/></td>
<td><c:out value="${table.DESCRIPTION}"/></td>

</tr>
</c:forEach>
</table>
 </body>
</html> 