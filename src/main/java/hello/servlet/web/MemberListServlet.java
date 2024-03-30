package hello.servlet.web;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "MemberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter writer = resp.getWriter();
        writer.write("<html>");
        writer.write("<body>");
        for (Member member : members) {
            writer.write("<tr>");
            writer.write("<td>"+member.getId()+"</td>");
            writer.write("<td>"+member.getUsername()+"</td>");
            writer.write("<td>"+member.getAge() +"</td>");
            writer.write("</td>");
            writer.write("</tr>");
        }
        writer.write("</body>");
        writer.write("</html>");

    }
}
