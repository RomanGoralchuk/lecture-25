<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Upload example</title>
    </head>
    <body>
        <h1>${nameApp}</h1>
        <p>${baseText}</p>
        <form method="POST" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
            <input type="file" name="file" /><br/>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>