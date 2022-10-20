package Task_2;

public class citizen extends human {
    private int passport_code = 1234;

    citizen(String name, int passport_code)
    {
        super(name);
        this.passport_code = passport_code;
    }

    public  int  GetPassportCode()
    {
        return  passport_code;
    }

    @Override
    public void GetInformation()
    {
        System.out.print("Name: " + GetName() + " | Passport code: " + passport_code);
    }
}
