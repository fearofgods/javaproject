<%-- 
    Document   : admin-order
    Created on : Mar 15, 2022, 2:29:46 AM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : admin-manage
    Created on : Feb 28, 2022, 12:29:01 AM
    Author     : hongd
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>Cellphone Shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <jsp:include page="common/link.jsp"/>
        <!-- My styles -->
        <link rel="stylesheet" href="styles/admin.css">
    </head>

    <body>
        <jsp:include page="head-sidenav.jsp" />

        <div id="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 content">
                        <div class="col-12 dilivery-info">
<!--                            <h5>Thông tin vận chuyển</h1>
                                <p>Họ và tên: Phạm Dương</p>
                                <p>Địa chỉ: Hải Dương</p>
                                <p>Số điện thoại: 01234</p>
                                <p>Ghi chú: </p>
                                <input type="text" name="description" id="des">

                                </div>-->

                                <table class="table table-dark">
                                    <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col" colspan="2">Sản phẩm</th>
                                            <th scope="col">Phân loại</th>
                                            <th scope="col">Đơn giá</th>
                                            <th scope="col">Số lượng</th>
                                            <th scope="col">Số tiền</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:set var="id" value="0"/>
                                        <c:forEach items="${list}" var="l">
                                            <c:set var="id" value="${id+1}"/>
                                            <tr>
                                                <td scope="row">${id}</td>
                                                <td><img id="img-items" src="${l.products.image}" class="img-responsive"
                                                         alt="">
                                                </td>
                                                <td>&nbsp;${l.products.name}</td>
                                                <td>${l.color} - ${l.storage}</td>
                                                <td id="item-price">${l.price}</td>
                                                <td>
                                                    <div><input type="button" value="-" class="qty-btn"><input type="text" value="1"
                                                                                                               name="qty" class="qty-in" readonly><input type="button" value="+"
                                                                                                               class="qty-btn"></div>
                                                </td>
                                                <td id="total-item-price">${l.total_price}</td>
                                            </tr>
                                        </c:forEach>
                                </table>

                                <div class="payment">
                                    <a href="<c:url value="/admin-orderdt?oid=${list.get(0).oid}&action=cf"/>"><input type="button" value="Xác nhận"></a>
                                    <a href="<c:url value="/admin-orderdt?oid=${list.get(0).oid}&action=cl"/>"><input type="button" value="Từ chối"></a>
                                </div>
                        </div>
                    </div>

                </div>
            </div>

            <jsp:include page="common/script.jsp"/>
            <!-- My script -->
            <script src="js/admin.js"></script>
    </body>

</html>

