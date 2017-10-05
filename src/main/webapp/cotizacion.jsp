<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
	<script src="js/cotizador.js"></script>
</head>
<body>
	<form id="Cotizador">
		<div data-ng-app="cotizar" data-ng-controller="catcirc">
			<label>Categoria de circulacion</label>
			<select data-ng-model="selectedCat" data-ng-options="y.descripcion for (x, y) in getCat">
			</select>
		</div>
	</form>
</body>
</html>
