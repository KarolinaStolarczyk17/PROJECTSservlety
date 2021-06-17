package pl.coderslab.web.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String startString = request.getParameter("start");
        String endString = request.getParameter("end");
        int start = Integer.parseInt(startString);
        int end = Integer.parseInt(endString);

        request.setAttribute("s", start + 10);
        request.setAttribute("e", end + 10);
        getServletContext().getRequestDispatcher("/jsp2.jsp").forward(request, response);
    }
}
