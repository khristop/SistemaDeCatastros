/**
 * Created by Christopher on 27/11/2016.
 */

app.controller('inicioController', function ($scope) {
    $scope.message ='Inicio!!!';
});

app.controller('catastroController', function ($scope) {
    $scope.message ='Pagina de catastros!!!';
});

app.controller('otroController', function ($scope) {
    $scope.message ='Otra pagina!!!';
});

app.controller('departamento', function ($scope, $http) {

    $scope.departamentos = {};

    $scope.guardarDepartamento = function () {
        $http({
            method: 'POST',
            url: '/api/departamento/crear',
            params:{
                nombre: $scope.depnombre
            }
        }).success(function (data) {
            if(data.status =="ok"){
                alert("ok");
                limpiar();
            }else{
                alert("Si trajo pero no ok");
            }
        }).error(function () {
            alert("No se conecto al server");
        })
    };

    $scope.obtenerDepartamentos = function () {
        $http({
            method: 'GET',
            url: '/api/departamento'
        }).success(function (data) {
            $scope.departamentos = data;
        }).error(function () {
            console.log("no se pudieron obtener");
        })
    };

    $scope.eliminarDepartamento = function (id) {
        $http({
            method: 'DELETE',
            url: '/api/departamento/'+id
        }).success(function (data) {
            if(data.status =="ok"){
                alert("ok");
                limpiar();
            }else{
                alert("Si trajo pero no ok");
            }
        }).error(function () {
            alert("No se conecto al server");
        })
    };

    $scope.limpiar = function () {
        $scope.nombre = "";
    }
});