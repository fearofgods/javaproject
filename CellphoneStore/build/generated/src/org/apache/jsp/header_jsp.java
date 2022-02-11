package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("        <div class=\"header-child-1\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/\"><img src=\"img/logo/store.svg\" width=\"30\" height=\"30\" alt=\"Logo\"></a>\r\n");
      out.write("                <div class=\"brand-name\">\r\n");
      out.write("                    <p>Cellphone Store</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form action=\"\" class=\"search-form\">\r\n");
      out.write("                <input type=\"search\" name=\"\" placeholder=\"Bạn muốn tìm gì?\" id=\"search-box\">\r\n");
      out.write("                <label for=\"search-box\" class=\"fas fa-search\"></label>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"icons\">\r\n");
      out.write("                <div class=\"shoping-cart\">\r\n");
      out.write("                    <div class=\"fas fa-shopping-cart\"></div>\r\n");
      out.write("                    <a href=\"\">Giỏ hàng</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"users\">\r\n");
      out.write("                    <div class=\"fas fa-user\"></div>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/login\">Đăng nhập</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header-child-2\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <button class=\"navbar-toggler d-none\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span\r\n");
      out.write("                            class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav w-100 justify-content-between\">\r\n");
      out.write("                            <li class=\"nav-component dropdown \">\r\n");
      out.write("                                <a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\" onclick=\"loadCategory()\">Danh mục sản phẩm</a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" id=\"catemenu\" role=\"menu\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-component dropdown\">\r\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Chính sách bảo hành</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-component dropdown\">\r\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Miễn phí giao hàng</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-component dropdown\">\r\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Đổi trả trong 15 ngày</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav> \r\n");
      out.write("        </div>\r\n");
      out.write("    </header>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <a class=\"dropdown-item\" role=\"presentation\"href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
