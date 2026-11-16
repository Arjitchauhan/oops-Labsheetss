package lab_sheet_9.Q06;

import java.util.ArrayList;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
