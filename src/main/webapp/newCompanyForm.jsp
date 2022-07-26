<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value ="/newCompany" var="newCompanyServletLink"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Company Form</title>
</head>
<body>

	<form action="${ newCompanyServletLink }" method="post">	
	
		Nome: <input type="text" name="companyName" placeholder="Entre com o nome da empresa"  />
		Data abertura: <input type="text" name="openingDate" placeholder="Entre com o nome da empresa"  />
		<input type="submit" />
			
	</form>

</body>
</html>