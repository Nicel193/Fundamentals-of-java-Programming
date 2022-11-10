package Task_2;

public class Main {
    public static void main(String[] args) {
        Month month = Month.September;
        System.out.println("Цей місяць: " + month);
        System.out.println("Наступний місяць: " + month.get_next());
        System.out.println("Минулий місяць: " + month.get_last());

        System.out.println("Всі місяці:");
        Month.all_month_info();
    }
}
