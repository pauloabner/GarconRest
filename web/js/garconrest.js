var url = "http://localhost:8080/GarconRest";
//var url = "http://garconrest.abner.cloudbees.net
function createXMLHttpRequest() {
		// See http://en.wikipedia.org/wiki/XMLHttpRequest
		// Provide the XMLHttpRequest class for IE 5.x-6.x:
		if (typeof XMLHttpRequest == "undefined")
			XMLHttpRequest = function() {
				try {
					return new ActiveXObject("Msxml2.XMLHTTP.6.0");
				} catch (e) {
				}
				try {
					return new ActiveXObject("Msxml2.XMLHTTP.3.0");
				} catch (e) {
				}
				try {
					return new ActiveXObject("Msxml2.XMLHTTP");
				} catch (e) {
				}
				try {
					return new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
				throw new Error("This browser does not support XMLHttpRequest.");
			};
		return new XMLHttpRequest();
	}

	var AJAX = createXMLHttpRequest();

	function handler() {
		if (AJAX.readyState == 4 && AJAX.status == 200) {
			var json = eval('(' + AJAX.responseText + ')');
			alert(json.Mesa.conta);
		} else if (AJAX.readyState == 4 && AJAX.status != 200) {
			alert('Erro');
		}
	}	

	function show() {
		AJAX.onreadystatechange = handler;
		var x = document.getElementById("numeroMesa").value;
		var path = url+"/cxf/mesaService/mesa/"+ x;
		AJAX.open("GET", path);
		AJAX.send("");
	};
	
	function chamarHandler() {
		if (AJAX.readyState == 4 && AJAX.status == 200) {			
			alert("Garçon!");
		} else if (AJAX.readyState == 4 && AJAX.status != 200) {
			alert('Erro');
		}
	}
	
	function chamar(){
		AJAX.onreadystatechange = chamarHandler;
		var x = document.getElementById("numeroMesa").value;
		var path = url +"/cxf/mesaService/mesa/"+ x +"/garcon";
		AJAX.open("GET", path);
		AJAX.send("");
	}
	
	 function listarCategorias(){
		 
		AJAX.onreadystatechange = categoriasHandler;
		var path = url+"/cxf/mesaService/categorias";
		AJAX.open("GET", path);
		AJAX.send("");	 
     }

     function categoriasHandler(){ 
    	 
    	 if (AJAX.readyState == 4 && AJAX.status == 200) {	
    		 alert(AJAX.readyState+","+AJAX.status+","+AJAX.responseText);
    		 var json = eval('(' + AJAX.responseText + ')');
    		 alert(json.Categoria.length);
 		} else if (AJAX.readyState == 4 && AJAX.status != 200) {
 			alert('Erro');
 		}        
     }