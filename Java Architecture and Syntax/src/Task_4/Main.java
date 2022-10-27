package Task_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.err.println("No argument");
            System.exit(-1);
        }

        String s = args[0];

        System.out.printf("|%s| Length: %d\n", s, s.length());
        System.out.printf("Enter new length: ");

        Scanner in = new Scanner(System.in);
        int new_length = in.nextInt();
        int spaces_count = new_length - s.length();

        if (spaces_count <= 0) {
            System.err.printf("The length of the new line must be greater than %d", s.length());
            System.exit(-1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces_count++;
            }
        }

        StringTokenizer st = new StringTokenizer(s);

        boolean is_first_space = (s.charAt(0) == ' ');
        boolean is_last_space = (s.charAt(s.length() - 1) == ' ');

        if(st.countTokens() == 1) is_first_space = is_last_space = true;

        //Find the number of spaces in a sentence
        int space_cycle = st.countTokens() - 1;
        if(is_first_space) space_cycle++;
        if(is_last_space) space_cycle++;

        String[] space_str = new String[space_cycle];

        //Fill in an array of strings of spaces
        for (int i = 0, j = 0; i < spaces_count; i++) {
            if(space_str[j] == null) space_str[j] = "";

            space_str[j++] += ' ';

            if(j == space_str.length) j = 0;
        }

        StringBuilder new_str = new StringBuilder();

        //Fill StringBuilder
        int i = 0;
        while (st.hasMoreTokens()) {
            if(is_first_space){
                new_str.append(space_str[i]);
                is_first_space = false;
                i++;
            }

            new_str.append(st.nextToken());

            if(st.hasMoreTokens() || is_last_space) {
                new_str.append(space_str[i]);
                i++;
            }
        }

        System.out.printf("\nAnswer: \"%s\"\nLength: %d", new_str, new_length);
    }
}