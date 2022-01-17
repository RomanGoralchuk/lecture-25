<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Show example</title>
    </head>
    <body>
        <h1>${nameApp}</h1>
        <h2>Upload Status</h2>
        <p>Name: ${fileName}</p>
        <p>Size: ${fileSize}.KB</p>
        <p>Path: ${filePath}</p>
        <img width="200" src="<c:url value="/resources/"/>${filename}"/>
        <br>
        <a href="${pageContext.request.contextPath}/">Return to Homepage</a>
    </body>
</html>