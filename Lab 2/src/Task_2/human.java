package Task_2;

import java.lang.String;

public class human {
    private String name = "Test";

    human(String name)
    {
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }

    public void GetInformation()
    {
        System.out.print("Name: " + name);
    }
}
