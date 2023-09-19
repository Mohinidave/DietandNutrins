<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 <html>
<head>
<title>What to eat</title>
</head>
<body>
    <h1>What to eat</h1>
    <p>These times are general guidelines, and the best times to eat may vary depending on your individual needs and schedule. However, eating regular meals and snacks throughout the day can help to keep your blood sugar levels stable, boost your metabolism, and reduce your risk of overeating.</p>
    
<sql:setDataSource var="db" driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527/CERegistration"
 user="root" password="root"/>
 <sql:query dataSource="${db}" var="rs">
SELECT * FROM ROOT.HOWTOEAT
</sql:query>
 <table border="2" width="100%">
<tr>
<th>Meal</th>
<th>Time</th>
<th>What to Include</th>
<th>What to Avoid</th>

</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.MEAL}"/></td>
<td><c:out value="${table.TIME}"/></td>
<td><c:out value="${table.FOODTOINCLUDE}"/></td>
<td><c:out value="${table.FOODTOAVOID}"/></td>

</tr>
</c:forEach>
</table>
 </body>
</html> 