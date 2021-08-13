package fr.esic.solutec.projects.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/converter")
public class ConverterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/converter.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Je recupere la saise de l'utilisateur
        String celsius = req.getParameter("celsius");

        try {
            double celsiusDouble = Double.parseDouble(celsius);
            double farenheit = 1.8 * celsiusDouble + 32;

            BigDecimal resultat = BigDecimal.valueOf(farenheit);
            resultat = resultat.setScale(2, RoundingMode.HALF_UP);

            //J'encapsule le resultat dans la requete en tant qu'attribut
            req.setAttribute("resultat", resultat);
        } catch (NumberFormatException e) {
            req.setAttribute("error", "Erreur de saisie");
        } finally {
            doGet(req, resp);
        }
    }
}
