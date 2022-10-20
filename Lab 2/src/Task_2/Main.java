package Task_2;

public class Main {
    public static void main(String[] args) {
        human[] humans = {new human("Danya"),
                new citizen("Oleg", 124334528),
                new student("Olya", 845643253, "MIT-222snv"),
                new student("Ruslan", 435232574, "KN-221b"),
                new employee("Vadim", 234892453, "Programmer")};

        for (int i = 0; i < humans.length; i++) {
            humans[i].GetInformation();

           if((i+1) != humans.length)  System.out.println("\n-----------------------------------------------------------");
        }
    }
}
