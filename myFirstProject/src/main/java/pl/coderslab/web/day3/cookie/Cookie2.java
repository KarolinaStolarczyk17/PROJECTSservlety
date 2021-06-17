package pl.coderslab.web.day3.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addToCookies")
public class Cookie2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String key = request.getParameter("key");
String value = request.getParameter("value");

        Cookie cookie = new Cookie(key, value);
        response.addCookie(cookie);
        response.sendRedirect("/cookie2.html");
    }
}
