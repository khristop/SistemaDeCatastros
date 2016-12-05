/**
 * Created by Christopher on 27/11/2016.
 */
var app = angular.module('catastroApp', ['ngRoute', 'ngResource']);

app.factory("Departamento", ['$resource', function ($resource) {
    return $resource('http://localhost:8080/rest/departamento/:deptid', {deptid: '@did'},
        {
            updateDepartamento : {method: 'PUT'}
        });
}]);