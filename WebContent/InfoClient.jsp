<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div {
 width: 500px;
  border: 15px solid black;
  padding: 25px;
  margin: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Informations Client</title>
</head>
<body bgcolor="#COCOCO">
<center>
<jsp:useBean id="client" class="beans.Client" scope="session"></jsp:useBean>
<h1><p style="color:olive";>Client est crée avec succes !!!!!!!!</p></h1>
<hr>
<div>
<h2>
Nom : <%= client.getNom() %><br>
Prénom : <%= client.getPrenom() %><br>
Adresse de Livraison : <%= client.getAdresse() %><br>
Numero de Téléphone : <%= client.getNum() %><br>
Adresse Email : <%= client.getAdressem() %><br>
<br>
</h2>
</center>
</div>
</body>
</html>