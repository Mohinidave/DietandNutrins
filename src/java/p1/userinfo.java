package p1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Userinfo extends HttpServlet {
private static final long serialVersionUID = 1L;
 /**
 *
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
String name = request.getParameter("name");
String password = request.getParameter("password");
 String email_id = request.getParameter("email_id");
 String contact_no = request.getParameter("contact_no");
String address = request.getParameter("address");
String height = request.getParameter("height");
 String weight = request.getParameter("weight");
if(name.isEmpty() || password.isEmpty() || email_id.isEmpty() ||
contact_no.isEmpty() || address.isEmpty() || height.isEmpty()||
weight.isEmpty())
{
RequestDispatcher req = request.getRequestDispatcher("userinfo.jsp");
req.include(request, response);
}
else
{
RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
req.forward(request, response);
}
}
}
