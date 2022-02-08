<%-- 
    Document   : index
    Created on : Feb 4, 2022, 10:30:29 PM
    Author     : hongd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <!-- <link rel="stylesheet" href="styles/header.css"> -->
    </head>
    <body>
        <!-- Navbar -->
        <jsp:include page="header.jsp"/>

        <!-- <div class="container-fluid">
            <div class="row">
                <div class="col-md-6 wrapper-slider">
                    <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                          <div class="carousel-item active">
                            <img class="d-block w-100" src="img/banner/banner-ip13.jpg" alt="First slide">
                          </div>
                          <div class="carousel-item">
                            <img class="d-block w-100" src="img/banner/banner-rdm11.jpg" alt="Second slide">
                          </div>
                          <div class="carousel-item">
                            <img class="d-block w-100" src="img/banner/banner-zflip.jpg" alt="Third slide">
                          </div>
                          <div class="carousel-item">
                            <img class="d-block w-100" src="img/banner/banner-zfold.png" alt="Fourth slide">
                          </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> -->

        <!-- Slider -->
        

        <!-- Info -->
        <div class="container">
            <div class="default-list">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-12 block-header">
                        <h1>Điện thoại nổi bật nhất</h1>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6 col-12">
                        <div class="item-wrapper">
                            <div class="item-img">
                                <a href="#"><img src="img/items/apple-iphone-13-pro-max.jpg" class="img-responsive img-i" alt="iphone13 pro max"></a>
                                
                            </div>
                            <div class="item-price">
                                <h3>Iphone 13 pro max 128gb</h3>
                                <p>34.190.000đ</p>
                            </div>
                            <div class="my-btn">
                                <button id="btn-1">Thêm vào giỏ</button>
                                <button id="btn-2">Mua ngay</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
        <!-- Footer -->
        <jsp:include page="footer.jsp"/>
        <jsp:include page="common/script.jsp"/>
    </body>
    
</html>
