package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String protocol = request.getProtocol();
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        HttpServletMapping httpServletMapping = request.getHttpServletMapping();

        System.out.println("method = " + method);
        System.out.println("protocol = " + protocol);
        System.out.println("requestURI = " + requestURI);
        System.out.println("requestURL = " + requestURL);
        System.out.println("httpServletMapping = " + httpServletMapping);





    }
}
