package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showCompany")
public class ShowCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var database = new Database();
		
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		Company company = database.findById(id);
	
		request.setAttribute("company", company);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("editCompanyForm.jsp");
		requestDispatcher.forward(request, response);
	}

}
