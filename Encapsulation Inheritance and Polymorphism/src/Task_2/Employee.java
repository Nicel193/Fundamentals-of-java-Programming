package Task_2;

public class Employee extends Citizen {
    public String name_profession;

    Employee(String name, int passport_code, String name_profession) {
        super(name, passport_code);
        this.name_profession = name_profession;
    }

    @Override
    public void GetInformation()
    {
        System.out.println("Name: " + GetName() + " | Passport code: " + GetPassportCode() + " | Name profession: " + name_profession);
    }
}
