<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./login" method="post">
User name:  <input type="text" name="un" id="un" required/><br/>
Password: <input type="password" name="ps" id="ps" required/> <br/>
<input type="submit" value="Login"/>
</form>
<p>  It's Index page from Spring MVC</p> <br/>
<form action="./home" method="post">
To display Home Page <button>Click Here</button>.
</form>
</body>
</html>