package pl.coderslab.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Get1", value = "/Get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String startString = request.getParameter("start");
String endString = request.getParameter("end");

int start= Integer.parseInt(startString);
int end = Integer.parseInt((endString));

    }


}
