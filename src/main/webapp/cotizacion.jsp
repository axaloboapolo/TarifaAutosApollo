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
		<div>
			<button data-ng-click="dialog.dialog_open()">Marcas</button>
			
		</div>
	
	
		
		<div  data-ng-app="cobert" data-ng-controller="coberturas">
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
            			<td data-ng-controller="SelectDeducibleDM">
                		<select data-ng-model="selectedDM" data-ng-options="y.deducible for (x, y) in getDed" >
                		</select>
            			</td>
            			<td data-ng-controller="SelectSADM">
                		<select data-ng-model="selectedSaDM" data-ng-options="y.SA for (x, y) in getSuma"></select>
            			</td>
            		</tr>
					<tr>
						<td>Robo total</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleRT">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSART">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Responsabilidad civil</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleRC">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSARC">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Gastos Medicos</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleGM">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAGM">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Cristales</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleCR">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSACR">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Defensa Legal</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleDL">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSADL">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Servicios de Asistencia</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleSERVAS">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSASERVAS">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Accidentes al conductor</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleACC">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAACC">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Extencion de RC</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleERC">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAERC">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Ampliacion de RC</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleARC">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAARC">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Equipo especial DM</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleEEDM">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAEEDM">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Equipo especial RT</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleEERT">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAEERT">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Adaptaciones y conversiones DM</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleADCDM">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAADCDM">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Adaptaciones y conversiones RT</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleADCRT">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectADCRT">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >Eliminacion de deducible </td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleED">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAED">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >RC Viajero</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleRCV">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSARCV">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >Perdida Total por colision</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeduciblePTC">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAPTC">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >RC Personas</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleRCP">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSARCP">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >ASRT</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleASRT">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAASRT">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >Sigue con Auto</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleSCA">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSASCA">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td >Robo parcial de interiores</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleRPI">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSARPI">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
					<tr>
						<td>Gastos de transporte</td>
						<td><input type="checkbox"></td>
						<td data-ng-controller="SelectDeducibleGTR">
							<select  data-ng-model="selectedded" data-ng-options="y.deducible for (x,y) in getDed">
							</select>
						</td>
						<td data-ng-controller="SelectSAGTR">
							<select data-ng-model="selectedsum" data-ng-options="y.suma for (x,y) in getSuma">
							</select>
						</td>
					</tr>
				</tbody>
				
			</table>
		</div>
	</form>
			
			
</body>
</html>
