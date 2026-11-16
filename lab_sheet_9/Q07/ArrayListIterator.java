package lab_sheet_9.Q07;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
