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
<body data-ng-app="cotizar">
	<form id="Cotizador">
		<div data-ng-controller="catcirc">
			<label>Categoria de circulacion</label>
			<select data-ng-model="selectedCat" data-ng-options="y.descripcion for (x, y) in getCat">
			</select>
		</div>
		<div data-ng-controller="subtipo">
			<label>Subtipo Vehiculo</label>
			<select data-ng-model="selectedsub" data-ng-options="y.descripcion for (x, y) in getSub">
			</select>
		</div>
		<div data-ng-controller="valor">
			<label>Tipo Valor</label>
			<select data-ng-model="selectedvalor" data-ng-options="y.descripcion for (x, y) in getValor">
			</select>
		</div>
		<button>Marcas</button>
		<div data-ng-controller="marca">
			<label>Marca</label>
			<select data-ng-model="selectedmarca" data-ng-options="y.descripcion for (x, y) in getMarca">
			</select>
		</div>
		
		<div data-ng-controller="coberturas">
			<table id="table-1">
				<thead>
					<tr>
						<th>Cobertura</th>
						<th>Aplica</th>
						<th>Deducible</th>
						<th>SA</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-repeat="cobertura in getCob">
						<td>{{cobertura.descripcion}}</td>
						<td><input type="checkbox"></td>
						<td>
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td>
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<th>A</th>
						<th>B</th>
						<th>C</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</form>
			
			
</body>
</html>
