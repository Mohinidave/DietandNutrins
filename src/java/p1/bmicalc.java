package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class bmicalc extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 public bmicalc() {
 super();
 }

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 Double weight =
Double.parseDouble(request.getParameter("weight"));
Double height = Double.parseDouble(request.getParameter("height"))/100;
double BMI = Math.round(weight/(height*height)*100)/100;
String BmiInfo = "";

if(BMI<18.5) {
BmiInfo = "Your BMI is too low. You are underweight.";
out.println(BmiInfo);
out.println(BmiInfo);
     
request.setAttribute(BmiInfo, BmiInfo);
 RequestDispatcher dispatcher = request.getRequestDispatcher("/underweight.jsp");
dispatcher.forward(request, response);


 
} else if(BMI>18.5 && BMI<25) {
BmiInfo = "Your BMI is right. Great!";
 out.println(BmiInfo);
     
request.setAttribute(BmiInfo, BmiInfo);
 RequestDispatcher dispatcher = request.getRequestDispatcher("/normal.jsp");
dispatcher.forward(request, response);
 out.println(BmiInfo);
} else if(BMI>=25) {
BmiInfo = "Your BMI is too height. You are overweight.";
 out.println(BmiInfo);
 request.setAttribute(BmiInfo, BmiInfo);
 RequestDispatcher dispatcher = request.getRequestDispatcher("/overweight.jsp");
dispatcher.forward(request, response);
 out.println(BmiInfo);
}

 out.println(BMI);
 
}
}