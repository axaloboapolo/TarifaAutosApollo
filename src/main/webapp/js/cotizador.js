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
	
	app.controller('deddm', function($scope, $http){
		$http.get('http://localhost:8090/deducible?cobertura=DM').
			then(function(response) {
				$scope.getDed = response.data;
			});
	});
	
	app.controller('dedrt', function($scope, $http){
		$http.get('http://localhost:8090/deducible?cobertura=RT').
			then(function(response){
				$scope.getRt = response.data;
			});
	});
	
	app.controller('sarc', function($scope,$http){
		$http.get('http://localhost:8090/suma?cobertura=RC').
			then(function(response){
				$scope.getRc= response.data;
			});
	});
	
	app.controller('sarcp', function($scope,$http){
		$http.get('http://localhost:8090/suma?cobertura=RCP').
			then(function(response){
				$scope.getRcp = response.data;
			});
	});
	
	app.controller('sagmo', function($scope,$http){
		$http.get('http://localhost:8090/suma?cobertura=GMO').
			then(function(response){
				$scope.getsagmo = response.data;
			});
	});
	
	app.controller('saacc', function($scope,$http){
		$http.get('http://localhost:8090/suma?cobertura=ACC').
			then(function(response){
				$scope.getsaacc = response.data;
			});
	});
	
	app.controller('sarcv', function($scope,$http){
		$http.get('http://localhost:8090/suma?cobertura=RCV').
			then(function(response){
				$scope.getrcv = response.data;
			});
	});
	
	app.controller('uso', function($scope,$http){
				$http.get('http://localhost:8090/uso').
					then(function(response){
						$scope.getUso = response.data;
					});
			});
	
	it('should check ngShow', function() {
		  var checkbox = element(by.model('checked'));
		  var checkElem = element(by.css('.check-element'));

		  expect(checkElem.isDisplayed()).toBe(false);
		  checkbox.click();
		  expect(checkElem.isDisplayed()).toBe(true);
		});
	
		
		
	})