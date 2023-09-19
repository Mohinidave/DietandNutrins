<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 <html>
<head>
<title>Under Weight</title>
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
    <img src="Images/underweight.webp" class="center">
    <h1 style="text-align: center">UnderWeight</h1>
    <p>An underweight person is a person whose body weight is considered too low to be healthy. A person who is underweight is malnourished.</p>
    
    
    <h4>Nutrition Intake for UnderWeight</h4>
    <table border="2">
        <tr>
            <th>Nutrition Value</th>
        </tr>
        <tr>
            <td>Energy-3228kcal </td>
         </tr>
          <tr>
            <td>Protien-20%(181gms)</td>
             </tr>
              <tr>
            <td>Carbs-50%(403gms)</td>
             </tr>
              <tr>
            <td>Fats-30%(121gms) </td>
             </tr>
       
    </table>
    <h4>Generic Diet for UnderDiet</h4>
    <table border="2">
        <tr>
            <td>Breakfast</td>
            <td>Oats, blueberries, milk, nuts</td>
        </tr> 
        <tr>
            <td>Lunch</td>
            <td>Home food, salads, yogurt, cheez, ghee.</td>
        </tr> 
        <tr>
            <td>Dinner</td>
            <td>Home food,nuts,fruits.ghee</td>
        </tr> 
    </table>

<sql:setDataSource var="db" driver="org.apache.derby.jdbc.ClientDriver"
 url="jdbc:derby://localhost:1527/CERegistration"
 user="root" password="root"/>
 <sql:query dataSource="${db}" var="rs">
SELECT * FROM ROOT.UNDERWEIGHT
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
