package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet (name = "collabListServlet", urlPatterns = {"/collaborateurs/lister"})
public class ListerCollaborateursController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
// A ajouter
        req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues","Steeve"));
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
                .forward(req, resp);
    }
}
