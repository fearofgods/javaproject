package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cellphone Shop</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/link.jsp", out, false);
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/index.css\">\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"styles/header.css\"> -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 wrapper-slider\">\n");
      out.write("                    <div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                          <div class=\"carousel-item active\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"img/banner/banner-ip13.jpg\" alt=\"First slide\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"carousel-item\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"img/banner/banner-rdm11.jpg\" alt=\"Second slide\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"carousel-item\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"img/banner/banner-zflip.jpg\" alt=\"Third slide\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"carousel-item\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"img/banner/banner-zfold.png\" alt=\"Fourth slide\">\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> -->\n");
      out.write("\n");
      out.write("        <!-- Slider -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Info -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"default-list\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 block-header\">\n");
      out.write("                        <h1>Điện thoại nổi bật nhất</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"item-wrapper\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/items/apple-iphone-13-pro-max.jpg\" class=\"img-responsive img-i\" alt=\"iphone13 pro max\"></a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-price\">\n");
      out.write("                                <h3>Iphone 13 pro max 128gb</h3>\n");
      out.write("                                <p>34.190.000đ</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-btn\">\n");
      out.write("                                <button id=\"btn-1\">Thêm vào giỏ</button>\n");
      out.write("                                <button id=\"btn-2\">Mua ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/script.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
