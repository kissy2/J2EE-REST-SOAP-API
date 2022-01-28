package org.apache.jsp.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calcul_005fmntTTC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              <hr>\n");
      out.write("        <h1>Calcul TTC</h1>\n");
      out.write("        <hr>\n");
      out.write("        <form method=\"post\" action=\"http://localhost:8080/tp6_ws_client/Servlet_Soap\">\n");
      out.write("            <input type=\"number\" required placeholder=\"Veuillez enter : le montant\" name=\"montant\">\n");
      out.write("            <select name=\"cat\" size=\"1\">\n");
      out.write("                <OPTION selected value=\"00.5\">Catégorie 1 : TVA=5%</option>\n");
      out.write("                <OPTION value=\"00.8\">Catégorie 2 : TVA=8%</option>\n");
      out.write("                <OPTION value=\"0.12\">Catégorie 3 : TVA=12%</option>\n");
      out.write("                <OPTION value=\"0.18\">Catégorie 4 : TVA=18%</option>\n");
      out.write("                <OPTION value=\"0.27\">Catégorie 5 : TVA=27%</option>\n");
      out.write("                </select>\n");
      out.write("            <br>    \n");
      out.write("            <input type=\"submit\" value=\"Calculer\">\n");
      out.write("                \n");
      out.write("            <input type=\"reset\" value=\"Annuler\">\n");
      out.write("             </form>\n");
      out.write("        <label>");
 
           String s= (String)request.getAttribute("resultat");
            out.println(s);   
      out.write("</label>\n");
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
