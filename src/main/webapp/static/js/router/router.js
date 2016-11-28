/**
 * Created by Christopher on 27/11/2016.
 */

app.config(function ($routeProvider) {
    $routeProvider

        .when('/', {
            templateUrl : 'pages/inicio.html',
            controller : 'inicioController'
        })

        .when("/catastro", {
            templateUrl : 'pages/catastro.html',
            controller : 'catastroController'
        })

        .when("/otro", {
            templateUrl: 'pages/otro.html',
            controller: 'otroController'
        })

        .when("/departamento", {
            templateUrl : 'pages/dpto/index.html',
            controller: 'departamento'
        })

        .when("/404",{templateUrl: 'pages/404.html'})

        .otherwise({redirectTo: '/404'})
});