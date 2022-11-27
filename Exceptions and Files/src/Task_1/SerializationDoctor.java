package Task_1;

import java.io.*;

public class SerializationDoctor extends WritableDoctor {
    SerializationDoctor(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public void sort_alphabetic_comments() {
        read_file(null);
        super.sort_alphabetic_comments();
        write_to_file("SortedByComments" + get_surname() + ".dat");
    }

    @Override
    public void sort_number_of_visitors() {
        read_file(null);
        super.sort_number_of_visitors();
        write_to_file("SortedByVisitors" + get_surname() + ".dat");
    }

    @Override
    public void read_file(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(get_path(filename, ".dat")))) {
            SerializationDoctor data = (SerializationDoctor) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write_to_file(String filename) {
        String s = "Hello";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(get_path(filename, ".dat")))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test(){
        add_reception(new Reception("05/06/2022", "Nice doctor", 5));
        add_reception(new Reception("12/06/2022", "Good", 2));
        add_reception(new Reception("03/06/2022", "Well done", 4));

        write_to_file(null);

        System.out.println("Default: ");
        System.out.println(this);
        sort_number_of_visitors();
        System.out.println("Sort-Number-Of-visitors:");
        System.out.println(this);
        sort_alphabetic_comments();
        System.out.println("Sort-Alphabetic-Comments:");
        System.out.println(this);

        System.out.print("Find-Average-Number-Visitors: ");
        System.out.println(find_average_number_visitors());
        System.out.print("Find-Longest-Comment: ");
        System.out.println(find_longest_comment());
        System.out.print("Find-Min-Number-Visitors: ");
        System.out.println(find_min_number_visitors());
    }
}
