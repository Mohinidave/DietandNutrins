package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String pass = request.getParameter("pass");
        String useremail = request.getParameter("email");
        if (name.equals("") || pass.equals("") || useremail.equals("")) {
            out.print("Please fill all details ");
        }
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CERegistration", "root", "root");

            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO ROOT.REGISTRATION (NAME, EMAIL, PASSWORD)VALUES (?,?,?)");
            pst.setString(1, name);
            pst.setString(2, useremail);
            pst.setString(3, pass);

            int rowcount = pst.executeUpdate();
            conn.commit();

            RequestDispatcher rd = request.getRequestDispatcher("Login.html");
            if (rowcount <= 0) {
                request.setAttribute("Status", "Fail");
            } else {
                request.setAttribute("Status", "Success");
            }

            rd.forward(request, response);

        } catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
            System.out.println(e);
            out.println("<p>Email Exist already</p>");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                out.print(ex);
            }
        }
    }

}
