<%-- 
    Document   : index
    Created on : Feb 4, 2022, 10:30:29 PM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header class="header">
        <div class="header-child-1">
            <div class="logo">
                <a href="<%=request.getContextPath()%>/"><img src="img/logo/store.svg" width="30" height="30" alt=""></a>
                <div class="brand-name">
                    <p>Cellphone Store</p>
                </div>
            </div>


            <form action="" class="search-form">
                <input type="search" name="" placeholder="Bạn muốn tìm gì?" id="search-box">
                <label for="search-box" class="fas fa-search"></label>
            </form>

            <div class="icons">
                <div class="shoping-cart">
                    <div class="fas fa-shopping-cart"></div>
                    <a href="">Giỏ hàng</a>
                </div>
                <div class="users">
                    <div class="fas fa-user"></div>
                    <a href="<%=request.getContextPath()%>/login">Đăng nhập</a>
                </div>

            </div>
        </div>
        <div class="header-child-2">
            <nav class="navbar navbar-expand-md">
                <div class="container">
                    <button class="navbar-toggler d-none" data-toggle="collapse" data-target="#navcol-1"><span
                            class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav w-100 justify-content-between">
                            <li class="nav-component dropdown ">
                                <a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Danh mục sản phẩm</a>
                                <div class="dropdown-menu" role="menu">
                                    <c:forEach items="${category}" var="o">
                                        <a class="dropdown-item" role="presentation"href="#">${o.cname}</a>
                                    </c:forEach>
                                </div>
                            </li>
                            <li class="nav-component dropdown">
                                <a class="nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Chính sách bảo hành</a>
                            </li>
                            <li class="nav-component dropdown">
                                <a class="nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Miễn phí giao hàng</a>
                            </li>
                            <li class="nav-component dropdown">
                                <a class="nav-link" data-toggle="dropdown" aria-expanded="false" href="#">Đổi trả trong 15 ngày</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav> 
        </div>
    </header>