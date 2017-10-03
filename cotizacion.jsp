<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
 <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
  <script src="src/main/webapp/js/cotizador.js"></script>
</head>
<body   data-ng-app="myApp" >
 <br>
	<form action="">
		<div data-ng-controller="circulacionCtrl" data-ng-repeat="categoria in catCirculacion">
		<input type="radio">{{categoria.catCirculacion}}
		<!-- 	<input type="radio" name="CatCirculacion" value="Resdiente">Residente <br>
			<input type="radio" name="CatCirculacion" value="Fronterizo">Fronterizo<br>
			<input type="radio" name="CatCirculacion" value="Turista">Turista<br>
		---></div>
		<br>
		<div>
			<select  data-ng-controller=subtipoCtrl>
				<option data-ng-repeat="subtipo in subtipoveh">{{subtipo.subtipoveh}}</option>
			</select>
		</div>
		<div>
			<h2>Variables</h2>
		</div>
		<table>
		<tr>
		<td>
		<div  data-ng-controller="coberturasCtrl" >
			<table style="text-align:center;"  data-ng-controller="coberturasCtrl" >
			<tr>
			<th>Cobertura</th>
			<th>Aplica Cobertura</th>
			<th>Deducible</th>
			<th>Suma asegurada</th>
			</tr>
			<tr data-ng-repeat="cob in coberturas">
			<td>{{cob.cobertura}}</td>
			<td><input type="checkbox"></td>
			<td>{{cob.deducible}}</td>
			<td>{{cob.sumaasegurada}}</td>
			</tr>
			</table>
			</div>
			</td>
	<!-- ---<div>
			<table>
				<tr>
					<th>Cobertura</th>
					<th>Aplica Cobertura</th>
					<th>Deducible</th>
					<th>Suma Asegurada</th>
				</tr>
				<tr>
					<td>Daños Materiales</td>
					<td><input type="checkbox" name="DM" value="Aplica"></td>
					<td><select>
							<option value="5">0</option>
							<option value="5">5</option>
							<option value="5">10</option>
						</select>
					</td>
					<td>
						-
					</td>
				</tr>
				<tr>
					<td>
						Robo Total
					</td>
					<td><input type="checkbox" name="RT" value="Aplica">
					</td>
					<td>
						<select>
							<option value="5">0</option>
							<option value="5">5</option>
							<option value="5">10</option>
						</select>
					</td>
					<td>
						-
					</td>
				</tr>
				<tr>
				<td>Responsabilidad Civil</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>RC personas en exceso</td>
				<td><input type="checkbox" name="RCP" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Gasto Medicos por ocupante</td>
				<td><input type="checkbox" name="GM" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Accidentes al conductor</td>
				<td><input type="checkbox" name="ACC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>RC viajero</td>
				<td><input type="checkbox" name="RCV" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Uso</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Derechos poliza</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>IVA</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Forma de pago</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Descuento</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
				<tr>
				<td>Comision</td>
				<td><input type="checkbox" name="RC" value="Aplica"></td>
				<td>
				<select>
					<option value="5">0</option>
					<option value="5">5</option>
					<option value="5">10</option>
				</select>
				</td>
				<td>
					-
				</td>	
				</tr>
			</table>
		</div>------->
		<td data-ng-controller="valorbVhCtrl">
		<select data-ng-repeat="v in valor">
		<option>{{v.valor}}</option>
		</select><br>
		<input type="checkbox">Extencion RC<br>
		<input type="checkbox">PRIX<br>
		<input type="checkbox">Defensa Legal<br>
		<input type="checkbox">Servicios de asistencia<br>
		<input type="checkbox">Auto Sustituto<br>
		<input type="checkbox">Sigue con auto<br>
		</td>
		</tr>
		</table>
	</form>

</body>
</html>
