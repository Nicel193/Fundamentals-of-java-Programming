package Task_4;

import Task_3.Student;

import java.util.Arrays;

public class AcademicGroup {
    private String name_group;
    private Student[] students = {};

    public void add_student(Student new_student) {
        Task_3.Student[] new_arr = Arrays.copyOf(students, students.length + 1);

        new_arr[students.length] = new_student;

        students = new_arr;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getNameGroup() {
        return name_group;
    }

    public void setNameGroup(String name_group) {
        this.name_group = name_group;
    }

    @Override
    public String toString() {
        String str = "Name group: " + name_group + '\n';
        for (Student s : students) {
            str += s.toString() + '\n';
        }

        return str;
    }
}
