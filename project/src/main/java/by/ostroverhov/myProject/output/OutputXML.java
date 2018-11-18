package by.ostroverhov.myProject.output;

import by.ostroverhov.myProject.drugs.Drug;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class OutputXML {
    private List<Drug> ourDrugs;

    public OutputXML(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        Element rootElement = doc.createElement("Drugs");
        doc.appendChild(rootElement);

        for (Drug d:ourDrugs) {

            Element drug = doc.createElement("Drug");
            rootElement.appendChild(drug);

            Attr attr = doc.createAttribute("id");
            attr.setValue(String.valueOf(d.getId()));
            drug.getAttributeNode(String.valueOf(attr));

            Element drugName = doc.createElement("drugName");
            drugName.appendChild(doc.createTextNode(d.getName()));
            drug.appendChild(drugName);

            Element drugBatch = doc.createElement("drugBatch");
            drugBatch.appendChild(doc.createTextNode(d.getBatch()));
            drug.appendChild(drugBatch);

            Element drugamountPackages = doc.createElement("drugamountPackages");
            drugamountPackages.appendChild(doc.createTextNode(String.valueOf(d.getAmountPackages())));
            drug.appendChild(drugamountPackages);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File("file.xml"));
            transformer.transform(source,streamResult);
        }
    }
}
