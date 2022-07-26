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

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		var database = new Database();
		
		String companyName = req.getParameter("companyName");
		String openingDate = req.getParameter("openingDate");
		Date formattedOpeningDate = null;
		
		try {
			var dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			formattedOpeningDate = dateFormat.parse(openingDate);
		} catch (ParseException exception) {
			throw new ServletException(exception);
		}
		
		var company = new Company(companyName, formattedOpeningDate);
		database.add(company);

		resp.sendRedirect("companiesList");
	}
		
}
