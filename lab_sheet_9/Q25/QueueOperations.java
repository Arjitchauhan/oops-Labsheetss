package lab_sheet_9.Q25;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        System.out.println("After adding: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("After removing: " + queue);
    }
}
