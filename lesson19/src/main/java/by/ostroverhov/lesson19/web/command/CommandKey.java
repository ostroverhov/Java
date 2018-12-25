package by.ostroverhov.lesson19.web.command;

import java.util.Objects;

public class CommandKey {
    private String method;
    private String uri;

    public CommandKey(String method, String uri) {
        this.method = method;
        this.uri = uri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandKey that = (CommandKey) o;
        return Objects.equals(method, that.method) &&
                Objects.equals(uri, that.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, uri);
    }
}