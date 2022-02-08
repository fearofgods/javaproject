<%-- 
    Document   : index
    Created on : Feb 4, 2022, 10:30:29 PM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark rounded">
    <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp"><img src="img/logo/store.svg" width="30" height="30" alt="logo" style="cursor: pointer;">&nbsp;Cellphone Store</a>
    
    <ul class="navbar-nav mr-auto">
        <form class="form-inline">
            <input class="form-control mr-sm-1 search-box" type="search" placeholder="Bạn muốn tìm gì?" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm</button>
        </form>
    </ul>

    <ul class="navbar-nav ml-auto">
        <li class="nav-item">
            <a href="" class="nav-link"><span class="material-icons">shopping_cart</span>Giỏ hàng</a>
        </li>
        <li class="nav-item">
            <a href="<%=request.getContextPath()%>/login" class="nav-link">Đăng nhập/Đăng kí</a>
        </li>
     </ul>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-warning second-nav">
    <div class="collapse navbar-collapse justify-content-center second-nav" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item dropdown child-second-nav">
            <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
            Danh mục sản phẩm
            </a>
            <div class="dropdown-menu">
               <a class="dropdown-item" href="#">Javascript</a>
               <a class="dropdown-item" href="#">Css</a>
               <a class="dropdown-item" href="#">Bootstrap</a>
            </div>
         </li>
        <li class="nav-item child-second-nav">
            <a href="" class="nav-link"><span class="material-icons">done</span> Sản phẩm đã xem</a>
        </li>
        <li class="nav-item child-second-nav">
          <a class="nav-link" href="#">Tư vấn bán hàng</a>
        </li>
        <li class="nav-item child-second-nav">
          <a class="nav-link" href="#">Chính sách bảo hành</a>
        </li>
        <li class="nav-item child-second-nav">
          <a class="nav-link" href="#">Miễn phí vận chuyển</a>
        </li>
      </ul>
    </div>
  </nav>