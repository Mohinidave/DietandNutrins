package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Caloriecalculator extends HttpServlet {
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException {
 // Retrieve user input parameters from the request
 double weight = Double.parseDouble(request.getParameter("weight"));
 double height = Double.parseDouble(request.getParameter("height"));
 int age = Integer.parseInt(request.getParameter("age"));
 double activityLevel =
Double.parseDouble(request.getParameter("activityLevel"));
 // Calculate Total Daily Energy Expenditure (TDEE)
 double bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
 double tdee = bmr * activityLevel;
 // Calculate recommended daily calorie intake
 double recommendedCalories = tdee;
 // Set the content type of the response
 response.setContentType("text/html");
 // Write the HTML content of the result page
 PrintWriter out = response.getWriter();
 out.println("<html><head><title>Calorie CalculatorResult</title></head><body>");
 out.println("<h1>Calorie Calculator Result</h1>");
 out.println("<p>Total Daily Energy Expenditure (TDEE): " + tdee + "calories</p>");
 out.println("<p>Recommended Daily Calorie Intake: " +recommendedCalories + " calories</p>");
 
 
     
 }
}