package pl.coderslab.web.day3.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Cookie[] cookies = request.getCookies();
for (Cookie c : cookies){
    response.getWriter().append(c.getValue() + "<a href=\"/removeCookie?name="+c.getName()+"\">link/a>");
}
response.setContentType("text/html");
    }
}
