package by.ostroverhov.lesson9.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compression {
    private static final Pattern PATTERN_FORWARD = Pattern.compile("(.)(\\1)+");
    private static final Pattern PATTERN_BACK = Pattern.compile(".\\d");

    public String forward (String text) {
        Matcher matcher = PATTERN_FORWARD.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            String found = matcher.group();
            matcher.appendReplacement(buffer, found.substring(0, 1) + found.length());
        }
        matcher.appendTail(buffer);

        return buffer.toString();
    }

    public String back(String compressed) {
        Matcher matcher = PATTERN_BACK.matcher(compressed);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            String found = matcher.group();

            String symbol = found.substring(0, 1);
            Integer count = Integer.valueOf(found.substring(1));
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < count; i++) {
                result.append(symbol);
            }

            matcher.appendReplacement(buffer, result.toString());
        }
        matcher.appendTail(buffer);

        return buffer.toString();
    }
}
