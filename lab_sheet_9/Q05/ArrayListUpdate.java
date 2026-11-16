package lab_sheet_9.Q05;

import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha");
        names.add("Ravi");
        names.add("Maya");

        names.set(1, "Kiran");
        System.out.println(names);
    }
}
