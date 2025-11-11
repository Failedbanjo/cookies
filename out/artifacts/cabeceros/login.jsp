<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 10/11/2025
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%---Creación del formulario---%>
<html>
<head>
    <title>Login</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css">

</head>
<body class="login-page">
<div class="login-container">
    <h2>Login</h2>
    <form action="/cabeceros/login" method="post">
        <div class="form-group">
            <label for="user"> Ingrese el usuario </label>
            <input type="text" id="user" name="user">
        </div>
        <div class="form-group">
            <label for="password">Ingrese el password</label>
            <input type="password" id="password" name="password">
        </div>
        <div class="form-group">
            <input type="submit" value="Entrar">
        </div>
    </form>
</div>
</body>
</html>