package lab_sheet_9.Q08;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);

        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);
    }
}
