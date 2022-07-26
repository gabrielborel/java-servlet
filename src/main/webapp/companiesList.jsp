<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Company" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Companies List</title>
	</head>
	<body>
		<c:if test="${not empty company}">
			Empresa: ${ company } cadastrada com sucesso !!
		</c:if>
	
		Companies List: <br />
		
		<ul>
			<c:forEach items="${ companies }" var="company">
				<c:url value ="/removeCompany?id=${ company.id }"  var="removeCompanyServletLink"/>
				<c:url value ="/showCompany?id=${ company.id }"  var="showCompanyServletLink"/>
				
				<fmt:formatDate value="${ company.openingDate }" var="formattedDate" pattern="dd/MM/yyyy"/>
				<li>
					${ company.name } - ${ formattedDate }
					<a href="${ removeCompanyServletLink }">remover</a>
					<a href="${ showCompanyServletLink }">editar</a>
				</li>
			</c:forEach>
		</ul>
	
	</body>
</html>
