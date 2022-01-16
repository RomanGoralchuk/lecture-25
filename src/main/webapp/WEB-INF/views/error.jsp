<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSP Examples</title>
    </head>
    <body>
        <h1>Sorry... We have a problems..</h1>
        <p>Failed URL: ${url}</p>
        <p>Exception:  ${exception.message}</p>
        <p>Return to the Main page<a href="${pageContext.request.contextPath}/">Main</a>
    </body>
</html>