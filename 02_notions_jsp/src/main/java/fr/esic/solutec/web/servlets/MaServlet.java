package fr.esic.solutec.web.servlets;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maservlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// On fait les traitement qu'il faut sur la requete entrante
		//on passe la main ensuite à la jsp
		
		String message = "Message provenant de la servlet et transmis à la jsp";
		request.setAttribute("msg", message);
		
		LocalTime heure = LocalTime.now();
		request.setAttribute("heure", heure);
				
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
