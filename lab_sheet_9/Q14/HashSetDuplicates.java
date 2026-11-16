package lab_sheet_9.Q14;

import java.util.HashSet;

public class HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Set: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("The duplicate 10 is stored only once.");
    }
}
