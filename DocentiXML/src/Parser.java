import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List docenti;

    public Parser() {
        docenti = new ArrayList();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodeTr;
        
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
        nodeTr = root.getElementsByTagName("tr");
        if (nodeTr != null && nodeTr.getLength() > 0) {
            for (int i = 0; i < nodeTr.getLength(); i++) {
                element = (Element)nodeTr.item(i);
                Docente doc = getDocente(element);
                if(doc!=null){
                    docenti.add(doc);
                }                                
            }
        }
        return docenti;
    }

    private Docente getDocente(Element element) {
        Docente d;
        NodeList nodeTd;
        nodeTd=element.getElementsByTagName("td");
        if (nodeTd != null && nodeTd.getLength() > 0) {
            String nome=getTextValue((Element)nodeTd.item(1));
            String data=getTextValue((Element)nodeTd.item(2));
            d = new Docente(nome,data);
            return d;
        }
        else{
            return null;
        }
        
    }
    
    // restituisce il valore testuale dell’elemento figlio specificato
    private String getTextValue(Element element) {
        String value = null;
        if (element != null) {
            Node l = element.getFirstChild();
            if(l!=null){
                value=l.getNodeValue();
            }
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