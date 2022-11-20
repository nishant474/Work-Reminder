package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mystyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">Daily Reminders</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"display.jsp\">Show Works <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("<!--      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">About Us</a>\n");
      out.write("      </li>-->\n");
      out.write("<!--      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("          Dropdown\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("        </div>\n");
      out.write("      </li>-->\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("     \n");
      out.write("\n");
      out.write("        <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ul class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- The slideshow -->\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"img/1.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/2.jpg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/3.png\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    <center>\n");
      out.write("        <div id=\"div1\" style=\"background-color: orange\">\n");
      out.write("            <h1>Add Your Reminders</h1>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <form  name=\"form1\" method=\"POST\" action=\"insert\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Work Name :- </label>\n");
      out.write("                    <input type=\"text\"  name=\"workname\" placeholder=\"WORK NAME\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>Area of Work</label>\n");
      out.write("                    <select name=\"areaofwork\" required=\"\">\n");
      out.write("                        <option selected=\"\" disabled=\"\">Select</option>\n");
      out.write("                        <option value=\"College Work\">College Work</option>\n");
      out.write("                        <option value=\"Self Work\">Self Work</option>\n");
      out.write("                        <option value=\"Company Work\">Company Work</option>\n");
      out.write("                        <option value=\"Side Work\">Side Work</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"><br>\n");
      out.write("                    <label>Due Date</label>\n");
      out.write("                    <input type=\"date\" name=\"workdate\"required=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" id=\"submit\" value=\"submit\" class=\"btn btn-primary\">Save</button><br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>Thankyou For Visiting Daily Reminders Site  @ Nishant Trivedi</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"css/home.js\"></script>\n");
      out.write("</body>\n");
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
