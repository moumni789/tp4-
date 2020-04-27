<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div {
 width: 300px;
  border: 15px solid black;
  padding: 25px;
  margin: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body bgcolor="#COCOCO">
<center>
<h1><p style="color:green";>Bienvenue à Votre Session <br></h1>
<% if(request.getParameter("nom").equals("") || request.getParameter("prenom").equals("") ) %>
<jsp:useBean id="personne" class="beans.PerAuth" scope="session"></jsp:useBean>
<jsp:setProperty property="nom" name="personne" />
<jsp:setProperty property="prenom" name="personne" />
<hr>
<div>
<br><h2>Prénom : <%=personne.getPrenom() %></h2>
<br><h2>Nom : <%=personne.getNom()%></h2>
</div>
</center>
</body>
</html>