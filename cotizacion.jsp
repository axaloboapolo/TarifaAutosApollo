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
		
	<div data-ng-app="cotizar" data-ng-controller="subtipo">
			<label>Subtipo Vehiculo</label>
			<select data-ng-model="selectedsubt" data-ng-options="y.descripcion for (x, y) in getSub">
			</select>
				</div>
			<div data-ng-app="cotizar" data-ng-controller="marca">
			<label>Marca</label>
			<select data-ng-model="selectedmarca" data-ng-options="y.descripcion for (x, y) in getMarca">
			</select>
		</div>
		<div data-ng-app="cotizar" data-ng-controller="valor">
			<label>Tipo Valor</label>
			<select data-ng-model="selectedvalor" data-ng-options="y.descripcion for (x, y) in getValor">
			</select>
		</div>
			</form>
			
			<form id="Coberturas">
			<div data-ng-app="cotizar" data-ng-controller="coberturas">
			<table>
			<tr>
			<th>Cobertura</th>
			<th>Aplica</th>
			<th>Deducible</th>
			<th>Suma Asegurada</th>
			</tr>
			<tr data-ng-controller="coberturas">
			<td data-ng-repeat="x in getCobertura">{{y.descripcion for (x,y) in getCobertura}}</td>
			<td><input type="checkbox">
			<td data-ng-repeat="x in getDeducible">{{y.deducible for (x,y) in getDeducible}}</td>
			<td data-ng-repeat="x in getSA">{{y.suma for (x,y) in getSa}}</td>
			</tr>
			</table>
			
			</div>
			
			
			</form>
</body>
</html>
