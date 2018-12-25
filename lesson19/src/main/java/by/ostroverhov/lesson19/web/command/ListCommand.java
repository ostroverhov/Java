package by.ostroverhov.lesson19.web.command;

import by.ostroverhov.lesson19.domain.Plumbers;

import javax.servlet.http.HttpServletRequest;

public class ListCommand implements Command {
    @Override
    public void execute(HttpServletRequest request) {
        request.setAttribute("plumbers", Plumbers.INSTANCE.getPlumbers());
        request.setAttribute("page", "/WEB-INF/list.jsp");
    }
}