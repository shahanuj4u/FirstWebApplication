<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><% int a = Integer.parseInt(request.getParameter("t1"));
 int b = Integer.parseInt(request.getParameter("t2"));
 out.println("<br/><h2><center>" + a + "+" + b + " = " + (a+b) + "<br>");
 out.println("<br/><center>" + a + "-" + b + " = " + (a-b));
 %></h1>
</body>
</html>