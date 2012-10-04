<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.css" />
	<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
	<script
		src="http://code.jquery.com/mobile/1.1.1/jquery.mobile-1.1.1.min.js"></script>
	<script type="text/javascript" src="js/garconrest.js"></script> 
</head>
<body>
	<div data-role="page">
		<div data-role="header" align="center">Cardápip</div>
		<div data-role="content" id="content">
			<a href="index.jsp?numeroMesa=<%=request.getParameter("numeroMesa")%>" data-role="button" data-icon="arrow-l" >Voltar</a>			
		</div>		
		<script>
		$(document).bind("pageinit",function(){
			$.getJSON(url+"/cxf/mesaService/categorias",					  
					  function(data) {
					    $.each(data.Categoria, function(i,item){
					    var text = "<a href='cardapio.jsp?numeroMesa=<%=request.getParameter("numeroMesa")%>&categoriaId="+item.id+"' data-role='button' data-iconpos='right' data-icon='arrow-r' >"
					    		+item.descricao+"</a>";
					    $("#content").append(text).trigger("create");
					    })
					  });
		});			
			
		</script>
		
		<div data-role="footer" align="center">AbneNet</div>
	</div>
		<input type="hidden" id="numeroMesa"
			value="<%=request.getParameter("numeroMesa")%>">
</body>
</html>