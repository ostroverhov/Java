package by.ostroverhov.lesson14.Gson.deserializer;

import by.ostroverhov.lesson14.Patient;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientDeserializer implements JsonDeserializer<Patient> {

    @Override
    public Patient deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String name = jsonObject.get("name").getAsString();
        String surname = jsonObject.get("surname").getAsString();
        LocalDate dateOfBirth = LocalDate.parse(jsonObject.get("birthDate").getAsString(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        boolean sick;
        if (jsonObject.get("isill").getAsString().equals("здоров")) {
            sick = false;

        } else sick = true;

        return new Patient(name, surname, dateOfBirth, sick);
    }
}
