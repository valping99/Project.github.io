<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="navigation">
    <!-- container -->
    <div class="container">
        <div id="responsive-nav">
            <!-- category nav -->
            <div class="category-nav show-on-click">
                <span class="category-header">Danh Mục Sản Phẩm <i class="fa fa-list"></i></span>
                <ul class="category-list">
                    <c:forEach var="item" items="${nhomsanpham}">
                        <li class="dropdown side-dropdown">
                            <a onclick="location.href = 'searchbynhomsp.htm?maNhomSp=${item.maNhomSp}'" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">${item.tenNhomSp}<i class="fa fa-angle-right"></i></a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <!-- /category nav -->

            <!-- menu nav -->
            <div class="menu-nav">
                <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                <ul class="menu-list">
                    <li><a href="redirect.jsp">Trang chủ</a></li>
                    <li><a href="checkout.htm">Giỏ hàng</a></li>
                </ul>
            </div>  
            <!-- menu nav -->
        </div>
    </div>
    <!-- /container -->
</div>
