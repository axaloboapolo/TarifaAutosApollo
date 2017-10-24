<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
	<script src="js/catalogo.js" type="text/javascript"></script>
	
</head>
<body data-ng-app="catalogos">
	<form  id="consultacat" action="/catalogos" method="post">
		<div data-ng-controller="catalogo">
			<label>Catalogos</label>
				<select data-ng-model="catalogoselected" data-ng-options="y.descripcion for (x,y) in getCatalogo"></select>
		</div>
	</form>
</body>
</html>