<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 19/02/2020
  Time: 12.45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Velkomme her kan du oprette dig som bruger

${requestScope.besked}



<form action="Opret", method="post">
    <label for="fname">Skriv dit navn for oprette dig som bruger:</label><br>
    <input type="text" id="fname" name="navn" ><br>

    <input type="submit" value="Opret">
</form>


</body>
</html>
