package by.ostroverhov.lesson19.web;

import by.ostroverhov.lesson19.web.command.AddCommand;
import by.ostroverhov.lesson19.web.command.Command;
import by.ostroverhov.lesson19.web.command.CommandKey;
import by.ostroverhov.lesson19.web.command.GetAddCommand;
import by.ostroverhov.lesson19.web.command.ListCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "PlumbersServlet",
        description = "Plumbers Servlet",
        urlPatterns = "/plumbers/*")
public class PlumbersServlet extends HttpServlet {
    private Map<CommandKey, Command> commands = new HashMap<>();

    {
        commands.put(new CommandKey("GET", "/plumbers"), new ListCommand());
        commands.put(new CommandKey("GET", "/plumbers/add"), new GetAddCommand());
        commands.put(new CommandKey("POST", "/plumbers"), new AddCommand(
                commands.get(new CommandKey("GET", "/plumbers"))
        ));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Command command = commands.get(new CommandKey(req.getMethod(), req.getRequestURI()));
        command.execute(req);
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/main.jsp");
        dispatcher.forward(req, resp);
    }
}