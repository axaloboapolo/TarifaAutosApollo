/**
 * 
 */
var app = angular.module('catTarifa', []);
	
	app.controller('tarifacat', function($scope, $http){
		$http.get('http://localhost:8090/indextarifa?modulo=M1').
			then(function(response) {
				$scope.getCatalogoM1 = response.data;
			});
	});	
	
	app.controller('tarifacat', function($scope, $http){
		$http.get('http://localhost:8090/indextarifa?modulo=M2').
			then(function(response) {
				$scope.getCatalogoM2 = response.data;
			});
	});	
	app.controller('tarifacat', function($scope, $http){
		$http.get('http://localhost:8090/indextarifa?modulo=M3').
			then(function(response) {
				$scope.getCatalogoM3 = response.data;
			});
	});	
	app.controller('tarifacat', function($scope, $http){
		$http.get('http://localhost:8090/indextarifa?modulo=M4').
			then(function(response) {
				$scope.getCatalogoM4 = response.data;
			});
	});	
	
	
