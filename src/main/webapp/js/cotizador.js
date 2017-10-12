var app = angular.module('cotizar', []);
	app.controller('catcirc', function($scope, $http){
		$http.get('http://localhost:8090/categoria').
			then(function(response) {
				$scope.getCat = response.data;
			});
	});	

	app.controller('subtipo', function($scope, $http){
		$http.get('http://localhost:8090/subtipo').
			then(function(response) {
				$scope.getSub = response.data;
			});
	});
	
	app.controller('marca', function($scope, $http){
		$http.get('http://localhost:8090/marca').
			then(function(response) {
				$scope.getMarca = response.data;
			});
	});
	
	app.controller('valor', function($scope, $http){
		$http.get('http://localhost:8090/tipovalor').
			then(function(response) {
				$scope.getValor = response.data;
			});
	});
	
	
	var coberturasCtrl = function($scope){
		$scope.cobertura = app.controller('coberturas', function($scope, $http){
			$http.get('http://localhost:8090/cobertura').
				then(function(response) {
					$scope.getCob = response.data;
				});
			});
	
	var deducibleCtrl = function ($scope){
		$scope.deducible = app.controller('deducible',function($scope,$http){
			$http.get('http://localhost:8090/deducible').
				then(function(response){
					$scope.getDed=response.data;
				});
		
		});
	var sumaCtrl = function ($scope){
		$scope.deducible = app.controller('suma',function($scope,$htp){
			http.get('http://localhost:8090/suma').
				then(function(response){
					$scope.getSuma=response.data;
				});
			});
		}
	}
		
	};
	
		
		
		
	