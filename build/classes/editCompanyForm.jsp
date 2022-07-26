<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value ="/editCompany" var="editCompanyServletLink"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Company</title>
</head>
<body>

	<form action="${ editCompanyServletLink }" method="post">	
		<fmt:formatDate value="${ company.openingDate }" var="formattedDate" pattern="dd/MM/yyyy"/>
	
		Nome: <input type="text" name="companyName" value="${ company.name }"  />
		Data abertura: <input type="text" name="openingDate"  value="${ formattedDate }" />
		<input type="hidden" name="id" value="${ company.id }"/>
		<input type="submit" />
			
	</form>
	
</body>
</html>