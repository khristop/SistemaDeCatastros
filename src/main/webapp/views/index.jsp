<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: khris
  Date: 11-22-16
  Time: 02:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="catastroApp">
<head>
    <!-- estilos-->
    <link rel="stylesheet" href="<c:url value='/static/bower_components/bootstrap/dist/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value="/static/bower_components/font-awesome/css/font-awesome.css" />" />
    <!-- propios -->
    <link rel="stylesheet" href="<c:url value='/static/css/style.css' />" />

    <title>Sistema de Catastros</title>
</head>
<body ng-controller="inicioController">

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#/">
                    <span>Castastros</span>Admininstracion
                </a>
                <ul class="user-menu">
                    <li class="dropdown pull-right">
                        <a  class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Usuario <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#/"> <span class="fa fa-address-card"></span>  -  Perfil </a></li>
                            <li><a href="#/"> <span class="fa fa-list-ul"></span>  -  Configuraciones</a></li>
                            <li><a href="#/"> <span class="fa fa-lock"></span>  -  Salir</a></li>
                        </ul>
                    </li>
                </ul>
            </div>

        </div><!-- /.container-fluid -->
    </nav>

    <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
        <img style="height: auto; width: 100%; padding: 5px;" src="<c:url value="/static/img/logo.png" /> " alt="">
        <hr>
        <ul class="nav menu">
            <li class="active"><a href="#/"><span class="fa fa-home"></span> Home</a></li>
            <li><a href="#catastro"><span class="fa fa-book"></span> Gestion de cuentas</a></li>
            <li><a href="#otro"> <span class="fa fa-shield"></span> Gestion de inmuebles</a></li>
            <li><a href="#otro"> <span class="fa fa-apple"></span> Gestion de departamentos</a></li>
            <li><a href="#otro"> <span class="fa fa-arrow-up"></span> Gestion de Empresas</a></li>
            <li><a href="#otro"> <span class="fa fa-bank"></span> Gestion de alcaldia</a></li>
            <li role="presentation" class="divider"></li>
            <li><a href="#login"> <span class="fa fa-lock"></span> Cerrar sesion</a></li>
        </ul>

    </div><!--/.sidebar-->

    <div id="main" >

        <div ng-view></div>

    </div>

    <!-- Scripts -->
    <!-- vendor -->

    <script src="<c:url value='/static/bower_components/jquery/dist/jquery.js' />" ></script>
    <script src="<c:url value='/static/bower_components/bootstrap/dist/js/bootstrap.js' />" ></script>
    <script src="<c:url value='/static/bower_components/angular/angular.js' />"></script>
    <script src="<c:url value='/static/bower_components/angular-route/angular-route.js' />" ></script>
    <!-- app de angular -->
    <!-- definicion de angular -->
    <script src="<c:url value='/static/js/main.js' />" ></script>
    <!-- rutas -->
    <script src="<c:url value='/static/js/router/router.js' />" ></script>
    <!-- controladores -->
    <script src="<c:url value='/static/js/controllers/ctrls.js' />" ></script>

    <script>
        !function ($) {
            $(document).on("click","ul.nav li.parent > a > span.icon", function(){
                $(this).find('em:first').toggleClass("glyphicon-minus");
            });
            $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
        }(window.jQuery);

        $(window).on('resize', function () {
            if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
        })
        $(window).on('resize', function () {
            if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
        })

        $('.menu li').click(function (e) {
            var $this = $(this);
            $('.menu li.active').removeClass('active');
            if (!$this.hasClass('active')){
                $this.addClass('active');
            }
        })
    </script>
</body>
</html>
