<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
	
	<link href="src/main/webapp/js/catTarifa.js"/>
	
	
	<style type="text/css">
		fieldset select, 
		fieldset label {
		    display: table-cell;
		    margin: 3px;
		}
		fieldset label {
		    text-align: right;
		}
	
	
	</style>
</head>
<body>

	<form  id="consultacat" action="/catalogos" method="post"
	data-ng-app="catTarifa">
				<h2>Catalogos Tarifa</h2>
		<div data-ng-controller="tarifacat">
				<label>Modulo I</label>
					<select data-ng-model="catalogoselectedm1" data-ng-options="y.descripcion for (x,y) in getCatalogoM1"></select>
		
			<label>Modulo II</label>
				<select data-ng-model="catalogoselectedm2" data-ng-options="y.descripcion for (x,y) in getCatalogoM2"></select>
			<label>Modulo III</label>
				<select data-ng-model="catalogoselectedm3" data-ng-options="y.descripcion for (x,y) in getCatalogoM3"></select>
			<label>Modulo IV</label>
				<select data-ng-model="catalogoselectedm4" data-ng-options="y.descripcion for (x,y) in getCatalogoM4"></select>
	</form>

</body>
</html>