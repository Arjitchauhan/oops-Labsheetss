package lab_sheet_9.Q28;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Asha");
        names.add("Ravi");
        names.add("Asha");
        names.add("Maya");

        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("List: " + names);
        System.out.println("Set: " + uniqueNames);
    }
}
