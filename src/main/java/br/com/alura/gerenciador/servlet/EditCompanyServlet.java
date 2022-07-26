package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editCompany")
public class EditCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var database = new Database();
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		String companyName = request.getParameter("companyName");
		String openingDate = request.getParameter("openingDate");
		Date formattedOpeningDate = null;
		
		try {
			var dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			formattedOpeningDate = dateFormat.parse(openingDate);
		} catch (ParseException exception) {
			throw new ServletException(exception);
		}
		
		Company company = database.findById(id);
		company.setName(companyName);
		company.setOpeningDate(formattedOpeningDate);
		
		response.sendRedirect("companiesList");
	}

}
