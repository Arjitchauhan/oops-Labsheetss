package lab_sheet_9.Q20;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] values = {30, 10, 20};

        for (int value : values) {
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);
        }

        System.out.println("HashSet (order unspecified): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
