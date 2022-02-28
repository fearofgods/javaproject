<%-- 
    Document   : admin-home
    Created on : Feb 12, 2022, 9:29:24 AM
    Author     : hongd
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <!-- My styles -->
    <link rel="stylesheet" href="styles/admin.css">
</head>

<body>
    <jsp:include page="head-sidenav.jsp" />
    
    <div id="main">
        <div class="container-fluid">
        
            <div class="row">
                <div class="col-md-4">
                    <div class="my-modal">
                        <div class="inside-modal">
                            <p class="modal-title">Tổng doanh thu</p>
                            <p class="modal-info">100.000.000đ</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="my-modal">
                        <div class="inside-modal">
                            <p class="modal-title">Tổng doanh thu</p>
                            <p class="modal-info">100.000.000đ</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="my-modal">
                        <div class="inside-modal">
                            <p class="modal-title">Tổng doanh thu</p>
                            <p class="modal-info">100.000.000đ</p>
                        </div>
                    </div>
                </div>
            </div>
            
            <h1>Đơn đặt hàng mới</h1>
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                  </tr>
                </tbody>
              </table>

            <h1>Đơn hàng đã xử lí</h1>
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                  </tr>
                </tbody>
              </table>
        </div>
    </div>


    


    <jsp:include page="common/script.jsp"/>
    <!-- My script -->
    <script src="js/admin.js"></script>
</body>

</html>
