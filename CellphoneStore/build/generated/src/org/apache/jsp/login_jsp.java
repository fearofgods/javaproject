package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <h1 class=\"text-center header\">Cellphone Shop</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"d-flex justify-content-center align-items-center mt-5\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"nav nav-pills mb-3\" id=\"pills-tab\" role=\"tablist\">\r\n");
      out.write("                <li class=\"nav-item text-center\"> \r\n");
      out.write("                    <a class=\"nav-link active btl\" id=\"pills-home-tab\" data-toggle=\"pill\" href=\"#pills-home\" role=\"tab\" aria-controls=\"pills-home\" aria-selected=\"true\">Đăng nhập</a> \r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item text-center\"> \r\n");
      out.write("                    <a class=\"nav-link btr\" id=\"pills-profile-tab\" data-toggle=\"pill\" href=\"#pills-profile\" role=\"tab\" aria-controls=\"pills-profile\" aria-selected=\"false\">Đăng kí</a> \r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"tab-content\" id=\"pills-tabContent\">\r\n");
      out.write("                <form action=\"\" method=\"\" class=\"tab-pane fade show active\" id=\"pills-home\" role=\"tabpanel\" aria-labelledby=\"pills-home-tab\">\r\n");
      out.write("                    <div class=\"form px-4 pt-5\"> \r\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Tên đăng nhập\"> \r\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Mật khẩu\"> \r\n");
      out.write("                        <button class=\"btn btn-dark btn-block\">Đăng nhập</button> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <form action=\"\" method=\"\" class=\"tab-pane fade\" id=\"pills-profile\" role=\"tabpanel\" aria-labelledby=\"pills-profile-tab\">\r\n");
      out.write("                    <div class=\"form px-4\"> \r\n");
      out.write("                        <input type=\"text\" name=\"firstname\" class=\"form-control\" placeholder=\"Họ và tên đệm\"> \r\n");
      out.write("                        <input type=\"text\" name=\"lastname\" class=\"form-control\" placeholder=\"Tên\"> \r\n");
      out.write("                        <input type=\"email\" name=\"Email\" class=\"form-control\" placeholder=\"Email\"> \r\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Tên đăng nhập\"> \r\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Mật khẩu\"> \r\n");
      out.write("                        <input type=\"password\" name=\"repassword\" class=\"form-control\" id=\"repassword\" placeholder=\"Nhập lại mật khẩu\">\r\n");
      out.write("                        <span id=\"message\"></span>\r\n");
      out.write("                        <button class=\"btn btn-dark btn-block\">Đăng kí</button> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"js/login.js\"></script>\r\n");
      out.write("</body>\r\n");
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
