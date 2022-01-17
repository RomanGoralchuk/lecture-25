<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSP Examples</title>
    </head>
    <body>
        <h1>Sorry... We have a problems..</h1>
        <p>Failed URL: ${url}</p>
        <p>Exception:  ${exception}</p>
        <a href="${pageContext.request.contextPath}/">Return to Homepage</a>
    </body>
</html>