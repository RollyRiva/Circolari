/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkxml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author riva_roland
 */
public class LinkXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String patheth="Link.xml";
        List links = null;
        Parser dom = new Parser();
        try {
            links = dom.parseDocument(patheth);
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Numero di libri: " + links.size());
        Iterator iterator = links.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
}
