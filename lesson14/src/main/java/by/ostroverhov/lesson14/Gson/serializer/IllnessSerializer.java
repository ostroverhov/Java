package by.ostroverhov.lesson14.Gson.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class IllnessSerializer implements JsonSerializer<Boolean> {

    @Override
    public JsonElement serialize(Boolean aBoolean, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(aBoolean ? "не здоров" : "здоров");
    }
}
