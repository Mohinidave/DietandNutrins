<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 <html>
<head>
<title>Over Weight</title>
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
   
    <img src="Images/overweight.jpg" class="center">
    <h1 style="text-align: center">Obesity</h1>
<p>Overweight and obesity are defined as abnormal or excessive fat accumulation that presents a risk to health. A body mass index (BMI) over 25 is considered overweight, and over 30 is obese.</p>
    
    <h4>Nutrition Intake for overWeight</h4>
    <table border="2">
        <tr>
            <th>Nutrition Value</th>
        </tr>
        <tr>
            <td>Energy- 1200kcal </td>
         </tr>
          <tr>
            <td>Protein- 12%(100gms)</td>
             </tr>
              <tr>
            <td>Carbs-15%(130gms)</td>
             </tr>
              <tr>
            <td>Fats- 10%(50gms) </td>
             </tr>
       
    </table>
    <h4>Generic Diet for Obese</h4>
    <table border="2">
        <tr>
            <td>Breakfast</td>
            <td>Oats, blueberries, milk, nuts.</td>
        </tr> 
        <tr>
            <td>Lunch</td>
            <td>Home food, salads, yogurt.</td>
        </tr> 
        <tr>
            <td>Dinner</td>
            <td>Home food,nuts,fruits.</td>
        </tr> 
    </table>

<sql:setDataSource var="db" driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527/CERegistration"
 user="root" password="root"/>
 <sql:query dataSource="${db}" var="rs">
SELECT * FROM ROOT.OBESE
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
