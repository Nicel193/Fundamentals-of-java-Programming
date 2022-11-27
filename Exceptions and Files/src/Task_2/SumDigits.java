package Task_2;

public final class SumDigits {
    private int number;
    private int sum_digits;

    SumDigits(int number) {
        this.number = number;
        sum_digits();
    }

    public int get_number() {
        return number;
    }

    public int get_sum_digits() {
        return sum_digits;
    }

    private void sum_digits() {
        int digit = 0;
        int num = number;
        while (num > 0) {
            digit = num % 10;
            sum_digits = sum_digits + digit;
            num = num / 10;
        }
    }
}
