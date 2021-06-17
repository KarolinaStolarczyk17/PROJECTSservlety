package pl.coderslab.web.day3.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String time = request.getParameter("time");
        int time1 = Integer.parseInt(time);
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(time1 * 60);
        response.addCookie(cookie);
        response.sendRedirect("/cookie3.html");
    }
}
