package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * 1. 파라메터 전송 기능
 * http://localhost:8083/request-param?username=hello&age=20
 *
 *
 * */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 전체 파라미터 조회

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println("paramName = " + request.getParameter(paramName)));


        /*String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("username = " + username + "age = " + age);*/
    }
}
