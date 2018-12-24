package by.ostroverhov.lesson13.sax;

import by.ostroverhov.lesson13.model.Customers;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomersReader {
    private static final Logger LOGGER = Logger.getLogger(CustomersReader.class.getName());
    private String path;

    public CustomersReader(String path) {
        this.path = path;
    }

    public Customers read() throws IOException {
        try (InputStream toRead = CustomersReader.class.getClassLoader().getResource(path).openStream()) {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            CustomersHandler handler = new CustomersHandler();
            saxParser.parse(toRead, handler);
            return handler.getCustomers();
        } catch (SAXException | ParserConfigurationException | IOException e) {
            LOGGER.log(Level.INFO, e.getMessage());
            throw new IOException(e);
        }
    }
}