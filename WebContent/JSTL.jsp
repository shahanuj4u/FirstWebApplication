<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>1</title>
 </head>
 <body>
 <center><b>Count 1 to 10 using JSTL </b></center>
 <h1><c:forEach var="count" begin="1" end="10">
 <center><c:out value="${count}" /><br></center>
 </c:forEach>
 </body>
</html>