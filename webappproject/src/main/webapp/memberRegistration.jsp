<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION FORM</title>

</head>
<body>
<h1>REGISTRATION FORM</h1>
<form action="Register" method="post">
<table>
<tr><td> UName:</td><td><input type="text" name="uname"></td><tr>
<tr><td>Password:</td><td><input type="password" name="password"></td><tr>
<tr><td>Email:</td><td><input type="text" name="email"></td><tr>
<tr><td> phone:</td><td><input type="text" name="phone"></td><tr>
<tr>
<td>Address <br /><br /><br /></td>
<td><textarea rows="4" cols="30" name="Address"></textarea></td>
</tr>
<tr><td> Image:</td><td><input type="file" name="Image"></td><tr>

<tr><td></td><td><input type="submit" value="register"></td><tr>

</table>

</form>
</body>
</html>