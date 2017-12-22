<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="springmvc/testRest" method="POST">
		用户名:<input type="text" name="username" value=""/><br/>
		密码:<input type="password" name="password" value=""/><br/>
		角色名:<input type="text" name="role.role_name" value=""/><br/>
		<input type="submit" value="提交" /> 
	</form>

</body>
</html>