package lab_sheet_9.Q12;

import java.util.LinkedList;

public class LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        System.out.println("Removed first: " + days.removeFirst());
        System.out.println("Removed last: " + days.removeLast());
        System.out.println("Remaining: " + days);
    }
}
