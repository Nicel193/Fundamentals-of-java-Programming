package Task_3;

import java.util.Random;

public class Main {
    public static String [] names = {"Ruslan", "Bogdan", "Roman", "Petya", "Oleg"};

    public static void main(String[] args) {
        AcademicGroup academic_group = new AcademicGroup();
        academic_group.setNameGroup("KN-221b");

        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            Student student = new Student();
            student.setName(names[i]);
            student.setAge(random.nextInt(3) + 16);
            academic_group.add_student(student);
        }

        XML.serialization(academic_group, "AcademicGroup.xml");
        AcademicGroup deserialization_academic_group = (AcademicGroup) XML.deserialization("AcademicGroup.xml");
        System.out.println(deserialization_academic_group);
    }
}
