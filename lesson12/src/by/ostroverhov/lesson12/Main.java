package by.ostroverhov.lesson12;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Hospital hospital = new Hospital();

        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse("hospital.xml");

        NodeList nodeList = document.getElementsByTagName("patient");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getNodeName());

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String surname = element.getElementsByTagName("surname").item(0).getTextContent();
                String birthDate = element.getElementsByTagName("birthDate").item(0).getTextContent();
                boolean pay = Boolean.valueOf(element.getElementsByTagName("pay").item(0).getTextContent());
                System.out.println(name + ";" + surname + ";" + birthDate + ";" + pay);
                hospital.addPatient(new Patient(name, surname, birthDate, pay));
            }
        }

        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
        }

        System.out.println("-----------------");

        try {
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            UserHandler userHandler = new UserHandler();
            saxParser.parse("hospital.xml", userHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------");

        boolean bname = false;
        boolean bsurname = false;
        boolean bbirthDate = false;
        boolean bpay = false;

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader =
                    factory.createXMLEventReader(new FileReader("hospital.xml"));

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()) {

                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();

                        if (qName.equalsIgnoreCase("patient")) {
                            System.out.println("patient");
                        } else if (qName.equalsIgnoreCase("name")) {
                            bname = true;
                        } else if (qName.equalsIgnoreCase("surname")) {
                            bsurname = true;
                        } else if (qName.equalsIgnoreCase("birthDate")) {
                            bbirthDate = true;
                        } else if (qName.equalsIgnoreCase("pay")) {
                            bpay = true;
                        }
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if (bname) {
                            System.out.println("name" + characters.getData());
                            bname = false;
                        } else if (bsurname) {
                            System.out.println("surname " + characters.getData());
                            bsurname = false;
                        } else if (bbirthDate) {
                            System.out.println("birthDate " + characters.getData());
                            bbirthDate = false;
                        } else if (bpay) {
                            System.out.println("pay " + characters.getData());
                            bpay = false;
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();

                        if (endElement.getName().getLocalPart().equalsIgnoreCase("patient")) {
                            System.out.println("---");

                        }
                        break;
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }


}

