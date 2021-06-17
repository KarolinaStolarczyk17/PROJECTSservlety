package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "Get3", value = "/Get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // String number = request.getParameter("number");
        String width = request.getParameter("width");
        String height = request.getParameter("height");
        int widthI;
        int heightI;
        if (width == null || height == null) {
            widthI = 5;
            heightI = 10;
        } else {
            widthI = Integer.parseInt(width);
            heightI = Integer.parseInt(height);
        }
        for (int i = 1; i < widthI; i++) {
            for (int j = 1; j < heightI; j++) {
                response.getWriter().append(i * j + " ");
            }
            response.getWriter().append("\n");
        }
    }

}

