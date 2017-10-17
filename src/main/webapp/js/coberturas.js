/**
 * 
 */
var app =angular.module('cobert',[]);
	
	app.controller('DeducibleDM', function($scope, $http){
		$http.get('http://localhost:8090/deducible?cobertura=DM').
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleRT', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RT).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleRC', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RC).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleGM', function($scope, $http){
		$http.get('http://localhost:8090/deducible',GM).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleCR', function($scope, $http){
		$http.get('http://localhost:8090/deducible',CR).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleDL', function($scope, $http){
		$http.get('http://localhost:8090/deducible',DL).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleSERVAS', function($scope, $http){
		$http.get('http://localhost:8090/deducible',SERVAS).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleACC', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ACC).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleERC', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ERC).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleARC', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ARC).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleEEDM', function($scope, $http){
		$http.get('http://localhost:8090/deducible',EEDM).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleEERT', function($scope, $http){
		$http.get('http://localhost:8090/deducible',EERT).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleADCDM', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ADCDM).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleADCRT', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ADCRT).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleED', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ED).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleRCV', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RCV).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeduciblePTC', function($scope, $http){
		$http.get('http://localhost:8090/deducible',PTC).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleRCP', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RCP).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	
	app.controller('DeducibleASRT', function($scope, $http){
		$http.get('http://localhost:8090/deducible',ASRT).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleSCA', function($scope, $http){
		$http.get('http://localhost:8090/deducible',SCA).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleRPI', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RPI).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	app.controller('DeducibleGTR', function($scope, $http){
		$http.get('http://localhost:8090/deducible',RPI).
			then(function(response) {
				$scope.getDed = response.data;
		});
});
	
	
	/*app.controller('SADM', function($scope, $http){
	$http.get('http://localhost:8090/suma',DM).
		then(function(response) {
			$scope.getSuma = response.data;
		});
	});
	
	*/