<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.6.2/js/ngDialog.min.js"></script>
	<link href="https://cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.6.2/css/ngDialog.css" type="text/css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.6.2/css/ngDialog-theme-default.css" type="text/css" rel="stylesheet">
	<script src="js/cotizador.js"></script>
	<script src="js/coberturas.js"></script>
</head>
<body data-ng-app="cotizar">
	<form id="Cotizador">
		<div data-ng-controller="catcirc">
			<label>Categoria de circulacion</label>
			<select data-ng-model="selectedCat" data-ng-options="y.descripcion for (x, y) in getCat">
			</select>
		</div>
		<br>
		<div data-ng-controller="subtipo">
			<label>Subtipo Vehiculo</label>
			<select data-ng-model="selectedsub" data-ng-options="y.descripcion for (x, y) in getSub">
			</select>
		</div>
		<br>
		<div data-ng-controller="valor">
			<label>Tipo Valor</label>
			<select data-ng-model="selectedvalor" data-ng-options="y.descripcion for (x, y) in getValor">
			</select>
		</div>
	    <br>
		<div data-ng-grid="gridOptions">
			<button data-ng-click="showModal()">Marcas</button>
			
		</div>
			
		<div data-ng-controller="DeducibleDM">
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
					<tr>
						<td>DM</td>
            			<td><input type="checkbox"></td>
            			<td>
                			<select data-ng-model="selectedDM" data-ng-options="x.deducible for x in getDed">
                			</select>
            			</td>
            		</tr>
            	</table>
		</div>
	</form>
			
			
</body>
</html>
