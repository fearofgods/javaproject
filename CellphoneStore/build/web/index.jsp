<%-- 
    Document   : index
    Created on : Feb 4, 2022, 10:30:29 PM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link rel="stylesheet" href="styles/index.css">
    </head>
    <body class="d-flex flex-column min-vh-100">
        <!-- Navbar -->
        <jsp:include page="header.jsp" />
        <!-- Info -->
        <div class="container">
            <div class="banner col-md-12 col-12 col-sm-12">
        </div>
            <!-- Slider top sell -->
        <div class="top-list col-md-12 col-12 col-sm-12">
            <div class="row">
                <div class="col-md-12 col-sm-12 block-header">
                    <h1>Top bán chạy</h1>
                </div>

                <div class="owl-carousel col-md-12 col-sm-12">
                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="item-top">
                            <div class="item-top-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive"
                                        alt=""></a>
                            </div>
                            <div class="item-top-title">
                                <h2>Iphone 13 pro max 128gb</h2>
                                <p>34.190.000đ</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="item-top">
                            <div class="item-top-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro.jpg" class="img-responsive"
                                        alt=""></a>
                            </div>
                            <div class="item-top-title">
                                <h2>Iphone 13 pro max 128gb</h2>
                                <p>34.190.000đ</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="item-top">
                            <div class="item-top-img">
                                <a href="#"><img src="img/items/samsung-galaxy-z-fold3-5g.jpg" class="img-responsive"
                                        alt=""></a>
                            </div>
                            <div class="item-top-title">
                                <h2>Iphone 13 pro max 128gb</h2>
                                <p>34.190.000đ</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="item-top">
                            <div class="item-top-img">
                                <a href="#"><img src="img/items/sony-xperia-pro-i.jpg" class="img-responsive"
                                        alt=""></a>
                            </div>
                            <div class="item-top-title">
                                <h2>Iphone 13 pro max 128gb</h2>
                                <p>34.190.000đ</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6">
                        <div class="item-top">
                            <div class="item-top-img">
                                <a href="#"><img src="img/items/xiaomi-redmi-note-11-pro-global.jpg"
                                        class="img-responsive" alt=""></a>
                            </div>
                            <div class="item-top-title">
                                <h2>Iphone 13 pro max 128gb</h2>
                                <p>34.190.000đ</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="banner col-md-12 col-12 col-sm-12">
            <h2>ADS</h2>
        </div>
        <!-- New products -->
        <div class="default-list col-md-12 col-12 col-sm-12">
            <div class="row" id="newlist">
                <div class="col-md-12 col-sm-12 block-header">
                    <h1>Điện thoại mới nhất</h1>
                </div>
                <!--load with ajax-->
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="load-more">
                        <div class="btn">
                            <button onclick="loadTop4()">Xem thêm</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- Footer -->
        <jsp:include page="footer.jsp"/>
        <jsp:include page="common/script.jsp"/>
        <script src="js/index.js"></script>

    </body>
    
</html>
