package lab_sheet_9.Q22;

import java.util.PriorityQueue;

public class PriorityQueueRemove {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Removal order:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
    }
}
