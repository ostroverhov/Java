package by.ostroverhov.lesson19.web.command;

import by.ostroverhov.lesson19.domain.Plumber;
import by.ostroverhov.lesson19.domain.Plumbers;

import javax.servlet.http.HttpServletRequest;

public class AddCommand implements Command {
    private Command listCommand;

    public AddCommand(Command listCommand) {
        this.listCommand = listCommand;
    }

    @Override
    public void execute(HttpServletRequest request) {
        Plumbers.INSTANCE.add(
                new Plumber.Builder()
                        .name(request.getParameter("name"))
                        .rank(request.getParameter("rank"))
                        .fresh(request.getParameter("fresh"))
                        .build()
        );

        listCommand.execute(request);
    }
}