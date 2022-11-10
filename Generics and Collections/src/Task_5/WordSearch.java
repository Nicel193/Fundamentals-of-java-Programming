package Task_5;

import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(sentence, " ,.");
        SortedSet<String> sorted_set = new TreeSet<>();

        while (st.hasMoreTokens()) {
            sorted_set.add(st.nextToken());
        }

        System.out.println(sorted_set);
    }
}
