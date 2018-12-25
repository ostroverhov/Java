package by.ostroverhov.lesson19.web.command;

import javax.servlet.http.HttpServletRequest;

public class GetAddCommand implements Command {
    @Override
    public void execute(HttpServletRequest request) {
        request.setAttribute("page", "/WEB-INF/add.jsp");
    }
}