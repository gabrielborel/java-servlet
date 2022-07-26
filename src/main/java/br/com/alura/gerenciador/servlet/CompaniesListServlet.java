package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/companiesList")
public class CompaniesListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var database = new Database();
		
		List<Company> companies = database.getCompanies();
	
		request.setAttribute("companies", companies);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("companiesList.jsp");
		reqDispatcher.forward(request, response);
	}

}
