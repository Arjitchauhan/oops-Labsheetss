package lab_sheet_9.Q21;

import java.util.PriorityQueue;

public class PriorityQueueAdd {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Priority queue: " + numbers);
        System.out.println("Head (smallest element): " + numbers.peek());
    }
}
