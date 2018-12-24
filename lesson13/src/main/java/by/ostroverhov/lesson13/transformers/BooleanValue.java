package by.ostroverhov.lesson13.transformers;

public class BooleanValue implements Value<Boolean> {
    @Override
    public Boolean transform(String s) {
        return Boolean.parseBoolean(s);
    }
}
