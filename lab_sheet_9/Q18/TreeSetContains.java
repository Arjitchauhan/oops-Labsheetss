package lab_sheet_9.Q18;

import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int target = 20;
        System.out.println("Set: " + numbers);
        System.out.println("Contains " + target + ": " + numbers.contains(target));
    }
}
