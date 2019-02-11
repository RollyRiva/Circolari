package linkxml;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List libri;

    public Parser() {
        libri = new ArrayList();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        Link lin;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
        nodelist = root.getElementsByTagName("a");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element)nodelist.item(i);
                Link l = getLink(element);
                libri.add(l);
            }
        }
        return libri;
    }

    private Link getLink(Element element) {
        Link l;
        String path = element.getAttribute("href");
        String link = getTextValue(element);
        l = new Link(path,link);
        return l;
    }
    
    // restituisce il valore testuale dell’elemento figlio specificato
    private String getTextValue(Element element) {
        String value = null;
        if (element != null) {
            value = element.getFirstChild().getNodeValue();
        }
        return value;
    }
    
    // restituisce il valore intero dell’elemento figlio specificato
    private int getIntValue(Element element, String tag) {
        return Integer.parseInt(getTextValue(element));
    }
    
    // restituisce il valore numerico dell’elemento figlio specificato
    private float getFloatValue(Element element, String tag) {
        return Float.parseFloat(getTextValue(element));
    }
    
}