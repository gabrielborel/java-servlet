package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeCompany")
public class RemoveCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var database = new Database();
		
		String paramId = req.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		database.remove(id);
		
		resp.sendRedirect("companiesList");
	}
}
