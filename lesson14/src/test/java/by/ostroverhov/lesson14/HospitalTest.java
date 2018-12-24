package by.ostroverhov.lesson14;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HospitalTest {
    @Test
    public void toJsonShouldEqualsStringGson() {
        Hospital hospital = new Hospital();
        hospital.addPatients(new Patient("Nick", "Ivanov", LocalDate.of(1950, 11, 23), true));
        hospital.addPatients(new Patient("Ivan", "Petrov", LocalDate.of(1955, 10, 15), true));

        String expected = "{\"patients\":[{\"name\":\"Nick\",\"surname\":\"Ivanov\",\"birthDate\":\"23-11-1950\",\"isill\":\"не здоров\"}," +
                "{\"name\":\"Ivan\",\"surname\":\"Petrov\",\"birthDate\":\"15-10-1955\",\"isill\":\"не здоров\"}]}";
        Assert.assertEquals(expected, hospital.toJson());
    }

    @Test
    public void fromJsonShouldEqualsObject() {
        Hospital expectedHospital = new Hospital();
        expectedHospital.addPatients(new Patient("Nick", "Ivanov", LocalDate.of(1950, 11, 23), true));
        expectedHospital.addPatients(new Patient("Ivan", "Petrov", LocalDate.of(1955, 10, 15), true));
        String json = "{\"patients\":[{\"name\":\"Nick\",\"surname\":\"Ivanov\",\"birthDate\":\"23-11-1950\",\"isill\":\"не здоров\"}," +
                "{\"name\":\"Ivan\",\"surname\":\"Petrov\",\"birthDate\":\"15-10-1955\",\"isill\":\"не здоров\"}]}";

        Hospital newHospital = new Hospital();
        newHospital.fromJson(json);
        Assert.assertEquals(expectedHospital.getPatients(), newHospital.getPatients());
    }


}
