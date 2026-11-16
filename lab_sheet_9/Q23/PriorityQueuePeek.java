package lab_sheet_9.Q23;

import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Maya");
        names.add("Asha");
        names.add("Ravi");

        System.out.println("First element: " + names.peek());
        System.out.println("Queue after peek: " + names);
    }
}
