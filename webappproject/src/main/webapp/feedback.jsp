<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Feedback Form</h1>
<form action="feedback" method="post">
<table>
<tr><td> uid:</td><td><input type="text" name="uid"></td><tr>
<tr><td> uname:</td><td><input type="text" name="uname"></td><tr>
<tr><td>Email:</td><td><input type="text" name="email"></td><tr>
<td>feedback <br /><br /><br /></td>
<td><textarea rows="4" cols="30" name="feedback"></textarea></td>
</tr>

<tr><td></td><td><input type="submit" value="submit"></td><tr>
</table>
</form>

</body>
</html>