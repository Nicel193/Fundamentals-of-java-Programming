package Task_1;

public class Therapist extends Doctor{
    private Reception[] receptios;

    Therapist(String surname, String experience)
    {
        super(surname, experience);
    }

    public Reception[] get_receptions()
    {
        return receptios;
    }
}
