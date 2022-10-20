package Task_1;

public class Reception implements Comparable<Reception> {
    private String day;
    private String comment;
    private int number_visitors;

    public int get_number_visitors() {
        return number_visitors;
    }

    public String get_day() {
        return day;
    }

    public String get_comment() {
        return comment;
    }

    //Change-for-after-tests------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Reception)) {
            return false;
        }

        Reception reception = (Reception) o;

        return this.number_visitors == reception.number_visitors && comment.equals(reception.comment) && day.equals(reception.day);
    }

    @Override
    public String toString() {
        return "Number visitors: " + number_visitors + " | Comment: " + comment + " | Day: " + day;
    }

    @Override
    public int hashCode() {
        return number_visitors + day.hashCode() + comment.hashCode();
    }

    //HZ
    @Override
    public int compareTo(Reception o) {
        if (this.day == o.get_day() && this.comment == o.get_comment() && this.number_visitors == o.number_visitors) {
            return 0;
        }

        return 1;
    }
}
