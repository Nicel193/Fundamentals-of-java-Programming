package Task_5;

import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public class Main {
    public  static String PATH = "task5/";

    public static void main(String[] args) throws Exception {
        System.out.println("SAXMethod:");
        SAXMethod saxMethod = new SAXMethod();
        try {
            saxMethod.test("AcademicGroup.xml");
        } catch (SAXNotSupportedException e) {
            e.printStackTrace();
        } catch (SAXNotRecognizedException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("DOMMethod:");
        DOMMethod domMethod = new DOMMethod();
        domMethod.test("AcademicGroup.xml");
    }
}
