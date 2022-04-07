
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sidebar" data-color="blue" data-background-color="black" data-image="/DoAnTotNghiepAdmin/views/assets/img/sidebar-3.jpg">
    <!--
      Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

      Tip 2: you can also add an image using data-image tag
    -->
    <div class="logo">
        <a class="simple-text logo-normal">
           SHOP LAPTOP
        </a>
    </div>
    <div class="sidebar-wrapper">
        <ul class="nav">
            <c:if test="${sessionScope.acc.idRole == 'entities.Roles[ idRole=1 ]'}">
                <li class="nav-item ">
                    <a class="nav-link" href="Dangky.htm">
                        <i class="material-icons">face</i>
                        <p>ADMIN</p>
                    </a>
                </li>
            </c:if>
           <c:if test="${sessionScope.acc.idRole == 'entities.Roles[ idRole=2 ]'}">
                 <li class="nav-item ">
                <a class="nav-link" href="Nhanvien.htm">
                    <i class="material-icons">face</i>
                    <p>Nhân viên</p>
                </a>
            </li>
            </c:if>
            <li class="nav-item ">
                <a class="nav-link" href="Home.htm">
                    <i class="material-icons">list</i>
                    <p>Danh mục sản phẩm</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="SanPham.htm">
                    <i class="material-icons">shopping_basket</i>
                    <p>Sản phẩm</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="NhaCungCap.htm">
                    <i class="material-icons">store</i>
                    <p>Nhà cung cấp</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="KhachHang.htm">
                    <i class="material-icons">supervised_user_circle</i>
                    <p>Khách hàng</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="ChiTietHoaDon.htm">
                    <i class="material-icons">wysiwyg</i>
                    <p>Hóa đơn</p>
                </a>
            </li> 
            <li class="nav-item ">
                <a class="nav-link" href="HoaDon.htm">
                    <i class="material-icons">assignment</i>
                    <p>Đơn hàng chi tiết</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="ThanhToan.htm">
                    <i class="material-icons">payment</i>
                    <p>Phương thức thanh toán</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="VanChuyen.htm">
                    <i class="material-icons">electric_rickshaw</i>
                   <p>Phương thức vận chuyển</p>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="TinTuc.htm">
                    <i class="material-icons">language</i>
                    <p>Tin tức & quảng cáo</p>
                </a>
            </li>
            
        </ul>
    </div>
</div>
