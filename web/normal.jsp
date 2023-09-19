<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 <html>
<head>
<title>Normal Weight</title>
<style>
    .center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}
</style>
</head>
<body>
    <%String bmiInfo = (String) request.getAttribute("BmiInfo");
    %>
    
    <h3> ${bmiInfo}</h3>
   
    <img src="Images/healthy.jpg" class="center">
    <h1 style="text-align: center">Healthy Person</h1>
    <p>Healthy living is difficult to implement, much less maintain. If you are like us and try your darndest to eat right, sleep enough, and properly hydrate. But, fall off the wagon from time to time ? these quotes are for you. Use this inspiration to stay the course with the positive habits you have put into place!</p>
    
    
    <h4>Nutrition Intake</h4>
    <table border="2">
        <tr>
            <th>Nutrition Value</th>
        </tr>
        <tr>
            <td>Energy- 2400kcal </td>
         </tr>
          <tr>
            <td>Protein- 16%(150gms)</td>
             </tr>
              <tr>
            <td>Carbs-42%(340gms)</td>
             </tr>
              <tr>
            <td>Fats- 26%(106gms) </td>
             </tr>
       
    </table>
    <h4>Generic Diet</h4>
    <table border="2">
        <tr>
            <td>Breakfast</td>
            <td>Oats, blueberries, lemon tea, milk, nuts</td>
        </tr> 
        <tr>
            <td>Lunch</td>
            <td>Home food, salads, yogurt.</td>
        </tr> 
        <tr>
            <td>Dinner</td>
            <td>Home food,nuts,fruits</td>
        </tr> 
    </table>

<sql:setDataSource var="db" driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527/CERegistration"
 user="root" password="root"/>
 <sql:query dataSource="${db}" var="rs">
SELECT * FROM ROOT.NORMAL
</sql:query>
<h4>Weekly Planner</h4>
 <table border="2" width="100%">
<tr>
<th>Days</th>
<th>Breakfast</th>
<th>Lunch</th>
<th>Dinner</th>
<th>Snacks</th>

</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.DAY}"/></td>
<td><c:out value="${table.BREAKFAST}"/></td>
<td><c:out value="${table.LUNCH}"/></td>
<td><c:out value="${table.DINNER}"/></td>
<td><c:out value="${table.SNACKS}"/></td>

</tr>
</c:forEach>
</table>

 </body>
</html> 
