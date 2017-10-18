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
	<link href="css/cotizador.css" rel="stylesheet" type="text/css"/>
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
		<div data-ng-controller="deddm">
			<label>Deducible DM</label>
				<select data-ng-model="deducibledm" data-ng-options="x.deducible for x in getDed">
				</select>
		</div>
		<div data-ng-controller="dedrt">	
			<label>Deducible RT</label>
				<select data-ng-model="deduciblert" data-ng-options="x.deducible for x in getRt">
				</select>
		</div>
		<div data-ng-controller="sarc">
			<label>Responsabilidad Civil</label>
				 <select data-ng-model="saresc" data-ng-options="x.sa for x in getRc"></select>
		</div>	
		<div data-ng-controller="sarcp">
			<label>RC personas en Exceso</label>
				<select data-ng-model="sarcp" data-ng-options="x.sa for x in getRcp"></select>
		</div>
		<div data-ng-controller="sagmo">
			<label>Gastos Medicos por Ocupante</label>
				<select data-ng-model="sagmo" data-ng-options="x.sa for x in getsagmo"></select>
		</div>
		<div data-ng-controller="saacc">
			<label>Accidentes al conductor</label>
				<select data-ng-model="saacc" data-ng-options="x.sa for x in getsaacc"></select>
		</div>
		<div data-ng-controller="sarcv">
			<label>RC Viajero</label>
				<select data-ng-model="rcv" data-ng-options="x.sa for x in getrcv"></select>
		</div>
		<div>
			<label>Extencion RC</label><input type="checkbox">
		</div>
		<div>
			<label>Gastos Medicos por Evento</label><input type="checkbox">
		</div>
		<div>
			<label>Defensa Legal</label><input type="checkbox">
		</div>
		<div>
			<label>Servicios de Asistencia</label><input type="checkbox">
		</div>
		<div>
			<label>Sigue con Auto</label><input type="checkbox">
		</div>
		Show: <input type="checkbox" data-ng-model="checked" aria-label="Toggle ngShow"><br />
		<div class="check-element animate-show-hide" data-ng-show="checked">
			<table id="table-1">
				<thead>
					<tr>
						<th>Marca</th>
						<th>Codigo</th>
						<th>Aplicar</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>CHEVROLET</td>
						<td>CH</td>
						<td><input type="checkbox" name="aplica"></td>
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