package by.ostroverhov.lesson12;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

    boolean name = false;
    boolean surname = false;
    boolean birthDate = false;
    boolean pay = false;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("name")) {
            name = true;
        } else if (qName.equalsIgnoreCase("surname")) {
            surname = true;
        } else if (qName.equalsIgnoreCase("birthDate")) {
            birthDate = true;
        } else if (qName.equalsIgnoreCase("pay")) {
            pay = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("patient")) {
            System.out.println("----");
        }
    }

    public void characters(char ch[], int start, int lenght) throws SAXException {
        if (name) {
            System.out.println("name: " + new String(ch, start, lenght));
            name = false;
        } else if (surname) {
            System.out.println("surname: " + new String(ch, start, lenght));
            surname = false;
        }else if (birthDate) {
            System.out.println("birthDate: " + new String(ch, start, lenght));
            birthDate = false;
        }else if (pay){
            System.out.println("pay: " + new String(ch, start, lenght));
            pay = false;
        }
    }
}

