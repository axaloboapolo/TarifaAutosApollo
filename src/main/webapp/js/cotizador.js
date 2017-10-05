var app = angular.module('cotizar', [])
	.controller('catcirc', function($scope, $http){
		$http.get('http://localhost:8090/categoria').
			then(function(response) {
				$scope.getCat = response.data;
			});
	});