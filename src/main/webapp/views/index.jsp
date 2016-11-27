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
    <header>
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/"></a>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#/"> <i class="fa fa-home"></i> Inicio </a></li>
                    <li><a href="#catastro"> <i class="fa fa-shield"></i> Catastros </a></li>
                    <li><a href="#otro"> <i class="fa fa-bank"></i> Otro </a></li>
                </ul>
            </div>
        </nav>
    </header>

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
</body>
</html>
