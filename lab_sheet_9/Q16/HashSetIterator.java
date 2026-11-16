package lab_sheet_9.Q16;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(12);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
