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
	<link href="css/cotizador.css" rel="stylesheet" type="text/css"/>
	<script src="js/coberturas.js"></script>
</head>
<body data-ng-app="cotizar">
	<form id="Cotizador" action="/tarifa" method="post">
	<table>
	<tr>
	<td>
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
		
		
		</td>
		<td>
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
		<div data-ng-controller="uso">
			<label>Uso</label>
				<select data-ng-model="uso" data-ng-options="x.uso for x in getUso"></select>
		</div>
	    <div>
			<label>Derechos de poliza</label>
				<input type="number" min="0" max="" name="derechos">	
		</div>
		<div>
			<label>Descuento</label>
				<input type="number" min="0" max="" name="descuento">
		</div>
		<div>
			<label>Comision</label>
				<input type="number" min="0" max="" name="comision">
		</div>
		<div>
			<label>Cesion de Comision</label>
				<input type="number" min="0" max="" name="cesion">
		</div>
		
		<input type="submit" value="Cotizar">	
			</td>
		<tr>		
	</table>
	<div>
		Marcas<input type="checkbox" data-ng-model="checked" aria-label="Toggle ngShow"><br />
		<div class="check-element animate-show-hide" data-ng-show="checked">
		<input type="checkbox" data-ng-model="all">Seleccionar Todos
			<table id="table-1" data-ng-controller="marca">
				<thead>
					<tr>
						<th>Marca</th>
						<th>Codigo</th>
						<th>Aplicar</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-model="marcas" data-ng-repeat="marca in getMarca">
						<td>{{marca.descripcion}}</td>
						<td>{{marca.codigo}}</td>
						<td><input type="checkbox" name="aplica" data-ng-checked="all"></td>
					</tr>
				</tbody>
			</table>
		</div>
		</div>
	</form>
			
			
</body>
</html>