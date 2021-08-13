<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--<c:if test="${user == null}">
	<c:redirect url="login" />
</c:if>--%>

<!doctype html>
<html lang="fr">
<head>
    <!-- Required meta tags -->
    <link rel="stylesheet" type="text/css" href="../../assets/css/app.css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="assets/bs/css/bootstrap.css"/>
    <link rel="stylesheet" href="assets/css/app.css">
    <title>Converter Page</title>
</head>
<body>
<div class="content">
    <div class="header">projet converter</div>
    <div class="monForm shadow mt-5">
        <div class="titre bg-primary">converter form</div>
        <form method="post">
            <div class="mb-3">
                <label for="celsius" class="form-label">Temperature</label>
                <input type="text" class="form-control" id="celsius"
                       placeholder="Saisir la temperature en °C" name="celsius">
            </div>
            <div>
                <input type="submit" value="Valider" class="btn btn-primary"/>
                <input type="reset" value="Reset" class="btn btn-secondary float-end"/>
            </div>
        </form>
    </div>

    <c:if test="${resultat!=null}">
        <div class="resultat alert alert-success">Resultat = ${resultat} °F</div>
    </c:if>

    <c:if test="${error!=null}">
        <div class="error alert alert-danger">${error} °F</div>
    </c:if>
</div>
</body>
</html>