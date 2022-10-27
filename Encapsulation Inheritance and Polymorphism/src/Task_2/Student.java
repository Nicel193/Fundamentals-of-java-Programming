package Task_2;

public class Student extends Citizen {
    private String group_number;

    Student(String name, int passport_code, String group_number)
    {
        super(name, passport_code);
        this.group_number = group_number;
    }

    @Override
    public void GetInformation()
    {
        System.out.print("Name: " + GetName() + " | Passport code: " + GetPassportCode() + " | Group number: " + group_number);
    }
}
