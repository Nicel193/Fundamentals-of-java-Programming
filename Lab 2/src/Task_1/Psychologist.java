package Task_1;

public class Psychologist extends Doctor{
    private Reception[] receptios;

    Psychologist(String surname, String experience)
    {
        super(surname, experience);
    }

    public Reception[] get_receptions()
    {
        return receptios;
    }
}
