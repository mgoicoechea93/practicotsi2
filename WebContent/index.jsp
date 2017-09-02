<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>HOLA MUNDO</h2>
	<form action="LoginController" method="POST">
            <td>Usuario</td>
			<input  type="text" name="username" placeholder="Nickname o email"/>
			<br/>
            <td>Contraseña</td>
			<input type="password" name="password"/>
			<br/>      
			<input type="button" onclick="submit()" value="Entrar" />
    </form>
</body>
</html>
</jsp:root>