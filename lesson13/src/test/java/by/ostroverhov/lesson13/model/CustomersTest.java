package by.ostroverhov.lesson13.model;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomersTest {
    @Test
    public void sortByNameShouldBeValid() {
        Customers customers = new Customers();
        customers.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        customers.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        customers.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        customers.sortByName();

        Customers expected = new Customers();
        expected.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        expected.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));
        expected.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));

        Assert.assertEquals(expected, customers);
    }

    @Test
    public void sortByNameShouldBeInvalid() {
        Customers customers = new Customers();
        customers.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        customers.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        customers.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        customers.sortByName();

        List<Customer> expected = new ArrayList<>();
        expected.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        expected.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        expected.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        Assert.assertNotEquals(expected, customers);
    }
}
