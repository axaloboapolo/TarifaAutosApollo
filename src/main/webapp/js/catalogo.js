var app = angular.module('catalogos', []);

	app.controller('catalogo', function($scope,$http){
		$http.get('http://localhost:8090/indicecat').
		 then(function(response){
			 $scope.getCatalogo = response.data;
		 });
	});
	
	app.controller('catalogo',function($scope,$http){
		$http.get('http://localhost:8090/indicecat')
		
	})