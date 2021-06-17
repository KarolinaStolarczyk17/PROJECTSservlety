package pl.coderslab.web.day3.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet11", value = "/Servlet11")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("counter") == null) {
            response.getWriter().append("EMPTY");
        } else {
            int counter = (int)session.getAttribute("counter");
            response.getWriter().append(String.valueOf(counter));
            session.setAttribute("counter", counter+1);
        }
    }
}
