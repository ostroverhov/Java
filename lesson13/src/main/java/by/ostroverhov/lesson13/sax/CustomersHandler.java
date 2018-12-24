package by.ostroverhov.lesson13.sax;

import by.ostroverhov.lesson13.model.Customer;
import by.ostroverhov.lesson13.model.Customers;
import by.ostroverhov.lesson13.transformers.BooleanValue;
import by.ostroverhov.lesson13.transformers.IntValue;
import by.ostroverhov.lesson13.transformers.LocalDateValue;
import by.ostroverhov.lesson13.transformers.StringValue;
import by.ostroverhov.lesson13.transformers.Value;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomersHandler extends DefaultHandler {
    private Field currentField;
    private Map<Class, Value> values = new HashMap<>();

    {
        values.put(Integer.class, new IntValue());
        values.put(LocalDate.class, new LocalDateValue());
        values.put(String.class, new StringValue());
        values.put(Boolean.class, new BooleanValue());
    }

    private Customers customers = new Customers();
    private int id;
    private String name;
    private LocalDate lastOrder;
    private LocalDate dateOfBirth;
    private List<String> cars = new ArrayList<>();
    private boolean discount;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentField = Field.valueOf(qName.toUpperCase());
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length);
        if(currentField == Field.ID){
            id = IntValue.class.cast(values.get(currentField.getType())).transform(s);
        } else if (currentField == Field.NAME) {
            name = StringValue.class.cast(values.get(currentField.getType())).transform(s);
        } else if (currentField == Field.LASTORDER) {
            lastOrder =  LocalDateValue.class.cast(values.get(currentField.getType())).transform(s);
        } else if (currentField == Field.DATEOFBIRTH) {
            dateOfBirth = LocalDateValue.class.cast(values.get(currentField.getType())).transform(s);
        } else if (currentField == Field.CAR) {
            cars.add(StringValue.class.cast(values.get(currentField.getType())).transform(s));
        } else if (currentField == Field.DISCOUNT) {
            discount = BooleanValue.class.cast(values.get(currentField.getType())).transform(s);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        Field field = Field.valueOf(qName.toUpperCase());
        if (field.equals(Field.CUSTOMER)) {
            customers.add(new Customer(id, name, lastOrder, dateOfBirth, cars, discount));
            cars = new ArrayList<>();
        }
        currentField = null;
    }

    public Customers getCustomers() {
        return customers;
    }
}