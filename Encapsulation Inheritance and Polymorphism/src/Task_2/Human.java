package Task_2;

import java.lang.String;

public class Human {
    private String name = "Test";

    Human(String name)
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
