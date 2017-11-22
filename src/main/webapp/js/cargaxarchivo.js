/**
 * 
 */
var app = angular.module('cotcargaxarchivo', []);
	app.controller('cargaurl',['$http',Controllerprip]);
	
	function Controllerprip ($http){
		var vm = this;
		vm.fup = {};
		wm.enviar =function(){
			$http.get('http://localhost:8090/wscragaxarchivo',wm.fup)
			.success(function(res){
				var txtFile = "test.txt";
				var file = new File (txtFile);
				var str = res.stringify(JsonExport);
			
					var dataUri = 'data:application/json;charset=utf-8,'+ encodeURIComponent(str);
						var link = document.getElementById('link').href =dataUri;
						
			
			})
			
		}
		
		
	}