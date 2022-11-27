package Task_4;

import Task_3.AcademicGroup;
import Task_3.Student;

import java.util.Random;

import java.io.*;
import java.util.zip.*;

public class Write {
    public static String[] names = {"Ruslan", "Bogdan", "Roman", "Petya", "Oleg"};

    public static void write_to_zip(Student[] students) {
        System.out.println("Write to ZIP...");
        try (ZipOutputStream zOut = new ZipOutputStream(new FileOutputStream("Source.zip"))) {
            DataOutputStream out = new DataOutputStream(zOut);
            for (Student s : students) {
                ZipEntry zipEntry = new ZipEntry(s.getName());
                zOut.putNextEntry(zipEntry);
                out.writeInt(s.getAge());
                zOut.closeEntry();
            }
            zOut.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Complete");
    }

    public static void main(String[] args) {
        Task_3.AcademicGroup academic_group = new AcademicGroup();
        academic_group.setNameGroup("KN-221b");

        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            Task_3.Student student = new Student();
            student.setName(names[i]);
            student.setAge(random.nextInt(3) + 16);
            academic_group.add_student(student);
        }

        write_to_zip(academic_group.getStudents());
    }
}
