<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
<link href=	"src/main/webapp/js/cargaxarchivo.js"/>
</head>
<body>
<div data-ng-app="cotcargaxarchivo" data-ng-controller="cargaurl">
	<form data-ng-submit="vm.enviar()" >
		 <div >
	      <label>Cotizacion por archivo</label>
	        <input id="cargar" type="file" data-ng-model="vm.fup.file">
	        <br>
	        <input type="submit" value="Enviar">
	     </div>

	</form>
</div>
		
</body>
</html>