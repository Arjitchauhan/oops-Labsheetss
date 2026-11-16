package lab_sheet_9.Q13;

import java.util.LinkedList;

public class LinkedListRetrieveEnds {
    public static void main(String[] args) {
        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        System.out.println("First: " + days.getFirst());
        System.out.println("Last: " + days.getLast());
    }
}
