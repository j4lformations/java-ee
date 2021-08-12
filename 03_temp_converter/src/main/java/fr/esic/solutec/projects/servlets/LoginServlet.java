package fr.esic.solutec.projects.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.esic.solutec.projects.models.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");

		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");

		// On recupere les parametres du formulaires via la methode
		// getParameter("name");
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");

		if (login.equalsIgnoreCase("titi@solutec.fr") && mdp.equals("123")) {
			//Je cree un user
			User user = new User(login, mdp);

			//Je recupere la session de navigation
			HttpSession session = request.getSession();

			//Je met le user dans la session de navigation
			session.setAttribute("user", user);

			response.sendRedirect("converter");
		} else {
//			System.out.println("Infos incorrects");
//
//			String msgError = "Infos incorrects";
//			request.setAttribute("msg", msgError);

//			request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
			response.sendRedirect("login");
		}
	}
}
