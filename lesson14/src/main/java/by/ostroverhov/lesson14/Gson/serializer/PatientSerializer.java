package by.ostroverhov.lesson14.Gson.serializer;

import by.ostroverhov.lesson14.Patient;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class PatientSerializer implements JsonSerializer<Patient> {
    @Override
    public JsonElement serialize(Patient patient, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject json = new JsonObject();
        json.addProperty("name", patient.getName());
        json.addProperty("surname", patient.getSurname());
        Type dateType = new TypeToken<LocalDate>(){}.getType();
        json.add("birthDate", jsonSerializationContext.serialize(patient.getBirthDate(),dateType));
        Type booleanType = new TypeToken<Boolean>(){}.getType();
        json.add("isill", jsonSerializationContext.serialize(patient.isIll()));
        return json;
    }
}
