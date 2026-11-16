package lab_sheet_9.Q19;

import java.util.LinkedHashSet;

public class LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Asha");
        names.add("Ravi");
        names.add("Maya");
        names.add("Asha");

        System.out.println("Insertion order (duplicates removed): " + names);
    }
}
