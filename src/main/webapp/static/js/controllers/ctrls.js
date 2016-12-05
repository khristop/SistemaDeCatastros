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

app.controller('departamentoController', function ($scope, $http, Departamento) {

    $scope.departamentos = [];
    $scope.departamento = new Departamento();

    $scope.fetchDepartamentos = function () {
        $scope.departamentos = Departamento.query();
    };

    $scope.fetchDepartamentos();

    $scope.guardarDepartamento = function () {
        // $http({
        //     method: 'POST',
        //     url: '/api/departamento/crear',
        //     params:{
        //         nombre: $scope.depnombre
        //     }
        // }).success(function (data) {
        //     if(data.status =="ok"){
        //         alert("ok");
        //         limpiar();
        //     }else{
        //         alert("Si trajo pero no ok");
        //     }
        // }).error(function () {
        //     alert("No se conecto al server");
        // })
        if($scope.dptform.$valid){
            console.log($scope.departamento);
            $scope.departamento.$save(function (departamento) {
                console.log(departamento);
                $scope.flag = 'creado';
                $scope.fetchDepartamentos();
                console.log("exito");
            }),
                function (err) {
                    $scope.flag="fracaso";
                    console.log("fracaso");
                }
        }
    };

    $scope.obtenerDepartamentos = function () {
        $scope.departamentos = Departamento.query();
        console.log(departamentos);
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