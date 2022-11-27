package Task_4;

import java.io.*;
import java.util.zip.*;

public class Read {
    public static void main(String[] args) {
        System.out.println("Reading zip...");
        try (ZipInputStream zIn = new ZipInputStream(new FileInputStream("Source.zip"))) {
            DataInputStream in = new DataInputStream(zIn);
            ZipEntry entry;
            while ((entry = zIn.getNextEntry()) != null) {
                System.out.println(entry);
                System.out.println("Age: " + in.readInt());
                System.out.println("-------------");
                zIn.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
