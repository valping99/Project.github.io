<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>T-SHOP LAPTOP</title>
        <link rel="icon" type="image/png" href="/DoAn/views/img/T.png">
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/DoAn/views/css/bootstrap.min.css" />
        <link type="text/css" rel="stylesheet" href="/DoAn/views/css/slick.css" />
        <link type="text/css" rel="stylesheet" href="/DoAn/views/css/slick-theme.css" />
        <link type="text/css" rel="stylesheet" href="/DoAn/views/css/nouislider.min.css" />
        <link rel="stylesheet" href="/DoAn/views/css/font-awesome.min.css">
        <link type="text/css" rel="stylesheet" href="/DoAn/views/css/style.css" />
    </head>
    <body>
        <header>
            <jsp:include page="header.jsp" flush="true"></jsp:include>
            </header>
            <jsp:include page="menu.jsp" flush="true"></jsp:include>
                <!-- menu nav -->
            </div>
        </div>
        <!-- /container -->
    </div>
    <!-- /NAVIGATION -->
    <!-- section -->
    <div class="section">
        <!-- container -->
        <div class="container">
            <!-- row -->
            <div class="row">
                <!--  Product Details -->
                <div class="product product-details clearfix">
                    <div class="col-md-12">

                        <div class="product-body">
                            <f:form  onsubmit="return validateForm()"  id="register-form" action="luukhachhang.htm" method="post" commandName="khachHang">
                                <table>
                                    <tr>
                                        <td><h1 class="product-name"></h1></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h1 class="product-name"><f:hidden path="maKh"/></h1></td>

                                    </tr>
                                    <tr>
                                        <td><h1 class="product-name"> Sửa thông tin tài khoản:</h1></td>

                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Tên Tài Khoản:</h5></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                         <td ><h5 class="product-price"><f:input path="tenTk" readonly="true"/></h5></td>

                                    </tr>
                                    <tr>
                                        <td><h5 class="product-name" style="margin-top: 0px;"> Tên Khách Hàng:</h5></td>
                                        <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h5 class="product-name" style="margin-top: 0px;"><f:input path="tenKh"/></h5></td>

                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Mật khẩu:</h5></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h5 class="product-price"><f:input path="matKhau" type="password" id="Password"/></h5></td>
                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Xác nhận mật khẩu:</h5></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h5 class="product-price"><input path="matKhau" type="password" id="ConfirmPassword"/></h5></td>
                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Địa chỉ:</h5></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h5 class="product-price"><f:input path="diaChi"/></h5></td>

                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Số Điện Thoại:</h5></td>
                                         <td><h1 class="product-name">&nbsp; </h1></td>
                                        <td><h5 class="product-price"><f:input path="soDienThoai" id="phone"/></h5></td>

                                    </tr>
                                    <tr>
                                        <td><h5 class="product-price">Email:</h5></td>
                                        <td><h1 class="product-name">&nbsp;</h1></td>
                                        <td><h5 class="product-price"><f:input type="email" id="myEmail" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" path="email"/></h5></td>
                                    </tr>
                                </table>
                                <f:button onclick="return confirm('Bạn có muốn thay đổi thông tin ?')">Lưu</f:button>
                            </f:form>

                        </div>

                    </div>
                </div>
                <!-- /Product Details -->
            </div>
            <!-- /row -->
        </div>
        <!-- /container -->
    </div>

    <jsp:include page="footer.jsp" flush="true"></jsp:include>
    <script src="/DoAn/views/js/jquery.min.js"></script>
    <script src="/DoAn/views/js/bootstrap.min.js"></script>
    <script src="/DoAn/views/js/slick.min.js"></script>
    <script src="/DoAn/views/js/nouislider.min.js"></script>
    <script src="/DoAn/views/js/jquery.zoom.min.js"></script>
    <script src="/DoAn/views/js/main.js"></script>
    <script>
    function validateForm() {
        //collect form data in JavaScript variables  
        var pw1 = document.getElementById("Password").value;
        var pw2 = document.getElementById("ConfirmPassword").value;
        var ph = document.getElementById("phone").value;
        
        if (isNaN(ph)) {
            alert("Vui lòng nhập đúng định dạng số điện thoại");
            return false;
        }

        //minimum password length validation  
        if (pw1.length < 8) {
            alert("Không được nhập password dưới 8 ký tự");
            return false;
        }

        //maximum length of password validation  
        if (pw1.length > 15) {
            
            alert("Không được nhập password dưới 15 ký tự");
            return false;
        }

        if (pw1 != pw2) {
            alert("Mật khẩu xác nhận không chính xác");
            return false;
        }
    }
</script>  

</body>

</html>