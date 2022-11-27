package Task_1;

import java.io.Serializable;

public class Reception implements Comparable<Reception>, Serializable {
    private static final long serialVersionUID = 5308689750632711432L;

    private String day;
    private String comment;
    private int number_visitors;

    Reception(String day, String comment, int number_visitors) {
        this.day = day;
        this.comment = comment;
        this.number_visitors = number_visitors;
    }

    public int get_number_visitors() {
        return number_visitors;
    }

    public void setNumber_visitors(int number_visitors) {
        this.number_visitors = number_visitors;
    }

    public String get_day() {
        return day;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String get_comment() {
        return comment;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * We redefine the object comparison method
     *
     * @param obj the received object
     * @return true - if the objects are equal and otherwise - false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Reception reception = (Reception) obj;

        return this.number_visitors == reception.number_visitors && comment.equals(reception.comment) && day.equals(reception.day);
    }

    /**
     * Override for output
     *
     * @return information about the doctor
     */
    @Override
    public String toString() {
        return "Number visitors: " + number_visitors + " Comment: " + comment + " Day: " + day;
    }

    @Override
    public int hashCode() {
        return number_visitors + day.hashCode() + comment.hashCode();
    }

    /**
     * Compares the number of visitors
     *
     * @param o the object to be compared.
     * @return the difference between the number of visitors
     */
    @Override
    public int compareTo(Reception o) {
        return get_number_visitors() - o.get_number_visitors();
    }
}
