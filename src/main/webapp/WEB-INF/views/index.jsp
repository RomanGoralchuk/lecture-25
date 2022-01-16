<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSP Examples</title>
    </head>
    <body>
        <h1>${nameApp}</h1>
        <p>${baseText}</p>
        <a href="${pageContext.request.contextPath}/upload">Upload File</a>
    </body>
</html>