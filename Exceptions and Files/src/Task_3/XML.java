package Task_3;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XML {
    public static <T> void serialization(T object, String filename) {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(filename))) {
            xmlEncoder.writeObject(object);
            xmlEncoder.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserialization(String filename) {
        Object object = null;
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(filename))) {
            object = xmlDecoder.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }
}
