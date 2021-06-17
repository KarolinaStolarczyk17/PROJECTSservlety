package pl.coderslab.web.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String role = request.getParameter("role");
        if (role == null) {

        } else {
            role = "ROLE_" + role.toUpperCase();
            request.setAttribute("userROle", role);
        }
        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(request, response);
    }
}

