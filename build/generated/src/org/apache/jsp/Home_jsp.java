package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Style/Dashboard.css\"   type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\" class=\"logo\">\n");
      out.write("                            <img src=\"Images/logo.webp\" alt=\"\">\n");
      out.write("                            <span class=\"nav-item\">Home</span>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li><a href=\"Dashboard.html\">\n");
      out.write("                            <i class=\"fas fa-home\"></i>\n");
      out.write("                            <span class=\"nav-item\">Dashboard</span>\n");
      out.write("                        </a></li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <li><a href=\"Registration.html\" class=\"logout\">\n");
      out.write("                            <i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("                            <span class=\"nav-item\">Logout</span>\n");
      out.write("                        </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <i class=\"fas fa-laptop-code\"></i>\n");
      out.write("\n");
      out.write("                <section class=\"main\">\n");
      out.write("                    <div class=\"main-top\">\n");
      out.write("                        <h1></h1>\n");
      out.write("\n");
      out.write("                        <i class=\"fas fa-user-cog\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"main-skills\">\n");
      out.write("\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <i class=\"fas fa-laptop-code\"></i>\n");
      out.write("\n");
      out.write("                            <h3>BMI Calculator</h3>\n");
      out.write("                            <p></p>\n");
      out.write("                            <form action=\"http://localhost:8080/CE21project/bmihtml.html\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <i class=\"fab fa-wordpress\"></i>\n");
      out.write("                            <h3>Calorific Calculator</h3>\n");
      out.write("                            <form action=\"http://localhost:8080/CE21project/caloriecalculator.html\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <section class=\"main-course\">\n");
      out.write("                        <h1>BMI Range and It's Diet</h1>\n");
      out.write("                        <div class=\"course-box\">\n");
      out.write("\n");
      out.write("                            <div class=\"course\">\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h3>UnderWeight</h3>\n");
      out.write("                                    <p>BMI:<18</p>\n");
      out.write("                                    <form action=\"http://localhost:8080/CE21project/underweight.jsp\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    <i class=\"fab fa-html5 html\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h3>  Healthy   </h3>\n");
      out.write("                                    <p>BMI:18.5-24.9</p>\n");
      out.write("                                    <form action=\"http://localhost:8080/CE21project/normal.jsp\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <i class=\"fab fa-css3-alt css\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h3>OverWeight</h3>\n");
      out.write("                                    <p>BMI:25-29.5</p>\n");
      out.write("                                    <form action=\"http://localhost:8080/CE21project/overweight.jsp\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <i class=\"fab fa-js-square js\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h3>  Obese  </h3>\n");
      out.write("                                    <p>BMI:<30</p>\n");
      out.write("                                    <form action=\"http://localhost:8080/CE21project/obese.jsp\" method=\"get\">\n");
      out.write("                                        <button>Know More</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <i class=\"fab fa-js-square js\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
