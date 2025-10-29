<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome, <%= request.getAttribute("user") %>!</h2>
    <p>Login Successful!</p>
</body>
</html>
