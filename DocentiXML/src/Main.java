/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author riva_roland
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.err.println("inserisci giorno");
        String day=scanner.next();
        day=Normalizer.normalize(day, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "ì");
        String patheth="Circolari.xml";
        List docenti = null;
        Parser dom = new Parser();
        try {
            docenti = dom.parseDocument1(patheth,day);
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
         System.out.println(docenti.get(3).toString());
        System.out.println("Numero di Docenti: " + docenti.size());
        Iterator iterator = docenti.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }    
}
