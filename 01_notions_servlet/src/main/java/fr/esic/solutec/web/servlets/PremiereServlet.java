package fr.esic.solutec.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PremiereServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		try {
			out.println("<!doctype html>");
			out.println("<html>"
					+ "<head>"
					+ "<title>Premiere Servlet</title>"
					+ "</head>"
					+ "<body>"
					+ "<h2>Un petit bonjour depuis ma servlet</h2>"
					+ "</body>"
					+ "</html>");
		}finally {
			out.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init -> sans arg");
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}