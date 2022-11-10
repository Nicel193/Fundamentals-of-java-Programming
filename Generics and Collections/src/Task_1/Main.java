package Task_1;

public class Main {
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(COLOR_GREEN + "Psychologist-With-Array: " + COLOR_RESET);
        PsychologistWithList psychologist = new PsychologistWithList("Dmitrievna", 5);
        psychologist.add_reception(new Reception("05/06/2022", "Nice doctor", 5));
        psychologist.add_reception(new Reception("12/06/2022", "Good", 2));
        psychologist.add_reception(new Reception("03/06/2022", "Well done", 4));

        System.out.println("Default: ");
        System.out.println(psychologist);
        psychologist.sort_number_of_visitors();
        System.out.println("Sort-Number-Of-visitors:");
        System.out.println(psychologist);
        psychologist.sort_alphabetic_comments();
        System.out.println("Sort-Alphabetic-Comments:");
        System.out.println(psychologist);

        System.out.print("Find-Average-Number-Visitors: ");
        System.out.println(psychologist.find_average_number_visitors());
        System.out.print("Find-Longest-Comment: ");
        System.out.println(psychologist.find_longest_comment());
        System.out.print("Find-Min-Number-Visitors: ");
        System.out.println(psychologist.find_min_number_visitors());

        System.out.println('\n' + COLOR_GREEN + "Psychologist-With-Sorting: " + COLOR_RESET);
        TherapistWithSet psychologistWithSorting = new TherapistWithSet("Oleg", 10);
        psychologistWithSorting.add_reception(new Reception("05/06/2022", "Nice doctor", 5));
        psychologistWithSorting.add_reception(new Reception("12/06/2022", "Good", 2));
        psychologistWithSorting.add_reception(new Reception("03/06/2022", "Well done", 4));

        System.out.println("Default: ");
        System.out.println(psychologistWithSorting);
        psychologistWithSorting.sort_number_of_visitors();
        System.out.println("Sort-Number-Of-visitors:");
        System.out.println(psychologistWithSorting);
        psychologistWithSorting.sort_alphabetic_comments();
        System.out.println("Sort-Alphabetic-Comments:");
        System.out.println(psychologistWithSorting);

        System.out.print("Find-Average-Number-Visitors: ");
        System.out.println(psychologistWithSorting.find_average_number_visitors());
        System.out.print("Find-Longest-Comment: ");
        System.out.println(psychologistWithSorting.find_longest_comment());
        System.out.print("Find-Min-Number-Visitors: ");
        System.out.println(psychologistWithSorting.find_min_number_visitors());
    }
}
