/**
 * 
 	var app = angular.module('myApp',["ngResource"]);
	app.controller('coberturasCtrl',['$scope','$http',
		function($scope,$http){
	$scope.getCoberturas= function(){
		$http.get('/cobertura').success(function(data){
			$scope.coberturas =data;
			
		});
	var app = angular.module('myApp',["ngResource"]);
	app.controller('coberturaslCtrl',['$scope','$http',
		function($scope,$htpp){
		$scope.get
		
	}])
	
	}
	}]);
	
	var app = angular.module('myApp',["ngResource"]);
	app.controller('subtipoCtrl',['$scope','$http',
		function($scope,$http){
		$scope.getSubtipo = function(){
			$http.get('/subtipo').sucess(function(data){
				$scope.subtipo=data;
				
			});
			
		}
		
	}]);
	
	
var app = angular.module('myApp',["ngResource"]);
 app.controller('circulacionCtrl',['$scope','$http',
	 function($scope,$http){
	 $scope.getCategoria= function(){
		 $http.get('/categoria').success(function(data){
			 $scope.categoria=data;
			 
		 })
		 
	 }
	 
	 
 }]);
	
 var app = angular.module('myApp',["ngResource"]);
 app.controller('valorbVhCtrl',['$scope','$http',
	 function($scope,$http){
	 $scope.getValor= function(){
		 $http.get('/tipovalor').success(function(data){
			 $scope.valor=data;
			 
		 })
		 
	 }
	 
	 
 }]);
*/

angular.module('demo', [])
.controller('circulacionCtrl', function($scope, $http) {
    $http.get('http://localhost:8090/categoria').
        then(function(response) {
            $scope.catCirc = response.data;
        });
});