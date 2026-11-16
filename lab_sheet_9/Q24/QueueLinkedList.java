package lab_sheet_9.Q24;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Remaining: " + queue);
    }
}
