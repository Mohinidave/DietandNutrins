package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String name=request.getParameter("username");
        String pass=request.getParameter("pass");
        String useremail=request.getParameter("email");
        
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CERegistration", "root", "root");
            
            String sql = "INSERT INTO ROOT.REGISTRATION (NAME, EMAIL, PASSWORD)VALUES (?,?,?);";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, useremail);
            pst.setString(3, pass);
            
            int rowcount = pst.executeUpdate();
            conn.commit();
            
            RequestDispatcher rd = request.getRequestDispatcher("Dashboard.html");
            if (rowcount <= 0) {
                request.setAttribute("Status", "Fail");
            } else {
                request.setAttribute("Status", "Success");
            }
            
            rd.forward(request, response);
            
        } catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
            System.out.println(e);
            out.println("<meta http-equiv='refresh' content='3;URL=index.html'>");//redirects after 3 seconds
            out.println("<p>Email Exist already</p>");
        } finally {
            conn.close();
        }
    
            
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <input type=\"checkbox\" id=\"flip\">\n");
      out.write("            <div class=\"cover\">\n");
      out.write("                <div class=\"front\">\n");
      out.write("                    <img src=\"Images/IGCF.gif\" alt=\"\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <span class=\"text-1\"></span>\n");
      out.write("                        <span class=\"text-2\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"back\">\n");
      out.write("\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <span class=\"text-1\">Complete miles of journey <br> with one step</span>\n");
      out.write("                        <span class=\"text-2\">Let's get started</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"forms\">\n");
      out.write("                <div class=\"form-content\">\n");
      out.write("                    <div class=\"login-form\">\n");
      out.write("                        <div class=\"title\">Login</div>\n");
      out.write("                        <form action=\"Login\" method='get'>\n");
      out.write("                            <div class=\"input-boxes\">\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("                                    <i class=\"fas fa-envelope\"></i>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your email\" name='username' required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("                                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Enter your password\" name=\"pass\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text\"><a href=\"#\">Forgot password?</a></div>\n");
      out.write("                                <div class=\"button input-box\">\n");
      out.write("                                    <input type=\"submit\" value=\"Sumbit\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text sign-up-text\">Don't have an account? <label for=\"flip\">Sigup now</label></div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"signup-form\">\n");
      out.write("                        <div class=\"title\">Signup</div>\n");
      out.write("                        <form action=\"\" method=\"post\">\n");
      out.write("                            <div class=\"input-boxes\">\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("                                    <i class=\"fas fa-user\"></i>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your name\" name=\"username\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("                                    <i class=\"fas fa-envelope\"></i>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your email\" name=\"email\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("                                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Enter your password\" name=\"pass\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"button input-box\">\n");
      out.write("                                    <input type=\"submit\" value=\"Sumbit\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text sign-up-text\">Already have an account? <label for=\"flip\">Login now</label></div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
