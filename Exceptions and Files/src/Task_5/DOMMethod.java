package Task_5;

import java.io.*;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DOMMethod {
    public void test(String filename) throws Exception {
        String path = Main.PATH + filename;

        Document doc;
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        doc = db.parse(new File(path));
        Node rootNode = doc.getDocumentElement();
        for (int i = 0; i < rootNode.getChildNodes().getLength(); i++) {
            Node currentNode = rootNode.getChildNodes().item(i);

            if (currentNode.getNodeName() == "Student") System.out.println("----------------");

            for (int j = 0; j < currentNode.getChildNodes().getLength(); j++) {
                Node mainNode = currentNode.getChildNodes().item(j);
                if (mainNode == null) break;

                switch (mainNode.getNodeName()) {
                    case "Name":
                        System.out.print("Name: ");
                        System.out.println(mainNode.getTextContent());
                        break;
                    case "Age":
                        System.out.print("Age: ");
                        System.out.println(mainNode.getTextContent());
                        int new_age = Integer.parseInt(mainNode.getTextContent()) + 1;
                        mainNode.setTextContent(Integer.toString(new_age));
                        break;
                }
            }
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        String new_path = Main.PATH + "Modified" + filename;
        // Запис у файл:
        transformer.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File(new_path))));
    }
}
