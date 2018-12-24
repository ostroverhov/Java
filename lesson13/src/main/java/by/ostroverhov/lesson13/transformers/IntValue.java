package by.ostroverhov.lesson13.transformers;

public class IntValue implements Value<Integer> {
    @Override
    public Integer transform(String s) {
        return Integer.parseInt(s);
    }
}