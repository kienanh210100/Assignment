package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;
import java.util.ArrayList;
import entity.Players;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> List Players of Manchester United </title>\n");
      out.write("        ");

            HttpSession session1 = request.getSession();
            ArrayList<Players> players = (ArrayList<Players>) session1.getAttribute("players");
            ArrayList<Account> account = (ArrayList<Account>) request.getAttribute("account");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <center>\n");
      out.write("        <h1>List Players of Manchester United 2021-2022</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Position</th>\n");
      out.write("                <th>Year</th>\n");
      out.write("                <th>Nation</th>\n");
      out.write("                <th>Number</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 for (Players p : players) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( p.getId());
      out.write("</td> \n");
      out.write("                <td>");
      out.print( p.getName());
      out.write("</td> \n");
      out.write("                <td>");
      out.print( p.getPosition());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( p.getYear());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( p.getNation());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( p.getNumber());
      out.write("</td> \n");
      out.write("                <td><a href=\"Update?id=");
      out.print(p.getId());
      out.write("\">Update</a></td>\n");
      out.write("                <td><a href=\"DeleteControl?id=");
      out.print(p.getId());
      out.write("\"onclick=\"return confirm('Do you want to delete?')\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <form action=\"LogoutControl\" method=\"POST\">\n");
      out.write("            <td><a href=\"LogoutControl\"onclick=\"return confirm('Do you want to Log out?')\">Log Out</a></td>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</html>");
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
