<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>LOGIN FORM</H1>
<%
String myname = (String)session.getAttribute("user");
if(myname!=null)
{
out.println("Welcome "+myname+" , <a href=\"logout.jsp\">Logout</a>");
}
else
{
%>
 <form method="post" action="Check">
 <center>
 <table align="center">
 <tr><td> User Name : </td><td> <input type="text" name="user" ></td></tr>
 <tr><td> Password : </td><td> <input type="password" name="pass" ></td></tr>
 <tr><td colspan="2" align="center"><br> 
 <input type="submit"
name="Login" value="Login"></td></tr>
 </table></center></form>
<%
}
%>
</body>
</html>