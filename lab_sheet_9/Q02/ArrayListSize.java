package lab_sheet_9.Q02;

import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha");
        names.add("Ravi");
        names.add("Maya");

        System.out.println("Elements: " + names);
        System.out.println("Size: " + names.size());
    }
}
