package by.ostroverhov.lesson13.transformers;

public class StringValue implements Value<String> {
    @Override
    public String transform(String s) {
        return s;
    }
}
