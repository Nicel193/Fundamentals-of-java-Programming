package Task_2;

public class Main {
    public static void main(String[] args) {
        Human[] humans = {new Human("Danya"),
                new Citizen("Oleg", 124334528),
                new Student("Olya", 845643253, "MIT-222snv"),
                new Student("Ruslan", 435232574, "KN-221b"),
                new Employee("Vadim", 234892453, "Programmer")};

        for (int i = 0; i < humans.length; i++) {
            humans[i].GetInformation();

           if((i+1) != humans.length)
               System.out.println("\n-----------------------------------------------------------");
        }
    }
}
