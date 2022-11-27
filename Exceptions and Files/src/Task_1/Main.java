package Task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------Test-class-TextDoctor--------------------");
        TextDoctor psychologist = new TextDoctor("Dmitrievna", 5);
        psychologist.test();

        System.out.println("---------------------Test-class-TextSerialization--------------------");
        SerializationDoctor terapevt = new SerializationDoctor("Oleg", 10);
        terapevt.test();
    }
}
