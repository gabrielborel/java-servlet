<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Company</title>
</head>
<body>

	<c:if test="${not empty company}">
		Empresa ${ company } cadastrada com sucesso !!!
	</c:if>
	
		<c:if test="${empty company}">
		Nenhuma empresa cadastrada !!!
	</c:if>
	
	
</body>
</html>