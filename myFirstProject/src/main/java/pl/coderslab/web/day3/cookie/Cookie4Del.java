package pl.coderslab.web.day3.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Cookie[] cookies = request.getCookies();
String name = request.getParameter("name");

       for (Cookie c : cookies) {
           if (name.equals(c.getName())){
               c.setMaxAge(0);
               response.addCookie(c);
           }
       }
    }
}
