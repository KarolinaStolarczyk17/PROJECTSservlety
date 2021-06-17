package pl.coderslab.web.day4;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "/*")
public class Filter2 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {


        HttpServletRequest request1 = (HttpServletRequest) request;
        String getHeader = request1.getHeader("User-Agent");
        System.out.println(getHeader);
        long startTime = System.nanoTime();


        chain.doFilter(request, response);
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
}
