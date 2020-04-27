<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nombre Aléatoire</title>
</head>
<body bgcolor="#008000">
<center>
<h1>Résultat</h1>
<hr>
<jsp:useBean id="BeanNumber" class="beans.NombreAleatoire" scope="session"></jsp:useBean>
<h2>Random Number : <%= request.getAttribute("randomNum") %></h2>
</center>
</body>
</html>