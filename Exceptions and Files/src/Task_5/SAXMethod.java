package Task_5;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAXMethod extends DefaultHandler {

    @Override
    public void startDocument() {
        System.out.println("Opening document");
    }

    @Override
    public void endDocument() {
        System.out.println("Done");
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        switch (qName) {
            case "Name":
                System.out.print("Name: ");
                break;
            case "Age":
                System.out.print("Age: ");
                break;
            case "Student":
                System.out.println("----------------");
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = new String(ch).substring(start, start + length).trim();
        if (s.length() > 0) {
            System.out.println(s);
        }
    }

    public void test(String filename) throws SAXNotSupportedException, SAXNotRecognizedException {
        filename = Main.PATH + filename;
        SAXParser parser = null;
        try {
            parser = SAXParserFactory.newInstance().newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        if (parser != null) {
            InputSource input = new InputSource(filename);
            try {
                parser.parse(input, new SAXMethod());
            } catch (SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
