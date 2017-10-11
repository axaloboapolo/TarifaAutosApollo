var app = angular.module('cotizar', [])
	.controller('catcirc', function($scope, $http){
		$http.get('http://localhost:8090/categoria').
			then(function(response) {
				$scope.getCat = response.data;
			});
	});

var app = angular.module('cotizar', [])
.controller('subtipo', function($scope, $http){
	$http.get('http://localhost:8090/subtipo').
		then(function(response) {
			$scope.getSub = response.data;
		});
});
var app = angular.module('cotizar', [])
.controller('marca', function($scope, $http){
	$http.get('http://localhost:8090/marca').
		then(function(response) {
			$scope.getMarca = response.data;
		});
});

var app = angular.module('cotizar', [])
.controller('valor', function($scope, $http){
	$http.get('http://localhost:8090/tipovalor').
		then(function(response) {
			$scope.getValor = response.data;
		});
});

var app = angular.module ('cotizar',[])
.controller('coberturas',function($scope,$http){
	$http.get('http://localhost:8090/cobertura').
	then(function(response){
		$scope.getCobertura = response.data;
		
	});
	
	(function($scope,$http){
		$http.get('http://localhost:8090/deducible').
		then(function(response){
			$scope.getDeducible = response.data;
			
		});
		
	}
	(function ($scope,$http){
		$http.get('http://localhost:8090/suma').
		then(function(response){
			$scope.getSa=respose.data;
		})
		
	}));
	
});
/*function() {

	angular.module('cotizar').controller('coberturas', coberturas);
	coberturasctrl.$inject = [ '$scope','cobertura','deducible','suma'];

	function coberturasctrl($scope, coberturas) {
		var vm = this;

		function deducible($scope, deducible){
				deducible.$inject=[$scope,deducible];
				function sumaasegurada($scope, sumaasegurada){
				sumaasegurada.$inject

			}
		}		

	}


})();*/
