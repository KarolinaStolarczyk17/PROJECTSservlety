//package pl.coderslab.web.day3.session;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(name = "/session1Set")
//public class Session2 extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       response.getWriter().append("<form action=\"/session2\" method=POST\">")
//               .append("<input type=\"text\" name\"ocena\"><\\br>")
//               .append("<input type=\"submit\">")
//               .append("</form>");
//    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        HttpSession session = request.getSession();
//        List<>
//    }
//}
