/**
 * 
 */
	var app = angular.module('myApp',["ngResource"]);
	app.controller('coberturasCtrl',['$scope','$http',
		function($scope,$http){
	$scope.getCoberturas= function(){
		$http.get('/cobertura').success(function(data){
			$scope.coberturas =data;
			
		});
	
	}
	}]);
	
	var app = angular.module('myApp',["ngResource"]);
	app.controller('subtipoCtrl',['$scope','$http',
		function($scope,$http){
		$scope.getSubtipo = function(){
			$http.get('/obtenSubtipo').sucess(function(data){
				$scope.subtipo=data;
				
			});
			
		}
		
	}]);
	
	
var app = angular.module('myApp',["ngResource"]);
 app.controller('circulacionCtrl',['$scope','$http',
	 function($scope,$http){
	 $scope.getCategoria= function(){
		 $http.get('/').success(function(data){
			 $scope.categoria=data;
			 
		 })
		 
	 }
	 
	 
 }]);
	
 var app = angular.module('myApp',["ngResource"]);
 app.controller('valorbVhCtrl',['$scope','$http',
	 function($scope,$http){
	 $scope.getValor= function(){
		 $http.get('/').success(function(data){
			 $scope.valor=data;
			 
		 })
		 
	 }
	 
	 
 }]);
